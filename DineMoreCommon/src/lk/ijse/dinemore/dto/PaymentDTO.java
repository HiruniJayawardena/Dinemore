package lk.ijse.dinemore.dto;

public class PaymentDTO {
    private String paymentID;
    private String paymentMethod;
    private double amount;

    public PaymentDTO() {
    }

    public PaymentDTO(String paymentID, String paymentMethod, double amount) {
        this.paymentID = paymentID;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "paymentID='" + paymentID + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                '}';
    }
}
