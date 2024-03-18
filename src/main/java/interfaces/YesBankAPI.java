package interfaces;

public class YesBankAPI implements openBankingAPI{

    public void checkBalance(){
        System.out.println("Checking Balance");
    }
    public void transferMoney(String accountNumber,String to, double amount){
        System.out.println("Transferring Money");
    }
    public void payBill(String accountNumber, String billType, double amount){
        System.out.println("Paying Bill");
    }
    public void withdrawMoney(String accountNumber, double amount){
        System.out.println("Withdrawing Money");
    }
    public void depositMoney(String accountNumber, double amount){
        System.out.println("Depositing Money");
    }
    public void getAccountInfo(String accountNumber){
        System.out.println("Getting Account Info");
    }

}
