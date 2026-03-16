public class OrderManagerWithDI {

    private MessagingService service;

    public OrderManagerWithDI(MessagingService service) {
        this.service = service;
    }

    public void processOrder() {
        this.service.sendMessage("", "");
    }
}
