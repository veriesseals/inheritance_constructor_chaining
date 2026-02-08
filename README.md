# inheritance_constructor_chaining

Inheritance & Constructor Chaining (Java) — Coursera Example

Overview
This Java console application demonstrates core Object-Oriented Programming (OOP) concepts: inheritance and constructor chaining using the super keyword.

The example uses a base class (Vehicle) and a derived class (Car). The Car class inherits fields and methods from Vehicle while also introducing its own functionality. When a Car object is created, constructor chaining ensures the Vehicle constructor executes first.

What This Example Demonstrates
• Inheritance using the extends keyword
• Constructor chaining with super(...)
• Code reuse and logical class hierarchy
• Separation of shared behavior vs specialized behavior

Project Structure
Main.java     - Application entry point
Vehicle.java - Parent/base class
Car.java     - Child class extending Vehicle

Requirements
• Java JDK 8 or higher
• Terminal, Command Prompt, or Java IDE

How to Compile and Run
1. Open a terminal in the project directory
2. Compile the files:
   javac Main.java Vehicle.java Car.java
3. Run the program:
   java Main

How the Code Works
Vehicle Class:
• Stores make, model, color, and speed
• Provides accelerate, brake, turn, and getSpeed methods

Car Class:
• Extends Vehicle
• Adds seatPosition field
• Uses super(make, model, color) to call the parent constructor
• Includes adjustSeat method

Main Class:
• Creates Car objects
• Calls inherited Vehicle methods
• Calls Car-specific methods

Sample Output
Vehicle created.
Car created.
The vehicle is speeding up.
GT running at 5 miles per hour.
Vehicle created.
Car created.
The vehicle is speeding up.
Model S running at 5 miles per hour.
Turning right
The vehicle is slowing down.
Model S running at 0 miles per hour.
Moving seat forward...

Key Takeaways
• Inheritance allows shared behavior across related classes
• Constructor chaining ensures proper initialization order
• This pattern is foundational for advanced OOP concepts

Next Practice Ideas
• Make fields private and add getters/setters
• Override methods in Car
• Add validation to prevent negative speed
• Introduce polymorphism


