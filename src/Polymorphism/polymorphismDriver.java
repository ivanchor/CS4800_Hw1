package Polymorphism;

public class polymorphismDriver
{
    public static void main(String[] args)
    {

        ship ship1 = new ship();
        ship1.setShipName("Ship 1");
        ship1.setYearBuild("6000");

        cruiseShip ship2 = new cruiseShip();
        ship2.setShipName("Ship 2");
        ship2.setYearBuild("6050");
        ship2.setMaxPassengers(5);

        cargoShip ship3 = new cargoShip();
        ship3.setShipName("Ship 3");
        ship3.setYearBuild("6080");
        ship3.setCapacity(10000);

        ship[] shipArray = new ship[3];

        shipArray[0] = ship1;
        shipArray[1] = ship2;
        shipArray[2] = ship3;

        for(int i = 0; i < shipArray.length; i++)
        {
            System.out.println(shipArray[i].toString());
        }
    }
}
