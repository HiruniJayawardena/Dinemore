package lk.ijse.dinemore.controller.Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminDashboadController {

        @FXML
        private AnchorPane adminDash;

        @FXML
        private Button btnManageOperator;

        @FXML
        private Button btnManageChef;

        @FXML
        private Button btnManageDeliverer;

        @FXML
        private Button btnManageItem;

        @FXML
        private Button btnViewReports;

        @FXML
        private Button btnViewOrders;

        @FXML
        private AnchorPane adminMiddlePane;

        @FXML
        void manageChefOnAction(ActionEvent event) {
                try {
                        AnchorPane pane=FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/admin/ManageChef.fxml"));
                        adminMiddlePane.getChildren().setAll(pane);
                } catch (IOException ex) {
                        Logger.getLogger(AdminDashboadController.class.getName()).log(Level.SEVERE, null, ex);
                }

        }

        @FXML
        void manageDelivererOnAction(ActionEvent event) {
                try {
                        AnchorPane pane=FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/admin/ManageDeliverer.fxml"));
                        adminMiddlePane.getChildren().setAll(pane);
                } catch (IOException ex) {
                        Logger.getLogger(AdminDashboadController.class.getName()).log(Level.SEVERE, null, ex);
                }

        }

        @FXML
        void manageItemOnAction(ActionEvent event) {
                try {
                        AnchorPane pane=FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/admin/ManageMenu.fxml"));
                        adminMiddlePane.getChildren().setAll(pane);
                } catch (IOException ex) {
                        Logger.getLogger(AdminDashboadController.class.getName()).log(Level.SEVERE, null, ex);
                }

        }

        @FXML
        void manageOperatorOnAction(ActionEvent event) {
                try {
                        AnchorPane pane=FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/admin/ManageOperator.fxml"));
                        adminMiddlePane.getChildren().setAll(pane);
                } catch (IOException ex) {
                        Logger.getLogger(AdminDashboadController.class.getName()).log(Level.SEVERE, null, ex);
                }

        }

        @FXML
        void viewOrdersOnAction(ActionEvent event) {
                try {
                        AnchorPane pane=FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/admin/ViewOrder.fxml"));
                        adminMiddlePane.getChildren().setAll(pane);
                } catch (IOException ex) {
                        Logger.getLogger(AdminDashboadController.class.getName()).log(Level.SEVERE, null, ex);
                }


        }

        @FXML
        void viewReportsOnAction(ActionEvent event) {
                try {
                        AnchorPane pane=FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/admin/ViewReports.fxml"));
                        adminMiddlePane.getChildren().setAll(pane);
                } catch (IOException ex) {
                        Logger.getLogger(AdminDashboadController.class.getName()).log(Level.SEVERE, null, ex);
                }

        }

}
