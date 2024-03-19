package interfaces;

public class PhonePe {

    public static void main(String[] args) {
        openBankingAPI openBankingAPI = new YesBankAPI();
        openBankingAPI.checkBalance();
        openBankingAPI.depositMoney("1234", 1000);
        openBankingAPI.getAccountInfo("1234");
        openBankingAPI.payBill("1234", "Electricity", 100);
        openBankingAPI.transferMoney("1234", "5678", 100);
        openBankingAPI.withdrawMoney("1234", 100);

        System.out.println("DEBUG");



        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");



        openBankingAPI = new ICICIBankAPI();
        openBankingAPI.checkBalance();
        openBankingAPI.depositMoney("1234", 1000);
        openBankingAPI.getAccountInfo("1234");
        openBankingAPI.payBill("1234", "Electricity", 100);
        openBankingAPI.transferMoney("1234", "5678", 100);
        openBankingAPI.withdrawMoney("1234", 100);



        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");


        openBankingAPI = new razorpay();
        openBankingAPI.checkBalance();
        openBankingAPI.depositMoney("1234", 1000);
        openBankingAPI.getAccountInfo("1234");
        openBankingAPI.payBill("1234", "Electricity", 100);
        openBankingAPI.transferMoney("1234", "5678", 100);
        openBankingAPI.withdrawMoney("1234", 100);



    }


}
