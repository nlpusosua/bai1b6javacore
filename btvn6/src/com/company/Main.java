package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        HinhCn hcn = new HinhCn();
        System.out.println("nhap chieu dai hcn: ");
        hcn.setLength(scanner.nextDouble());
        System.out.println("nhap chieu rong hcn: ");
        hcn.setWidth(scanner.nextDouble());
        System.out.println("chu vi hcn: "+ hcn.tinhP());
        System.out.println("dien tich hcn: "+ hcn.tinhS());


        HinhV hv= new HinhV();
        System.out.println("nhap do dai canh hv: ");
        hv.setSpace(scanner.nextDouble());
        System.out.println("chu vi hv"+ hv.tinhP());
        System.out.println("dien tich hv"+ hv.tinhS());
    }
}
