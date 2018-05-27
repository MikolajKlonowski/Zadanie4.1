public class Test {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(12.21,212.32,32.32);
        CheckTriangle check = new CheckTriangle();
        check.isRightTriangle(triangle1);

    }
}
