package blackjack;

/**
 *  pattern == 무늬
 *  denomination (A,2 ~ 10 , J, Q, K)
 */
public class Card {
    private String pattern;
    private String denomination;

    /**
     * @param denomination
     * @param pattern
     * 생성자를 만들어 / 끗수와 무늬는 필수 생성 !
     */
    public Card(String denomination, String pattern) {
        this.denomination = denomination;
        this.pattern = pattern;
    }

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

    @Override
    public String toString() {
        return "Card{" + "pattern='" + pattern + ", denomination='" + denomination + '}';
    }

}
