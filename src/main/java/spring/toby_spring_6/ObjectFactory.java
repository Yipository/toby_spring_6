package spring.toby_spring_6;

public class ObjectFactory {
    public PaymentService paymentService() {
        return new PaymentService(exrateProvider());
    }

    public ExRateProvider exrateProvider() {
        return new SimpleExRateProvider();
    }
}
