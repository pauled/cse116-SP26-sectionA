package week3classes;

import java.util.ArrayList;

public class Party {
    private int battlesWon;
    private ArrayList<Character> members;

    public Party(){
        this.battlesWon=0;
        this.members=new ArrayList<>();
    }
    public void addMember(Character member){
        this.members.add(member);
    }
    public void winBattle(int xp){
        this.battlesWon++;
        for (Character member : this.members){
            member.winBattle(xp);
        }
    }
    public String toString(){
        String out="Battles won: "+this.battlesWon+"\n";
        out+="members:\n";
        for (int i=0;i<this.members.size();i++){
            out+="-"+this.members.get(i).toString()+"\n";
        }
        return out;
    }

    public static void main(String[] args) {
        Party p=new Party();
        Character c1=new Character();
        Character c2=new Character();
        c1.winBattle(10);
        p.addMember(c1);
        p.winBattle(20);
        p.addMember(c2);
        System.out.println(p);
        Character c3=new Character();
        Character c4=new Character();
        System.out.println(c3==c4);
    }
}
