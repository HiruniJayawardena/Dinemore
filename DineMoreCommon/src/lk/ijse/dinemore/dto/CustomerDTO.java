package lk.ijse.dinemore.dto;

public class CustomerDTO {
    private String customerId;
    private String customerName;
    private String customerNIC;
    private int customerTP;
    private String houseNo;
    private String landMark;
    private String town;
    private String cardType;
    private int cardNo;
    private String expireDate;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerId, String customerName, String customerNIC, int customerTP, String houseNo, String landMark, String town, String cardType, int cardNo, String expireDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerNIC = customerNIC;
        this.customerTP = customerTP;
        this.houseNo = houseNo;
        this.landMark = landMark;
        this.town = town;
        this.cardType = cardType;
        this.cardNo = cardNo;
        this.expireDate = expireDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNIC() {
        return customerNIC;
    }

    public void setCustomerNIC(String customerNIC) {
        this.customerNIC = customerNIC;
    }

    public int getCustomerTP() {
        return customerTP;
    }

    public void setCustomerTP(int customerTP) {
        this.customerTP = customerTP;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerNIC='" + customerNIC + '\'' +
                ", customerTP=" + customerTP +
                ", houseNo='" + houseNo + '\'' +
                ", landMark='" + landMark + '\'' +
                ", town='" + town + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardNo=" + cardNo +
                ", expireDate='" + expireDate + '\'' +
                '}';
    }
}
