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