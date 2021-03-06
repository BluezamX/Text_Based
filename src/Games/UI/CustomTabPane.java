package Games.UI;

import Games.ApplicationRoot;
import Games.UI.Menu.MenuPane;
import javafx.scene.control.TabPane;

/**
 * Created by jaspe on 12/12/2017.
 * CustomTabPane that functions like a browser. Contains CustomTabs.
 */
public class CustomTabPane extends TabPane{

  CustomTabPane(){
    CustomTab menuTab = new CustomTab("Menu", false, new MenuPane(this));
    getTabs().add(menuTab);
    sizeToScene();
  }

  private void sizeToScene() {
    setPrefWidth(ApplicationRoot.resolution.getWidth());
    setPrefHeight(ApplicationRoot.resolution.getHeight());
    setStyle(".tab-pane {\n" +
        "  -fx-tab-min-width:64px;\n" +
        "  -fx-tab-max-width:64px;\n" +
        "  -fx-tab-min-height:32px;\n" +
        "  -fx-tab-max-height:32px;\n" +
        "}");
  }
}
