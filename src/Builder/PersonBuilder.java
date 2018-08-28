package Builder;

public class PersonBuilder
        <SELF extends PersonBuilder<SELF>>
{
//      Used to 'build up' person information.  Being utilized to explore the use of
//      recursive generics in the builder pattern to identify potential gotchas...
    protected Person person = new Person();



    public SELF withName(String name)
    {

        return self();
    }

    public Person build()
    {
        return person;
    }


    protected SELF self(){
        return (SELF) this;
    }
}
