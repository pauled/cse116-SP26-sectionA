package week6inheritance;


public class Weapon extends Location implements Usable{
    private int damage;

    public Weapon(double x,double y,int damage){
        super(x,y);
        this.damage=damage;
    }
    public String toString(){
        String out=super.toString();
        out+=" damage:"+this.damage;
        return out;
    }

    public void use(Player player){
        player.takeDamage(this.damage);
    }
}
