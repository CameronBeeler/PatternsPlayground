package BuilderFacets;

public class BLDRFacetsDemo
{
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person cam = pb
                .lives().onStreet("1566 Jeffrey Ave")
                    .inCity("Escondido")
                    .inCountry("USA")
                    .atZip("92027")
                .works().atCompany("At Home")
                    .inPosition("Software Engineering")
                    .startedWork("October 1st, 2018")
                    .paid(85000.25)
                .atHome().hobby("Raising Chameleons")
                .Personal().nameIs("Cam Beeler")
                    .isA("Man")
                    .wasBorn("25 January 1968")
                    .isMarried(true)
                .build();

        System.out.println(cam);
    }
}
