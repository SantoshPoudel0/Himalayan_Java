import java.util.Scanner;
public class PrintfMethod {
    public static void main (String[] args){
        // printf is a method used to format output
        //  %f[flags][width][.precision][specifier-character]

        // [ flags ]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        // [ width ]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        double price1 = 9.99;
        double price2 = 100.23;
        double price3 = -54.23;

        String name = "Santosh";
        char firstLetter = 'S';
        double weight = 62.75;
        int age = 21;
        boolean isStudent = true;

        // specifier-character
        System.out.printf("My name is %s and I'm %d years old. \n", name, age);

        // precision using .2f

        System.out.printf("%s is a %d years old that's why his weight is %.2f and did you know he is a Student",
                name, age, weight );





    }
}
