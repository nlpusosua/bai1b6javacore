package com.company;

public class HinhV extends HinhHoc{
    private double space;

    public HinhV() {
    }

    public HinhV(double space) {
        this.space = space;
    }

    public double getSpace() {
        return space;
    }

    public void setSpace(double space) {
        this.space = space;
    }
    double tinhS(){
        return space*space;
    }
    double tinhP(){
        return space*4;
    }
}
