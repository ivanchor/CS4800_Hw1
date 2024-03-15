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

    public int getCommissionRate()
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
