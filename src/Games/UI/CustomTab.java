package Games.UI;

import javafx.scene.control.Tab;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 * Created by jaspe on 12/12/2017.
 * Custom Tab used by CustomTabPane. CustomTabs are created by TabFactory.
 */
public class CustomTab extends Tab {

  public Pane pane;

  public CustomTab(String name, boolean closable, Pane pane) {
    setGraphic(new Text(name));
    this.setClosable(closable);
    this.pane = pane;
    setContent(this.pane);
  }
}
