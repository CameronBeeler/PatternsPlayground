package LSP;

public class Square extends Rectangle {
    public Square(){

    }

    public Square(int size){
        width = height = size;
    }

    @Override
    public void setWidth(int size) {
        super.setWidth(size);
        super.setHeight(size);

    }

    @Override
    public void setHeight(int size) {
        super.setHeight(size);
        super.setWidth(size);
    }
}
