package BuilderFacets;

public class HomeLifeBuilder
        extends PersonBuilder
{
    public HomeLifeBuilder (Person person)
    {
        this.person = person;
    }

    public HomeLifeBuilder hobby(String hobby)
    {
        person.favoriteHobby = hobby;
        return this;
    }
}
