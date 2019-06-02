package lk.ijse.dinemore.dto;

public class OrdersDTO {
    private String orderID;
    private String operatorId;
    private String customerId;
    private String paymentID;
    private String chefId;
    private String delivererId;
    private int qty;
    private double amount;
    private String orderStatus;

    public OrdersDTO() {
    }

    public OrdersDTO(String orderID, String operatorId, String customerId, String paymentID, String chefId, String delivererId, int qty, double amount, String orderStatus) {
        this.orderID = orderID;
        this.operatorId = operatorId;
        this.customerId = customerId;
        this.paymentID = paymentID;
        this.chefId = chefId;
        this.delivererId = delivererId;
        this.qty = qty;
        this.amount = amount;
        this.orderStatus = orderStatus;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getChefId() {
        return chefId;
    }

    public void setChefId(String chefId) {
        this.chefId = chefId;
    }

    public String getDelivererId() {
        return delivererId;
    }

    public void setDelivererId(String delivererId) {
        this.delivererId = delivererId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" +
                "orderID='" + orderID + '\'' +
                ", operatorId='" + operatorId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", paymentID='" + paymentID + '\'' +
                ", chefId='" + chefId + '\'' +
                ", delivererId='" + delivererId + '\'' +
                ", qty=" + qty +
                ", amount=" + amount +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
