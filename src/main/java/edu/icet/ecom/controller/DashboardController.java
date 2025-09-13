package edu.icet.ecom.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {

        Stage customerManagement = new Stage();
        Stage itemManagement = new Stage();
        Stage orderManagement = new Stage();
        Stage orderDetailsManagement = new Stage();

        @FXML
        private JFXButton btnCustomerManagement;

        @FXML
        private JFXButton btnItemManagement;

        @FXML
        private JFXButton btnOrderDetailManagement;

        @FXML
        private JFXButton btnOrderManagement;

        @FXML
        void btnCustomerManagementOnAction(ActionEvent event) {
            try {
                customerManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CustomerManagement.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            customerManagement.setResizable(false);
            customerManagement.show();

        }

        @FXML
        void btnItemManagementOnAction(ActionEvent event) {
            try {
                itemManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ItemManagement.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            itemManagement.setResizable(false);
            itemManagement.show();

        }

        @FXML
        void btnOrderDetailManagementOnAction(ActionEvent event) {
            try {
                orderDetailsManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/OrderDetailManagement.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            orderDetailsManagement.setResizable(false);
            orderDetailsManagement.show();
        }

        @FXML
        void btnOrderManagementOnAction(ActionEvent event) {
            try {
                orderManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/OrderManagement.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            orderManagement.setResizable(false);
            orderManagement.show();

        }

    }


