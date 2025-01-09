public class PartTimeEmployee extends Employees{
    private double hoursWorked;
    private double ratePerHour;

    //constructor
    public PartTimeEmployee (int employeeNumber, String employeeName, double hoursWorked, double ratePerHour){
        super(employeeNumber, employeeName);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public void calculateNetSalary() {
        double netsalary = hoursWorked * ratePerHour;
        setNetSalary(netsalary);
    }
}
