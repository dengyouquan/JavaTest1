package com.hand;

/**
 * Hello world!
 */

enum IncomeTax {
    INSTANCE;

    IncomeTax() {

    }

    public double getTax(int income) {
        int taxedIncome = income - 3500;
        double tax = 0;
        if (taxedIncome > 80000) {
            tax += (taxedIncome - 80000) * 0.45;
            taxedIncome = 80000;
        }
        if (taxedIncome > 55000) {
            tax += (taxedIncome - 55000) * 0.35;
            taxedIncome = 55000;
        }
        if (taxedIncome > 35000) {
            tax += (taxedIncome - 35000) * 0.30;
            taxedIncome = 35000;
        }
        if (taxedIncome > 9000) {
            tax += (taxedIncome - 9000) * 0.25;
            taxedIncome = 9000;
        }
        if (taxedIncome > 4500) {
            tax += (taxedIncome - 4500) * 0.20;
            taxedIncome = 4500;
        }
        if (taxedIncome > 1500) {
            tax += (taxedIncome - 1500) * 0.10;
            taxedIncome = 1500;
        }
        if (taxedIncome <= 1500) {
            tax += taxedIncome * 0.03;
        }
        return tax;
    }
}

public class App {
    public static void main(String[] args) {
        IncomeTax incomeTax = IncomeTax.INSTANCE;
        double useratax = incomeTax.getTax(5000);
        double userbtax = incomeTax.getTax(10000);
        double userctax = incomeTax.getTax(15000);
        double userdtax = incomeTax.getTax(60000);
        System.out.println("userA：" + useratax + " userB：" + userbtax + "，userC：" + userctax + "，userD：" + userdtax);
    }
}
