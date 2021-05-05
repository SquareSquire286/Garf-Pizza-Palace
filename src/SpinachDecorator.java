public class SpinachDecorator extends AbstractDecorator
{
    public SpinachDecorator(AbstractPizza pizza)
    {
	this.pizza = pizza;
	this.ingredientCount = this.pizza.ingredientCount + 1;
    }
    
    @Override
    public double getPrice()
    {
	return pizza.getPrice() + 1.5; // The additional cost of spinach is $1.50.            
    }

    @Override
    public void printIngredients()
    {
	pizza.printIngredients();
	System.out.print("Spinach. ");
    }
}