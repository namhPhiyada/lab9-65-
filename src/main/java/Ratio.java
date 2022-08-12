public class Ratio {
    public static void main(String[] args) {
        System.out.println(ratio(1,0));
         System.out.println(ratio(2,2));
        System.out.println("succeed");
    }
    public static int ratio (int num1, int num2 ) {
        try{
        return num1/num2;
        }
       catch (ArithmeticException x){
           System.out.print("ไม่สามารถแสดงข้อมูลได้กรุณากรอกข้อมูลใหม่ :");
    }
        return 0;
    }
}
