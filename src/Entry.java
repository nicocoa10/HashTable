/**
 * Created by Keenan.
 *
 * YOU ARE NOT ALLOWED TO ALTER THIS CLASS other than adding implementation for the hashCode() method.
 * If you wish to change something that you feel would increase performance, you must ask me first.
 */

public class Entry {
    //The word to store in the Entry, this will be a key value for your hash table.
    private String word;
    public int hash=-1;
    //The count of how many times the word appears.
    private int count;

    /**
     * Constructor that creates an {@code Entry} object given a word.
     *
     * @param word The word to set in the {@code Entry}.
     */
    public Entry(String word) {
        this.word = word;
        this.count = 1;
    }

    /**
     * Returns the word of this {@code Entry}.
     *
     * @return The word of this {@code Entry}.
     */
    public String getWord() {
        return this.word;
    }

    /**
     * Returns the count of how many times this word appears in the document.
     *
     * @return the word count.
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Increases the count of the word in this {@code Entry} by one.
     *
     */
    public void incrementCount() {
        this.count++;
    }

    @Override
    public String toString() {
//        String result = "";
//
//        result += "Word:\t" + this.word + "\n" +
//                "Count:\t" + this.count;
//
//        return result;
        String result = "";

        result += "" + this.word + " :" +
                " " + this.count;

        return result;
    }

    @Override
    public int hashCode() {
        //You must implement this method!!!!
        //This function should generate a hashCode() based on the word of the Entry.
//        int [] array1=new int[this.word.length()];
        if(hash==-1){ // this means if the hashcode is being calculated for the first time
            int b = 31 ;
            hash = 0;
            for (int i = 0; i < word.length(); i++) {
//            System.out.println("i value: :"+i);

//            System.out.println("Hash before:"+hash);
//            array1[i]= (int)(word.charAt(i) * Math.pow(b, word.length() - (i + 1)));
                hash +=(int) (word.charAt(i) * Math.pow(b, word.length() - (i + 1)));
//            System.out.println("Hash after:"+hash);


            }
            return Math.abs(hash);

        }
        else {
            return Math.abs(hash);

        }


    }
}

