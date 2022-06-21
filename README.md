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