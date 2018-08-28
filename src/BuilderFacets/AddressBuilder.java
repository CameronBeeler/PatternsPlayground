package BuilderFacets;

public class AddressBuilder
        extends PersonBuilder
{
    public AddressBuilder(Person person)
    {
        this.person = person;
    }

    public AddressBuilder onStreet(String street)
    {
        person.street = street;
        return this;
    }

    public AddressBuilder inCity(String city)
    {
        person.city = city;
        return this;
    }

    public AddressBuilder inCountry(String country)
    {
        person.country = country;
        return this;
    }

    public AddressBuilder atZip(String zip)
    {
        person.zip = zip;
        return this;
    }
}
