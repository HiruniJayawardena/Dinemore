package lk.ijse.dinemore.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;

public class OperatorLoginController {


        @FXML
        private AnchorPane operatorPane;

        @FXML
        private AnchorPane adminPane;

        @FXML
        private VBox root;

        @FXML
        private Button btnOperatorClose;

        @FXML
        private Button btnOperatorLogin;

        @FXML
        private JFXTextField txtoperatoruserName;

        @FXML
        private JFXTextField txtOperatorPassword;

        @FXML
        private ImageView btnHome;

        @FXML
        void closeOnAction(ActionEvent event) {
                System.exit(2);

        }

        @FXML
        void homeOnAction(MouseEvent event) {

        }

        @FXML
        void loginOnAction(ActionEvent event) throws IOException {
                Parent del=FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/employee/OperatorDashBoard.fxml"));
                Scene temp=new Scene(del);
                Stage window= (Stage) this.operatorPane.getScene().getWindow();
                window.setScene(temp);
                window.centerOnScreen();


        }


        public void homeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
        }
}
