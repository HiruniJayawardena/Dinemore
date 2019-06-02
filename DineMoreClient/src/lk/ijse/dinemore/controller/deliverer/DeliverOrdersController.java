package lk.ijse.dinemore.controller.deliverer;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;


public class DeliverOrdersController {

                @FXML
                private TableView<?> tblDelivererView;

                @FXML
                private JFXTextField searchQueue;

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




}
