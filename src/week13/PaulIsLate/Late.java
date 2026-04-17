package week13.PaulIsLate;

public class Late extends Latesness{
    public Late(Paul paul){
        super(paul);
    }
    public void makeCoffee(){
        System.out.println("now even later");
    }
    public void run(){
        System.out.println("...still late");
    }
    public void setTimer(){
        this.paul.setState(new NotYetLate(this.paul));
    }
    public void teach(){
        System.out.println("compress material into shorter time");
    }
}
