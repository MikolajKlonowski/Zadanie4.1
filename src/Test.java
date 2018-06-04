public class Test {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(12,5,13);
        CheckTriangle check = new CheckTriangle();
        System.out.println(check.isRightTriangle(triangle1));


    }
}
