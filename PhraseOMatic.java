public class PhraseOMatic{

    // main method
    public static void main(String args[]){

        // create 3 string arrays with words
        String[] wordListOne = {"Shrimp", "Caramel", "Pork", "Oreo"};
        String[] wordListTwo = {"Spirit", "Shortie", "Puppy", "Babe"};
        String[] wordListThree = {"Applause", "Silk", "Positivity", "BoraBora"};

        //find the lenghtof each array
        int listOneLength = wordListOne.length;
        int listTwoLength = wordListTwo.length;
        int listThreeLength = wordListThree.length;

        //pick a random word from each array
        int rand1 = (int) (Math.random()*listOneLength);
        int rand2 = (int) (Math.random()*listTwoLength);
        int rand3 = (int) (Math.random()*listThreeLength);

        //join the random words to form a weird sentence :P
        String weirdSentence = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("I want a " + weirdSentence);


    }
}