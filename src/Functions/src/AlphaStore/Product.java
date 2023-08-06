package AlphaStore;

public class Product {
    private final String name;
    private final String iD;
    private final String productDescription;
    private final ProductType productType;
    private  int price;

    public Product (String name, String iD, String productDescription, int price, ProductType productType){
        this.iD = iD;
        this.name = name;
        this.productType = productType;
        this.productDescription = productDescription;
        if (price < 0){
            throw new IllegalArgumentException("Invalid Price");
        }else  this.price = price;
    }

    public void setPrice(int price) {
        if (price < 0){
            throw new IllegalArgumentException("Invalid Price");
        } else  this.price = price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getID() {
        return iD;
    }

    public String getName() {
        return name;
    }
}
