package week7polymorphism;


import java.util.ArrayList;

public class Player extends Location {
    private int maxHP;
    private int HP;
    private int damageDealt;
    private ArrayList<Usable> inventory=new ArrayList<>();

    public Player(int maxHP, double x, double y){
        super(x,y);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
    }
    public Player(int maxHP){
        super(0,0);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
    }

    public int getHP(){
        int temp=this.HP;
        return temp;
    }
    public void takeDamage(int damage){
        this.HP-=damage;
    }
    public void attack(Player other){
        other.takeDamage(this.damageDealt);
    }
    public String toString(){
        String out="location: "+super.toString();
        out+="hp: ("+this.HP+"/"+this.maxHP+") damage:";
        out+=this.damageDealt;
        return out;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getDamageDealt() {
        return damageDealt;
    }

    public ArrayList<Usable> getInventory() {
        return inventory;
    }

    public void pickup(Usable item){
        this.inventory.add(item);
    }
    public void useItem(int loc, Player other){
        if (loc<this.inventory.size()){
            this.inventory.get(loc).use(other);
        }
    }

    public static void main(String[] args) {
        Player p1=new Player(10);
        Player p2=new Player(9);
        int temp=p1.getHP();
        System.out.println(temp);
        System.out.println(p1);
        System.out.println(p2);
        Player p3=p2;
        p1.attack(p2);
        p1.pickup(new HealthPotion(1,2,3));
        p1.useItem(0,p2);
    }
}
