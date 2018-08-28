package BuilderFacets;

public class Person
{
//    personal information
    protected String name, DOB, sex;
    protected boolean isMarried;

//    Address information
    protected String street, city, country, zip;

//    Worklife information
    protected Double annualIncome;
    protected String beginWorkAnniversary, position, companyName;

//    Homelife information
    protected String favoriteHobby;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + "\',\n" +
                "DOB='" + DOB + "\',\n" +
                "sex='" + sex + "\',\n" +
                "married='" + isMarried + "\',\n" +
                "street='" + street + "\',\n" +
                "city='" + city + "\',\n" +
                "country='" + country + "\',\n" +
                "zip='" + zip + "\',\n" +
                "annualIncome='" + String.format("%,.2f", annualIncome) +"\',\n" +
                "beginWorkAnniversary='" + beginWorkAnniversary + "\',\n" +
                "position='" + position + "\',\n" +
                "companyName='" + companyName + "\',\n" +
                "favoriteHobby='" + favoriteHobby + "\'\n" +
                '}';
    }
}
