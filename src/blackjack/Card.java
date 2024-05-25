package blackjack;

/**
 *  pattern == 무늬
 *  denomination (A,2 ~ 10 , J, Q, K)
 */
public class Card {
    private String pattern;
    private String denomination;

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
