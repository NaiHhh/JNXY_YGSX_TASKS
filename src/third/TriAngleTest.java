package third;

public class TriAngleTest {

    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle();
        triAngle.setBase(7);
        triAngle.setHeight(9);

        System.out.println("三角形的面积为" + triAngle.triAngleTest());

    }

}
