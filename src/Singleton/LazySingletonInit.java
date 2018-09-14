package Singleton;

public
class LazySingletonInit
{
    private int size=1;
    private static LazySingletonInit instance;

    private LazySingletonInit()
    {
        System.out.println("Initializing LazySingletonInit, constructor");
    }

//    public static synchronized LazySingletonInit getInstance()
//    {
//        if(instance==null)
//        {
//            instance = new LazySingletonInit();
//        }
//        return instance;
//    }

//    DOUBLE-CHECKED LOCKING
    public static LazySingletonInit getInstance()
    {
        if(instance==null)
        {
            synchronized (LazySingletonInit.class)
            {
                if(instance == null)
                {
                    instance=new LazySingletonInit();
                }
            }

        }
        return new LazySingletonInit();
    }
}
