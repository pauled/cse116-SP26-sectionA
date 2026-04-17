package week13.PaulIsLate;

public class Early extends Latesness{
    public Early(Paul paul){
        super(paul);
    }
    public void makeCoffee(){
        this.paul.setState(new OnTime(this.paul));
    }
    public void run(){
        System.out.println("what do I do  with all this time,I feel akward");
    }
    public void speakToStudentsBeforeClass(){
        System.out.println("sure, let's chat");
    }
}
