[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=16138064&assignment_repo_type=AssignmentRepo)



Interfaces: 
Moveable
Destructible

Classes that use Moveable interface: Elephant, Apple, Cherry

Classes that use Destructible interface: Apple, Cherry


Inside the Moveable interface is an empty method called move(); 
The Moveable interface was used in the Elephant class and Apple, and Cherry subclasses because they all move in the game
Therefore, having a Moveable interface helps group the classes that can move, as well as help simplify and organize the code. 
Additionally, the elephant and enemy fruits move differently, one goes down in Y level, while the elephant class requires the player to use left and right arrow keys to move the character. 
Interfaces can have the same method name/concept and have different codes in different classes. 

Inside the Destructible interface is an empty method called destroy();
The Destructible interface was used in the Apple and Cherry subclasses because they can all be removed from the game once the player (elephant) makes contact with one of the food subclasses.
Having a Destructible interface helps group which classes can remove themselves from the world, and help organize the overall code.


Abstract Classes:
Food

We've made a Food abstract class because it groups the classes called cherry and apple, as these two classes are part of the same concept/idea 
Additionally, the Food abstract class also has methods and constructors that are used in cherry and apple.
Which overall organizes the code and subclasses. 

Inside the Abstract class is a constructor and a method
The constructor has a parameter (int value) 
which sets the value of the subclass to its value 
For example: inside Apple's constructor
Apple()
{
  super(5) 
}
makes Apple's value = to 5
which makes the points gained be 5 when in contact with apple 

The method setSpeed sets the speed of the Food subclasses when it is called in the subclasses
When called, the subclass has to have a variable to have it equal to the speed in the Food abstract class. 

Classes that use Polymorphism & Override: Apple, Cherry

The superclass Food contains two subclasses, Apple and Cherry. With the use of polymorphism, method overriding, and dynamic binding, we are able to adjust the speed of different subclasses by calling the same method on different objects. Through method overriding in particular, we set the speed of cherries to be one level faster than that of the apple while allowing any new subclasses to have a default speed equal to the apple. 




