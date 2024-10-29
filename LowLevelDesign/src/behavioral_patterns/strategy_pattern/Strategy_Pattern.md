## Strategy Pattern


### Intent
 - Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
### Problem
 - Each time you added a new algorithm, the main class increased in size. At some point, the beast became too hard to maintain.

 - Any change to one of the algorithms, whether it was a simple bug fix or a slight adjustment in the algorithm, affected the whole class, increasing the chance of creating an error in already-working code.

 - Implementing a new feature requires you to change the same huge class, conflicting with the code produced by other people. They spend too much time resolving merge conflicts.
### Solution
 - The Strategy pattern suggests that you take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes called **strategies**.

 - The original class, called **context**, must have a field for storing a reference to one of the strategies. The context delegates the work to a linked strategy object instead of executing it on its own.

 - The **context** isn’t responsible for selecting an appropriate algorithm for the job. Instead, the client passes the desired strategy to the context. In fact, the context doesn’t know much about strategies. It works with all strategies through the same generic interface, which only exposes a single method for triggering the algorithm encapsulated within the selected strategy.

 - This way the context becomes independent of concrete strategies, so you can add new algorithms or modify existing ones without changing the code of the context or other strategies.

### Structure
![img.png](img.png)

### Applicability
 - Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
 - Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.
 - Use the pattern to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic.
 - Use the pattern when your class has a massive conditional statement that switches between different variants of the same algorithm.

### How to Implement
  - In the context class, identify an algorithm that’s prone to frequent changes. It may also be a massive conditional that selects and executes a variant of the same algorithm at runtime.

  - Declare the strategy interface common to all variants of the algorithm.

  - One by one, extract all algorithms into their own classes. They should all implement the strategy interface.

  - In the context class, add a field for storing a reference to a strategy object. Provide a setter for replacing values of that field. The context should work with the strategy object only via the strategy interface. The context may define an interface which lets the strategy access its data.

  - Clients of the context must associate it with a suitable strategy that matches the way they expect the context to perform its primary job.

### Resource

- [Refactoring Guru: Strategy Pattern](https://refactoring.guru/design-patterns/strategy)
















