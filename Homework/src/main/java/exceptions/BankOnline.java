package exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BankOnline {
    private static final List<String> BLOCKED = Arrays.asList("1111111111111111",
            "2222222222222222", "3333333333333333");
    public void send(String cardNumber, Double money) throws BankOnlineException {
        cardNumber = Objects.requireNonNull(cardNumber, "card number is null!");
        Objects.requireNonNull(money, "money is null!");

        boolean isOnlyDigits = true;
        for(int i = 0; i < cardNumber.length() && isOnlyDigits; i++) {
            if(!Character.isDigit(cardNumber.charAt(i))) {
                isOnlyDigits = false;
            }
        }

        if (cardNumber.length() != 16 || !isOnlyDigits) {
            throw new InvalidCardNumberException();
        }

        if (BLOCKED.contains(cardNumber)) {
            throw new BlockedCardException();
        }

        if (money < 0) {
            throw new NegativeSumException();
        }

        if (money > 50000) {
            throw new OutOfLimitTransferException();
        }
    }
}
