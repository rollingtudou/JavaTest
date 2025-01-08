package work;

// 定义矩形类Rectangle
public class Rectangle {
    // 属性
    private double width;
    private double height;
    private double area;
    private double perimeter;

    // 构造方法
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.area = getArea();
        this.perimeter = getPerimeter();
    }

    // 计算面积的方法
    public double getArea() {
        return width * height;
    }

    // 计算周长的方法
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // 获取宽度
    public double getWidth() {
        return width;
    }

    // 获取高度
    public double getHeight() {
        return height;
    }

    // 获取面积
    public double getAreaValue() {
        return area;
    }

    // 获取周长
    public double getPerimeterValue() {
        return perimeter;
    }
}

// 定义测试类TestRectangle
public class TestRectangle {
    public static void main(String[] args) {
        // 输入矩形的宽度和高度
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("请输入矩形的宽度：");
        double width = scanner.nextDouble();
        System.out.print("请输入矩形的高度：");
        double height = scanner.nextDouble();

        // 创建矩形对象
        Rectangle rectangle = new Rectangle(width, height);

        // 输出矩形的面积和周长
        System.out.println("矩形的面积是：" + rectangle.getAreaValue());
        System.out.println("矩形的周长是：" + rectangle.getPerimeterValue());
    }
}