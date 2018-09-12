package Prototype;

public
class DemoProto
{
    public static
    void main(String[] args)
    throws Exception
    {
        Person john = new Person(
                new String[]{"John", "Adams", "Smith"},
                new Address("Peters Colony rd", "1815"));

        System.out.println(john.toString());
        Person jane=john.clone();
        jane.setAddress(new Address("Peters Colony rd", "1817"));
        jane.setNames(new String[]{"Jane", "Smith"});
        System.out.println(jane.toString());
        System.out.println(john.toString());


    }
}
