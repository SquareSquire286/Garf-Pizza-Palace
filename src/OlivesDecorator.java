public class OlivesDecorator extends AbstractDecorator
{
    public OlivesDecorator(AbstractPizza pizza)
    {
	this.pizza = pizza;
	this.ingredientCount = this.pizza.ingredientCount + 1;
    }

    @Override
	public double getPrice()
    {
	return pizza.getPrice() + 0.55; // The additional cost of olives is $0.55.            
    }

    @Override
	public void printIngredients()
    {
	pizza.printIngredients();
	System.out.print("Olives. ");
    }
}