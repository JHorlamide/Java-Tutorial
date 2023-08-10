package com.olamide;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var box1 = new TextBox();
        var box2 = new TextBox();
        var box3 = box2;


        System.out.println(box2.equals(box3));

        //var scanner = new Scanner(System.in);
        //var report = new TaxReport(new TaxCalculator2018(100_000));
        //report.show();
    }
}
