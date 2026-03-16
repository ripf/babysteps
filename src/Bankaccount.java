public class Bankaccount {
    private String owner;
    private String iban;
    private String bic;
    private double balance;
    private double creditAmount = 0;


    public Bankaccount(String iban, String bic) {
        this.iban = iban;
        this.bic = bic;
    }

    public Bankaccount(String iban, String bic, String owner) {
        this.iban = iban;
        this.bic = bic;
        this.owner = owner;
    }


    public void sendMoney(double amount, Bankaccount receiver) {
        // needs to be implemented
    }

    public void receiveMoney(double amount) {
        // needs to be implemented
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getIban() {
        return this.iban;
    }

    public String getBic() {
        return this.bic;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCreditAmount() {
        return this.creditAmount;
    }
}
