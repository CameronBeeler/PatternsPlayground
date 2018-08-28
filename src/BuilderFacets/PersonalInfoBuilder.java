package BuilderFacets;

public class PersonalInfoBuilder
        extends PersonBuilder
{
    public PersonalInfoBuilder(Person person)
    {
        this.person = person;
    }

    public PersonalInfoBuilder nameIs(String name)
    {
        person.name = name;
        return this;
    }

    public PersonalInfoBuilder wasBorn(String dob)
    {
        person.DOB = dob;
        return this;
    }

    public PersonalInfoBuilder isA(String sex)
    {
        person.sex = sex;
        return this;
    }

    public PersonalInfoBuilder isMarried(boolean isMarried)
    {
        person.isMarried = isMarried;
        return this;
    }

}

