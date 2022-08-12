import java.io.File;
import java.io.FileReader;
public class Exceptionsssss {
    public static void main(String[] args) {
      File file=new File("file.txt");
      try{
      FileReader fr = new FileReader(file); 
      }
      catch(java.io.FileNotFoundException y){
          System.out.println("ไม่พบไฟล์");
      }
      
      System.out.println("Will this print ?");
    }

}
