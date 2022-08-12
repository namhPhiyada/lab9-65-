public class ExceptionOfArray {
    public static void main(String[] args) {
      int num[]={1,2,3,4};
      
      try{
      System.out.println(num[5]);
      }
      catch(java.lang.ArrayIndexOutOfBoundsException z){
          System.out.println("ไม่สามารถใช้ Array ตำแหน่งที่ 5 ได้เนื่องจากArray มีขนาดแค่ 4 ตำแหน่ง");
      }
      System.out.println("Will this print ?");
    }
}


