package Games.UI.RPG;

/**
 * Created by jaspe on 14/12/2017.
 * Moves that can be used by Characters.
 */
public class Move {

  private final int damage;
  private final String name;
  private final int effect;

  public Move(int damage, String name, int effect){
    this.damage = damage;
    this.name = name;
    this.effect = effect;
  }

  public int getDamage(){
    return damage;
  }

  public String getName(){
    return name;
  }

  public int getEffect(){
    return effect;
  }
}
