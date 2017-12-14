package Games.UI.RPG;

/**
 * Created by jaspe on 14/12/2017.
 * Character with stats to be used in the RPG Game.
 */
public class Character {

  private final int atk;
  private final int def;
  private final int spe;
  private final int hp;
  private final String name;
  private final Move[] moves;

  public Character(String name, int atk, int def, int spe, int hp, Move[] moves){
    this.name = name;
    this.atk = atk;
    this.def = def;
    this.spe = spe;
    this.hp = hp;
    this.moves = moves;
  }

  public int getAtk() {
    return atk;
  }

  public int getDef() {
    return def;
  }

  public int getSpe() {
    return spe;
  }

  public int getHp() {
    return hp;
  }

  public Move getMove(int number) {
    return moves[number];
  }

  public String getName(){
    return name;
  }
}
