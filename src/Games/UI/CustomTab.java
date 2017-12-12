package Games.UI;

import javafx.scene.control.Tab;
import javafx.scene.text.Text;

/**
 * Created by jaspe on 12/12/2017.
 * Custom Tab used by CustomTabPane. Is Extended by individual panes.
 */
public class CustomTab extends Tab {

  public CustomTab(String name) {
    Text text = new Text(name);
    setGraphic(text);
  }
}
