package FactoryMethods;

public
class CoffeeFactory
    implements iHotDrinkFactory
{
    @Override
    public
    iHotDrinks Prepare(int Amount)
    {
        System.out.println("boil coffee, pour over grinds " + Amount + " TBS, add some cream, MM, MM, good!");
        return new Coffee();
    }

}
