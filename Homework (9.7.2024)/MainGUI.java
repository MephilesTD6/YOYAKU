import javafx.application.Application;

import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


import javafx.geometry.Insets;//add padding
import javafx.geometry.Pos;//center align
import javafx.geometry.HPos;//center align for horizontal elements (setHalightment)

public class MainGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("MAIN MENU");

        GridPane grid = new GridPane();//layout manager
        grid.setAlignment(Pos.CENTER);//will alight table itself to center
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setMinSize(300, 300);
        grid.setVgap(10);//gaps between element
        grid.setHgap(10);
        
        Label welcomeLabel = new Label("Welcome to Yoyaku!");
        
        Button clientButton = new Button("Client Manager");
        clientButton.setOnAction(e -> openClientManager());

        Button reservationButton = new Button("Reservation Manager");
        reservationButton.setOnAction(e -> openReservationManager());

        Button tableButton = new Button("Table Manager");
        tableButton.setOnAction(e -> openTableManager());
        
        // Set preferred size for the buttons
        int buttonSize = 150;
        clientButton.setPrefSize(buttonSize, buttonSize);
        reservationButton.setPrefSize(buttonSize, buttonSize);
        tableButton.setPrefSize(buttonSize, buttonSize);

        //add objects into grid layout
        grid.add(welcomeLabel,0, 0);
        GridPane.setHalignment(welcomeLabel, HPos.CENTER);

        grid.add(clientButton, 0, 1);
        grid.add(reservationButton, 0, 2);
        grid.add(tableButton, 0, 3);
        
        //adding grid to scene
        //adding scene to stage
        Scene scene = new Scene(grid, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();//IMPORTANT
    }

    
    private void openClientManager() {
        Stage clientStage = new Stage(); //new Stage object that is separate
        ClientGUI clientGUI = new ClientGUI();//declare ClientGUI object
        clientGUI.start(clientStage);//open new pop up 
    }

    private void openReservationManager() {
        Stage reservationStage = new Stage();
        ReservationGUI reservationGUI = new ReservationGUI();
        reservationGUI.start(reservationStage);
    }

    private void openTableManager() {
        Stage tableStage = new Stage();
        TableGUI tableGUI = new TableGUI();
        tableGUI.start(tableStage);
    }

    
}
