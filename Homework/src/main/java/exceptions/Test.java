package exceptions;

public class Test {
    public static void test1(String cardNumber) {
        BankOnline bankOnline = new BankOnline();
        try {
            bankOnline.send(cardNumber, 123.3);
            System.out.println("Send success!");
        } catch (InvalidCardNumberException e1) {
            System.out.println("Invalid card number!");
        } catch (BankOnlineException en) {
            System.out.println("Exception at test 1");
        }
    }
    public static void test2(String cardNumber) {
        BankOnline bankOnline = new BankOnline();
        try {
            bankOnline.send(cardNumber, 123.3);
            System.out.println("Send success!");
        } catch (BlockedCardException e1) {
            System.out.println("Transfer to blocked card!");
        } catch (BankOnlineException en) {
            System.out.println("Exception at test 2");
        }
    }
    public static void test3(Double money) {
        BankOnline bankOnline = new BankOnline();
        try {
            bankOnline.send("1111112111111111", money);
            System.out.println("Send success!");
        } catch (NegativeSumException e1) {
            System.out.println("Trying to send negative sum!");
        } catch (BankOnlineException en) {
            System.out.println("Exception at test 3");
        }
    }
    public static void test4(Double money) {
        BankOnline bankOnline = new BankOnline();
        try {
            bankOnline.send("1111112111111111", money);
            System.out.println("Send success!");
        } catch (OutOfLimitTransferException e1) {
            System.out.println("Out of limit transfer!");
        } catch (BankOnlineException en) {
            System.out.println("Exception at test 4");
        }
    }
    public static void test5(String cardNumber, Double money) {
        BankOnline bankOnline = new BankOnline();
        try {
            bankOnline.send(cardNumber, money);
            System.out.println("Send success!");
        } catch (NullArgumentException e1) {
            System.out.println("One of arguments is null!");
        } catch (BankOnlineException en) {
            System.out.println("Exception at test 5");
        }
    }
}
