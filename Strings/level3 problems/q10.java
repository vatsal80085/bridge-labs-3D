import java.util.Random;

public class q10 {
    static String[] suits={"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks={"2","3","4","5","6","7","8","9","10",
                           "Jack","Queen","King","Ace"};

    static String[] initializeDeck(){
        String[] deck=new String[suits.length*ranks.length];
        int idx=0;
        for(String s:suits){
            for(String r:ranks){
                deck[idx++]=r+" of "+s;
            }
        }
        return deck;
    }

    static void shuffleDeck(String[] deck){
        Random rand=new Random();
        for(int i=0;i<deck.length;i++){
            int r=i+rand.nextInt(deck.length-i);
            String temp=deck[i]; deck[i]=deck[r]; deck[r]=temp;
        }
    }

    static String[][] distribute(String[] deck,int players,int cards){
        if(players*cards>deck.length) return null;
        String[][] hands=new String[players][cards];
        int idx=0;
        for(int i=0;i<players;i++){
            for(int j=0;j<cards;j++){
                hands[i][j]=deck[idx++];
            }
        }
        return hands;
    }

    public static void main(String[] args){
        String[] deck=initializeDeck();
        shuffleDeck(deck);
        int players=4, cards=5;
        String[][] hands=distribute(deck,players,cards);
        for(int i=0;i<players;i++){
            System.out.println("Player "+(i+1)+":");
            for(int j=0;j<cards;j++){
                System.out.println("  "+hands[i][j]);
            }
        }
        
    }
}
