import java.util.Scanner;

public class FacadeInterface
{
    private PastaFactory pastaFactory;
    private AbstractPizza pizza, proxyPizza;
    private char[] ingredientList;
    private int arrayCount;
    private Scanner scanner;

    public FacadeInterface()
    {
	pastaFactory = new PastaFactory();
	proxyPizza = new Pizza();
	ingredientList = new char[7];
	arrayCount = 0;
	scanner = new Scanner(System.in);

	for (int i = 0; i < ingredientList.length; i++)
	    ingredientList[i] = '0';
    }
    
    public void createOrder(char choice) // resembles Facade design pattern
    {
	if (choice == '1')
	    this.createPizzaOrder();

	else if (choice == '2')
	    this.createPastaOrder();

	else return; // an exception will be thrown in main() automatically
    }

    public void createPizzaOrder()
    {
        System.out.println("");
	System.out.println("Garf's Pizza Palace offers traditional recipes and customizable orders.");
	System.out.println("Press [1] if you want to order a recipe from the menu, or any other key if you want to create your own pizza.");

	char choice = scanner.nextLine().charAt(0);

	if (choice == '1')
	    this.displayMenu();

	else this.displayToppingsModule();
    }

    public void displayMenu()
    {
	System.out.println("");
	System.out.println("To select a pizza, press the corresponding key:");
	System.out.println("[1] Cheese Pizza");
	System.out.println("[2] Pepperoni Pizza");
	System.out.println("[3] Hawaiian Pizza");
	System.out.println("[4] Pepperoni & Mushroom Pizza");
	System.out.println("[5] Spinach & Feta Pizza");
	System.out.println("[Other] Greek Pizza");
	System.out.println("");
	System.out.print("Enter your choice here: ");

	char choice = scanner.nextLine().charAt(0);
	this.buildBasicPizza(choice);
    }

    public void displayToppingsModule()
    {
	System.out.println("");
	System.out.println("To add a topping to your pizza, press the corresponding key. Note that mozzarella cheese and tomato sauce are included on all of our pizzas by default.");
	System.out.println("[1] Pepperoni");
	System.out.println("[2] Pineapple");
	System.out.println("[3] Ham");
	System.out.println("[4] Mushrooms");
	System.out.println("[5] Spinach");
	System.out.println("[6] Feta Cheese");
	System.out.println("[7] Olives");
	System.out.println("[Other] No additional toppings");
	System.out.println("");
	System.out.print("Enter your choice here: ");

	char choice = scanner.nextLine().charAt(0);
	this.addTopping(choice);
    }

    public void buildBasicPizza(char choice)
    {
	switch (choice)
	    {
	        case '1': break; // no decoration is required
	        case '2': proxyPizza = new PepperoniDecorator(new Pizza()); break;
	        case '3': proxyPizza = new PineappleDecorator(new HamDecorator(new Pizza())); break;
	        case '4': proxyPizza = new MushroomsDecorator(new PepperoniDecorator(new Pizza())); break;
	        case '5': proxyPizza = new FetaDecorator(new SpinachDecorator(new Pizza())); break;
	        default: proxyPizza = new OlivesDecorator(new FetaDecorator(new SpinachDecorator(new Pizza())));
	    }

	this.updatePizza();
    }

    public void addTopping(char choice)
    {
	int i;
	int initialArrayCount = arrayCount;

	int ascii = (int) choice;

	if (ascii < 49 || ascii > 55) // indicating that the user does not want to add more ingredients
	    {
		this.updatePizza();
	    }

	else
	    {
		for (i = 0; i < ingredientList.length; i++)
		    {
			if (ingredientList[i] == '0') // indicating a dummy value (element not overwritten yet)
			    {
				ingredientList[i] = choice;
				arrayCount++;
				break;
			    }
		
			else if (ingredientList[i] == choice) // indicating that the ingredient is already in the list
			    break;
		    }
		
		if (arrayCount == initialArrayCount) // indicating that no element was added to the list
		    {
			System.out.println("");
			System.out.println("This ingredient has already been selected! Try again.");
			this.displayToppingsModule();
		    }
		
		else
		    {
			switch (choice)
			    {
			        case '1': proxyPizza = new PepperoniDecorator(proxyPizza); this.printUpdatedIngredient("Pepperoni"); break;
			        case '2': proxyPizza = new PineappleDecorator(proxyPizza); this.printUpdatedIngredient("Pineapple"); break;
			        case '3': proxyPizza = new HamDecorator(proxyPizza); this.printUpdatedIngredient("Ham"); break;
			        case '4': proxyPizza = new MushroomsDecorator(proxyPizza); this.printUpdatedIngredient("Mushrooms"); break;		
			        case '5': proxyPizza = new SpinachDecorator(proxyPizza); this.printUpdatedIngredient("Spinach"); break;
			        case '6': proxyPizza = new FetaDecorator(proxyPizza); this.printUpdatedIngredient("Feta Cheese"); break;
			        case '7': proxyPizza = new OlivesDecorator(proxyPizza); this.printUpdatedIngredient("Olives"); break;
			        default: break;
			    }
			
			this.displayToppingsModule();
		    }
	    }
    }

    public void printUpdatedIngredient(String ingredient)
    {
	System.out.println("");
	System.out.println(ingredient + " added.");
    }
    
    public void updatePizza()
    {
	pizza = proxyPizza;
    }

    public AbstractPizza getPizza()
    {
	return pizza;
    }

    public void createPastaOrder()
    {
	System.out.println("Pasta Module Coming Soon");
    }
}
