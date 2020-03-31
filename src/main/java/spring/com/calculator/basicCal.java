package spring.com.calculator;

public class basicCal implements BasicCalculator {
    /*double a;
    double b;
    double c;*/

    public void sum(double a, double b) {
        double c=a+b;
        System.out.println(a+"+"+b+"="+c);

    }

    public void subtraction(double a, double b) {
        double c= a-b;
        System.out.println(a+"-"+b+"="+c);

    }

    public void division(double a, double b) {
        double c= a/b;
        System.out.println(a+"/"+b+"="+c);

    }

    public void multiplication(double a, double b) {
        double c=a*b;
        System.out.println(a+"*"+b+"="+c);

    }

/*
    public void operation () {

        System.out.println(a+"+"+b+"="+c);
        System.out.println(a+"-"+b+"="+c);
        System.out.println(a+"*"+b+"="+c);
        System.out.println(a+"/"+b+"="+c);

    }*/


}
