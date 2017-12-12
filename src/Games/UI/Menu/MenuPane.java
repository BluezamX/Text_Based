package Games.UI.Menu;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 * Created by jaspe on 12/12/2017.
 * Contains Buttons that open new Tabs.
 */
public class MenuPane extends BorderPane {

  private static final String testString = "Test";

  private final Label testLabel;

  MenuPane(){
    this.testLabel = new Label(testString);
    setCenter(testLabel);
  }
}
