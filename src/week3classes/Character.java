package week3classes;

public class Character {
    private int battlesWon;
    private int expPts;

    public Character(){
        this.battlesWon=0;
        this.expPts=0;
    }
    public void winBattle(int xp){
        this.battlesWon++;
        this.expPts+=xp;
    }
    public String toString(){
        String out="battles won: "+this.battlesWon;
        out+=" xp: "+this.expPts;
        return out;
    }
}
