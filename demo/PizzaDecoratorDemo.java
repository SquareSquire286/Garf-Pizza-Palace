public class PizzaDecoratorDemo
{
    public static void main(String[] args)
    {
	AbstractPizza pizza1 = new Pizza(); // Instantiate a simple Cheese Pizza.
	AbstractPizza pizza2 = new PineappleDecorator(new HamDecorator(new Pizza())); // Instantiate a Hawaiian Pizza.
	AbstractPizza pizza3 = new MushroomsDecorator(new PepperoniDecorator(new Pizza())); // Instantiate a Pepperoni & Mushroom Pizza.
	AbstractPizza pizza4 = new OlivesDecorator(new FetaDecorator(new SpinachDecorator(new Pizza()))); // Instantiate a Greek Pizza.

	pizza1.printIngredients(); // should print "Pizza Ingredients: Mozzarella Cheese. Tomato Sauce"
	System.out.println();
	System.out.println("Pizza Cost: $" + String.format("%.2f", pizza1.getPrice()));

	pizza2.printIngredients(); // should print "Pizza Ingredients: Mozzarella Cheese. Tomato Sauce. Ham. Pineapple."
	System.out.println();
	System.out.println("Pizza Cost: $" + String.format("%.2f", pizza2.getPrice()));

	pizza3.printIngredients(); // should print "Pizza Ingredients: Mozzarella Cheese. Tomato Sauce. Pepperoni. Mushroom."
	System.out.println();
	System.out.println("Pizza Cost: $" + String.format("%.2f", pizza3.getPrice()));

	pizza4.printIngredients(); // should print "Pizza Ingredients: Mozzarella Cheese. Tomato Sauce. Spinach. Feta Cheese. Olives."
	System.out.println();
	System.out.println("Pizza Cost: $" + String.format("%.2f", pizza4.getPrice()));

	return;
    }
}