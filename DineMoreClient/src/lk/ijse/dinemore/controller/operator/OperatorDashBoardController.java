package lk.ijse.dinemore.controller.operator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperatorDashBoardController {


                @FXML
                private Button btnMakeOrder;

                @FXML
                private Button btnManageCustomers;

                @FXML
                private AnchorPane operatorMiddlePane;

                @FXML
                private Button btnManageOrders;

                @FXML
                void makeOrderOnAction(ActionEvent event) {
                        try {
                                Parent root= FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/employee/CustomerOrder.fxml"));
                                operatorMiddlePane.getChildren().setAll(root);
                        } catch (IOException e) {
                                Logger.getLogger(OperatorDashBoardController.class.getName()).log(Level.SEVERE,null,e);
                        }

                }

                @FXML
                void manageCustomersOnAction(ActionEvent event) {
                        try {
                                Parent root= FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/employee/ManageCustomer.fxml"));
                                operatorMiddlePane.getChildren().setAll(root);
                        } catch (IOException e) {
                                Logger.getLogger(OperatorDashBoardController.class.getName()).log(Level.SEVERE,null,e);
                        }

                }

                @FXML
                void manageOrdersOnAction(ActionEvent event) {
                        try {
                                Parent root= FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/employee/ManageOrders.fxml"));
                                operatorMiddlePane.getChildren().setAll(root);
                        } catch (IOException e) {
                                Logger.getLogger(OperatorDashBoardController.class.getName()).log(Level.SEVERE,null,e);
                        }


                }




}
