import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class StudentRecordApp extends Application {
public static void main(String[] args) {
launch(args);
}

@Override
public void start(Stage stage) {
Label nameLabel = new Label("Student Name:");
TextField nameField = new TextField();

Label rollLabel = new Label("Roll Number:");
TextField rollField = new TextField();

Button submitButton = new Button("Submit");
Label messageLabel = new Label();

submitButton.setOnAction(e -> {
String name = nameField.getText();
String roll = rollField.getText();
if (name.isEmpty() || roll.isEmpty()) {
messageLabel.setText("Please fill all fields!");
} else {
messageLabel.setText("Student Added: " + name + " (Roll: " + roll + ")");
}
});

VBox layout = new VBox(10);
layout.getChildren().addAll(nameLabel, nameField, rollLabel, rollField, submitButton, messageLabel);

Scene scene = new Scene(layout, 300, 250);
stage.setTitle("Student Record Form");
stage.setScene(scene);
stage.show();
}
}
