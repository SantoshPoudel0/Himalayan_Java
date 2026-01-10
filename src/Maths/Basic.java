package Maths;

public class Basic {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(3, 2);
        result = Math.abs(-6);  // abs giving positive value if it is in the negative .
        result = Math.sqrt(27);
        result = Math.round(3.13);
        result = Math.ceil(3.14);
        result = Math.floor(8.99);
        result = Math.max(10, 20 );
        result = Math.min(10, 20);

        System.out.println(result);

    }
}
