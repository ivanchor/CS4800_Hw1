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

    public int getMaxPassengers()
    {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers)
    {
        this.maxPassengers = maxPassengers;
    }
}
