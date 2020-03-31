package spring.com.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac= new AnnotationConfigApplicationContext(BeanFactory.class);
        //User1 userOne=ac.getBean(User1.class);
       // userOne.showOperation(16,2);
        /*User userTwo =ac.getBean(User.class);
        userTwo.showOperation(5,10);*/
        basicCal user11 =ac.getBean(basicCal.class);
        user11.division(12,2);
        scientificCal user22=ac.getBean(scientificCal.class);
        user22.power(5,2);
    }
}
