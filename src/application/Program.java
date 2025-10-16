package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> product = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Product #" + (i+1) + " data");
            System.out.print("Common, used or imported - (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'i'){
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();
                Product productImported = new ImportedProduct(name, price, customFee);
                product.add(productImported);
            } else if (ch == 'c'){
                Product productCommon = new Product(name, price);
                product.add(productCommon);
             } else if (ch == 'u'){
                System.out.print("Manufacture Data (DD/MM/YYYY): ");
                Date manufactureData = sdf.parse(sc.next());
                Product produtUsed = new UsedProduct(name, price, manufactureData);
                product.add(produtUsed);
            }
        }
        System.out.println("PRICE TAGS");
        for(Product pdt : product){
            System.out.println(pdt.priceTag());
        }
    }
}
