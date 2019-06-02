package lk.ijse.dinemore.controller.chef;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;


import java.net.URL;
import java.util.ResourceBundle;


public class ChefViewController implements Initializable {



        @FXML
        private TableView<?> tblChefView;

        @FXML
        private JFXTextField searchQueue;

        @FXML
        private TableView<?> tableItemList;

        @FXML
        private JFXButton btnStart;

        @FXML
        private JFXButton btnFinish;

        @FXML
        private JFXTextField txtStartTime;

        @FXML
        private JFXTextField txtEndTime;

        @FXML
        void endTimeOnAction(ActionEvent event) {

        }

        @FXML
        void finishOnAction(ActionEvent event) {

        }

        @FXML
        void saveChefOnAction(ActionEvent event) {
        }

        @FXML
        void searchQueueOnAction(ActionEvent event) {

        }

        @FXML
        void startTimeOnAction(ActionEvent event) {

        }


        @Override
        public void initialize(URL location, ResourceBundle resources) {

        }
}
