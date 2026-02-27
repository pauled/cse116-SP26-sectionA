package week6inheritance;



public class HealthPotion extends Location implements Usable{
    private int increase;

    public HealthPotion(int increase, double x,double y){
        super(x,y);
        this.increase=increase;
        //this.xLoc=9;
    }
    public void use(Player player){
        player.takeDamage(-this.increase);
    }
    public void useless(){}
    public String toString(){
        String out=super.toString();
        out+="increase: "+this.increase;
        return out;
    }

    public static void main(String[] args) {
        HealthPotion h1=new HealthPotion(10,0,1);
        Weapon w1=new Weapon(3,4,5);
        System.out.println(h1);
        System.out.println(w1);
        h1.move(10,10);
        w1.move(20,20);
        System.out.println(h1);
        System.out.println(w1);
    }
}
