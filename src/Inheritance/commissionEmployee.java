package Inheritance;

public class commissionEmployee extends employee
{

    private int commissionRate;
    private int grossSales;

    public commissionEmployee(){}

    public commissionEmployee(String firstName, String lastName, String SSN, int commissionRate, int grossSales)
    {
        super(firstName, lastName, SSN);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public String toString()
    {
        return (super.toString() + " Commission Rate: " + commissionRate + " Gross Sales: " + grossSales);
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

    public int commissionRate()
    {
        return commissionRate;
    }

    public void setCommissionRate(int commissionRate)
    {
        this.commissionRate = commissionRate;
    }

    public int getGrossSales()
    {
        return grossSales;
    }

    public void setGrossSales(int grossSales)
    {
        this.grossSales = grossSales;
    }
}
