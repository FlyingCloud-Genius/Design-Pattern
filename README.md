# Some rules for design pattern

**Remember to read this first before moving on to actual cases!** 
Here introduce some of the basic rules to design a good system.

## Dependence Inversion
1. Definition:  
High level modules should not depend upon low level modules.
Both should depend upon abstractions. Abstractions should not depend upon details. 
Details should depend upon abstractions.

2. My Understanding:  
    1.  High modules should not depend on the realization of the object,
    but should depend on the abstraction. The dependency always comes
    with interface or abstraction.

    2.  The interface and abstraction should not depend on realization, but the realization does.

3. The conversion of dependency
    1. Comparing to the traditional software design architecture, like the three layer structure we always mentioned.
    Because each layer depends on the lower layer, when the lower layer changed, the upper layer much change its corresponding
    structure. But **if the higher layer does not depend on the realization of the lower layer but depend on the abstraction of the 
    lower layer**, we add another layer for interface. Then, as long as we did not change the action of the api. The upper layer 
    will not need to change.
    
    2. As a conclusion, the conversion of dependency is not conversion, but another layer to help realizing the low coupling design.
    It makes the design of API more important for interaction.
    
4. Some realization of the dependency conversion
    1. **Inversion of Control(IoC)**: The detail can refer to the design of Spring.
    The idea of IoC is to transfer the control of dependency to the framework. If I want to use instance A in B, 
    I ask the container to get the instance rather than go to A directly.
    
    2. **Dependency Injection(DI)**: DI is one of the way to realize IoC to convert dependency.
    
    3. **IoC Container**: The framework for dependency injection, used for projecting dependency, maintaining the life circle and initialization of the object.


## Single Responsibility Principle
1. Definition:  
    There should never be more than one reason for a class to change.
    In another expression, **for one class, it should only be responsible for only one thing, as the only
    reason to change it.**
    
2. My Understanding:  
    1. In OOP, we always follow a rule, high cohesion, low coupling. The rule of single responsibility principle is about extending
    the rule. We include less responsibility in one class to higher its cohesion, to reduce the change to it. The point of this rule
    is about dividing the responsibility properly for each class. In different classes with different requirement, we need to decouple
    classes properly.
    
    2. Under different requirement of fine-grain, it will be suitable for different business requirement. 
    **There is no perfect design. But only the most suitable under the circumstance.**
    
## Interface Segregation Principle
1.  Definition:  
    Clients should not be forced to depend upon interfaces that they don't use.  
    OR:  
    The dependency of one class to another one should depend on the smallest possible interface.
    
2. My Understanding
    1. We only provide interfaces for what clients need. We don't rely on the interface as long as the client fo not need it.
    Extra interface means a higher coupling in the program.
    
    2. The dependency of different class should be built on the minimum interface. The minimum interface means higher cohesion
    in the program. To design the minimum interface, it is related to the grain size of the interface. From some point of view,
    the SRP and ISP are similar.
    
    3. **SRP and ISP**:  
        1. From the point of principle restraint, ISP focus more on dependency of different interface, more about **cohesion**.
        But for SRP, it focus more on responsibility of different interface.
        
        2. SRP focus on how to separate the interface, while ISP focus on isolation of interface with similar functions. The
        minimum interface with ISP can implement many SRP interface. 
        
        3. ISP focus more on structuring rather than business. Differently, the SRP focus more on restraining the business model.
        
## Open Closed Principle
1. Definition:  
    Software entities (class, module, function) should be open for extension but closed for modification.
    
2. My understanding:
    1. Open for extension. It means extending the module to satisfy all the new actions.
    
    2. Closed for modification. When the demand changes, we do not change the source code but extend the source code
    in the extension package.
    
    3. Why we need "open" and "closed"?  
        When we receive the notice that we need modification on the demand, what we usually do is to modify the current 
        source code. However, there is a huge risk of doing that, especially when the program is already been loaded for some time.
        Therefore, to decrease the risk, what we do is not to modify the source code, as we called the "Closed principle".  
        
        What we actually do is to extend the package and add more functions to satisfy the changes. That is what we called IOP (Api oriented programming)
         or AOP(Abstraction Oriented Programming).For every parameter class or passing reference, we must use abstraction or interface to define it rather
         than using realization class directly. We use abstraction to define extension. If we define an interface A, then, our extension must be the realization 
         class for interface A. (In this way, it will save a lot of time.) **As a conclusion, Open Closed Principle higher the maintainability and reusability.**

## Liskov Substitution Principle
1. Definition:  
    If for each object o1 of type S, there is an object o2 of type T such that for all programs P
    defined in terms of T, the behavior of P is unchanged when o1 is substituted o2 then S is a subtype of T.  
    Or:  
    Functions that using pointers or references to base classes must be able
     to use objects of derived classes without knowing it.
     
2. Meaning during Implementation:
    1. Child class must implement the abstract method of the parent class, but should not override the non-abstract method.
    
    2. The child class can add its own method.
    
    3. When child class override or implementing the method of father class, the condition of a child class should be more 
    loose for a child's class rather than a father class.
    
    4. When a child's method is implementing, the return value should be stricter than the father class.
    
3. My Understanding:
    1. Father can be replaced by child class. But child class can not be replaced by father class. This is about the inheritance hierarchy.
    
    2. To substitute this principle, we should not change the father class's function inherited in the child class. We can only add new functions.
    
    3. When the child class implements the abstract method in father class, the return should be stricter. Differently, for input in the method, 
    the child class should have much loose prior condition.