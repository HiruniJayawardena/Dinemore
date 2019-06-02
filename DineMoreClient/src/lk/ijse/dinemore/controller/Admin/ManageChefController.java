package lk.ijse.dinemore.controller.Admin;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.dinemore.common.IDGenerator;
import lk.ijse.dinemore.dto.ChefDTO;
import lk.ijse.dinemore.proxy.ProxyHandler;
import lk.ijse.dinemore.service.ServiceFactory;
import lk.ijse.dinemore.service.custom.ChefService;
import lk.ijse.dinemore.service.impl.custom.impl.ChefServiceImpl;

import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ManageChefController implements Initializable {
    private static ChefService chefService;

    static {
        try {
            chefService = new ChefServiceImpl();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private AnchorPane manageChefPane;

    @FXML
    private JFXButton btnSaveChef;

    @FXML
    private TableView<ChefDTO> tblChef;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnUpdateChef;

    @FXML
    private JFXTextField txtChefId;

    @FXML
    private JFXTextField txtChefName;

    @FXML
    private JFXTextField txtChefAddress;

    @FXML
    private JFXTextField txtChefNIC;

    @FXML
    private JFXTextField txtChefConNo;

    @FXML
    private JFXTextField txtChefSalary;

    @FXML
    private TextField txtChefSearch;

    @FXML
    void chefAddressOnAction(ActionEvent event) {

    }

    @FXML
    void chefConNoOnAction(ActionEvent event) {

    }

    @FXML
    void chefIdOnAction(ActionEvent event) {

    }

    @FXML
    void chefNICOnAction(ActionEvent event) {

    }

    @FXML
    void chefNameOnAction(ActionEvent event) {

    }

    @FXML
    void chefSalaryOnAction(ActionEvent event) {

    }

    @FXML
    void chefSearchOnAction(ActionEvent event) {

    }

    @FXML
    void chefUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void deleteChefOnAction(ActionEvent event) {

    }

    @FXML
    void saveChefOnAction(ActionEvent event) throws Exception {
        ChefDTO chefDTO=new ChefDTO(
                txtChefId.getText(),
                txtChefName.getText(),
                txtChefAddress.getText(),
                txtChefConNo.getText(),
                Double.parseDouble(txtChefSalary.getText()));
                boolean isAdded=chefService.addChef(chefDTO);
                if(isAdded){
                    Alert alert=new Alert(Alert.AlertType.INFORMATION,"Chef Addsd Successfully",ButtonType.OK);
                    alert.show();

                }else{
                    Alert error=new Alert(Alert.AlertType.ERROR,"Something went wrong", ButtonType.OK);
                    error.show();
                }


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        tblChef.getColumns().get(0).setCellValueFactory(new  PropertyValueFactory<>("chefId"));
        tblChef.getColumns().get(1).setCellValueFactory(new  PropertyValueFactory<>("chefName"));
        tblChef.getColumns().get(2).setCellValueFactory(new  PropertyValueFactory<>("chefAddress"));
        tblChef.getColumns().get(3).setCellValueFactory(new  PropertyValueFactory<>("chefContactNo"));
        tblChef.getColumns().get(4).setCellValueFactory(new  PropertyValueFactory<>("chefSalary"));

//        try {
//            loadChefId();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


    }
//
//    private void loadChefId() throws SQLException, IOException, ClassNotFoundException {
//        String chefId;
//        chefId=IDGenerator.getNewID("Chef","chefId","CH");
//        txtChefId.setText(chefId);
//    }

}
