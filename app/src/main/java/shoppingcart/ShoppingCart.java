package shoppingcart;
import java.util.ArrayList;

public class ShoppingCart {
   private ArrayList<LineItem> itemList;
   private double totalBill;
   private double tax;

    public ArrayList<LineItem> getItemList() {
        return itemList;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    ShoppingCart() {
       this.itemList = new ArrayList<>();
       this.totalBill = 0;
       this.tax = 0;
   }
    public void addToCart(LineItem items){
        itemList.add(items);
    }

   private double calculateTotalBill(){
       for(int i=0;i<itemList.size();i++){
           Product product = itemList.get(i).getProduct();
           int productQuantity = itemList.get(i).getQuantity();
           double productPrice = product.getProductPrice();
           totalBill += productPrice * productQuantity;

       }
       return totalBill;
   }

   private double calculateTax(){
        tax = tax/100;
       double totalTax = 0;
       for(int i=0;i<itemList.size();i++){
           Product product = itemList.get(i).getProduct();
           double price = product.getProductPrice();
           int quantity = itemList.get(i).getQuantity();
           totalTax += tax * price * quantity;
       }
       return Math.ceil(totalTax);
   }

    public double getTax() {
        return calculateTax();
    }

    public double getTotalBill() {
        return calculateTotalBill();
    }
}
