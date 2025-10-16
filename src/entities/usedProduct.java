package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class usedProduct extends Product{
    private Date manufacture;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public usedProduct(){
        super();
    }

    public usedProduct(String name, Double price, Date manufacture) {
        super(name, price);
        this.manufacture = manufacture;
    }

    public Date getManufacture() {
        return manufacture;
    }

    public void setManufacture(Date manufacture) {
        this.manufacture = manufacture;
    }
    @Override
    public String priceTag(){
        return String.format("%s (used) R$ %.2f (Manufacture Date: %s", super.getName(), super.getPrice(), sdf.format(manufacture));
    }
}
