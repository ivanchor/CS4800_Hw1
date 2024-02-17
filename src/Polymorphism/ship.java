package Polymorphism;

public class ship
{
    private String shipName;
    private String yearBuilt;

    public ship(){}

    public ship(String shipName, String yearBuilt)
    {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public String toString()
    {
        return("Ship Name: " + shipName + " Year Built: " + yearBuilt);
    }

    public String getShipName()
    {
        return shipName;
    }

    public void setShipName(String shipName)
    {
        this.shipName = shipName;
    }

    public String getYearBuilt()
    {
        return yearBuilt;
    }

    public void setYearBuild(String yearBuilt)
    {
        this.yearBuilt = yearBuilt;
    }

}
