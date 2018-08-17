#Class
A class a 'Blue Print' or Prototype from which objects are created.

class syntax

```
 [AccessSpecifier] class ClassName{
	
	//blocks 	- Instance block, Static block
	
	//variables (fields)- instance(non-static) variables, static variables. 
	
	//constructor - default or parameterized constructor
	  
	//methods - instance(non-static) method, static variables
	
	//Inner-Class - local classes, anonymous classes.
}
```

#variables

An object stores its state in fields.

```
Member variables in a class— these are called 'fields'.
Variables in a method or block of code—these are called 'local variables'.
Variables in method declarations—these are called parameters.
```

#Constructor

A class contains constructors that are invoked to create objects from the class blueprint. 

Constructor declarations look like method declarations—except that they use the name of the class and have no return type. 

```
Syntax: default\non parameter 
<access modifier> ClassName(){
	// code for constructor.
}  
```

For example, Bicycle has one constructor:

```
public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
}
```

You don't have to provide any constructors for your class.

The compiler automatically provides a no-argument, default constructor for any class without constructors. This default constructor will call the no-argument constructor of the superclass(java.lang.Object).

Reference:
https://www.geeksforgeeks.org/constructors-in-java/
https://www.javamadesoeasy.com/2015/06/constructor-in-java-constructor.html


#Methods

The only required elements of a method declaration are the method's return type, name, a pair of parentheses, (), and a body between braces, {}.

More generally, method declarations have six components, in order:

```
public double calculateAnswer(double wingSpan, int numberOfEngines, double length, double grossTons) {
    //do the calculation here
}
```

1. Modifiers—such as public, private, and others you will learn about later.
2. The return type—the data type of the value returned by the method, or void if the method does not return a value.
3. The method name—the rules for field names apply to method names as well, but the convention is a little different.
4. The parameter list in parenthesis—a comma-delimited list of input parameters, preceded by their data types, enclosed by parentheses, (). If there are no parameters, you must use empty parentheses.
5. An exception list—to be discussed later.
6. The method body, enclosed between braces—the method's code, including the declaration of local variables, goes here.

Reference:

https://www.geeksforgeeks.org/methods-in-java/
