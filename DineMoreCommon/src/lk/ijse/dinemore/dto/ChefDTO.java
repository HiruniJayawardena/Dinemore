package lk.ijse.dinemore.dto;

public class ChefDTO {
    private String chefId;
    private String chefName;
    private String chefAddress;
    private String chefContactNo;
    private double chefSalary;

    public ChefDTO() {
    }

    public ChefDTO(String chefId, String chefName, String chefAddress, String chefContactNo, double chefSalary) {
        this.chefId = chefId;
        this.chefName = chefName;
        this.chefAddress = chefAddress;
        this.chefContactNo = chefContactNo;
        this.chefSalary = chefSalary;
    }

    public String getChefId() {
        return chefId;
    }

    public void setChefId(String chefId) {
        this.chefId = chefId;
    }

    public String getChefName() {
        return chefName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public String getChefAddress() {
        return chefAddress;
    }

    public void setChefAddress(String chefAddress) {
        this.chefAddress = chefAddress;
    }

    public String getChefContactNo() {
        return chefContactNo;
    }

    public void setChefContactNo(String chefContactNo) {
        this.chefContactNo = chefContactNo;
    }

    public double getChefSalary() {
        return chefSalary;
    }

    public void setChefSalary(double chefSalary) {
        this.chefSalary = chefSalary;
    }

    @Override
    public String toString() {
        return "ChefDTO{" +
                "chefId='" + chefId + '\'' +
                ", chefName='" + chefName + '\'' +
                ", chefAddress='" + chefAddress + '\'' +
                ", chefContactNo='" + chefContactNo + '\'' +
                ", chefSalary=" + chefSalary +
                '}';
    }
}
