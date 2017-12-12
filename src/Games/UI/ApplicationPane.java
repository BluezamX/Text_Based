package Games.UI;

import javafx.scene.layout.Pane;

/**
 * Created by jaspe on 12/12/2017.
 * Custom Pane that contains all other elements.
 */
public class ApplicationPane extends Pane {

  private final CustomTabPane tabs;

  ApplicationPane() {
    this.tabs = new CustomTabPane();

    getChildren().add(tabs);
  }
}
