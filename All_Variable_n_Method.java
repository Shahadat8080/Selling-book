package Book_Sell_Inventory;

import javax.swing.JOptionPane;

public class All_Variable_n_Method {

    static String askToCustomer;
    static String bookList[] = {"Java", "C", "C++", "Php"};
    static String priceString;

    static String yourProString[] = {"Student", "Teacher", "Business Man ", "Privet Job Holder"};

    final static double DISCOUNTFORSTUDENT = .3;
    // static double DISCOUNTFORSTUDENT ;
    final static double DISCOUNTFORTEACHER = 50.0;
    final static double DISCOUNTFORBUSINESSMAN = 20.0;
    final static double DISCOUNTFORPRIVET_JOB_HOLDER = 15.0;

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to our Book Store");
        JOptionPane.showMessageDialog(null, "Shop Manager: How can i help you?");
        JOptionPane.showMessageDialog(null, "Customer: I need a book. ");
        askToCustomer = JOptionPane.showInputDialog("Shop Manager: Okay! Which book do you need? ");

        if (bookList[0].toLowerCase().equals(askToCustomer.toLowerCase())) {
            showMessageForJava();

        } else if (bookList[1].toLowerCase().equals(askToCustomer.toLowerCase())) {
            showMessageForC();
        } else if (bookList[2].toLowerCase().equals(askToCustomer.toLowerCase())) {
            showMessageForCPlus();
        } else if (bookList[3].toLowerCase().equals(askToCustomer.toLowerCase())) {
            showMessageForPhp();
        }

    }

    static void showMessageForJava() {
        //System.out.println("Shop Manager: Yes i have Java book");
        JOptionPane.showMessageDialog(null, "Shop Manager: Yes i have Java book");
        JOptionPane.showMessageDialog(null, "Customer: How much price of this book?");
        //JOptionPane.showMessageDialog(null, "Shop Manager: Book price is 200 taka");
        priceString = JOptionPane.showInputDialog("Shop Manager: Book price is. ");
        double price = Double.parseDouble(priceString);
        JOptionPane.showMessageDialog(null, "Shop Manager: We are giving some discount for varieties customer");
        if (price == 200) {
            String chosePro = JOptionPane.showInputDialog(" Shop Manager: Would you tell me what's your profession?");
            JOptionPane.showMessageDialog(null, "Shop Manager: Thanks for giving information. Just wait for accounting");

            if (yourProString[0].toLowerCase().equals(chosePro.toLowerCase())) {
                price = price - (price * DISCOUNTFORSTUDENT);
                JOptionPane.showMessageDialog(null, "Your total price with discount is: " + price + "taka.");
            }
//            JOptionPane.showMessageDialog(null, "Customer: Would you reduceing price of this book? ");
//            JOptionPane.showMessageDialog(null, "Shop Manager: Yeap i will do");
//            JOptionPane.showMessageDialog(null, "Customer: How much taka will reduce for me? ");
//            String reducePriceString = JOptionPane.showInputDialog("Shop Manager: ");
//            JOptionPane.showMessageDialog(null, "Shop Manager: Only " + reducePriceString + " taka less for you");
//            int reducePriceInt = Integer.parseInt(reducePriceString);
//            double totalPrice = price - reducePriceInt;
//         //       priceString = JOptionPane.showInputDialog("");
//            JOptionPane.showMessageDialog(null, "Shop Manager: Your total book price is: " + totalPrice);
//            JOptionPane.showMessageDialog(null, "Customer: Thanks and give me this book.");
        }
    }

    static void showMessageForC() {
        JOptionPane.showMessageDialog(null, "Shop Manager: Yes i have C book");
        JOptionPane.showMessageDialog(null, "Customer: How much price of this book?");
        //JOptionPane.showMessageDialog(null, "Shop Manager: Book price is 200 taka");
        priceString = JOptionPane.showInputDialog("Shop Manager: Book price is. ");
        double price = Double.parseDouble(priceString);
        if (price == 100) {
            JOptionPane.showMessageDialog(null, "Customer: Would you reduceing price of this book? ");
            JOptionPane.showMessageDialog(null, "Shop Manager: Sorry! I can't. It's Fixed price");
//                JOptionPane.showMessageDialog(null, "Customer: How much taka will reduce for me? ");
//                String reducePriceString = JOptionPane.showInputDialog("Shop Manager: ");
//                JOptionPane.showMessageDialog(null, "Shop Manager: Only "+reducePriceString+" taka less for you");
//                int reducePriceInt = Integer.parseInt(reducePriceString);
//                double totalPrice = price - reducePriceInt;
////                priceString = JOptionPane.showInputDialog("");
            int willYouTake = JOptionPane.showConfirmDialog(null, "Will you buy this?");
            if (willYouTake == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Shop Manager: Okay paid 200 taka onlay");//+ totalPrice);
                JOptionPane.showMessageDialog(null, "Customer: Okay. Thanks for your service.");
                JOptionPane.showMessageDialog(null, "Shop Manager: Welcome Sir. Have you good day");

            }
        }
    }

    static void showMessageForPhp() {
        JOptionPane.showMessageDialog(null, "Shop Manager: Yes i have Php book");
        JOptionPane.showMessageDialog(null, "Customer: How much price of this book?");
        //JOptionPane.showMessageDialog(null, "Shop Manager: Book price is 200 taka");
        priceString = JOptionPane.showInputDialog("Shop Manager: Book price is. ");
        double price = Double.parseDouble(priceString);
        if (price == 120) {
            JOptionPane.showMessageDialog(null, "Customer: Would you reduceing price of this book? ");
            JOptionPane.showMessageDialog(null, "Shop Manager: Sorry! I can't. It's Fixed price");
//                JOptionPane.showMessageDialog(null, "Customer: How much taka will reduce for me? ");
//                String reducePriceString = JOptionPane.showInputDialog("Shop Manager: ");
//                JOptionPane.showMessageDialog(null, "Shop Manager: Only "+reducePriceString+" taka less for you");
//                int reducePriceInt = Integer.parseInt(reducePriceString);
//                double totalPrice = price - reducePriceInt;
////                priceString = JOptionPane.showInputDialog("");
            int willYouTake = JOptionPane.showConfirmDialog(null, "Will you buy this?");
            if (willYouTake == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Shop Manager: Okay paid 200 taka onlay");//+ totalPrice);
                JOptionPane.showMessageDialog(null, "Customer: Okay. Thanks for your service.");
                JOptionPane.showMessageDialog(null, "Shop Manager: Welcome Sir. Have you good day");

            }
        }
    }

    static void showMessageForCPlus() {
        JOptionPane.showMessageDialog(null, "Shop Manager: Yes i have C++ book");
        JOptionPane.showMessageDialog(null, "Customer: How much price of this book?");
        //JOptionPane.showMessageDialog(null, "Shop Manager: Book price is 200 taka");
        priceString = JOptionPane.showInputDialog("Shop Manager: Book price is. ");
        double price = Double.parseDouble(priceString);
        if (price == 200) {
            JOptionPane.showMessageDialog(null, "Customer: Would you reduceing price of this book? ");
            JOptionPane.showMessageDialog(null, "Shop Manager: Sorry! I can't. It's Fixed price");
//                JOptionPane.showMessageDialog(null, "Customer: How much taka will reduce for me? ");
//                String reducePriceString = JOptionPane.showInputDialog("Shop Manager: ");
//                JOptionPane.showMessageDialog(null, "Shop Manager: Only "+reducePriceString+" taka less for you");
//                int reducePriceInt = Integer.parseInt(reducePriceString);
//                double totalPrice = price - reducePriceInt;
////                priceString = JOptionPane.showInputDialog("");
            int willYouTake = JOptionPane.showConfirmDialog(null, "Will you buy this?");
            if (willYouTake == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Shop Manager: Okay paid 200 taka onlay");//+ totalPrice);
                JOptionPane.showMessageDialog(null, "Customer: Okay. Thanks for your service.");
                JOptionPane.showMessageDialog(null, "Shop Manager: Welcome Sir. Have you good day");

            }
        }
    }

}
