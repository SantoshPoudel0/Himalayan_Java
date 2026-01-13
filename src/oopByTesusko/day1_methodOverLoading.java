package oopByTesusko;


class calculator{
     public int add(int n1, int n2){
         return n1 + n2;
    }

    public int add(int n1, int n2, int n3){  // same method but different parameters
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2, double n3){
        return n1 + n2 + n3;
    }
}

public class day1_methodOverLoading {

    public static void main(String[] args) {
        calculator c = new calculator();

        int sum = c.add(3,4,5);


        System.out.println("The sum of two value is " + sum);



    }
}
