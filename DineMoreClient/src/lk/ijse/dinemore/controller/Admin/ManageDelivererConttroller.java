package lk.ijse.dinemore.controller.Admin;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lk.ijse.dinemore.dto.DelivererDTO;
import lk.ijse.dinemore.service.custom.DelivererService;
import lk.ijse.dinemore.service.impl.custom.impl.DelivererServiceImpl;

import java.rmi.RemoteException;

public class ManageDelivererConttroller {
        private static DelivererService delivererService;

        static {
                try {
                        delivererService=new DelivererServiceImpl();
                } catch (RemoteException e) {
                        e.printStackTrace();
                }
        }

        @FXML
        private JFXButton btnDelivererSave;

        @FXML
        private TableView<?> tblDeliverer;

        @FXML
        private JFXButton btnDeleteDeliverer;

        @FXML
        private JFXButton btnUpdateDeliverer;

        @FXML
        private JFXTextField txtDelivererId;

        @FXML
        private JFXTextField txtDelivererName;

        @FXML
        private JFXTextField txtDelivererAddress;

        @FXML
        private JFXTextField txtDelivererNIC;

        @FXML
        private JFXTextField txtDelivererContact;

        @FXML
        private JFXTextField txtDelivererSalary;

        @FXML
        private TextField txtDelivererSearch;

        @FXML
        void deleteDelivererOnAction(ActionEvent event) {

        }

        @FXML
        void delivererAddressOnAction(ActionEvent event) {

        }

        @FXML
        void delivererContactOnAction(ActionEvent event) {

        }

        @FXML
        void delivererIdOnAction(ActionEvent event) {

        }

        @FXML
        void delivererNICOnAction(ActionEvent event) {

        }

        @FXML
        void delivererNameOnAction(ActionEvent event) {

        }

        @FXML
        void delivererSalaryOnAction(ActionEvent event) {

        }

        @FXML
        void delivererSearchOnAction(ActionEvent event) {

        }

        @FXML
        void delivererUpdateOnAction(ActionEvent event) {

        }

        @FXML
        void saveDelivererOnAction(ActionEvent event) throws Exception {
                DelivererDTO delivererDTO=new DelivererDTO(
                        txtDelivererId.getText(),
                        txtDelivererName.getText(),
                        txtDelivererAddress.getText(),
                        txtDelivererContact.getText(),
                        Double.parseDouble(txtDelivererSalary.getText()));
                boolean isAdded=delivererService.addDeliverer(delivererDTO);
                if(isAdded){
                        Alert alert=new Alert(Alert.AlertType.INFORMATION,"Chef Addsd Successfully",ButtonType.OK);
                        alert.show();

                }else{
                        Alert error=new Alert(Alert.AlertType.ERROR,"Something went Wrong",ButtonType.OK);
                        error.show();
                }

        }



}
