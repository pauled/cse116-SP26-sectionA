package week7polymorphism;

public class PlayerComparator extends Comparator<Player> {
    public boolean compare(Player a,Player b){
        if (a.getHP()>b.getHP()){
            return true;
        } else if (a.getHP()<b.getHP()){
            return false;
        } else {
            if (a.getDamageDealt()>b.getDamageDealt()){
                return true;
            } else {
                return false;
            }
        }
    }
}
