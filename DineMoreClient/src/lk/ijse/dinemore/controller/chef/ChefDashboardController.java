package lk.ijse.dinemore.controller.chef;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import lk.ijse.dinemore.controller.Admin.AdminDashboadController;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChefDashboardController {

        @FXML
        private AnchorPane chefPane;

        @FXML
        private Button btnChefView;

        @FXML
        private AnchorPane chefMiddlePane;

        @FXML
        void chefViewOnAction(ActionEvent event) {
                try {
                        AnchorPane pane=FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/chef/ChefView.fxml"));
                        chefMiddlePane.getChildren().setAll(pane);
                } catch (IOException ex) {
                        Logger.getLogger(AdminDashboadController.class.getName()).log(Level.SEVERE, null, ex);
                }


        }

}
