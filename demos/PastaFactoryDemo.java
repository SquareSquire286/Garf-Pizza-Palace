public class PastaFactoryDemo
{
    public static void main(String[] args)
    {
        PastaFactory pastaFactory = new PastaFactory();
        
        Pasta pasta1 = pastaFactory.createPasta(1); // should create a Spaghetti object
        Pasta pasta2 = pastaFactory.createPasta(2); // should create a Fettucine object
        Pasta pasta3 = pastaFactory.createPasta(3); // should create a Linguine object
        Pasta pasta4 = pastaFactory.createPasta(4); // should create a Penne object
        Pasta pasta5 = pastaFactory.createPasta(5); // should create a Lasagna object
            
        System.out.println("Pasta Information: " + pasta1.getSupplier() + ", $" + String.format("%.2f", pasta1.getPrice())); // should print "Catelli, $3.50"
        System.out.println("Pasta Information: " + pasta2.getSupplier() + ", $" + String.format("%.2f", pasta2.getPrice())); // should print "Barilla, $4.25"
        System.out.println("Pasta Information: " + pasta3.getSupplier() + ", $" + String.format("%.2f", pasta3.getPrice())); // should print "Catelli, $4.00"
        System.out.println("Pasta Information: " + pasta4.getSupplier() + ", $" + String.format("%.2f", pasta4.getPrice())); // should print "Catelli, $4.50"
        System.out.println("Pasta Information: " + pasta5.getSupplier() + ", $" + String.format("%.2f", pasta5.getPrice())); // should print "Primo, $5.00"
        
        return;
    }
}
