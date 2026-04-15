package week13.Banner;

public class ProfHulk  implements State{
    private BruceBanner banner;

    public ProfHulk(BruceBanner banner){
        this.banner=banner;
    }
    public void makeAngry(){
        System.out.println("I'm angry, so what?");
    }
    public void calmDown(){
        System.out.println("already calm, your point?");
    }
    public void useCar(Car car){
        car.drive(true);
    }
    public void fight(){
        System.out.println("smash with precision");
    }
}
