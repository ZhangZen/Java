/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SychronizedThreadTheory;

/**
 *
 * @author Zhang
 */
public class Data {

    public static final int TH_A = 1;
    public static final int TH_B = 2;
    public static final int TH_C = 3;

    private int a;
    private int b;
    private int sum;
    private int flag;

    public Data() {
    }

    public Data(int a, int b, int sum, int flag) {
        this.a = a;
        this.b = b;
        this.sum = sum;
        this.flag = flag;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

}
