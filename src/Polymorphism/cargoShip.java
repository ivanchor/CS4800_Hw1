package Polymorphism;

public class cargoShip extends ship
{
    private int capacity;

    public cargoShip(){}

    public cargoShip(String shipName, String yearBuilt, int capacity)
    {
        super(shipName, yearBuilt);
        this.capacity = capacity;
    }

    public String toString()
    {
        return ("Ship Name: " + super.getShipName() + " Capacity in Tonnage: " + capacity);
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

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
}
