package blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private static final String[] PATTERNS = {"spade", "heart", "diamond", "club"};
    private static final int CARD_COUNT = 13;

    private List<Card> cards;

    public CardDeck() {
        cards = this.generateCards();
    }


    /**
     * 개선 2. 생성자는 실행을 시킬 역할이 만 하면 되고, 비즈니스 로직을 알필요 없다.
     * @return
     */
    private List<Card> generateCards() {
        cards = new ArrayList<>();

        for (String pattern : PATTERNS) {
            for (int i = 1; i <= CARD_COUNT; i++) {
                String denomination = this.numberToDenomination(i);
                Card card = new Card(denomination, pattern);

                cards.add(card); // 무늬랑 숫자를 Deck 에 삽입.
            }
        }

        return cards;
    }

    /**
     * 개선 1. 카드에 표식을 새기는 역할은
     * 생성자가 할 일이 아니다.
     * @return Card denomination
     */
    private String numberToDenomination(int number) {
        if (number == 1) {
            return "A";
        } else if (number == 11) {
            return  "J";
        } else if (number == 12) {
            return "Q";
        } else if (number == 13) {
            return "K";
        }
        return String.valueOf(number);
    }

    public Card getCard() {
        return null;
    }


    /**
     * 남아 있는 카드 중 랜덤한 1개의 카드를 준다.
     *
     * @return
     */
//    public Card draw() {
//
//    }

    /* 카드와 카드 덱이 잘만들어졌는지 확인 */
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (Card card : cards) {
            sb.append(card.toString()).append("\n");
        }
        return sb.toString();
    }
}
