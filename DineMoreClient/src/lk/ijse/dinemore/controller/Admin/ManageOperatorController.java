package lk.ijse.dinemore.controller.Admin;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lk.ijse.dinemore.dto.OperatorsDTO;
import lk.ijse.dinemore.service.custom.OperatorsService;
import lk.ijse.dinemore.service.impl.custom.impl.OperatorsServiceImpl;

import java.rmi.RemoteException;

public class ManageOperatorController {
        private static OperatorsService operatorsService;

        static {
                try {
                        operatorsService=new OperatorsServiceImpl();
                } catch (RemoteException e) {
                        e.printStackTrace();
                }
        }

        @FXML
        private JFXButton btnSaveOperator;

        @FXML
        private TableView<?> tblOperator;

        @FXML
        private JFXButton btnDeleteOperator;

        @FXML
        private JFXButton btnUpdateOperator;

        @FXML
        private JFXTextField txtOperatorId;

        @FXML
        private JFXTextField txtOperatorName;

        @FXML
        private JFXTextField txtOperatorAddress;

        @FXML
        private JFXTextField txtOperatorNIC;

        @FXML
        private JFXTextField txtOperatorContact;

        @FXML
        private JFXTextField txtOperatorSalary;

        @FXML
        private TextField txtOperatorSearch;

        @FXML
        void operatorAddressOnAction(ActionEvent event) {

        }

        @FXML
        void operatorContactOnAction(ActionEvent event) {

        }

        @FXML
        void operatorDeleteOnAction(ActionEvent event) {

        }

        @FXML
        void operatorIdOnAction(ActionEvent event) {

        }

        @FXML
        void operatorNICOnAction(ActionEvent event) {

        }

        @FXML
        void operatorNameOnAction(ActionEvent event) {

        }

        @FXML
        void operatorSalaryOnAction(ActionEvent event) {

        }

        @FXML
        void operatorSaveOnAction(ActionEvent event) {

        }

        @FXML
        void operatorSearchOnAction(ActionEvent event) {

        }

        @FXML
        void saveOperatorOnAction(ActionEvent event) throws Exception {
                OperatorsDTO operatorsDTO=new OperatorsDTO(
                        txtOperatorId.getText(),
                        txtOperatorName.getText(),
                        txtOperatorAddress.getText(),
                        txtOperatorContact.getText(),
                        Double.parseDouble(txtOperatorSalary.getText()));

                boolean isAdded=operatorsService.addOperators(operatorsDTO);
                if(isAdded) {
                        Alert alert=new Alert(Alert.AlertType.INFORMATION,"Operator Added SuccessFully",ButtonType.OK);
                        alert.show();

                }else {
                        Alert error=new Alert(Alert.AlertType.ERROR,"Something went wrong",ButtonType.OK);
                        error.show();
                }
        }
}
