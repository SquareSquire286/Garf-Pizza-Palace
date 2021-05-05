public abstract class PastaDecorator extends Pasta
{
    public Pasta pasta;

    public double getPrice()
    {
        return 0;   
    }
    
    public String getSupplier()
    {
        return "Null";
    }
}
