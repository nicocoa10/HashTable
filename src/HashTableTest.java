import java.time.Duration;
import java.time.Instant;
import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;

public class HashTableTest {
    public static SimpleList simpleList1= new SimpleList();
    public static HashTable hashTable1= new HashTable();
    public  static Scanner s;
    public static Scanner s2;
    public static int index;
    public static String word;
    public static Duration time;

        public HashTableTest()throws FileNotFoundException{
        openFile();
        }

    public void openFile()throws FileNotFoundException{
        String file = null;
        JFileChooser fc = new JFileChooser();
        int retVal = fc.showOpenDialog(null);
        if (retVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            file = selectedFile.getAbsolutePath();
        }
        s = new Scanner(new File(file));
        s2= new Scanner(new File(file));
    }

    public static HashTable generateHashTable(){
        Instant start = Instant.now();
        while(s.hasNext()){

            hashTable1.createEntry(s.next().toLowerCase());

        }
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));
        time=Duration.between(start, end);
        return hashTable1;

    }

   public static SimpleList generateSimpleList(){
       Entry temp;
       Instant start = Instant.now();
       while(s.hasNext()){
           temp=new Entry(s.next().toLowerCase());
           simpleList1.add(temp);
       }
       Instant end = Instant.now();
       System.out.println(Duration.between(start, end));
       time=Duration.between(start, end);

       return simpleList1;

   }


    public void closeFile(){
        s.close();
    }

}
