package lk.ijse.dinemore.Startup;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root=FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/logins/Welcome.fxml"));
        Scene scene=new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        //primaryStage.setTitle("Payroll System");
          primaryStage.setResizable(false);
        primaryStage.show();
    }
}
