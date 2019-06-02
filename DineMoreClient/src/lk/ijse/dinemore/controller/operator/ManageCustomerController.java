package lk.ijse.dinemore.controller.operator;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import lk.ijse.dinemore.dto.CustomerDTO;
import lk.ijse.dinemore.service.custom.Customerservice;
import lk.ijse.dinemore.service.impl.custom.impl.CustomerSreviceImpl;

import java.rmi.RemoteException;

public class ManageCustomerController {

        private static Customerservice customerservice;

        static {
                try {
                        customerservice=new CustomerSreviceImpl();
                } catch (RemoteException e) {
                        e.printStackTrace();
                }
        }
        @FXML
        private AnchorPane manageCustomerPane;

        @FXML
        private JFXButton btnsaveCustomer;

        @FXML
        private TableView<?> tblManageCustiomer;

        @FXML
        private JFXButton btnDeleteCustomer;

        @FXML
        private JFXButton btnUpdateChebtnUpdateCustomerf;

        @FXML
        private JFXTextField txtCustomerId;

        @FXML
        private JFXTextField txtCustomerName;

        @FXML
        private JFXTextField txtCustomerNIC;

        @FXML
        private JFXTextField txtCustomerTP;

        @FXML
        private JFXTextField txtHouseNo;

        @FXML
        private JFXTextField txtLandMark;

        @FXML
        private TextField txtCustomerSearch;

        @FXML
        private JFXTextField txtTown;

        @FXML
        private JFXTextField txtCardNo;

        @FXML
        private JFXTextField txtExpiredate;

        @FXML
        private JFXComboBox<?> cmbCardType;

        @FXML
        void cardNoOnAction(ActionEvent event) {

        }

        @FXML
        void cardTypeOnAction(ActionEvent event) {

        }

        @FXML
        void customerIdOnAction(ActionEvent event) {

        }

        @FXML
        void customerNICOnAction(ActionEvent event) {

        }

        @FXML
        void customerNameOnAction(ActionEvent event) {

        }

        @FXML
        void customerSearchOnAction(ActionEvent event) {

        }

        @FXML
        void customerTPOnAction(ActionEvent event) {

        }

        @FXML
        void deleteCustomerOnAction(ActionEvent event) {

        }

        @FXML
        void expireDateOnAction(ActionEvent event) {

        }

        @FXML
        void houseNoOnAction(ActionEvent event) {

        }

        @FXML
        void landMarkOnAction(ActionEvent event) {

        }

        @FXML
        void saveCustomerOnAction(ActionEvent event) throws Exception {
                CustomerDTO customerDTO=new CustomerDTO(
                        txtCustomerId.getText(),
                        txtCustomerName.getText(),
                        txtCustomerNIC.getText(),
                        Integer.parseInt(txtCustomerNIC.getText()),
                        txtHouseNo.getText(),
                        txtLandMark.getText(),
                        txtTown.getText(),
                        (String) cmbCardType.getSelectionModel().getSelectedItem(),
                        Integer.parseInt(txtCardNo.getText()),
                        txtExpiredate.getText());

                        boolean isAdded=customerservice.addCustomer(customerDTO);
                        if(isAdded){
                        Alert alert=new Alert(Alert.AlertType.INFORMATION,"Customer added successfully",ButtonType.OK);
                        alert.show();
                }else{
                      Alert error=new Alert(Alert.AlertType.ERROR,"Something went wrong",ButtonType.OK);
                      error.show();
                }



        }

        @FXML
        void townOnAction(ActionEvent event) {

        }

        @FXML
        void updateCustomerOnAction(ActionEvent event) {

        }



}
