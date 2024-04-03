package collections;

public class Payemnt {

    private String paymentId;
    private String paymentType;
    private double amount;
    private PaymentStatus status;

    public Payemnt(String paymentId, String paymentType, double amount, PaymentStatus status) {
        this.paymentId = paymentId;
        this.paymentType = paymentType;
        this.amount = amount;
        this.status = status;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Payemnt [paymentId=" + paymentId + ", paymentType=" + paymentType + ", amount=" + amount + ", status="
                + status + "]";
    }
}
