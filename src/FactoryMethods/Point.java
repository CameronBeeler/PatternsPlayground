package FactoryMethods;

public
class Point
{
    private boolean cartesian;
    Double a = 0.0, b = 0.0;
    private Point(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    public static class Factory

    {
        public static Point createPolarCoordinates ( double rho, double theta)
        {
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }

        public static Point createCartesianCoordinates ( double x, double y)
        {
            return new Point(x, y);
        }
    }
    @Override
    public String toString()
    {
        return a + ", " + b;
    }
}
