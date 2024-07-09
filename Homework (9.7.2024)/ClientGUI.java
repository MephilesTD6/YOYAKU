
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ClientGUI extends Application {
    private Clients clients = new Clients();
    private Reservations reservations = new Reservations();
    private Tables tables = new Tables();
    
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
        primaryStage.setTitle("Client Manager");

        GridPane mainPane = createPane();
        GridPane addClientPane = createPane();
        GridPane removeClientPane = createPane();
        GridPane printClientPane = createPane();
        GridPane findClientPane = createPane();

        // Main Scene Buttons
        Button addClientBtn = new Button("Add Client");
        Button removeClientBtn = new Button("Remove Client");
        Button printClientBtn = new Button("Print Client");
        Button findClientBtn = new Button("Find Client");

        // Set preferred size
        int btnHeight = 50;
        int btnWidth = 150;
        addClientBtn.setPrefSize(btnWidth , btnHeight);
        removeClientBtn.setPrefSize(btnWidth, btnHeight);
        printClientBtn.setPrefSize(btnWidth, btnHeight);
        findClientBtn.setPrefSize(btnWidth, btnHeight);
        
        // Add buttons to the main pane
        mainPane.add(addClientBtn, 0, 0);
        mainPane.add(removeClientBtn, 0, 1);
        mainPane.add(printClientBtn, 0, 2);
        mainPane.add(findClientBtn, 0, 3);

        Scene mainScene = new Scene(mainPane, 300, 200);

        // Add Client Pane
        Button backFromAddClientBtn = new Button("Back");
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        Label phoneLabel = new Label("Phone Number:");
        TextField phoneField = new TextField();
        Button okBtn = new Button("OK");
        Button cancelBtn = new Button("Cancel");

        addClientPane.add(backFromAddClientBtn, 0, 0);
        addClientPane.add(nameLabel, 0, 1);
        addClientPane.add(nameField, 1, 1);
        addClientPane.add(phoneLabel, 0, 2);
        addClientPane.add(phoneField, 1, 2);
        addClientPane.add(okBtn, 0, 3);
        addClientPane.add(cancelBtn, 1, 3);

        Scene addClientScene = new Scene(addClientPane, 300, 200);

        // Remove Client Pane
        Button backFromRemoveClientBtn = new Button("Back");
        Label indexLabelRemove = new Label("Enter Index:");
        TextField indexFieldRemove = new TextField();
        Button okBtnRemove = new Button("Ok");

        removeClientPane.add(backFromRemoveClientBtn, 0, 0);
        removeClientPane.add(indexLabelRemove, 0, 1);
        removeClientPane.add(indexFieldRemove, 1, 1);
        removeClientPane.add(okBtnRemove, 0,2);

        Scene removeClientScene = new Scene(removeClientPane, 300, 200);

        // Print Client Pane
        Button backFromPrintClientBtn = new Button("Back");
        Label statusPrint = new Label("");
        Button okBtnPrint = new Button("Print");

        printClientPane.add(backFromPrintClientBtn, 0, 0);
        printClientPane.add(okBtnPrint, 1, 0);
        printClientPane.add(statusPrint, 0, 1);

        Scene printClientScene = new Scene(printClientPane, 300, 200);

        // Find Client Pane
        Button backFromFindClientBtn = new Button("Back");
        Label indexLabelFind = new Label("Enter Index:");
        TextField indexFieldFind = new TextField();
        Button okBtnFind = new Button("Ok");


        findClientPane.add(backFromFindClientBtn, 0, 0);
        findClientPane.add(indexLabelFind, 0, 1);
        findClientPane.add(indexFieldFind, 1, 1);
        findClientPane.add(okBtnFind, 0, 2);

        Scene findClientScene = new Scene(findClientPane, 300, 200);

        
        //Setting up button actions
         
        //Main 4 button actions
        addClientBtn.setOnAction(e -> {primaryStage.setScene(addClientScene);});
        removeClientBtn.setOnAction(e -> {primaryStage.setScene(removeClientScene);});
        printClientBtn.setOnAction(e -> {primaryStage.setScene(printClientScene);});
        findClientBtn.setOnAction(e -> {primaryStage.setScene(findClientScene);});
        
        //Add client actions
        backFromAddClientBtn.setOnAction(e -> {primaryStage.setScene(mainScene);});
        
        cancelBtn.setOnAction(e -> {
            nameField.setText("");
            phoneField.setText("");
        });
        
        okBtn.setOnAction(e -> {
            String name = nameField.getText();
            String phone = phoneField.getText();
            
            Client newClient = new Client (name, phone);
            clients.addClient(newClient);
            //clients.printClient();
        });

        
        //Remove client actions
        backFromRemoveClientBtn.setOnAction(e -> {primaryStage.setScene(mainScene);});
        
        okBtnRemove.setOnAction(e -> {
            int clientIndex = Integer.parseInt(indexFieldRemove.getText());
            clients.removeClient(clientIndex);
            //clients.printClient();
        });
        
        //Print client actions
        backFromPrintClientBtn.setOnAction(e -> {primaryStage.setScene(mainScene);});
        
        okBtnPrint.setOnAction(e -> {
           clients.printClient(); 
           statusPrint.setText("Successful");
        });
        
        //Find client actions
        backFromFindClientBtn.setOnAction(e -> {primaryStage.setScene(mainScene);});
        
        okBtnFind.setOnAction(e -> {
            int clientIndex = Integer.parseInt(indexFieldFind.getText());
            clients.findClient(clientIndex);
        });
        
        
        //set scene into stage for visibility
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }    
}
