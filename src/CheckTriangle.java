public class CheckTriangle {
    public boolean isRightTriangle(Triangle triangle) {
        double a = triangle.getBokA() * triangle.getBokA();
        double b = triangle.getBokB() * triangle.getBokB();
        double c = triangle.getBokC() * triangle.getBokC();


        return b+a==c;




}}







