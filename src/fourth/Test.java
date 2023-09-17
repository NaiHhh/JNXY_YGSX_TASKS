package fourth;

//创建两个矩形（2，3），（3，6），创建两个三角形（3，4，5），（6，6，6）
//创建shape数组中，把上面4个对象放到数组中，遍历显示信息

public class Test {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(3, 6);
        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(6, 6, 6);

        Shape[] shapes = {rectangle1, rectangle2, triangle1, triangle2};


        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

    }

}
