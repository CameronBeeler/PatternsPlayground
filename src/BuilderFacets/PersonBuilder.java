package BuilderFacets;

//This is an exercise in the construction of a builder facade...

public class PersonBuilder {
    protected Person person = new Person();

    public AddressBuilder lives() {
        return new AddressBuilder(person);
    }

    public EmploymentBuilder works() {
        person.annualIncome = 85000.00;
        return new EmploymentBuilder(person);
    }

    public PersonalInfoBuilder Personal()
    {
        return new PersonalInfoBuilder(person);
    }

    public HomeLifeBuilder atHome()
    {
        return new HomeLifeBuilder(person);
    }

    public Person build()
    {
        return person;
    }

}
