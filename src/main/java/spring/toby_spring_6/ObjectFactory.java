package spring.toby_spring_6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectFactory {
    @Bean
    public PaymentService paymentService() {
        return new PaymentService(exrateProvider());
    }

    @Bean
    public ExRateProvider exrateProvider() {
        return new WebApiExRateProvider();
    }
}
