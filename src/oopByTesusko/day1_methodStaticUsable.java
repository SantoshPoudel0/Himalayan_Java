package oopByTesusko;

public class day1_methodStaticUsable {

    public static String money() {      // not need to pass the integer value using static
        return "momo";
    }

    public static void main(String[] args) {
        day1_methodStaticUsable mw = new day1_methodStaticUsable();
       String sr =  mw.money();
        System.out.println(sr);
    }
}
