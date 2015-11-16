package no.vestein.wsv8088;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import no.vestein.wsv8088.cpu.registers.Registers;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        System.out.println(Registers.AX.length);
        System.out.println(Registers.AX.start + ":" + Registers.AX.end);
        System.out.println(Registers.AH.length);
        System.out.println(Registers.AL.length);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
