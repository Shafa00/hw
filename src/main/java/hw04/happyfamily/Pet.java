package hw04.happyfamily;

public class Pet {
    String species;
    String nickname;
    int age;
    int tricklevel;
    String [] habits;
    public Pet(String s,String n,int a,int t_l,String[]h){
        s=species;
        age=a;
        tricklevel=t_l;
        habits=h;
    }
    public Pet(String s,String n){
        s=species;
        n=nickname;
    }
    public Pet(){

    }
    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){

        System.out.printf("Hello, owner. I am %s. I miss you!\n",nickname);
    }
    public void foul(){
        System.out.println("I need to cover it up.");
    }
    public String toString(){
        String temp ="";
        for (String s:habits) {
            temp+= s + " ";

        }
        return(" species="+species+",nickname="+nickname+",age="+age+",tricklevel="+tricklevel+",habits="+temp);
    }

}
