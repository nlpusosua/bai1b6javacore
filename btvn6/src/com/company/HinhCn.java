package com.company;

public class  HinhCn extends HinhHoc{
    private double length, width;

    public HinhCn(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public HinhCn() {
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    double tinhS(){
        return width*length;
    }
    double tinhP(){
        return (width+length)/2;
    }

}
