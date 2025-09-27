package edu.icet.ecom.controller.customerController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import edu.icet.ecom.model.Customer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerManagementFormController implements Initializable{

    ObservableList <Customer> customers = FXCollections.observableArrayList();


        @FXML
        private JFXButton btnAdd;

        @FXML
        private JFXButton btnClear;

        @FXML
        private JFXButton btnDelete;

        @FXML
        private JFXButton btnUpdate;

        @FXML
        private TableColumn<?, ?> colId;

        @FXML
        private JFXComboBox<String> comboProvince;

        @FXML
        private JFXComboBox<String> comboTitle;

        @FXML
        private DatePicker dateDOB;

        @FXML
        private JFXTextField txtAddress;

        @FXML
        private JFXTextField txtCity;

        @FXML
        private JFXTextField txtCustomerId;

        @FXML
        private JFXTextField txtName;

        @FXML
        private JFXTextField txtPostalCode;

        @FXML
        private JFXTextField txtSalary;

        @FXML
        void btnAddOnAction(ActionEvent event) {

        }

        @FXML
        void btnClearOnAction(ActionEvent event) {
            txtCustomerId.setText(null);
            comboTitle.getSelectionModel().clearSelection();
            txtName.setText(null);
            dateDOB.setValue(null);
            txtSalary.setText(null);
            txtAddress.setText(null);
            txtCity.setText(null);
            comboProvince.getSelectionModel().clearSelection();
            txtPostalCode.setText(null);

        }

        @FXML
        void btnDeleteOnAction(ActionEvent event) {

        }

        @FXML
        void btnUpdateOnAction(ActionEvent event) {

        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //        ------initialize comboTitle -------
        ObservableList <String> titles = FXCollections.observableArrayList(
                "Mr",
                "Miss",
                "Ms"
        );
        comboTitle.setItems(titles);

        //        ------initialize comboProvince -------
        ObservableList <String> province = FXCollections.observableArrayList(
                "Western",
                "Central",
                "Eastern",
                "Southern",
                "Northern",
                "North Western",
                "North Central",
                "Uva",
                "Sabaragamuwa"
        );
        comboProvince.setItems(province);

    }
}
