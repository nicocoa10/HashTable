import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.Instant;
import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;
// word count generator
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

//        String word="empire";
//        int []array1=new int[word.length()];
//        int b = 31 ;
//        int hash = 0;
//        for (int i = 0; i < word.length(); i++) {
//            hash =(int) (word.charAt(i) * Math.pow(b, word.length() - (i + 1)));
//            array1[i]=hash;
//
//        }
//        int n1=2147483647;
//        int n2=100663789;
//        int n3=3336592;
//        int n4=100905;
//        int n5=3534;
//        int n6=101;
//        System.out.println(Arrays.toString(array1));
//        System.out.println(n1+n2+n3+n4+n5+n6);
//        int n=-2043378728;
//        System.out.println(n%20);
//        System.out.println(Math.abs(n%20));


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
