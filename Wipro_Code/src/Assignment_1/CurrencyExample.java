package Assignment_1;

public class CurrencyExample {

    enum Currency {
        ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
    }

    public static void main(String[] args) {
        for (Currency c : Currency.values()) {
            System.out.println("Currency: " + c);
            
            switch (c) {
                case ONE:
                    System.out.println("Description: ₹1 note - Rarely used, still legal tender.");
                    break;
                case FIVE:
                    System.out.println("Description: ₹5 note - Smallest frequently used currency.");
                    break;
                case TEN:
                    System.out.println("Description: ₹10 note - Common in daily transactions.");
                    break;
                case TWENTY:
                    System.out.println("Description: ₹20 note - Used for moderate purchases.");
                    break;
                case FIFTY:
                    System.out.println("Description: ₹50 note - Used in local transport and shops.");
                    break;
                case HUNDRED:
                    System.out.println("Description: ₹100 note - Most commonly used higher currency.");
                    break;
            }

            System.out.println(); 
        }
    }
}

