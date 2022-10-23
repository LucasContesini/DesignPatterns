# DesignPatterns
Project with examples of design patterns.
<br><br>

## Creational Patterns
Design patterns that deal with object creation. 

### Abstract Factory

#### Definition
Abstract Factory is a pattern that creates related objects without specifying their concrete classes.
![Abstract Factory](src/main/resources/static/AbstractFactory.png)

#### Usage
Use this pattern when you have related objects, but you don't want the application to depend on the concrete classes.

#### Pros
* The objects you’re getting from a factory will be compatible with each other
* Avoid tight coupling between concrete objects and the application
* Complies with the Single Responsibility Principle, because you can extract the object creation code into one place
* Complies with the Open/Closed Principle, because you can introduce new variants of objects without breaking the application  

#### Cons
* The code may become more complicated than it should be


### Factory Method

#### Definition
Factory Method is a pattern that provides an interface for creating objects in superclass,
but allows subclasses to alter the type of objects that will be created.
![Factory Method](src/main/resources/static/FactoryMethod.png)

#### Usage
Use this pattern:
* When you don't know beforehand the exact types and dependencies of the objects your code should work with
* When you want to provide users of your library or framework with a way to extend its internal components
* When you want to save system resources by reusing existing objects instead of rebuilding them each time

#### Pros
* Avoid tight coupling between concrete objects and the application
* Complies with the Single Responsibility Principle, because you can move the object creation code into one place in the program
* Complies with the Open/Closed Principle, because you can introduce new types of objects into the program without breaking existing code

#### Cons
* The code may become more complicated than it should be


### Singleton

#### Definition
Singleton is a pattern that ensure that a class has only one instance, while providing a global access point to this instance.
![Singleton](src/main/resources/static/Singleton.png)

#### Usage
Use this pattern:
* When a class in your program should have just a single instance available to all clients. Example: Database object
* When you need stricter control over global variables

#### Pros
* You can be sure a class has only a single instance
* You gain a global access point to that instance
* The singleton object is initialized only when it’s requested for the first time

#### Cons
* Violates the Single Responsibility Principle. Ensuring that a class has just a single instance and providing a global access point to that instance
* This pattern can mask bad design, for instance, when the components of the program know too much about each other
* The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times
* It may be difficult to create unit test of the Singleton


### Builder

#### Definition
Builder is a pattern that lets you construct complex objects step by step.
![Builder](src/main/resources/static/Builder.png)

#### Usage
Use this pattern:
* When you need to construct composite objects
* When you want to get rid of a giant constructor

#### Pros
* You can create objects step-by-step
* You can reuse the same constructor to build objects
* Complies with the Single Responsibility Principle, because you can isolate complex construction code from the business logic

#### Cons
* The code may become more complicated than it should be


### Prototype

#### Definition
Prototype is a pattern that lets you copy existing objects without making your code dependent on their classes.
![Prototype](src/main/resources/static/Prototype.png)

#### Usage
Use this pattern:
* When your code shouldn’t depend on the concrete classes of objects that you need to copy

#### Pros
* You can clone objects without coupling to their concrete classes
* You can get rid of repeated initialization code in favor of cloning pre-built prototypes
* You can produce complex objects more conveniently
* You get an alternative to inheritance when dealing with a configuration presets for complex objects

#### Cons
* Cloning complex objects that have circular references might be difficult to handle