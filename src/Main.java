public class Main {

    public static void main(String[] args) {
       Triangle triangleA = new Triangle(15,8, 15,8,17);
       double Area1 = triangleA.findArea();
       System.out.println("AREA1:" + Area1);
       Triangle triangleB = new Triangle(3,2.598, 3,3,3);
       System.out.println("AREA2:" + triangleB.findArea());
    }

}
