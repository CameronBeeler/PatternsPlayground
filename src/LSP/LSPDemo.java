package LSP;

public class LSPDemo {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2,3);
        useIt(rc);

        Rectangle sq = new Square(3);
        useIt(sq);
    }


    static void useIt(Rectangle r){

        int width = r.getWidth();
        r.setHeight(10);
//  area of the Rectangle is W*H => W*10
        System.out.println(
                "Expected area of the rectangle to be " + (10* width) + ", w*h: w->" + r.getWidth() + ", h->" + r.getHeight() +
                " = " + r.getArea());
    }
}
