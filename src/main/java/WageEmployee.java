public class WageEmployee extends Employee implements Salary {
    private double hours;
    private double hourWage;


    public WageEmployee(double hours, double hourWage) {
        this.hours=hours;
        this.hourWage=hourWage;
    }

    public double getHourWage()
    {
        return  hourWage;
    }

    public double getHours()
    {
        return hours;
    }

    @Override
    public String toString()
    {
        return super.toString()+"WAGE:"+calculatesalary() ;
    }

    @Override
    public double calculatesalary()
    {
        return Salary.minHourWage*Salary.maxHOURS;
    }
}
