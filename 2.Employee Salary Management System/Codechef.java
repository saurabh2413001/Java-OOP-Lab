class Employee {

    // Declare private fields for employeeId, name,
    // and baseSalary.
    private String employeeID;
    private String name;
    private double baseSalary;

    // Create a constructor to initialize employee details.
    // Reject invalid IDs, names, and negative or non-finite salaries
    public Employee(String employeeID, String name, double baseSalary){
        if(employeeID==null || employeeID.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid employeeID");
        }
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid name");
        }
        if(baseSalary<0 || !Double.isFinite(baseSalary)){
            throw new IllegalArgumentException("Invalid baseSalary");
        }
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Create getter methods for employeeId, name,
    // and baseSalary.
    public String getEmployeeId(){
        return employeeID;
    }
    
    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }
    // Implement calculateSalary().
    // The base implementation should return the base salary.
    double calculateSalary(){
        return baseSalary;
    }

}

class FullTimeEmployee extends Employee {

    // Declare a field to store the employee's bonus
    private double bonus;

    // Create a constructor that initializes employee details
    // and bonus. Use super() to initialize the inherited fields.
    public FullTimeEmployee(String employeeID, String name, double baseSalary, double bonus){
        super(employeeID,name,baseSalary);    
        if(bonus<0 || !Double.isFinite(bonus)){
            throw new IllegalArgumentException("Invalid bonus");
        }
        this.bonus = bonus;
    }

    // Create a getter for the bonus.
    public double getBonus(){
        return bonus;
    }

    // Override calculateSalary() to include the bonus.
    @Override
    public double calculateSalary(){
        return getBaseSalary()+bonus;
    }

}

class SalesEmployee extends Employee {

    // Declare fields for salesAmount and commissionRate.
    private double salesAmount;
    private double commissionRate;

    // Create a constructor that initializes employee details,
    // sales amount, and commission rate. Use super() appropriately.
    public SalesEmployee(String employeeID, String name, double baseSalary, double salesAmount, double commissionRate){
        super(employeeID,name,baseSalary);
        if(salesAmount<0 || !Double.isFinite(salesAmount)){
            throw new IllegalArgumentException("Invalid salesAmount");
        }
        if(commissionRate<0 || commissionRate>1 || !Double.isFinite(commissionRate)){
            throw new IllegalArgumentException("Invalid commissionRate");
        }
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    // Create getters for salesAmount and commissionRate.
    public double getSalesAmount(){
        return salesAmount;
    }

    public double getCommissionRate(){
        return commissionRate;
    }
    // Implement calculateCommission() using the sales amount
    // and commission rate.
    public double calculateCommission(){
        return (salesAmount*commissionRate);
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary()+calculateCommission();
    }
    // Override calculateSalary() to include the commission


}

public class Codechef {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("E101", "Aman", 40000.0, 5000.0);

        SalesEmployee salesEmployee = new SalesEmployee("E102", "Sara", 30000.0, 100000.0, 0.05);

        System.out.println("Full-Time Employee: " + fullTimeEmployee.getName());
        System.out.println("Employee ID: " + fullTimeEmployee.getEmployeeId());
        System.out.println("Base Salary: " + fullTimeEmployee.getBaseSalary());
        System.out.println("Bonus: " + fullTimeEmployee.getBonus());
        System.out.println("Total Salary: " + fullTimeEmployee.calculateSalary());

        System.out.println();

        System.out.println("Sales Employee: " + salesEmployee.getName());
        System.out.println("Employee ID: " + salesEmployee.getEmployeeId());
        System.out.println("Base Salary: " + salesEmployee.getBaseSalary());
        System.out.println("Sales Commission: " + salesEmployee.calculateCommission());
        System.out.println("Total Salary: " + salesEmployee.calculateSalary());
    }
}


