public class TestResizableCircle {
  public static void main(String[] args){
    GeometricObject rc = new ResizableCircle(2.0);
    System.out.println(rc);
    System.out.println(rc.getPerimeter());
    System.out.println(rc.getArea());
  }
}