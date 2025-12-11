package models;

public class Employee extends Person {
    private String employeeId;
    private String position;

    public Employee(String fullName, String phone, String email, String nationalId, String address, String employeeId,
            String position) {
        super(fullName, phone, email, nationalId, address);
        this.employeeId = employeeId;
        this.position = position;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmloyeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public double pay() {
        switch (position.toLowerCase()) {
            case "manager":
                return 30000;
            case "receptionist":
                return 10000;
            case "cleaner":
                return 5000;
            default:
                return 4000;
        }
    }

    @Override
    public double calculatePayment() {
        return pay();
    }

    @Override
    public String getPaymentDetails() {
        return "Employee: " + getName() + " " + "id: " + getEmployeeId() + " " + "position: " + getPosition() + " " + "salary: " + pay();
    }

    @Override
    public void printInvoice() {
        System.out.println("Employee: " + getName() + " | Position: " + position + " | Salary: " + pay());
    }
}
