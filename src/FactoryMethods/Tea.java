package FactoryMethods;

public
class Tea
implements iHotDrinks
{
    @Override
    public
    void Consume()
    {
        System.out.println("This tea is delicious");
    }

}
