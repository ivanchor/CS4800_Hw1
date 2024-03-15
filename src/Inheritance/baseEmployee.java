package Inheritance;

public class baseEmployee extends employee
{
    private int baseSalary;

    public baseEmployee(){}

    public baseEmployee(String firstName, String lastName, String SSN, int baseSalary)
    {
        super(firstName, lastName, SSN);
        this.baseSalary = baseSalary;
    }

    public String toString()
    {
        return ( super.toString() + " Base Salary: " + baseSalary);
    }

    public int getBaseSalary()
    {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary)
    {
        this.baseSalary = baseSalary;
    }
}
