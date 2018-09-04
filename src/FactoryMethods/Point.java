package FactoryMethods;

public
class Point
{
    Double x = 0.0, y = 0.0;
    public Point(Double a, Double b, CoordinateSystem coordinateSystem)
    {
        switch (coordinateSystem)
        {
            case POLAR:
                this.x = a * Math.cos(b);
                this.y = b * Math.sin(b);
                break;
            case CARTESIAN:
                this.x = a;
                this.y = b;
                break;

        }
    }
}
