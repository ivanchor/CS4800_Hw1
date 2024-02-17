package Polymorphism;

public class cruiseShip extends ship
{
    private int maxPassengers;

    public cruiseShip(){}

    public cruiseShip(String shipName, String yearBuilt, int maxPassengers)
    {
        super(shipName, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public String toString()
    {
        return ("Ship Name: " + super.getShipName() + " Max Passengers: " + maxPassengers);
    }

    public String getShipName()
    {
        return super.getShipName();
    }

    public void setShipName(String shipName)
    {
        super.setShipName(shipName);
    }

    public String getYearBuilt()
    {
        return super.getYearBuilt();
    }

    public void setYearBuild(String yearBuilt)
    {
        super.setYearBuild(yearBuilt);
    }

    public int getMaxPassengers()
    {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers)
    {
        this.maxPassengers = maxPassengers;
    }
}
