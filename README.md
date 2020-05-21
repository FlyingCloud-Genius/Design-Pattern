# Some rules for design pattern

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
    
    3. **IoC container**: The framework for dependency injection, used for projecting dependency, maintaining the life circle and initialization of the object.


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
        
        2. SRP focus on how to seperate the interface, while ISP focus on isolation of interface with similar functions. The
        minimum interfce with ISP can implement many SRP interface. 
        
        3. ISP focus more on structuring rather than business. Differently, the SRP focus more on restraining the business model.
        
## Open Closed Principle
1. Definition:  
    

## Liskov Substitution Principle