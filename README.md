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


## Structural Patterns
Design patterns that work as a blueprint of how different objects and classes are combined to form a bigger structure for achieving multiple goals altogether. 


### Adapter

#### Definition
Adapter is a pattern that allows objects with incompatible interfaces to collaborate.
![Adapter](src/main/resources/static/Adapter.png)

#### Usage
Use this pattern:
* When you want to use some existing class, but its interface isn’t compatible with the rest of your code
* When you want to reuse several existing subclasses that lack some common functionality that can’t be added to the superclass

#### Pros
* Complies with the Single Responsibility Principle, because you can separate the interface or data conversion code from the primary business logic of the program
* Complies with the Open/Closed Principle, because you can introduce new types of adapters without breaking the existing client code

#### Cons
* The code may become more complicated than it should be


### Bridge

#### Definition
Bridge is a pattern that lets you split a large class, or a set of closely related classes into two separate hierarchies: abstraction (interface) and implementation (platform), which can be developed independently of each other.
![Bridge](src/main/resources/static/Bridge.png)
![Bridge2](src/main/resources/static/Bridge-2.png)

#### Usage
Use this pattern:
* When you want to divide and organize a monolithic class that has several variants of some functionality
* When you need to be able to switch implementations at runtime

#### Pros
* You can create platform-independent classes and apps
* The client code works with high-level abstractions. It isn’t exposed to the platform details
* Complies with the Single Responsibility Principle, because you can focus on high-level logic in the abstraction and on platform details in the implementation
* Complies with the Open/Closed Principle, because you can introduce new abstractions and implementations independently of each other

#### Cons
* The code may become more complicated than it should be


### Composite

#### Definition
Composite is a pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.
![Composite](src/main/resources/static/Composite.png)

#### Usage
Use this pattern:
* When you have to implement a tree-like object structure
* When you want the client code to treat both simple and complex elements uniformly

#### Pros
* You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage
* Complies with the Open/Closed Principle, because you can introduce new element types into the app without breaking the existing code, which now works with the object tree

#### Cons
*  It might be difficult to provide a common interface for classes whose functionality differs too much. In certain scenarios, you’d need to overgeneralize the component interface, making it harder to comprehend