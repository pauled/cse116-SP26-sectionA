package week13.PaulIsLate;

public class OnTime extends Latesness{
    public OnTime(Paul paul){
        super(paul);
    }
    public void makeCoffee(){
        this.paul.setState(new Late(this.paul));
    }
    public void run(){
        this.paul.setState(new Early(this.paul));
    }
}
