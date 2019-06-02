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
import javafx.stage.Stage;


import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminLoginController {
    @FXML
    private AnchorPane adminPane;
    @FXML
    private AnchorPane root;

    @FXML
    private AnchorPane adminDash;

    @FXML
        private Button btnClose;

        @FXML
        private Button txtAdminlogin;

        @FXML
        private JFXTextField txtAdminName;

        @FXML
        private JFXTextField txtAdminPassword;

        @FXML
        private ImageView btnHome;
        @FXML
        private ImageView btnAdminClose;


        @FXML
        void adminLogin(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/admin/AdminDashboard.fxml"));
            Scene temp = new Scene(root);
            Stage window = (Stage) this.adminPane.getScene().getWindow();
            window.setScene(temp);
            window.centerOnScreen();
        }

        @FXML
        void closeOnAction(ActionEvent event) {
            System.exit(2);

        }

        @FXML
        void homeOnAction(MouseEvent event) throws IOException {
            try {
                AnchorPane pane=FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/logins/Welcome.fxml"));
                adminPane.getChildren().setAll(pane);
            } catch (IOException ex) {
                Logger.getLogger(AdminLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    public void manageOperatorOnAction(ActionEvent actionEvent) {
    }

    public void manageChefOnAction(ActionEvent actionEvent) {
    }

    public void manageDelivererOnAction(ActionEvent actionEvent) {
    }

    public void manageItemOnAction(ActionEvent actionEvent) {
    }

    public void viewReportsOnAction(ActionEvent actionEvent) {
    }

    public void viewOrdersOnAction(ActionEvent actionEvent) {
    }

    public void minimizeOnAction(javafx.scene.input.MouseEvent mouseEvent) {
    }


//    public void homeOnAction(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
//
//    }
}
