//See Tho Soon Yinn

import java.sql.*;

class YoyakuDB {
    private Connection conn = null;
    private String url, user, password;
    private Statement stmt; 
    
    public YoyakuDB(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
        init();  // Initialize connection during construction to decrease no. of connections
    }
    
    public void init() {
       try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // connect way #1
            String url = "jdbc:mysql://"+this.url+":3306/"+this.user;
            String user = this.user;
            String password = this.password; // security risk
 
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Connected to the database test1");
            }
             stmt = conn.createStatement();   
        }
            // catch sqlexception
        catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
            System.out.println(ex);
            
            // catch whatever else, esp connector loading
        } catch (Exception ex) {
            System.out.println("Some sort of error, probably driver loading..");
            ex.printStackTrace();
        }
          
    }
    
    public void close() {
        try {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void insertClient( String name, String phoneNumber){
        try {
            stmt.executeUpdate ( "INSERT INTO Clients " + 
                                 "VALUES ('"+name+"','"+phoneNumber+"')");         
        }
        catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
            System.out.println(ex);
            // catch whatever else, esp connector loading
        }
    }
    
    public void insertTable( int tableNumber, int chairNumber){
        try {
            stmt.executeUpdate ( "INSERT INTO Tables (`Table no.`, `No. of chairs`, `Reservation status`) " + 
                                 "VALUES ('"+tableNumber+"','"+chairNumber+"', 'false')");         
        }
        catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
            System.out.println(ex);
            // catch whatever else, esp connector loading
        }
    }
 
    public void insertRes( int tableNumber, int paxNumber){
        try {
            stmt.executeUpdate ( "INSERT INTO Reservations (`Table no.`, `No. of pax`, `Reservation status`) " + 
                                 "VALUES (" +tableNumber+", "+paxNumber+", 'true')"); 
                                 
            stmt.executeUpdate ( "UPDATE Tables "+
                                 "SET `Reservation status` = 'true' "+
                                 "WHERE `Table no.`= "+tableNumber);
        }
        catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid or table does'nt exist");
            ex.printStackTrace();
            System.out.println(ex);
            // catch whatever else, esp connector loading
        }
    }
    
    public void deleteClient( String name){
        try {
            stmt.executeUpdate ( "DELETE FROM Clients WHERE Name ='"+name+ "';");         
        }
        catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
            System.out.println(ex);
            // catch whatever else, esp connector loading
        }
    }
    
    public void deleteTable(int tableNumber) {
        try {
            String sql = "DELETE FROM Tables WHERE `Table no.` = " + tableNumber + ";";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid or table doesn't exist");
            ex.printStackTrace();
            System.out.println(ex);
        }
    }

    public void deleteRes(int tableNumber){
        try {
            stmt.executeUpdate ( "DELETE FROM Reservations WHERE `Table no.` = "+tableNumber+ ";");         
        }
        catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
            System.out.println(ex);
            // catch whatever else, esp connector loading
        }
    }
    
    public void printClient(){
        ResultSet rs = null;
        try{
            rs = stmt.executeQuery("SELECT * FROM Clients;");
            while (rs.next()) {
                String name = rs.getString("Name");
                String phoneNumber = rs.getString("Phone no.");

                System.out.print("Name: " +name+ ", Number of pax: " +phoneNumber);
                rs.close();
            }
        }catch(SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
            System.out.println(ex);
            // catch whatever else, esp connector loading
        }
    }
    
        public void printTable(){
        ResultSet rs = null;
        try{
            rs = stmt.executeQuery("SELECT * FROM Tables;");
            while (rs.next()) {
                String tableNumber = rs.getString("Table no.");
                String chairNumber = rs.getString("No. of chairs");
                String status = rs.getString("Reservation status");
                
                System.out.print("Table Number: " +tableNumber+ ", Number of chairs: " + chairNumber+ ", Reservation status: " +status);
                rs.close();
            }
        }catch(SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
            System.out.println(ex);
            // catch whatever else, esp connector loading
        }
    }
    
    public void printRes(){
        ResultSet rs = null;
        try{
            rs = stmt.executeQuery("SELECT * FROM Resesrvations;");
            while (rs.next()) {
                String tableNumber = rs.getString("Table no.");
                String paxNumber = rs.getString("No. of pax");
                String status = rs.getString("Reservation status");;
                
                System.out.print("Table Number: " +tableNumber+ ", Number of pax: " + paxNumber+ ", Reservation status: " +status);
                rs.close();
            }
        }catch(SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
            System.out.println(ex);
            // catch whatever else, esp connector loading
        }
    }
    
    public void findClient(String clientName){
        ResultSet rs = null;
        try{
            rs = stmt.executeQuery("SELECT * FROM Clients WHERE Name = "+clientName+" ;");
            
            if (rs.next()) {
                String name = rs.getString("Name");
                String phoneNumber = rs.getString("Phone no.");

                System.out.println("Name: " + name);
                System.out.println("Phone Number: " + phoneNumber);
                System.out.println("--------------------------");
            }else {
                System.out.println("Client with name " + clientName + " not found.");
            }
                rs.close();
        }catch(SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
            System.out.println(ex);
            // catch whatever else, esp connector loading
        }
    }    
    
    public void findTable(int tableNumber){
        ResultSet rs = null;
            try {
            rs = stmt.executeQuery("SELECT * FROM Tables WHERE `Table no.`= " + tableNumber + ";");

            if (rs.next()) {  // Check if there is at least one result
                String tableNum = rs.getString("Table no.");
                String chairNum = rs.getString("No. of chairs");
                String status = rs.getString("Reservation status");

                System.out.println("Table Number: " + tableNum);
                System.out.println("Number of chairs: " + chairNum);
                System.out.println("Reservation status: " + status);
                System.out.println("--------------------------");
            } else {
                System.out.println("Table with number " + tableNumber + " not found.");
            }
        rs.close();
        }catch(SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
            System.out.println(ex);
            // catch whatever else, esp connector loading
        }
    }
    
    public void findRes(int tableNumber){
        ResultSet rs = null;
        try{
            rs = stmt.executeQuery("SELECT * FROM Reservations WHERE `Table no.`= "+tableNumber+";");
            
            if (rs.next()) {  // Check if there is at least one result
                String tableNum = rs.getString("Table no.");
                String paxNum = rs.getString("No. of pax");
                String status = rs.getString("Reservation status");
                
                System.out.println("Table Number: " + tableNum);
                System.out.println("Number of pax: " + paxNum);
                System.out.println("Reservation status: " + status);
                System.out.println("--------------------------");
                } else {
                System.out.println("Table with number " + tableNumber + " not found.");
            }
                rs.close();
        }catch(SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
            System.out.println(ex);
            // catch whatever else, esp connector loading
        }
    }
}
