package BuilderFacets;


public class EmploymentBuilder
        extends PersonBuilder
{
    public EmploymentBuilder (Person person)
    {
        this.person = person;
    }

    public EmploymentBuilder paid(Double income)
    {
        person.annualIncome = income;
        return this;
    }

    public EmploymentBuilder startedWork(String beginWorkAnniversary)
    {
        person.beginWorkAnniversary = beginWorkAnniversary;
        return this;
    }

    public EmploymentBuilder atCompany(String companyName)
    {
        person.companyName = companyName;
        return this;
    }

    public EmploymentBuilder inPosition(String position)
    {
        person.position = position;
        return this;
    }

}
