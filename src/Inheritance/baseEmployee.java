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

    public String getFirstName()
    {
        return super.getFirstName();
    }

    public void setFirstName(String firstName)
    {
        super.setFirstName(firstName);
    }

    public String getLastName()
    {
        return super.getLastName();
    }

    public void setLastName(String lastName)
    {
        super.setLastName(lastName);
    }

    public String getSSN()
    {
        return super.getSSN();
    }

    public void setSSN(String SSN)
    {
        super.setSSN(SSN);
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
