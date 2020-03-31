package spring.com.calculator;

public class User {



    private basicCal basicCalculator;



    public void showOperation (double a, double b){
        this.basicCalculator.sum(a,b);
    this.basicCalculator.subtraction(a,b);
    this.basicCalculator.multiplication(a,b);
    this.basicCalculator.division(a,b);
   // this.basicCalculator.operation();
    }



    }

