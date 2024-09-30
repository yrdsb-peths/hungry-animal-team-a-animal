[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=16138064&assignment_repo_type=AssignmentRepo)



Interfaces: 
Moveable
Destructable

Classes that use Moveable interface: Elephant, Apple, Cherry

Classes that use Destructable interface: Apple, Cherry


Inside the Moveable interface is an empty method called move(); 
The Moveable interface was used in the Elephant class and Apple, and Cherry subclasses because they all move in the game
Therefore, having a Moveable interface helps group the classes that can move, as well as help simplify and organize the code. 
Additionally, the elephant and enemy fruits move differently, one goes down in Y level, while the elephant class requires the player to use left and right arrow keys to move the character. 
Interfaces can have the same method name/concept and have different codes in different classes. 

Inside the Destructable interface is an empty method called destroy();
The Destructable interface was used in the Apple and Cherry subclasses because they can all be removed from the game once the player (elephant) makes contact with one of the food subclasses.
Having a Destructable interface helps group which classes can remove themselves from the world, and help organize the overall code.








