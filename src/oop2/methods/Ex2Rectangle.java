package oop2.methods;

public class Ex2Rectangle {
    private  double width;
    private  double height;

    public Ex2Rectangle(){}

    public Ex2Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*width+2*height;
    }
    public boolean isSquare(){
        return width==height;
    }
    public String toString(){
        return "width:"+width+",height:"+height;
    }

    public static void main(String[] args) {
        Ex2Rectangle r = new Ex2Rectangle(7,7);
        System.out.println(r);
        System.out.println("Diện tích: " + r.getArea());
        System.out.println("Chu vi: " + r.getPerimeter());
        System.out.println("Là hình vuông? " + r.isSquare());

    }
}
