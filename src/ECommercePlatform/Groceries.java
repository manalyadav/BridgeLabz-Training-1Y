package ECommercePlatform;

public class Groceries extends Product implements Taxable {

    private int mrp;
    private double taxGroceries;

    public Groceries(int ProductId, String name, int Mrp){
        setProductId(ProductId);
        setName(name);
        this.mrp= Mrp;
    }

    @Override
    public void calculateDiscount() {
        double calculatedDiscount = mrp * 0.02;
        if (mrp >= 500) {
            calculatedDiscount= mrp -50;
        }
        double finalPrice = mrp - calculatedDiscount;
        setPrice(finalPrice);
    }

    @Override
    public void calculateTax(double TaxValue) {
        this.taxGroceries=TaxValue;
    }

    @Override
    public String getTaxDetails() {
        return "GST on Groceries: "+taxGroceries;
    }
}
