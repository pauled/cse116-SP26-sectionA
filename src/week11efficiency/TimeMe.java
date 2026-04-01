package week11efficiency;

public class TimeMe {
    long start;
    long end;

    public TimeMe(){
        start=0;
        end=0;
    }
    public void start(){
        start=System.currentTimeMillis();
    }
    public void lap(){
        end=System.currentTimeMillis();
    }
    public void printTime(){
        int dif=(int)(end-start);
        int milli=(int)(end-start);
        milli%=1000;
        dif/=1000;
        System.out.printf("%02d:%02d:%02d.%03d\n",dif/3600,(dif/60)%60,dif%60,milli);
    }
}
