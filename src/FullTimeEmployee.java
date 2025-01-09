 class FullTimeEmployee extends Employees{
    private double basicSalary;
    private double deductions;

    //constructor
    public FullTimeEmployee (int employeeNumber, String employeeName, double basicSalary, double deductions){
        super(employeeNumber, employeeName);
        this.basicSalary = basicSalary;
        this.deductions = deductions;
    }

    // implement method
     @Override
     public void calculateNetSalary() {
         double netSalary = basicSalary - deductions;
         setNetSalary(netSalary);
     }



}
