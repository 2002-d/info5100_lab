
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yashu
 */
public class Contoller { 
    @FXML
    TextField nameTextfield;
    @FXML
    TextField ageTextField;
    @FXML
    TextField emailTextField;
    
    public void submit(ActionEvent event){
        System.out.println("Submitted");
        String name = nameTextfield.getText();
        String age = ageTextField.getText();
        String email = emailTextField.getText();
        if (name.isEmpty() || age.isEmpty() || email.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Error", "All fields are required!");
            return;
        }

        if (!isNumeric(age)) {
            showAlert(Alert.AlertType.ERROR, "Error", "Age must be a valid number!");
            return;
        }

        if (!isValidEmail(email)) {
            showAlert(Alert.AlertType.ERROR, "Error", "Invalid email format!");
            return;
        }

        // If all validations pass, show the success alert
        showAlert(Alert.AlertType.INFORMATION, "Submitted", 
            "Submitted Details: Name: " + name + " Age: " + age + " Email: " + email);
    }

private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Helper method to check if a string is numeric
    private boolean isNumeric(String str) {
        return str.matches("\\d+");  // Checks if the string contains only digits
    }

    // Helper method to validate email format (basic regex)
    private boolean isValidEmail(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }
}
        

    
