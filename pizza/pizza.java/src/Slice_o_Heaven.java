public class Slice_o_Heaven {
     public String storeAddress;
     private String storemenu;
     public String storeHours;
     public long storePhoneNumber;
     public String storeEmail;
     public String storeWebsite;
     public String pizaaname;
     public String sides;
     public String pizzaIngredients;
     private String orderID;
     private String orderDetails;
     private String orderStatus;
     private double orderTotal;
     public String drinks;
 
     // Final variables
     private static final String DEF_ORDER_ID = "DEF-SOH-099";
     private static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
     private static final double DEF_ORDER_TOTAL = 15.00;
 
     // Default constructor
     public Slice_o_Heaven() {
         this.orderID = DEF_ORDER_ID;
         this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
         this.orderTotal = DEF_ORDER_TOTAL;
         this.sides = "";
         this.drinks = "";
     }
 
     // Parameterized constructor
     public Slice_o_Heaven(String orderID, String pizzaIngredients, double orderTotal) {
         this.orderID = orderID;
         this.pizzaIngredients = pizzaIngredients;
         this.orderTotal = orderTotal;
     }
 
     // Getter and Setter for orderID
     public String getOrderID() {
         return orderID;
     }
 
     public void setOrderID(String orderID) {
         this.orderID = orderID;
     }
 
     // Getter and Setter for orderTotal
     public double getOrderTotal() {
         return orderTotal;
     }
 
     public void setOrderTotal(double orderTotal) {
         this.orderTotal = orderTotal;
     }
 
     public void takeOrder(String id, String details, double total) {
         orderID = id;
         orderDetails = details;
         orderTotal = total;
         System.out.println("Order accepted!");
         System.out.println("Order is being prepared");
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             System.out.println("Order is ready for pickup!");
         }
         System.out.println("Your order is ready!");
     }
 
     public void makepizza(String id, String details, double total) {
         orderID = id;
         orderDetails = details;
         orderTotal = total;
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             System.out.println("Order is ready for pickup!");
         }
         System.out.println("Your pizza is ok!");
         printReceipt();
     }
 
     private void printReceipt() {
         System.out.println("********RECEIPT********");
         System.out.println("Order ID: " + orderID);
         System.out.println("Order Details: " + orderDetails);
         System.out.println("Order Total: " + orderTotal);
     }
 }