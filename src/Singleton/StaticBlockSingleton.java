package Singleton;

import java.io.File;
import java.io.IOException;

public
class StaticBlockSingleton
{
    private StaticBlockSingleton()
    throws IOException
    {
        System.out.println("Initializing StaticBlockSingleton");
        File.createTempFile(".", ".");
    }
//    BECAUSE OF THIS, YOU CANNOT USE A PRIVATE STATIC FINAL because there is a throw condition that needs to be handled
//    NOW, we'll need to use a static block instead...instead

    static private StaticBlockSingleton instance;

    static
    {
        try
        {
            instance = new StaticBlockSingleton();
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.err.println("Failed to create singleton");
        }
    }

    public StaticBlockSingleton getInstance()
    {
        return instance;
    }
}
