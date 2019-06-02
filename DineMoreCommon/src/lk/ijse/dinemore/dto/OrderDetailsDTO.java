package lk.ijse.dinemore.dto;

public class OrderDetailsDTO {
    private String orderDetailsID;
    private String orderID;
    private String itemCode;

    public OrderDetailsDTO() {
    }

    public OrderDetailsDTO(String orderDetailsID, String orderID, String itemCode) {
        this.orderDetailsID = orderDetailsID;
        this.orderID = orderID;
        this.itemCode = itemCode;
    }

    public String getOrderDetailsID() {
        return orderDetailsID;
    }

    public void setOrderDetailsID(String orderDetailsID) {
        this.orderDetailsID = orderDetailsID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public String toString() {
        return "OrderDetailsDTO{" +
                "orderDetailsID='" + orderDetailsID + '\'' +
                ", orderID='" + orderID + '\'' +
                ", itemCode='" + itemCode + '\'' +
                '}';
    }
}
