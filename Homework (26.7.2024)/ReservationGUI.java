
// Ashwin A/L Ravichandran 22012188
// Avinash Kumar A/L Jayaseelan 24000113

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ReservationGUI extends Application {
    private Clients clients = new Clients();
    private Reservations reservations = new Reservations();
    private Tables tables = new Tables();
    
        String url = "localhost";  // Assuming MySQL server is running on localhost
        String user = "root";      // MySQL username
        String password = "";      // MySQL password (if any)

        YoyakuDB db = new YoyakuDB(url, user, password);
    
    private GridPane createPane() {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setHgap(10);
        pane.setVgap(10);
        return pane;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Reservation Manager");

        GridPane mainPane = createPane();
        GridPane addReservationPane = createPane();
        GridPane removeReservationPane = createPane();
        GridPane printReservationPane = createPane();
        GridPane findReservationPane = createPane();

        // Main Scene Buttons
        Button addReservationBtn = new Button("Add Reservation");
        Button removeReservationBtn = new Button("Remove Reservation");
        Button printReservationBtn = new Button("Print Reservation");
        Button findReservationBtn = new Button("Find Reservation");

        // Set preferred size
        int btnHeight = 50;
        int btnWidth = 150;
        addReservationBtn.setPrefSize(btnWidth , btnHeight);
        removeReservationBtn.setPrefSize(btnWidth, btnHeight);
        printReservationBtn.setPrefSize(btnWidth, btnHeight);
        findReservationBtn.setPrefSize(btnWidth, btnHeight);
        
        // Add buttons to the main pane
        mainPane.add(addReservationBtn, 0, 0);
        mainPane.add(removeReservationBtn, 0, 1);
        mainPane.add(printReservationBtn, 0, 2);
        mainPane.add(findReservationBtn, 0, 3);

        Scene mainScene = new Scene(mainPane, 300, 200);

        // Add Reservation Pane
        Button backFromAddReservationBtn = new Button("Back");
        Label tableNumberLabel = new Label("Table number:");
        TextField tableNumberField = new TextField();
        Label paxNumberLabel = new Label("Number of pax:");
        TextField paxNumberField = new TextField();
        Button okBtn = new Button("OK");
        Button cancelBtn = new Button("Cancel");

        addReservationPane.add(backFromAddReservationBtn, 0, 0);
        addReservationPane.add(tableNumberLabel, 0, 1);
        addReservationPane.add(tableNumberField, 1, 1);
        addReservationPane.add(paxNumberLabel, 0, 2);
        addReservationPane.add(paxNumberField, 1, 2);
        addReservationPane.add(okBtn, 0, 3);
        addReservationPane.add(cancelBtn, 1, 3);

        Scene addReservationScene = new Scene(addReservationPane, 300, 200);

        // Remove Reservation Pane
        Button backFromRemoveReservationBtn = new Button("Back");
        Label tableLabelRemove = new Label("Enter table number:");
        TextField tableFieldRemove = new TextField();
        Button okBtnRemove = new Button("Ok");

        removeReservationPane.add(backFromRemoveReservationBtn, 0, 0);
        removeReservationPane.add(tableLabelRemove, 0, 1);
        removeReservationPane.add(tableFieldRemove, 1, 1);
        removeReservationPane.add(okBtnRemove, 0,2);

        Scene removeReservationScene = new Scene(removeReservationPane, 300, 200);

        // Print Reservation Pane
        Button backFromPrintReservationBtn = new Button("Back");
        Label statusPrint = new Label("");
        Button okBtnPrint = new Button("Print");

        printReservationPane.add(backFromPrintReservationBtn, 0, 0);
        printReservationPane.add(okBtnPrint, 1, 0);
        printReservationPane.add(statusPrint, 0, 1);

        Scene printReservationScene = new Scene(printReservationPane, 300, 200);

        // Find Reservation Pane
        Button backFromFindReservationBtn = new Button("Back");
        Label tableLabelFind = new Label("Enter table number:");
        TextField tableFieldFind = new TextField();
        Button okBtnFind = new Button("Ok");


        findReservationPane.add(backFromFindReservationBtn, 0, 0);
        findReservationPane.add(tableLabelFind, 0, 1);
        findReservationPane.add(tableFieldFind, 1, 1);
        findReservationPane.add(okBtnFind, 0, 2);

        Scene findReservationScene = new Scene(findReservationPane, 300, 200);

        
        //Setting up button actions
         
        //Main 4 button actions
        addReservationBtn.setOnAction(e -> {primaryStage.setScene(addReservationScene);});
        removeReservationBtn.setOnAction(e -> {primaryStage.setScene(removeReservationScene);});
        printReservationBtn.setOnAction(e -> {primaryStage.setScene(printReservationScene);});
        findReservationBtn.setOnAction(e -> {primaryStage.setScene(findReservationScene);});
        
        //Add reservation actions
        backFromAddReservationBtn.setOnAction(e -> {primaryStage.setScene(mainScene);});
        
        cancelBtn.setOnAction(e -> {
            tableNumberField.setText("");
            paxNumberField.setText("");
        });
        
        okBtn.setOnAction(e -> {
            int tableNumber = Integer.parseInt(tableNumberField.getText());
            int paxNumber = Integer.parseInt(paxNumberField.getText());
            
            /*Reservation newReservation = new Reservation (tableNumber, paxNumber, status);
            newReservation.readClientDetails();
            reservations.addRes(newReservation);
            reservations.printRes();*/
            
            db.insertRes(tableNumber,paxNumber); //inserts values into 'Reservations' table
            
        });

        
        //Remove reservation actions
        backFromRemoveReservationBtn.setOnAction(e -> {primaryStage.setScene(mainScene);});
        
        okBtnRemove.setOnAction(e -> {
            /*int reservationIndex = Integer.parseInt(indexFieldRemove.getText());
            reservations.removeRes(reservationIndex);
            reservations.printRes(); */
            
            int tableNumber = Integer.parseInt(tableFieldRemove.getText());
            db.deleteRes(tableNumber);
        });
        
        //Print reservation actions
        backFromPrintReservationBtn.setOnAction(e -> {primaryStage.setScene(mainScene);});
        
        okBtnPrint.setOnAction(e -> {
           //reservations.printRes(); 
           statusPrint.setText("Successful");
           
           db.printRes();
        });
        
        //Find reservation actions
        backFromFindReservationBtn.setOnAction(e -> {primaryStage.setScene(mainScene);});
        
        okBtnFind.setOnAction(e -> {
            /*int reservationIndex = Integer.parseInt(tableFieldFind.getText());
            reservations.findRes(reservationIndex);*/
            
            int tableNumber = Integer.parseInt(tableFieldFind.getText());
            db.findRes(tableNumber);
        });
        
        
        //set scene into stage for visibility
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }   
    
        @Override
    public void stop() {
        db.close(); // Ensure the connection is closed when the application stops
    }
}
