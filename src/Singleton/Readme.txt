Two issues with Singletons, by design
1.  Reflections is able to disrupt and transform the private to public method definition which
circumvents the design of singletons.  Although this might be less of an issue by JAVA v10+

2.  Serialization is the bytewise copy of an object and when you copy the object back, serialization creates
a full replica of the original object, which means we have defeated the purpose of only one object...