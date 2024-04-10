class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        
        //initialize variables
        int N = deck.length;
        int [] result = new int[N];
        boolean skip = false;
        int indexInDeck = 0;
        int indexInResult = 0;
        
        //sort the deck
        Arrays.sort(deck);
        
        while (indexInDeck < N) {
            //current index in result is available to fill
            if(result[indexInResult] == 0) {
                
                //if skip is false, add card to result at this index
                if(!skip) {
                    result[indexInResult] = deck[indexInDeck];
                    indexInDeck++;
                }
                
                //toggle skip
                skip = !skip;
            }
            
            //move to next index in result
            indexInResult = (indexInResult + 1) % N;
            
        }
        
        return result;
        
    }
}