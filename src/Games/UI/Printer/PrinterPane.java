package Games.UI.Printer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaspe on 12/12/2017.
 * Stores User input and prints requested values.
 */
public class PrinterPane extends GridPane{

  private Label showText;
  private Map<String, String> keyList;

  private TextField keyField;
  private TextField inputField;
  private TextField requestField;

  private Button submit;
  private Button request;


  public PrinterPane(){
    initialize();
    place();
  }

  private void initialize(){
    showText = new Label();
    keyList = new HashMap<String, String>();

    // Set Textfields
    keyField = new TextField();
    keyField.setPrefColumnCount(12);
    keyField.setPromptText("Create a key.");

    inputField = new TextField();
    inputField.setPrefColumnCount(24);
    inputField.setPromptText("Create stored data.");

    requestField = new TextField();
    requestField.setPrefColumnCount(12);
    requestField.setPromptText("Enter a key.");

    // Set Buttons
    submit = new Button("Store");
    submit.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        // Neither field may be empty and the key may not exist already.
        if ((keyField.getText() != null && !keyField.getText().isEmpty()) && (inputField.getText() != null && !inputField.getText().isEmpty()) && !keyList.containsKey(keyField.getText())){
          showText.setText("Data stored! You can access it with key: " + keyField.getText());
          System.out.println("Value stored.");
          keyList.put(keyField.getText(), inputField.getText());
          System.out.println("Value stored.");
          keyField.clear();
          inputField.clear();
        } else if (keyList.containsKey(keyField.getText())){
          showText.setText("This key already exists. Please enter a new one.");
        } else {
          showText.setText("Either the key or input is invalid / empty. Please try again.");
        }
      }
    });
    request = new Button("Request");
    request.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        if (requestField.getText() != null){
          showText.setText(getValue(requestField.getText()));
          requestField.clear();
        } else {
          showText.setText("Request is invalid / empty. Please try again.");
        }
      }
    });
  }

  private void place(){
    setPadding(new Insets(10, 10, 10, 10));
    setVgap(8);
    setHgap(8);

    // Determine where elements will be placed.
    setConstraints(submit, 0, 0);
    setConstraints(keyField, 1, 0);
    setConstraints(inputField, 2, 0);
    setConstraints(showText, 0, 2);
    setConstraints(request, 0, 3);
    setConstraints(requestField, 1, 3);

    // Add elements to the Pane.
    getChildren().add(keyField);
    getChildren().add(inputField);
    getChildren().add(submit);
    getChildren().add(showText);
    getChildren().add(requestField);
    getChildren().add(request);
  }

  private String getValue(String key){
    if (keyList.containsKey(key)){
      System.out.println(keyList.get(key));
      return keyList.get(key);
    }
    return "Key not found.";
  }
}
