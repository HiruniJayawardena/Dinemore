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
import javafx.stage.Window;

import java.awt.event.MouseEvent;
import java.io.IOException;


public class DelivererLoginController {
        @FXML
        private AnchorPane delivererPane;



        @FXML
        private VBox root;

        @FXML
        private Button btnDelivererClose;

        @FXML
        private Button btnDelivererLogin;

        @FXML
        private JFXTextField txtDelivererUserName;

        @FXML
        private JFXTextField txtDelivererPassword;

        @FXML
        private ImageView btnHome;

        @FXML
        void closeOnAction(ActionEvent event) {
            System.exit(2);

        }

        @FXML
        void delivererLogin(ActionEvent event) throws IOException {
                Parent del=FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/deliverer/DelivererHome.fxml"));
                Scene temp=new Scene(del);
                Stage window= (Stage) this.delivererPane.getScene().getWindow();
                window.setScene(temp);
                window.centerOnScreen();
        }

        @FXML
        void homeClick(MouseEvent event) {

        }


    public void homeClick(javafx.scene.input.MouseEvent mouseEvent) {
    }
}
