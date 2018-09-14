package Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public
class DemoSingle
{
    static void saveToFile(BasicSingleton x, String fileName )
    throws Exception
    {
        try(FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(x); // MANUALLY created serialization.  Write the object to a file.  Object dump...
        }

    }

    static BasicSingleton readFromFile(String fileName)
    throws Exception
    {
        try(FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fin))
        {
            return (BasicSingleton) in.readObject();
            // Read the object from its byte-code and create a reference to it
        }

    }


    public static
    void main(String[] args)
    throws Exception
    {
        String filename= "singleton.bin";
        BasicSingleton bs1 = BasicSingleton.getInstance();
        bs1.setX(999);
        saveToFile(bs1, filename);
        bs1.setX(123);
        System.out.println(bs1.getX());

        BasicSingleton bs2 = readFromFile(filename);
        System.out.println(bs2.getX());
        System.out.println(bs1==bs2);



//SERIALIZATION


//        SIMPLE-SINGLETON
//        BasicSingleton bs = BasicSingleton.getInstance();
//        bs.setX(12);
//        System.out.println(bs);
    }
}
