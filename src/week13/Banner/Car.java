package week13.Banner;

public class Car {
    public boolean totaled;

    public Car(){
        this.totaled=false;
    }
    public void smash(){
        this.totaled=true;
    }
    public void drive(boolean overweight){
        if (this.totaled){
            System.out.println("Can't drive, smashed");
        } else if(overweight){
            System.out.println("The suspension was damaged");
        } else {
            System.out.println("Drive drive drivey drive drive");
        }
    }
}
