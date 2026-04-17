package week13.PaulIsLate;

public abstract class Latesness {
    protected Paul paul;

    public Latesness(Paul paul){
        this.paul=paul;
    }
    public void setTimer(){
        System.out.println("I'm all good, not gonna be late");
    }
    public abstract void makeCoffee();
    public abstract void run();
    public void teach(){
        System.out.println("cover material as expected");
    }
    public void speakToStudentsBeforeClass(){
        System.out.println("there is never time for this");
    }
}
