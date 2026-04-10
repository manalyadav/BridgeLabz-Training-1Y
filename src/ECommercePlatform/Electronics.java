package ECommercePlatform;

import javax.swing.plaf.metal.MetalRootPaneUI;

public class Electronics extends Product implements Taxable{

    private int mrp;
    private double taxElectronics;

    public Electronics(int ProductId, String name, int Mrp){
        setProductId(ProductId);
        setName(name);
        this.mrp= Mrp;
    }

    @Override
    public void calculateDiscount() {
        double claculatedDiscount = mrp*0.15;
        if(claculatedDiscount>2000.0){
            claculatedDiscount=2000.0;
        }
        double finalPrice = mrp - claculatedDiscount;
        setPrice(finalPrice);
    }


    @Override
    public void calculateTax(double TaxValue) {
        this.taxElectronics=TaxValue;
    }

    @Override
    public String getTaxDetails() {
        return "GST on Electronics: "+taxElectronics;
    }
}
