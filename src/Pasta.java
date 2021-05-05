public abstract class Pasta
{
    public double getPrice()
    {
        return 0;   
    }
    
    public String getSupplier()
    {
        return "Catelli"; // Catelli is the default supplier of a pasta type; unless the method is overridden in a subclass, "Catelli" will be returned
    }
}
