package lk.ijse.dinemore.controller.Admin;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lk.ijse.dinemore.dto.ItemDTO;
import lk.ijse.dinemore.entity.Item;
import lk.ijse.dinemore.service.custom.ItemService;
import lk.ijse.dinemore.service.impl.custom.impl.ItemServiceImpl;

import java.rmi.RemoteException;


public class ManageMenuController {

        private static ItemService itemService;

        static {
                try {
                        itemService=new ItemServiceImpl();
                } catch (RemoteException e) {
                        e.printStackTrace();
                }
        }

        @FXML
        private JFXButton btnItemSave;

        @FXML
        private TableView<?> tblItem;

        @FXML
        private JFXButton btnDeleteItem;

        @FXML
        private JFXButton btnUpdateItem;

        @FXML
        private JFXTextField txtItemCode;

        @FXML
        private JFXTextField txtItemName;

        @FXML
        private JFXTextField txtItemPrice;

        @FXML
        private TextField txtItemSearch;

        @FXML
        void itemCodeOnAction(ActionEvent event) {

        }

        @FXML
        void itemDeleteOnAction(ActionEvent event) {

        }

        @FXML
        void itemNameOnAction(ActionEvent event) {

        }

        @FXML
        void itemPriceOnAction(ActionEvent event) {

        }

        @FXML
        void itemSearchOnAction(ActionEvent event) {

        }

        @FXML
        void saveItemOnAction(ActionEvent event) throws Exception {
                ItemDTO itemDTO=new ItemDTO(
                        txtItemCode.getText(),
                        txtItemName.getText(),
                        Double.parseDouble(txtItemPrice.getText()));
                boolean isAdded=itemService.addItem(itemDTO);
                if(isAdded){
                        Alert alert=new Alert(Alert.AlertType.INFORMATION,"Chef Addsd Successfully",ButtonType.OK);
                        alert.show();

                }else{
                        Alert error=new Alert(Alert.AlertType.ERROR,"Something went wrong", ButtonType.OK);
                        error.show();
                }


        }

        @FXML
        void updateItemOnAction(ActionEvent event) {

        }



}
