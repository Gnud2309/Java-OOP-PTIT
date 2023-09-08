package Javaptit;

import java.util.Scanner;


class Rectange{
    private double width,heigh;
    private String color;

    Rectange(){
        width =1;
        heigh = 1;
    }

    public Rectange(double width, double heigh, String color) {
        this.width = width;
        this.heigh = heigh;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public String getColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public double findArea(){
        return width * heigh;
    }
    public double findPerimeter(){
        return 2*(width+heigh);
    }

    @Override
    public String toString() {
        return String.format("%d %d %s", (int)findPerimeter(),(int)findArea(),getColor());
    }
}

public class J04002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String color = sc.next();
        if(w>0 && h>0){
            Rectange x = new Rectange(w,h,color);
            System.out.println(x);
        }else {
            System.out.println("INVALID");
        }
    }
}
