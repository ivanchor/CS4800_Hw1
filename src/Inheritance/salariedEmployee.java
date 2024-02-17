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

    public int getWeeklySalary()
    {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary)
    {
        this.weeklySalary = weeklySalary;
    }
}
