package Singleton;

public
enum EnumBasedSingleton
{
    INSTANCE;

    EnumBasedSingleton()
    {
        this.value=42;
    }

    private int value;
    public int getValue()
    {
        return value;
    }
    public void setValue(int value)
    {
        this.value = value;
    }
}
