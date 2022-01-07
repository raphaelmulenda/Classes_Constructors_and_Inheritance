public class Wall {
    private double width;
    private double height;

public Wall(){

}

    public Wall(double width, double height) {
        if( width < 0){
            this.width = 0;
        }
        else if (height < 0 ){
            this.height = 0;
        }
        else {
        this.width = width;
        this.height = height;
            }
    }

    public double getWidth() {
        System.out.println("width= " + this.width);
        return width;
    }

    public void setWidth(double width) {
        if( width < 0){
            this.width = 0;
        }
        else {
            this.width = width;
        }

    }

    public double getHeight() {
        System.out.println("height= " + this.height);
        return height;
    }

    public void setHeight(double height) {
       if (height < 0 ){
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }
    public double getArea(){
        System.out.println("area=" + (this.width * this.height));
    return (this.width * this.height);

    }
}
