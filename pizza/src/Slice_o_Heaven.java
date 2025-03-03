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

   
    private static final String DEF_ORDER_ID = "DEF-SOH-099";
    private static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    private static final double DEF_ORDER_TOTAL = 15.00;

   
    public Slice_o_Heaven() {
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = "";
        this.drinks = "";
    }

   
    public Slice_o_Heaven(String orderID, String pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
    }

    
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    
    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public void takeOrder(String id, String details, double total) {
        this.orderID = id;
        this.orderDetails = details;
        this.orderTotal = total;
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
        this.orderID = id;
        this.orderDetails = details;
        this.orderTotal = total;
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

   
    public void processCardPayment(String cardNumber, String expiryDate, int cvv) {
        int cardLength = cardNumber.length();
        if (cardLength == 14) {
            System.out.println("Card accepted");
        } else {
            System.out.println("Invalid card");
        }

        int firstCardDigit = Integer.parseInt(cardNumber.substring(0, 1));

        String blacklistedNumber = "12345678901234"; // 示例黑名单卡号
        if (cardNumber.equals(blacklistedNumber)) {
            System.out.println("Card is blacklisted. Please use another card");
        }

        int lastFourDigits = Integer.parseInt(cardNumber.substring(cardLength - 4));

        StringBuilder cardNumberToDisplay = new StringBuilder(cardNumber);
        for (int i = 1; i < cardLength - 4; i++) {
            cardNumberToDisplay.setCharAt(i, '*');
        }
        System.out.println("Card number to display: " + cardNumberToDisplay);
    }

    
    public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
        System.out.println("Special of the day:");
        System.out.println("Pizza: " + pizzaOfTheDay);
        System.out.println("Side: " + sideOfTheDay);
        System.out.println("Price: " + specialPrice);
    }
}
