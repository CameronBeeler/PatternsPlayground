package Singleton;

import java.io.Serializable;

public
class BasicSingleton
implements Serializable
{
    private static final BasicSingleton instance = new BasicSingleton();
    private int x=0;

    private BasicSingleton()
    {

    }

    static public BasicSingleton getInstance()
    {
        return instance;
    }

    public
    int getX()
    {
        return x;
    }

    public
    void setX(int x)
    {
        this.x = x;
    }

    protected Object readResolve()
    {
        return instance;
    }

    @Override
    public
    String toString()
    {
        return "BasicSingleton{" +
               "x=" + x +
               '}';
    }
}
