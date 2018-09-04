package FactoryMethods;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javafx.util.Pair;
import org.reflections.Reflections;


public
class HotDrinkMachine
{
    private List<Pair<String, iHotDrinkFactory>> namedFactories = new ArrayList<>();

    public
    HotDrinkMachine()
    throws Exception
    {

        Set<Class<? extends iHotDrinkFactory>> types = new Reflections("")
                        .getSubTypesOf(iHotDrinkFactory.class);
        for(Class<? extends iHotDrinkFactory> type:types)
        {
            System.out.println("types = " + type);
            namedFactories
                    .add(new Pair<>(type.getSimpleName().replace("Factory", ""),
                                    type.getDeclaredConstructor().newInstance()
                    ));
        }
    }

    public iHotDrinks makeDrink()
        throws Exception
    {

        System.out.println("Available drinks: " );
        for(int i=0;i<namedFactories.size(); i++)
        {
            Pair<String, iHotDrinkFactory> item = namedFactories.get(i);
            System.out.println("" + i + ": " + item.getKey());


        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            String s;
            int i, amount;
            if  (    (s = reader.readLine()) != null
                &&  (i = Integer.parseInt(s)) >=0
                &&  (i < namedFactories.size())
                )
            {
                System.out.println("Specify Amount: ");
                s = reader.readLine();
                if ((s != null) && (amount = Integer.parseInt(s)) > 0 )
                {
                    return namedFactories.get(i).getValue().Prepare(amount);
                }
            }
            System.out.println("Incorrect Input, try again ");
        }
    }
}
