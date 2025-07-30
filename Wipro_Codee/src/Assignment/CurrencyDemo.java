package Assignment;

public class CurrencyDemo {

    // Define enum with six paper currencies
    enum Currency {
        ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
    }

    public static void main(String[] args) {
        // Loop through enum values
        System.out.println("Currency Types:");
        for (Currency c : Currency.values()) {
            System.out.println("- " + c);

            // Switch to print description
            switch (c) {
                case ONE:
                    System.out.println("  Description: Smallest paper denomination.");
                    break;
                case FIVE:
                    System.out.println("  Description: Commonly used for small purchases.");
                    break;
                case TEN:
                    System.out.println("  Description: Handy for daily transactions.");
                    break;
                case TWENTY:
                    System.out.println("  Description: Moderate denomination, used often.");
                    break;
                case FIFTY:
                    System.out.println("  Description: Larger denomination for bigger purchases.");
                    break;
                case HUNDRED:
                    System.out.println("  Description: High denomination, used for bulk transactions.");
                    break;
                default:
                    System.out.println("  Description: Unknown currency.");
            }
        }
    }
}


//Currency Types:
//- ONE
//  Description: Smallest paper denomination.
//- FIVE
//  Description: Commonly used for small purchases.
//- TEN
//  Description: Handy for daily transactions.
//- TWENTY
//  Description: Moderate denomination, used often.
//- FIFTY
//  Description: Larger denomination for bigger purchases.
//- HUNDRED
//  Description: High denomination, used for bulk transactions.

