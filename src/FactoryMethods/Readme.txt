1.  Factory Method
Creating static methods with a return type of a new Class() name.  This allows some initial verification
and/or specialized coding w/respect to the class/object

Keep in mind that the method is static which means it cannot access instance variable or methods,
only static variables and methods are accessible.

If the called method qualifies the creation of the Object instance, it will need to be done in the
factory method before completion.

The Constructor is private (generally) to encourage use of the available factories.


2.  Factory Class
A class (either external or internal) that has the existing factory methods.
If the class is external, will need to determine the best strategy for creation as the target class is
likely directly accessible, which is not the best outcome.

3.  Factory heirarchies with Abstract Factory Class
This one exists, but is rare.
