public class SalaryEmployee extends Employee implements Salary  {
    private double salary;


    public SalaryEmployee(double salary) {
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public double calculatesalary() {

        return Salary.minSalary ;
    }

    @Override
    public String toString()
    {
        return super.toString()+"Min Salary:"+calculatesalary();
    }
}

