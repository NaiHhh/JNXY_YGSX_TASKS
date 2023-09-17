package third;

//编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边⻓base和⾼height，
// 同时声明公共⽅法访问私有变量。此外，提供类必要的构造器。
// 另⼀个类中使⽤这些公共⽅法，计算三⻆形的⾯积。

public class TriAngle {
    // 底边长
    private int base;

    //高height
    private int height;

    public TriAngle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public TriAngle() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double triAngleTest() {
        return (base * height) / 2;
    }

}
