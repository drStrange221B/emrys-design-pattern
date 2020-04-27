Factory Design Pattern:
    It comes under creation pattern as this pattern provides one of the best way to create an object.
In Factory Design Pattern, we create object without exposing the creation logic to the client and refer to
newly created object using a common interface.

Requirements
1) One Common Interface.
2) Factory Class, factory class will have a method that will return the desire object.
3) Various product classes that will implements the common interface.


In the example:
1) Common interface is Fruits
2) Factory Class is FruitFactory
3) Various product classes are Apple, Orange, Banana, Grapes


here objects (Apple, Orange, Banana, Grapes) are not created using new keyword. Instead they are created
using factory class using common interface.

creation of object are hidden to the client also in any case if new object to be added, all it needs is
to update factory class without affecting client code.