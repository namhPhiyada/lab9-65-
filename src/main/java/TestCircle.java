interface GeomtricObject {
    public double getPerimeter();
    public double getArea();
}
interface Resizable {
    public void resize(int percent);
}
class Circle implements GeomtricObject {
    protected double radius = 1.0;
    
 public Circle(double radius){
     this.radius = radius;
 }
    @Override
 public double getPerimeter(){
 return 2*Math.PI*radius;
 }
    @Override
 public double getArea(){
 return Math.PI*Math.pow(radius, 2);
 }
}
class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle (double radius){
        super(radius);
    }

    @Override
    public void resize(int percent) {
       this.radius = percent * 0.01*super.radius;
    }
}
public class TestCircle {
    public static void main(String[] args) {
        Circle one = new Circle(3);
        System.out.println("วงกลม 1 มีพื้นที่ = " + one.getArea());
        System.out.println("วงกลม 1 มีเส้นรอบวง ="+one.getPerimeter());
        
        ResizableCircle two = new ResizableCircle(3);
        two.resize(70);
        System.out.println("วงกลม 2 มีพื้นที่ =" +two.getArea());
        System.out.println("วงกลม 2 มีเส้นรอบวง ="+two.getPerimeter());
    }
}
