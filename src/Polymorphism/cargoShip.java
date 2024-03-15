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

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
}
