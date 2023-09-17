package fourth;

public class Triangle extends Shape {

    // 属性:a.bc分别代表三角形的三边，私有化
    private double a;

    private double b;

    private double c;

    public Triangle() {
    }

    // public Triangle(double adouble b,double c)，并验证abc的值是否可以构成三角形，如果可以构成三角形再为a,b,c的属性赋值
    public Triangle(double a, double b, double c) {

        if (a + b > c || a + c > b || b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("不能组成三角形");
            return;
        }

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    //        。重写area()和perimeter方法,
//        。重写toString方法，返回“边长:xxxx,xx，面积:xxx，周长:xxx
    @Override
    public double area() {

        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }

    @Override
    public double perimeter() {

        return a + b + c;

    }

    @Override
    public String toString() {
        return "边长a：" + a + "，边长b：" + b + "边长c" + c + "，面积：" + area() +  ", 周长：" + perimeter();
    }

}
