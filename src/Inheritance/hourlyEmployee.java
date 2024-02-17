package Inheritance;

public class hourlyEmployee extends employee
{
    private int wage;
    private int hoursWorked;

    public hourlyEmployee(){}

    public hourlyEmployee(String firstName, String lastName, String SSN, int wage, int hoursWorked)
    {
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public String toString()
    {
        return (super.toString() + " Wage: " + wage + " Hours Worked: " + hoursWorked);
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

    public int getWage()
    {
        return wage;
    }

    public void setWage(int wage)
    {
        this.wage = wage;
    }

    public int getHoursWorked()
    {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
}
