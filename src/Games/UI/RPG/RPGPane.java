package Games.UI.RPG;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.HashMap;

/**
 * Created by jaspe on 14/12/2017.
 * Small Turn-Based RPG Battle System
 */
public class RPGPane extends GridPane{

  private Label label;
  private Button button;

  public RPGPane(){
    initialize();
    place();
  }

  private void initialize(){
    label = new Label(" ");
    button = new Button("Button");
    Character char1 = createCharacter();
    Character char2 = createCharacter();
    button.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        label.setText(char1.getName());
      }
    });
  }

  private void place(){
    setConstraints(button, 0, 0);
    setConstraints(label, 0, 1);

    getChildren().add(button);
    getChildren().add(label);
  }

  private Character createCharacter(){
    Move[] moveList = new Move[4];
    moveList[0] = new Move(20, "Stomp", 0);
    moveList[1] = new Move(50, "Fire", 1);
    moveList[2] = new Move(10, "Chop", 2);
    moveList[3] = new Move(25, "Super Stomp", 0);
    return new Character("Jasper", 10, 10, 10, 10, moveList);
  }
}
