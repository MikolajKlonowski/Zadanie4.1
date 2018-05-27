public class CheckTriangle {
    void isRightTriangle(Triangle triangle) {
        double a = triangle.getBokA() * triangle.getBokA();
        double b = triangle.getBokB() * triangle.getBokB();
        double c = triangle.getBokC() * triangle.getBokC();

        if (triangle.getBokC() > triangle.getBokA() && triangle.getBokC() > triangle.getBokB()) {
            boolean to = b + a == c;
            System.out.println(to);
        } else {
            boolean nie = 1==0;
            System.out.println(nie);
        }

    }
}







