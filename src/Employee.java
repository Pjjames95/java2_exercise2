 public class Employee{
    //employee's personal details
    String employeeName;
    String employeeNumber;
    String employeeEmail;
    double employeeGrossSalary;
    double netSalary;


//construoctor for our instance class Employee
    Employee(String employeeName, String employeeNumber, String employeeEmail, double employeeGrossSalary){
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.employeeEmail = employeeEmail;
        this.employeeGrossSalary = employeeGrossSalary;
        this.netSalary = 0;  //initialized netSalary for easy reassignment
    }

    //computing the nssf as a % of the gross salary
    public double computeNssf(double employeeGrossSalary){
        if(employeeGrossSalary <= 0){
            System.out.println("Salary cannot be negative");
            return 0;
        }
        return employeeGrossSalary * 0.05;
    }

    //paye of the employee as of their gross salary range
    public double computePaye(double employeeGrossSalary){
        if(employeeGrossSalary <= 0){
            System.out.println("Salary cannot be negative or zero");
        }
        if(employeeGrossSalary <= 335000){
            return employeeGrossSalary * 0.1;
        }
        if(employeeGrossSalary >= 335000 && employeeGrossSalary <= 410000){
            return employeeGrossSalary * 0.2;
        }
        else{
            return employeeGrossSalary * 0.3;
        }
    }

    //netSalary calculated monthly for the employee( netSalary of a single month)
    public double computeNetSalary(double employeeGrossSalary){
        if(employeeGrossSalary < 0){
            System.out.println("Salary cannot be negative");
        }

        double nssf = computeNssf(employeeGrossSalary);
        double Paye = computePaye(employeeGrossSalary);

        if( nssf < 0 || Paye < 0){
            System.out.println("Salary cannot be negative");
        }
        if((Paye + nssf) > employeeGrossSalary){
            System.out.println("Total deductions cannot be greater than the gross salary");
        }

        this.netSalary = employeeGrossSalary - (Paye + nssf);
        return this.netSalary;
    }

    /* the annualNetSalary, which is a total of all monthly netSalary(12*netSalary) as
    well as the total monthly bonus of the year, annualbonus(12*(netsalary * 0.7))
     */
    public double computeAnnualSalary(double netSalary){
        if(netSalary < 0){
            System.out.println("Salary cannot be negative");
        }

        return 12 * (netSalary + (netSalary * 0.7));
    }

    //main method to call on the above methods with sample data
    public static void main(String[] args) {

        Employee employee1 = new Employee("James", "Emp001", "gachombajames7@gmail.com", 500000);
        System.out.println("Employee Nssf " + employee1.computeNssf(employee1.employeeGrossSalary));
        System.out.println("Employee Paye " + employee1.computePaye(employee1.employeeGrossSalary));
        System.out.println("Employee NetSalary " + employee1.computeNetSalary(employee1.employeeGrossSalary));
        System.out.println("Employee's annual net salary " +  employee1.computeAnnualSalary(employee1.netSalary));
    }

 }