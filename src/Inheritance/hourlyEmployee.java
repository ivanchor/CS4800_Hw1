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
