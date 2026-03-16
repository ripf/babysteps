public class OrderManagerWithDependency {

    private EmailService emailService;

    public OrderManagerWithDependency() {
        String[] config = {"localhost"};
        this.emailService = new EmailService(config);
    }

    public void processOrder() {
        // order has been processed
        this.emailService.sendMessage("test@test.de", "Order processed", "Some Text");
    }
}
