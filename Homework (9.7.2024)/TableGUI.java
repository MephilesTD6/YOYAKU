// Syukri Fadhli bin Ahmad 24000074
// See Tho Soon Yinn 24000187

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TableGUI extends Application {
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
        primaryStage.setTitle("Table Manager");

        GridPane mainPane = createPane();
        GridPane addTablePane = createPane();
        GridPane removeTablePane = createPane();
        GridPane printTablePane = createPane();
        GridPane findTablePane = createPane();

        // Main Scene Buttons
        Button addTableBtn = new Button("Add Table");
        Button removeTableBtn = new Button("Remove Table");
        Button printTableBtn = new Button("Print Table");
        Button findTableBtn = new Button("Find Table");

        // Set preferred size
        int btnHeight = 50;
        int btnWidth = 150;
        addTableBtn.setPrefSize(btnWidth , btnHeight);
        removeTableBtn.setPrefSize(btnWidth, btnHeight);
        printTableBtn.setPrefSize(btnWidth, btnHeight);
        findTableBtn.setPrefSize(btnWidth, btnHeight);
        
        // Add buttons to the main pane
        mainPane.add(addTableBtn, 0, 0);
        mainPane.add(removeTableBtn, 0, 1);
        mainPane.add(printTableBtn, 0, 2);
        mainPane.add(findTableBtn, 0, 3);

        Scene mainScene = new Scene(mainPane, 300, 200);

        // Add Table Pane
        Button backFromAddTableBtn = new Button("Back");
        Label tableNumberLabel = new Label("Table number:");
        TextField tableNumberField = new TextField();
        Label chairNumberLabel = new Label("Number of chair:");
        TextField chairNumberField = new TextField();
        Button okBtn = new Button("OK");
        Button cancelBtn = new Button("Cancel");

        addTablePane.add(backFromAddTableBtn, 0, 0);
        addTablePane.add(tableNumberLabel, 0, 1);
        addTablePane.add(tableNumberField, 1, 1);
        addTablePane.add(chairNumberLabel, 0, 2);
        addTablePane.add(chairNumberField, 1, 2);
        addTablePane.add(okBtn, 0, 3);
        addTablePane.add(cancelBtn, 1, 3);

        Scene addTableScene = new Scene(addTablePane, 300, 200);

        // Remove Table Pane
        Button backFromRemoveTableBtn = new Button("Back");
        Label indexLabelRemove = new Label("Enter Index:");
        TextField indexFieldRemove = new TextField();
        Button okBtnRemove = new Button("Ok");

        removeTablePane.add(backFromRemoveTableBtn, 0, 0);
        removeTablePane.add(indexLabelRemove, 0, 1);
        removeTablePane.add(indexFieldRemove, 1, 1);
        removeTablePane.add(okBtnRemove, 0,2);

        Scene removeTableScene = new Scene(removeTablePane, 300, 200);

        // Print Table Pane
        Button backFromPrintTableBtn = new Button("Back");
        Label statusPrint = new Label("");
        Button okBtnPrint = new Button("Print");

        printTablePane.add(backFromPrintTableBtn, 0, 0);
        printTablePane.add(okBtnPrint, 1, 0);
        printTablePane.add(statusPrint, 0, 1);

        Scene printTableScene = new Scene(printTablePane, 300, 200);

        // Find Table Pane
        Button backFromFindTableBtn = new Button("Back");
        Label indexLabelFind = new Label("Enter Index:");
        TextField indexFieldFind = new TextField();
        Button okBtnFind = new Button("Ok");


        findTablePane.add(backFromFindTableBtn, 0, 0);
        findTablePane.add(indexLabelFind, 0, 1);
        findTablePane.add(indexFieldFind, 1, 1);
        findTablePane.add(okBtnFind, 0, 2);

        Scene findTableScene = new Scene(findTablePane, 300, 200);

        
        //Setting up button actions
         
        //Main 4 button actions
        addTableBtn.setOnAction(e -> {primaryStage.setScene(addTableScene);});
        removeTableBtn.setOnAction(e -> {primaryStage.setScene(removeTableScene);});
        printTableBtn.setOnAction(e -> {primaryStage.setScene(printTableScene);});
        findTableBtn.setOnAction(e -> {primaryStage.setScene(findTableScene);});
        
        //Add table actions
        backFromAddTableBtn.setOnAction(e -> {primaryStage.setScene(mainScene);});
        
        cancelBtn.setOnAction(e -> {
            tableNumberField.setText("");
            chairNumberField.setText("");
        });
        
        okBtn.setOnAction(e -> {
            int tableNumber = Integer.parseInt(tableNumberField.getText());
            int chairNumber = Integer.parseInt(chairNumberField.getText());
            boolean status = false;
            
            Table newTable = new Table (tableNumber, chairNumber, status);
            tables.addTable(newTable);
            //tables.printTable();
        });

        
        //Remove table actions
        backFromRemoveTableBtn.setOnAction(e -> {primaryStage.setScene(mainScene);});
        
        okBtnRemove.setOnAction(e -> {
            int tableIndex = Integer.parseInt(indexFieldRemove.getText());
            tables.removeTable(tableIndex);
            //tables.printTable();
        });
        
        //Print table actions
        backFromPrintTableBtn.setOnAction(e -> {primaryStage.setScene(mainScene);});
        
        okBtnPrint.setOnAction(e -> {
           tables.printTable(); 
           statusPrint.setText("Successful");
        });
        
        //Find table actions
        backFromFindTableBtn.setOnAction(e -> {primaryStage.setScene(mainScene);});
        
        okBtnFind.setOnAction(e -> {
            int tableIndex = Integer.parseInt(indexFieldFind.getText());
            tables.findTable(tableIndex);
        });
        
        
        //set scene into stage for visibility
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    
    
    
}
