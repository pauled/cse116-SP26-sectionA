package week13.PaulIsLate;

public class NotYetLate extends Latesness{
    public NotYetLate(Paul paul){
        super(paul);
    }
    public void makeCoffee(){
        this.paul.setState(new Late(this.paul));
    }
    public void run(){
        this.paul.setState(new OnTime(this.paul));
    }
    public void setTimer(){
        this.paul.setState(new OnTime(this.paul));
    }
}
