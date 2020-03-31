package spring.com.calculator;

public class scientificCal implements ScientificCalculator {
    double a;
    double b;
    double c;

    public void power(double a, double b ) {
       double  c = Math.pow(a, b);
        System.out.println(a+"^"+b+"="+c);



    }

    public void sqr(double a ) {
      double  b=Math.sqrt(a);
        System.out.println(a+"^0.5="+c);
    }
     /*public void operation () {

         System.out.println(a+"^"+b+"="+c);
          System.out.println(a+"^0.5="+c);

    }*/
}