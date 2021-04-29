public class PepperoniDecorator extends AbstractDecorator
{
    public PepperoniDecorator(AbstractPizza pizza)
    {
        this.pizza = pizza;
        this.ingredientCount = this.pizza.ingredientCount + 1;
    }
    
    @Override
    public double getPrice()
    {
        return pizza.getPrice() + 1; // The additional cost of pepperoni is $1.
    }
    
    @Override
    public void printIngredients() // The only default ingredients are mozzarella cheese and tomato sauce.
    {
        pizza.printIngredients();
        System.out.print("Pepperoni. ");   
    }
}
