public class MarinaraSauceDecorator extends PastaDecorator
{
    public MarinaraSauceDecorator(Pasta pasta)
    {
	this.pasta = pasta;
    }

    @Override
    public double getPrice()
    {
        return pasta.getPrice() + 1.5;   
    }

    @Override
    public String getSupplier()
    {
	return pasta.getSupplier();
    }
}
