package FactoryMethods;

public
class FactoryDemo
{

    public static
    void main(String[] args)
            throws Exception
    {
//        Point polarCoordinates =  Point.createPolarCoordinates(2.0,  3.0);
//        Point cartesian =  Point.createCartesianCoordinates(5.0, 7.0);
//        System.out.println("Polar Coordinates " + polarCoordinates);
//        System.out.println("Cartesian Coordinates " + cartesian);

        Point point = Point.Factory.createCartesianCoordinates(1, -3);
        Point polarCoordinates = Point.Factory.createPolarCoordinates(2, 3);
        Point point1 = Point.Factory.createCartesianCoordinates(17, 2);

        HotDrinkMachine machine = new HotDrinkMachine();
        iHotDrinks      drinks = machine.makeDrink();
        drinks.Consume();
    }
}
