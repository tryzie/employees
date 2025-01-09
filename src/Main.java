public class Main {
    public static void main(String[] args) {

        //fullTimeEmployee object
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "collins", 90000, 20000);
        fullTimeEmployee.calculateNetSalary();
        fullTimeEmployee.displayEmployeeDetails();
        System.out.println("netSalary: " + fullTimeEmployee.getNetSalary() );


        //fullTimeEmployee object
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "elvis", 90, 20);
        partTimeEmployee.calculateNetSalary();
        partTimeEmployee.displayEmployeeDetails();
        System.out.println("netSalary: " + partTimeEmployee.getNetSalary());


    }
}