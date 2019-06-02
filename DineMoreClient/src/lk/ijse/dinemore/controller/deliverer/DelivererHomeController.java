package lk.ijse.dinemore.controller.deliverer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DelivererHomeController {

    @FXML
    private Button btnDelivererView;

    @FXML
    private Button btnPayment;

    @FXML
    private AnchorPane delivererMiddlePane;

    @FXML
    void dellivererViewOnAction(ActionEvent event){

        try {
            Parent root= FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/deliverer/DelivererOrders.fxml"));
            delivererMiddlePane.getChildren().setAll(root);
        } catch (IOException e) {
            Logger.getLogger(DelivererHomeController.class.getName()).log(Level.SEVERE,null,e);
        }


    }

    @FXML
    void paymentOnAction(ActionEvent event) {
        try {
            Parent root= FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/deliverer/UpdatePayments.fxml"));
            delivererMiddlePane.getChildren().setAll(root);
        } catch (IOException e) {
            Logger.getLogger(DelivererHomeController.class.getName()).log(Level.SEVERE,null,e);
        }


    }

}
