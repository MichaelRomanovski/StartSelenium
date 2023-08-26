public class Manager extends SalaryEmployee implements Salary {
private double bonuses;

    public Manager(double salary, double bonuses)
    {
        super(salary);
        this.bonuses = bonuses;
    }

    public double getBonuses() {
        return bonuses;
    }

    @Override
    public double calculatesalary() {
        return super.calculatesalary()*bonuses;
    }

    @Override
    public String toString() {
        return super.toString()+" "+ calculatesalary();
    }
}


