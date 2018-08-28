package Builder;

public class HomeLifeBuilder
        extends PersonBuilder<HomeLifeBuilder>
{
//    Testing my understanding of Inheritance of the PersonBuilder and its use of the Generics class...
//    for use in the Builder pattern

    public HomeLifeBuilder() {

    }

    public Person build()
    {
        return person;
    }
    public HomeLifeBuilder Hobby(String hobby)
    {
            person.hobby = hobby;
            return self();
    }


    @Override
    protected HomeLifeBuilder self() {
        return this;
    }
}

