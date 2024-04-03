package LopHinhChuNhat;

public class Rectangle {
//    thuoc tinh
    double weight, height;

//    contrucstor
    public Rectangle(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

//    phuong thuc

    public void disPlay(){
        System.out.println("ban co hinh chu nhat chieu rong la "+ weight + " va chieu dai la "+ height);
    }
    public double getArea(){
        return this.weight * this.height;
    }
    public double getPerimeter(){
        return (this.weight + this.height) * 2;
    }

}
