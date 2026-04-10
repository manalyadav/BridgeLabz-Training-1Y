package ECommercePlatform;

public abstract class Product {
    private int productId;
    private String name;
    private double price;

    public abstract void calculateDiscount();

    @Override
    public String toString(){
        return "Product ID: "+productId+" | Name: "+name+" | Price: "+price;
    }


    //Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }
}
