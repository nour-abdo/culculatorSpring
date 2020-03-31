package spring.com.calculator;

import org.springframework.context.annotation.Bean;

public class BeanFactory {

    @Bean
    public scientificCal getScientificCal() {
        return new scientificCal();
    }

    @Bean
    public basicCal getBasicCal() {
        return new basicCal();
    }

    @Bean
    public User getUser() {
        return new User();
    }

    @Bean
    public User1 getUser1() {
        return new User1();
    }

}

