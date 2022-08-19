package shoppingcart;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import static shoppingcart.Constants.*;

public class ShoppingCartApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(args[0]));
        ShoppingCart cart = new ShoppingCart();
        while (scanner.hasNext()){
            String data = scanner.nextLine();
            String[] dataSet = data.split(" ");
            if(dataSet[0].equalsIgnoreCase(DOVESOAP) || dataSet[0].equalsIgnoreCase(AXEDEO)){
              Product product = new Product(dataSet[0],Double.parseDouble(dataSet[1]));
              int productQuantity = Integer.parseInt(dataSet[2]);
              cart.addToCart(new LineItem(product,productQuantity));
            }
            if(dataSet[0].equalsIgnoreCase(SALESTAX)){
                cart.setTax(Double.parseDouble(dataSet[1]));
            }
        }

        System.out.println("Total bill is: "+getTotalBill(cart));
    }

    public static double getTotalBill(ShoppingCart cart){
        double totalAmount = cart.getTotalBill();
        double taxAmount = cart.getTax();
        double totalBill = totalAmount + taxAmount;
        return totalBill;
    }


}
