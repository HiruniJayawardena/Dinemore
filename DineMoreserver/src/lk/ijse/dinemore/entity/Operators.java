package lk.ijse.dinemore.entity;

public class Operators {
    private String operatorId;
    private String operatorName;
    private String operatorAddress;
    private String operatorContactNo;
    private double operatorSalary;

    public Operators() {
    }

    public Operators(String operatorId, String operatorName, String operatorAddress, String operatorContactNo, double operatorSalary) {
        this.operatorId = operatorId;
        this.operatorName = operatorName;
        this.operatorAddress = operatorAddress;
        this.operatorContactNo = operatorContactNo;
        this.operatorSalary = operatorSalary;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorAddress() {
        return operatorAddress;
    }

    public void setOperatorAddress(String operatorAddress) {
        this.operatorAddress = operatorAddress;
    }

    public String getOperatorContactNo() {
        return operatorContactNo;
    }

    public void setOperatorContactNo(String operatorContactNo) {
        this.operatorContactNo = operatorContactNo;
    }

    public double getOperatorSalary() {
        return operatorSalary;
    }

    public void setOperatorSalary(double operatorSalary) {
        this.operatorSalary = operatorSalary;
    }

    @Override
    public String toString() {
        return "Operators{" +
                "operatorId='" + operatorId + '\'' +
                ", operatorName='" + operatorName + '\'' +
                ", operatorAddress='" + operatorAddress + '\'' +
                ", operatorContactNo='" + operatorContactNo + '\'' +
                ", operatorSalary=" + operatorSalary +
                '}';
    }
}
