public class HamDecorator extends AbstractDecorator
{
    public HamDecorator(AbstractPizza pizza)
    {
        this.pizza = pizza;
        this.ingredientCount = this.pizza.ingredientCount + 1;
    }
    
    @Override
    public double getPrice()
    {
        return pizza.getPrice() + 1.2; // The additional cost of ham is $1.20.
    }
    
    @Override
    public void printIngredients()
    {
        pizza.printIngredients();
        System.out.print("Ham. ");   
    }
}
