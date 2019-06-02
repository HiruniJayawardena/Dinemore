package lk.ijse.dinemore.controller.operator;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;


public class CustomerOrderController {


        @FXML
        private JFXButton btnSaveOrder;

        @FXML
        private TableView<?> tblCustomerOrder;

        @FXML
        private JFXButton btnDelete;

        @FXML
        private JFXButton btnUpdateChef;

        @FXML
        private JFXTextField txtReceptionId;

        @FXML
        private JFXTextField txtOrderId;

        @FXML
        private JFXTextField txtTotalPrice;

        @FXML
        private JFXTextField txtReceptionName;

        @FXML
        private TableView<?> tblItem;

        @FXML
        private Label lblOnDelivery;

        @FXML
        private Label lblFinishCook;

        @FXML
        private Label lblChefAccepted;

        @FXML
        private Label lblOnQueue;

        @FXML
        private JFXTextField txtSerarchOrderId;

        @FXML
        private JFXTextField txtOrderQty;

        @FXML
        private JFXComboBox<?> cmbmenu;

        @FXML
        private JFXButton btnAddItem;

        @FXML
        void OrderIdOnAction(ActionEvent event) {

        }

        @FXML
        void addItemOnAction(ActionEvent event) {

        }

        @FXML
        void chefUpdateOnAction(ActionEvent event) {

        }

        @FXML
        void deleteChefOnAction(ActionEvent event) {

        }

        @FXML
        void menuOnAction(ActionEvent event) {

        }

        @FXML
        void orderIdOnAction(ActionEvent event) {

        }

        @FXML
        void orderQtyOnAction(ActionEvent event) {

        }

        @FXML
        void receptionIdOnAction(ActionEvent event) {

        }

        @FXML
        void receptionnameOnAction(ActionEvent event) {

        }

        @FXML
        void saveChefOnAction(ActionEvent event) {

        }

        @FXML
        void totalPriceOnAction(ActionEvent event) {

        }



}
