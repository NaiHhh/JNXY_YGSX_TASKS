package fourth;

public class Rectangle extends Shape{

    private double length;

    private double width;

    public Rectangle() {
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }
    // 重与toString方法，返回“长:xx宽:xx面积:xxx周长:xxx“
    @Override
    public String toString() {
        return "长：" + length + "，宽：" + width + "，面积：" + area() +  ", 周长：" + perimeter();
    }
}
