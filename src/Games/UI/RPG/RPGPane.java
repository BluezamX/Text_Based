package Games.UI.RPG;

import javafx.geometry.Rectangle2D;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Screen;

/**
 * Created by jaspe on 14/12/2017.
 * Small Turn-Based RPG Battle System
 */
public class RPGPane extends GridPane{

  private GridPane statPane;
  private GridPane movePane;
  private Character char1;
  private Character char2;

  public RPGPane(){
    initialize();
    place();
  }

  private void initialize(){
    char1 = createCharacter();
    char2 = createCharacter();
    configureStats();
    configureMoves();
  }

  private void configureStats(){
    // Create a separate GridPane to show a table with Stats.
    // Stats are readable.
    statPane = new GridPane();
    statPane.setGridLinesVisible(true);
    String[] types = new String[]{"Health", "Attack", "Defense", "Speed"};
    int[] values = new int[]{char1.getHp(), char1.getAtk(), char1.getDef(), char1.getSpe()};
    Label[] labels = new Label[10];
    int i = 0;
    int j = 2;
    int k = 2;
    labels[0] = new Label("Name");
    labels[1] = new Label(char1.getName());
    statPane.setConstraints(labels[0], 0, 0);
    statPane.setConstraints(labels[1], 1, 0);
    for (String type : types){
      labels[j] = new Label(types[i]);
      j++;
      labels[j] = new Label(Integer.toString(values[i]));
      j++;
      statPane.setConstraints(labels[k], 0, i + 1);
      statPane.setConstraints(labels[k + 1], 1, i + 1);
      i++;
      k += 2;
    }
    i = 0;
    for (Label label : labels){
      statPane.getChildren().add(labels[i]);
      i++;
    }
//    statPane.setMinHeight(516);
//    statPane.setMaxHeight(516);
//    statPane.setMinWidth(516);
//    statPane.setMaxWidth(516);
  }

  private void configureMoves(){
    // Create a separate GridPane for Moves.
    // Moves are clickable.
    movePane = new GridPane();
    movePane.setGridLinesVisible(true);
    Move[] moves = char1.getMoves();
    Button[] buttons = new Button[4];
    int i = 0;
    int j = 0;
    while (i < 3){
      buttons[i] = new Button(moves[i].getName());
      buttons[i + 1] = new Button(moves[i + 1].getName());
      movePane.setConstraints(buttons[i], 0, j);
      movePane.setConstraints(buttons[i + 1], 1, j);
      System.out.println("Succes");
      i += 2;
      j++;
    }
    i = 0;
    for (Button button : buttons){
      button.setMinHeight(64);
      button.setMaxHeight(64);
      button.setMinWidth(128);
      button.setMaxWidth(128);
      movePane.getChildren().add(buttons[i]);
      System.out.println("Succes again");
      i++;
    }
  }

  private void place(){
    setConstraints(statPane, 0, 0);
    setConstraints(movePane, 1, 0);
    getChildren().add(statPane);
    getChildren().add(movePane);
    setGridLinesVisible(true);
  }

  private Character createCharacter(){
    Move[] moveList = new Move[4];
    moveList[0] = new Move(20, "Stomp", 0, 1);
    moveList[1] = new Move(50, "Fire", 1, 2);
    moveList[2] = new Move(10, "Chop", 2, 1);
    moveList[3] = new Move(25, "Super Stomp", 0, 1);
    return new Character("Jasper", 10, 10, 10, 10, moveList);
  }
}
