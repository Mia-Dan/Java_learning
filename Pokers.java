public class Pokers{

    public static void main(String[] args) {

        final char[] SUIT = {
            '♠','♣','♥','♦'
        };

        // str1.length(), length of String | NOT str1.length
        // array1.length, length of array  | NOT array1.length()
        // str1[i] would raise ERROR: array required, but String found
        // array1[i] works

        String[] cardSet = new String[52];
        int i = 0;
        for (int rank = 1; rank <= 13; rank++) {
            for ( int suit = 0; suit < SUIT.length; suit++) {
                cardSet[i] = "" + SUIT[suit] + rank;
                i++;
            }
        }

        for (i = 0; i < cardSet.length; i++){
            System.out.println(cardSet[i]);
        }
    }
}