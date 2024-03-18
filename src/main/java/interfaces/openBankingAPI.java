package interfaces;

public interface openBankingAPI {

    void checkBalance();
    void transferMoney(String accountNumber,String to, double amount);

    void payBill(String accountNumber, String billType, double amount);

    void withdrawMoney(String accountNumber, double amount);

    void depositMoney(String accountNumber, double amount);

    void getAccountInfo(String accountNumber);
}
