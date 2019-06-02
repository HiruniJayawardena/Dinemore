package lk.ijse.dinemore.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.io.IOException;

public class ChefLoginController {


        @FXML
        private AnchorPane chefLoginPane;

        @FXML
        private VBox root;

        @FXML
        private Button btnChefClose;

        @FXML
        private Button btnCheefLogin;

        @FXML
        private JFXTextField txtChefUserName;

        @FXML
        private JFXTextField txtChefPassword;

        @FXML
        void chefLogin(ActionEvent event) throws IOException {
                Parent pane=FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/chef/ChefDashBoard.fxml"));
                Scene temp=new Scene(pane);
                Stage window = (Stage) this.chefLoginPane.getScene().getWindow();
                window.setScene(temp);
                window.centerOnScreen();
        }

        @FXML
        void closeOnAction(ActionEvent event) {
                System.exit(2);

        }

}
