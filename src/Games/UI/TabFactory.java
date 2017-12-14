package Games.UI;

import Games.UI.Menu.MenuPane;
import Games.UI.Printer.PrinterPane;
import Games.UI.RPG.RPGPane;

/**
 * Created by jaspe on 12/12/2017.
 * Factory for all Tabs except Menu.
 */
public class TabFactory {

  public CustomTab create(int option){
    switch(option){
      case 0:
        System.out.println("Invalid code.");
        break;

      case 1:
        return new CustomTab("Printer", true, new PrinterPane());

      case 2:
        return new CustomTab("RPG", true, new RPGPane());

      default:
        System.out.println("Invalid code.");
        break;
    }
    return new CustomTab("Printer", true, new PrinterPane());
  }
}
