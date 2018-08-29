package BuilderTest;

public class CodeBuilder
{
//      Open with the class declaration & syntax
//      only one class name
//      n- variable declarations
//      Close with the class closing curly-brackets


    private String classname;
    private StringBuilder sb = new StringBuilder();


    public CodeBuilder(String className)
    {
        this.classname = className;
    }

    public CodeBuilder addField(String name, String type)
    {

        sb.append("\n  public " + type + " " + name + ";");
        return this;
    }

    @Override
    public String toString()
    {
        return "public class " + this.classname
                + "\n{" + sb + "\n}";
    }
}

/*

CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age" ,"int");

public class Person
{
  public String name;
  public int age;
}


 */