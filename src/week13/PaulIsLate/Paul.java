package week13.PaulIsLate;

public class Paul {
    private Latesness state=new Late(this);

    public void makeCoffee(){
        this.state.makeCoffee();
    }
    public void setTimer(){
        this.state.setTimer();
    }
    public void run(){
        this.state.run();
    }
    public void setState(Latesness stateNew){
        this.state=stateNew;
    }
    public void aMiracleOccurs(){
        setState(new Early(this));
    }
    public void teach(){
        this.state.teach();
    }
    public void speakToStudentsBeforeClass(){
        this.state.speakToStudentsBeforeClass();
    }
}
