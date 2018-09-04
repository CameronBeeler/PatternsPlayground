package FactoryMethods;

public
class TeaFactory
    implements iHotDrinkFactory
{
    @Override
    public
    iHotDrinks Prepare(int Amount)
    {
        System.out.println("put in tea bag, bring to a boil & pour" + Amount + " ml, add lemon and enjoy!");
        return new Tea();
    }
}
