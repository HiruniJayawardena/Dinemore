package lk.ijse.dinemore.dto;

public class DelivererDTO {
    private String delivererId;
    private String delivererName;
    private String delivererAddress;
    private String delivererContactNo;
    private double delivererSalary;

    public DelivererDTO() {
    }

    public DelivererDTO(String delivererId, String delivererName, String delivererAddress, String delivererContactNo, double delivererSalary) {
        this.delivererId = delivererId;
        this.delivererName = delivererName;
        this.delivererAddress = delivererAddress;
        this.delivererContactNo = delivererContactNo;
        this.delivererSalary = delivererSalary;
    }

    public String getDelivererId() {
        return delivererId;
    }

    public void setDelivererId(String delivererId) {
        this.delivererId = delivererId;
    }

    public String getDelivererName() {
        return delivererName;
    }

    public void setDelivererName(String delivererName) {
        this.delivererName = delivererName;
    }

    public String getDelivererAddress() {
        return delivererAddress;
    }

    public void setDelivererAddress(String delivererAddress) {
        this.delivererAddress = delivererAddress;
    }

    public String getDelivererContactNo() {
        return delivererContactNo;
    }

    public void setDelivererContactNo(String delivererContactNo) {
        this.delivererContactNo = delivererContactNo;
    }

    public double getDelivererSalary() {
        return delivererSalary;
    }

    public void setDelivererSalary(double delivererSalary) {
        this.delivererSalary = delivererSalary;
    }

    @Override
    public String toString() {
        return "DelivererDTO{" +
                "delivererId='" + delivererId + '\'' +
                ", delivererName='" + delivererName + '\'' +
                ", delivererAddress='" + delivererAddress + '\'' +
                ", delivererContactNo='" + delivererContactNo + '\'' +
                ", delivererSalary=" + delivererSalary +
                '}';
    }
}
