package oopByTesusko;

class computer{

    public void workHeavy(){
        System.out.println("working heavily ");
    }

    public String getMeAPen(int cost) {
        return "pen";
    }
}


public class day1_Method {
    public static void main(String[] args){
        computer com = new computer();
        com.workHeavy();
        String str = com.getMeAPen(10);
        System.out.println(str);

    }
}
