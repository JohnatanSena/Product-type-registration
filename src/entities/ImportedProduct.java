package entities;

public class ImportedProduct extends Product{
    private Double customFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }
    @Override
    public String priceTag(){
        return String.format("%s R$ %.2f (Custom fee: R$ %.2f) ", super.getName(), super.getPrice(), customFee);
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }
}
