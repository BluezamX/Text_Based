package Games.UI.Menu;

import Games.UI.CustomTabPane;
import Games.UI.TabFactory;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 * Created by jaspe on 12/12/2017.
 * Contains Buttons that open new Tabs.
 */
public class MenuPane extends GridPane {

  private final TabFactory tabfactory;
  private final CustomTabPane tabpane;

  private Button printerButton;
  private Button rpgButton;

  public MenuPane(CustomTabPane tabpane){
    this.tabpane = tabpane;
    tabfactory = new TabFactory();
    initialize();
    place();
  }

  private void initialize(){
    // Set Buttons
    printerButton = new Button("Printer");
    printerButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        // Opens a new Printer Tab
        tabpane.getTabs().add(tabfactory.create(1));
      }
    });
    rpgButton = new Button("RPG Game");
    rpgButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        // Opens a new Printer Tab
        tabpane.getTabs().add(tabfactory.create(2));
      }
    });
  }

  private void place() {
    setPadding(new Insets(10, 10, 10, 10));
    setVgap(8);
    setHgap(8);

    // Determine where elements will be placed.
    setConstraints(printerButton, 0, 0);
    setConstraints(rpgButton, 1, 0);

    // Add elements to the Pane.
    getChildren().add(printerButton);
    getChildren().add(rpgButton);
  }


}
