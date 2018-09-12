package Prototype;

import org.apache.commons.lang3.SerializationUtils;

public
class DemoProto
{
    public static
    void main(String[] args)
    throws Exception
    {
//CHALLENGE CODE FOR code-copy

        Line xy = new Line();
        xy.start = new Point();
        xy.start.x  =   0;
        xy.start.y  =   0;
        xy.end = new Point();
        xy.end.x    =   7;
        xy.end.y    =   7; // nice 45 degree angle...

        Line ab = xy.deepCopy();


        System.out.println(xy);
        System.out.println(ab);

        ab.start.x=7;
        ab.start.y = -7;

        System.out.println(xy);
        System.out.println(ab);


//        SERIALIZATION METHOD of deep copying objects
//        Foo foo = new Foo(42, "Life");
//        Foo foo2 = SerializationUtils.roundtrip(foo);
//        foo2.setWhatever("death");
//        System.out.println(foo);
//        System.out.println(foo2);
//


//        CLONE method of deep copying objects
//        Person john = new Person(
//                new String[]{"John", "Adams", "Smith"},
//                new Address("Peters Colony rd", "1815"));
//
//        System.out.println(john.toString());
//        Person jane=john.clone();
//        jane.setAddress(new Address("Peters Colony rd", "1817"));
//        jane.setNames(new String[]{"Jane", "Smith"});
//        System.out.println(jane.toString());
//        System.out.println(john.toString());


//        COPY CONSTRUCTOR method of deep copying objects
//        EmployeeCopyConstructor john = new EmployeeCopyConstructor
//                (
//                "John",
//                   new AddressCopyConstructor("1815", "Peters Colony rd", "Carrollton")
//                );
//        System.out.println(john);
//        EmployeeCopyConstructor mike = new EmployeeCopyConstructor(john);
//        mike.setName("Mike");
//        System.out.println(john);
//        System.out.println(mike);

    }
}
