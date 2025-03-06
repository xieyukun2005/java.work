import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
    public String sideDish;
    public int pizzasize;

    private static final String DEF_ORDER_ID = "DEF-SOH-099";
    private static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    private static final double DEF_ORDER_TOTAL = 15.00;
    private static final long BLACKLISTED_NUMBER = 12345678901234L;

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

    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        int ingChoice1, ingChoice2, ingChoice3;
        String ing1 = "", ing2 = "", ing3 = "";

        
        do {
            System.out.println("Please pick any three of the following ingredients:");
            System.out.println("1. Mushroom");
            System.out.println("2. Paprika");
            System.out.println("3. Sun-dried tomatoes");
            System.out.println("4. Chicken");
            System.out.println("5. Pineapple");
            System.out.println("Enter any three choices (1, 2, 3,…) separated by spaces:");

            ingChoice1 = scanner.nextInt();
            ingChoice2 = scanner.nextInt();
            ingChoice3 = scanner.nextInt();

            boolean valid1 = ingChoice1 >= 1 && ingChoice1 <= 5;
            boolean valid2 = ingChoice2 >= 1 && ingChoice2 <= 5;
            boolean valid3 = ingChoice3 >= 1 && ingChoice3 <= 5;

            if (!valid1 || !valid2 || !valid3) {
                System.out.println("Invalid choice(s). Please pick only from the given list:");
            }
        } while (!((ingChoice1 >= 1 && ingChoice1 <= 5) && (ingChoice2 >= 1 && ingChoice2 <= 5) && (ingChoice3 >= 1 && ingChoice3 <= 5)));

       
        switch (ingChoice1) {
            case 1 -> ing1 = "Mushroom";
            case 2 -> ing1 = "Paprika";
            case 3 -> ing1 = "Sun-dried tomatoes";
            case 4 -> ing1 = "Chicken";
            case 5 -> ing1 = "Pineapple";
        }
        switch (ingChoice2) {
            case 1 -> ing2 = "Mushroom";
            case 2 -> ing2 = "Paprika";
            case 3 -> ing2 = "Sun-dried tomatoes";
            case 4 -> ing2 = "Chicken";
            case 5 -> ing2 = "Pineapple";
        }
        switch (ingChoice3) {
            case 1 -> ing3 = "Mushroom";
            case 2 -> ing3 = "Paprika";
            case 3 -> ing3 = "Sun-dried tomatoes";
            case 4 -> ing3 = "Chicken";
            case 5 -> ing3 = "Pineapple";
        }
        pizzaIngredients = ing1 + ", " + ing2 + ", " + ing3;

        
        int sizeChoice;
        String pizzaSize = ""; 
        do {
            System.out.println("What size should your pizza be?");
            System.out.println("1. Large");
            System.out.println("2. Medium");
            System.out.println("3. Small");
            System.out.println("Enter only one choice (1, 2, or 3):");
            sizeChoice = scanner.nextInt();
            if (sizeChoice < 1 || sizeChoice > 3) {
                System.out.println("Invalid choice. Please pick from the list.");
            }
        } while (sizeChoice < 1 || sizeChoice > 3);

        
        switch (sizeChoice) {
            case 1 -> pizzaSize = "Large";
            case 2 -> pizzaSize = "Medium";
            case 3 -> pizzaSize = "Small";
        }

        
        System.out.println("Do you want extra cheese (Y/N):");
        String extraCheese = scanner.next();

        
        int sideDishChoice;
        String sideDish = ""; 
        do {
            System.out.println("Following are the side dish that go well with your pizza:");
            System.out.println("1. Calzone");
            System.out.println("2. Garlic bread");
            System.out.println("3. Chicken puff");
            System.out.println("4. Muffin");
            System.out.println("5. Nothing for me");
            System.out.println("What would you like? Pick one (1, 2, 3,…):");
            sideDishChoice = scanner.nextInt();
            if (sideDishChoice < 1 || sideDishChoice > 5) {
                System.out.println("Invalid choice. Please pick from the list.");
            }
        } while (sideDishChoice < 1 || sideDishChoice > 5);

        
        switch (sideDishChoice) {
            case 1 -> sideDish = "Calzone";
            case 2 -> sideDish = "Garlic bread";
            case 3 -> sideDish = "Chicken puff";
            case 4 -> sideDish = "Muffin";
            case 5 -> sideDish = "Nothing for me";
        }
        sides = sideDish;

        int drinkChoice;
        do {
            System.out.println("Choose from one of the drinks below. We recommend Coca Cola:");
            System.out.println("1. Coca Cola");
            System.out.println("2. Cold coffee");
            System.out.println("3. Cocoa Drink");
            System.out.println("4. No drinks for me");
            System.out.println("Enter your choice:");
            drinkChoice = scanner.nextInt();
            if (drinkChoice < 1 || drinkChoice > 4) {
                System.out.println("Invalid choice. Please pick from the list.");
            }
        } while (drinkChoice < 1 || drinkChoice > 4);

        switch (drinkChoice) {
            case 1 -> drinks = "Coca Cola";
            case 2 -> drinks = "Cold coffee";
            case 3 -> drinks = "Cocoa Drink";
            case 4 -> drinks = "No drinks for me";
        }

        orderDetails = "Pizza size: " + pizzaSize + ", Ingredients: " + pizzaIngredients + ", Extra cheese: " + extraCheese +
                ", Side dish: " + sides + ", Drinks: " + drinks;

        System.out.println("Would you like the chance to pay only half for your order? (Y/N):");
        String wantDiscount = scanner.next();

        if (wantDiscount.equalsIgnoreCase("Y")) {
            isItYourBirthday();
        } else {
            makeCardPayment();
        }

        scanner.close(); 
    }

    public void isItYourBirthday() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar now = Calendar.getInstance();
        String birthdateStr;

        do {
            System.out.println("Enter your birthday (dd/MM/yyyy):");
            birthdateStr = scanner.next();
            try {
                Date birthdate = sdf.parse(birthdateStr);
                Calendar cal = Calendar.getInstance();
                cal.setTime(birthdate);
                int birthYear = cal.get(Calendar.YEAR);
                int currentYear = now.get(Calendar.YEAR);
                int ageDiff = currentYear - birthYear;

                if (ageDiff >= 5 && ageDiff <= 120) {
                    int birthMonth = cal.get(Calendar.MONTH);
                    int birthDay = cal.get(Calendar.DAY_OF_MONTH);

                    int currentMonth = now.get(Calendar.MONTH);
                    int currentDay = now.get(Calendar.DAY_OF_MONTH);

                    int age = currentYear - birthYear;
                    if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
                        age--;
                    }

                    if (age < 18 && currentMonth == birthMonth && currentDay == birthDay) {
                        System.out.println("Congratulations! You pay only half the price for your order");
                        orderTotal /= 2;
                    } else {
                        System.out.println("Too bad! You do not meet the conditions to get our 50% discount");
                    }
                    makeCardPayment();
                    break;
                } else {
                    System.out.println("Invalid date. You are either too young or too dead to order. Please enter a valid date:");
                }
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please try again.");
            }
        } while (true);

        scanner.close(); 
    }

    public void makeCardPayment() {
        Scanner scanner = new Scanner(System.in);
        String expiryDate;
        SimpleDateFormat expiryFormat = new SimpleDateFormat("MM/yyyy");

        do {
            System.out.println("Enter the card’s expiry date (MM/yyyy):");
            expiryDate = scanner.next();
            try {
                Date expiry = expiryFormat.parse(expiryDate);
                if (expiry.before(new Date())) {
                    System.out.println("Invalid date. Expiry date must be in the future.");
                } else {
                    break;
                }
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please try again.");
            }
        } while (true);

        System.out.println("Enter your card number:");
        long cardNumber = scanner.nextLong();
        System.out.println("Enter the card’s cvv number:");
        int cvv = scanner.nextInt();

        processCardPayment(cardNumber, expiryDate, cvv);
        scanner.close(); 
    }

    public void processCardPayment(long cardNumber, String expiryDate, int cvv) {
        Scanner scanner = new Scanner(System.in);
        long cardNum;

        do {
            System.out.println("Enter a 14-digit card number:");
            cardNum = scanner.nextLong();
            String cardStr = Long.toString(cardNum);

            if (cardStr.length() == 14 && cardNum != BLACKLISTED_NUMBER) {
                int cardLength = cardStr.length();
                System.out.println("Card accepted");

                int firstCardDigit = Integer.parseInt(cardStr.substring(0, 1));

                if (cardNum == BLACKLISTED_NUMBER) {
                    System.out.println("Card is blacklisted. Please use another card");
                    return;
                }

                int lastFourDigits = Integer.parseInt(cardStr.substring(cardLength - 4));

                StringBuilder cardNumberToDisplay = new StringBuilder(cardStr);
                for (int i = 1; i < cardLength - 4; i++) {
                    cardNumberToDisplay.setCharAt(i, '*');
                }
                System.out.println("Card number to display: " + cardNumberToDisplay);

                makepizza(orderID, orderDetails, orderTotal);
                break;
            } else {
                System.out.println("Invalid card number. Must be 14 digits and not blacklisted.");
            }
        } while (true);

        scanner.close(); 
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
    }

    @Override
    public String toString() {
        return "********RECEIPT********\n" +
               "Order ID: " + orderID + "\n" +
               "Order Details: " + orderDetails + "\n" +
               "Order Total: " + orderTotal;
    }

    public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
        System.out.println("Special of the day:");
        System.out.println("Pizza: " + pizzaOfTheDay);
        System.out.println("Side: " + sideOfTheDay);
        System.out.println("Price: " + specialPrice);
    }
}



