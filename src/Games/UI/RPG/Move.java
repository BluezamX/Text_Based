package Games.UI.RPG;

/**
 * Created by jaspe on 14/12/2017.
 * Moves that can be used by Characters.
 * Hot, Cold, Divine, Necrotic, Piercing, Smashing, Psychic
 * 1    2     3       4         5         6         7
 */
public class Move {

  private final int damage;
  private final String name;
  private final int effect;
  private final int type;

  public Move(int damage, String name, int effect, int type){
    this.damage = damage;
    this.name = name;
    this.effect = effect;
    this.type = type;
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

  public int getType(){return type;}
}
