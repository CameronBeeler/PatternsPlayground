package Builder;

public class Person {
//    Demoing recursive generic builder scenarios.  There are some gotchas to watch for...
    public String name;

//    progressing to expand our understanding of how faceted Builder pattern is implemented
    public String position;

//    Initially to test out my understanding of the recursive generic object reference
    public String hobby;

//To demonstrate the faceted Builder pattern approach

    public Person()
    {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
