//Your table should keep track of a Load Factor
public class HashTable {

    private final double LOAD_FACTOR= 0.75;
    private static final int INITIAL_CAPACITY = 20;
    public Entry[] entries;
    private int size;
    public int numberOfEntries;

    public HashTable(){
        this.entries = new Entry[INITIAL_CAPACITY];
        this.size = entries.length;
        this.numberOfEntries=0;
    }
    public void createEntry(String w){
        Entry e=new Entry(w);
        placeEntry(e);
    }
    //need a function to read the file and fill the entries.

    public int hashFunction(Entry e){
        //System.out.println("Hash Code:"+e.hashCode());
        //System.out.println("Hash Index:"+e.hashCode()% size);

        return e.hashCode()% size;
    }


    public int hashFunctionCollision(Entry e, int j){

        return Math.abs((e.hashCode()+j) %size);
    }
    public void placeEntry(Entry e){
        if(loadFactor()>LOAD_FACTOR){
            rehash();
        }
        else{

            int index= hashFunction(e);
           // System.out.println("Word: "+e.getWord());

            //System.out.println("Index for Word: "+index);
            if(entries[index]==null) { //if the spot is free
                this.entries[index] = e;
                this.numberOfEntries++;

            }
            else{
                System.out.println("COLLISION!!");

                if(entries[index].getWord().equals(e.getWord())){ // else if is taken and is the same word(duplicate)
                    entries[index].incrementCount();
                    printHashTable();

                }
                else{
                    //This case has been reached if the entry is already taken AND its not a duplicate.
                    //collision resolution
                   // System.out.println("Collision");

                    int j=1;
                    int newIndex=hashFunctionCollision(e,j);
                   // System.out.println("New Index before while: "+newIndex);


                    while (entries[newIndex] != null) {

                        if (entries[newIndex].getWord().equals(e.getWord())) {

                                entries[newIndex].incrementCount();
                                newIndex = -1;
                                System.out.println("Right before break statement");
                                break;
                            } else {

                                j++;

                                newIndex = hashFunctionCollision(e, j);

                            }

                        }
                    System.out.println("New index: "+ newIndex);

                    if (newIndex>=0){

                        this.entries[newIndex]=e;

                        this.numberOfEntries++;


                    }

                }
            }

        }

    }
    public int size() {
        return this.size;
    }

    public void rehash(){
        //resize
        System.out.println("----------------b");

        System.out.println("INSIDE OF REHASH");
        System.out.println("----------------e");
        this.size=size*2;
        Entry[] newEntries=new Entry[size];
        //rehash
        System.out.println("New Size:"+size);

        for(int i=0;i<entries.length;i++){
            if(entries[i]!=null) {
                System.out.println("Word being rehashed: "+ entries[i].getWord());
                System.out.println("Words hashkey: "+ entries[i].hashCode());
                int newIndex = hashFunction(entries[i]);
                if(newEntries[newIndex]==null) { //if the spot is free
                    newEntries[newIndex] = entries[i];
                }
                else {
                    System.out.println("COLLISION Inside Rehash!!");
                    int j=1;
                    newIndex=hashFunctionCollision(entries[i],j); // this will spit out a new index
                    while (newEntries[newIndex] != null) {
                            j++;
                            newIndex = hashFunctionCollision(entries[i], j);
                    }
                    if (newIndex>=0){

                        newEntries[newIndex] = entries[i];
                    }
                }

                System.out.println("\n --------");
                /////// I need a way to handle collisions while rehashing . Items can produce the same index too


            }
        }
        System.out.println("Im made it out of rehash loop");

        this.entries=newEntries;
        System.out.println("This is the entries and current length in rehash: "+ entries.length);
        System.out.println("----------------b");

        printHashTable();
        System.out.println("----------------");
        System.out.println("----------------b");

        System.out.println("GOING OUT OF REHASH");
        System.out.println("----------------e");



    }
    public double loadFactor( ){
        return numberOfEntries/size;
    }


    public void printHashTable (){
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<size;i++){
            if(entries[i]!=null) {
                stringBuilder.append(entries[i].getWord()+"," );
            }
        }
        System.out.print("HashTable: ");

        System.out.println(stringBuilder);
        System.out.println("Current Size of HashTable: "+ size);
        System.out.println("Current amount of entries: "+ numberOfEntries);


    }




//    public void printWordsCount(){
//        for(int i=0; i< entries.length; i++){
//            if(entries[i] !=null) {
//                System.out.println(this.entries[i].toString());
//            }
//        }
//    }
}
