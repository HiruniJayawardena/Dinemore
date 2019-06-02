package lk.ijse.dinemore.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WelcomeController {

        @FXML
        private AnchorPane root;

        @FXML
        private Button btnClose;

        @FXML
        private Button btnAdmin;

        @FXML
        private Button btnOperator;

        @FXML
        private Button btnChef;

        @FXML
        private Button btnDeliverer;

        @FXML
        void adminOnAction(ActionEvent event) {
            try {
                AnchorPane pane=FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/logins/AdminLogin.fxml"));
                root.getChildren().setAll(pane);
            } catch (IOException ex) {
                Logger.getLogger(WelcomeController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        @FXML
        void chefOnAction(ActionEvent event) {
            try {
                AnchorPane pane=FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/logins/ChefLogin.fxml"));
                root.getChildren().setAll(pane);
            } catch (IOException ex) {
                Logger.getLogger(WelcomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @FXML
        void closeOnAction(ActionEvent event) {
            System.exit(2);

        }

        @FXML
        void delivererOnAction(ActionEvent event) {
            try {
                AnchorPane pane=FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/logins/DelivererLogin.fxml"));
                root.getChildren().setAll(pane);
            } catch (IOException ex) {
                Logger.getLogger(WelcomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @FXML
        void operatorOnAction(ActionEvent event) {
            try {
                AnchorPane pane=FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/logins/OperatorLogin.fxml"));
                root.getChildren().setAll(pane);
            } catch (IOException ex) {
                Logger.getLogger(WelcomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


}
