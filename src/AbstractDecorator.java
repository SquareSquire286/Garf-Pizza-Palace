public abstract class AbstractDecorator extends AbstractPizza
{
    public AbstractPizza pizza;
    
    @Override
    public double getPrice()
    {
        return 0;   
    }
    
    @Override
    public void printIngredients() // The only default ingredients are mozzarella cheese and tomato sauce.
    {
        System.out.print("Null");   
    }
}
