package Inheritance;

public class salariedEmployee extends employee
{
    private int weeklySalary;

    public salariedEmployee(){}

    public salariedEmployee(String firstName, String lastName, String SSN, int weeklySalary)
    {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    public String toString()
    {
        return (super.toString() + " Weekly Salary: " + weeklySalary);
    }

    public int getWeeklySalary()
    {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary)
    {
        this.weeklySalary = weeklySalary;
    }
}
