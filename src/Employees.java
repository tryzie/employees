abstract class Employees{
    private int employeeNumber;
    private String employeeName;
    private double netSalary;

    //constructor
    public Employees(int employeeNumber, String employeeName ){
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
    }

    // Getter and Setter for NetSalary
    public void setNetSalary(double netSalary){
        this.netSalary = netSalary;
    }

    public double getNetSalary(){
        return netSalary;
    }

    // Abstract method for salary calculation
    public abstract void calculateNetSalary();

    // Non-abstract method to display employee details
    public void displayEmployeeDetails(){
        System.out.println("employee Number: " + employeeNumber );
        System.out.println("employee Name: " + employeeName );

    }
}
