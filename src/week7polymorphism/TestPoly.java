package week7polymorphism;

import week6inheritance.HealthPotion;
import week6inheritance.Location;
import week6inheritance.Usable;
import week6inheritance.Weapon;

import java.util.ArrayList;

public class TestPoly {
    public static void main(String[] args) {
        ArrayList<Usable> things=new ArrayList<>();
        Usable l=new HealthPotion(10,1,2);
        things.add(l);
        l=new Weapon(3,4,5);
        things.add(l);
    }
}
