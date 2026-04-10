package ECommercePlatform;

public class Clothing extends Product implements Taxable {

    private double mrp;
    private double taxClothing;

    public Clothing(int ProductId, String name, double Mrp){
        setProductId(ProductId);
        setName(name);
        this.mrp= Mrp;
    }

    @Override
    public void calculateDiscount() {
        double calculatedDiscount = 0;
        if (mrp > 3000.0) {
            calculatedDiscount = mrp * 0.80;
        }
        double finalPrice = mrp - calculatedDiscount;
        setPrice(finalPrice);
    }


    @Override
    public void calculateTax(double TaxValue) {
        this.taxClothing=TaxValue;
    }

    @Override
    public String getTaxDetails() {
        return "GST on Clothing: "+taxClothing;
    }
}
