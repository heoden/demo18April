public class Triangle
{
    double base;
    double high;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    public Triangle(double base, double high, double sideLenOne, double sideLenTwo, double sideLenThree)
    {
        this.base = 100;
        this.high = 500;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double FindArea()
    {
        double findArea;
        findArea = base * high;
        System.out.print("value of findArea is: " + findArea);
        return findArea;
    }
}
