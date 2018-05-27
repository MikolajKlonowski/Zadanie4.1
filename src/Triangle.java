public class Triangle {
    private double bokA;
    private double bokB;
    private double bokC;

    public Triangle(double bokA, double bokB, double bokC) {
        this.setBokA(bokA);
        this.setBokB(bokB);
        this.setBokC(bokC);

    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {

        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;

    }

    public double getBokC() {
        return bokC;
    }

    public void setBokC(double bokC) {

        if (bokC>bokA && bokC>bokB){

            this.bokC = bokC;

        }
    }
}
