package Games.UI.Menu;

import Games.UI.CustomTab;

/**
 * Created by jaspe on 12/12/2017.
 * Unclosable tab. Contains the main menu at MenuPane.
 */
public class MenuTab extends CustomTab {

  private final MenuPane pane;

  public MenuTab(){
    super("Menu");
    this.setClosable(false);

    this.pane = new MenuPane();
    setContent(this.pane);
  }
}
