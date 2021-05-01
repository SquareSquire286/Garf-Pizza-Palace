# Garf's Pizza Palace - Devlog

**28 April 2021**

Initialized repository with README file, and began writing code based on design objectives outlined in README. Completed 14 classes that encompass Pasta instantiation (`Pasta`, `Spaghetti`, `Linguine`, `Fettucine`, `Penne`, `Lasagna`, `PastaFactory`) and Pizza decoration with four basic toppings (`AbstractPizza`, `Pizza`, `AbstractDecorator`, `PepperoniDecorator`, `MushroomsDecorator`, `HamDecorator`, `PineappleDecorator`). All classes compile successfully; no test cases or client applications developed as of yet.

**29 April 2021**

Completed three additional decorator subclasses for the `Pizza` creation module, which represent three previously unavailable toppings (`SpinachDecorator`, `FetaDecorator`, `OlivesDecorator`), and wrote two test programs (`PizzaDecoratorDemo`, `PastaFactoryDemo`) to demonstrate proper functionality of the implemented design patterns. These test programs can only instantiate and perform operations on `Pasta` or `AbstractPizza` objects, indicating that subclass code is properly encapsulated.

**30 April 2021**

Began working on client application with class name `GarfPizzaPalace`. The application currently reads one instance of user input, ensures that a valid integer value is entered with a try-catch block, and invokes a Façade-esque order creation module based on the value. If the user enters a 1, then a pizza order is created; if the user enters a 2, then a pasta order is created.
