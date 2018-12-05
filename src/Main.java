import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.Instant;
import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;
// word count generator
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
/**********Hash Table Testing **************************/
        HashTableTest test1 = new HashTableTest();
        HashTable h1 = new HashTable();
        h1 = test1.generateHashTable();

//        //need to sort the HashTable based in alphabetical order
////        Entry temp=new Entry();
////        for (int i = 0; i < h1.numberOfEntries; i++)
////        {
////            for (int j = i + 1; j < h1.numberOfEntries; j++)
////            {
////                if (h1.entries[i].compareTo(h1.entries[j])>0)
////                {
////                    temp = names[i];
////                    names[i] = names[j];
////                    names[j] = temp;
////                }
////            }
////        }
//        //This writes into file.
//        try {
//            int size = 0;
//            File fileIn = new File("HashTableWordCount.txt");
//            FileWriter data = new FileWriter(fileIn);
//            //For loop below calculates the total amount of words.
//            for (int i = 0; i < h1.size(); i++) {
//                if (h1.entries[i] != null) {
//                    size = size + h1.entries[i].getCount();
//                }
//            }
//            data.write("Number of total words in the Hash Table : " + size
//                    + "\r\n\n -------------------");
//            data.write("Amount of time to get a non-sorted Entries into the HashTableList : " + test1.time.toString()
//                    + "\r\n\n -------------------");
//            for (int i = 0; i < h1.size(); i++) {
//                if (h1.entries[i] != null) {
//                    data.write(h1.entries[i] + "\r\n");
//                }
//            }
//            data.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//    }
/************* End of Hash Table Testing ************************/


/************* Simple List Testing **************************/
//        HashTableTest test2=new HashTableTest();
//
//        SimpleList list1=new SimpleList();
//
//        list1=test2.generateSimpleList();
//        try {
//            int size=0;
//            File fileIn = new File("HashTableWordCount.txt");
//            FileWriter data = new FileWriter(fileIn);
//            //For loop below calculates the total amount of words.
//            for (int i = 0; i < list1.size(); i++) {
//                if (list1.getEntry(i) != null) {
//                    size=size+list1.getEntry(i).getCount();
//                }
//            }
//            data.write("Number of total words in the Simple List: "+size
//                    + "\r\n\n -------------------");
//            data.write("Amount of time to get a non-sorted Entries into the SimpleList : "+test2.time.toString()
//                    + "\r\n\n -------------------");
//            //For loop below prints each entry.(This includes its word and its corresponding size)
//            for (int i = 0; i < list1.size(); i++) {
//                if (list1.getEntry(i) != null) {
//                    data.write(list1.getEntry(i) + "\r\n");
//                }
//            }
//
//            data.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

/************* End of Simple List Testing ************************/


        }

}
