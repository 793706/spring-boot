package com.springboot;

import java.util.Vector;

class Gopher {
    private int gopherNumber;
    Gopher(int i) {
    gopherNumber = i;
    }
    void print(String msg) {
        System.out.println("执行方法print");
        if (msg != null){
            System.out.println(msg);
        }
        System.out.println("Gopher number " + gopherNumber);
    }
}
class GopherTrap {
    static void caughtYa(Gopher g) {
        System.out.println("执行方法caughtYa");
        g.print("Caught one!");
    }
}
class GopherVector {
    private Vector v = new Vector();
    public void addElement(Gopher m) {
        v.addElement(m);
    }
    public Gopher elementAt(int index) {
        System.out.println("执行方法elementAt");
        return (Gopher) v.elementAt(index);
    }
    public int size() {
        return v.size();
        }
    public static void main(String[] args) {
    GopherVector gophers = new GopherVector();
    for (int i = 0; i < 3; i++){
        gophers.addElement(new Gopher(i));
    }
    for (int i = 0; i < gophers.size(); i++){
        System.out.println("第"+i+"次输出");
        System.out.println("开始执行GopherTrap.caughtYa(gophers.elementAt(i));");
        GopherTrap.caughtYa(gophers.elementAt(i));
        System.out.println("执行完成GopherTrap.caughtYa(gophers.elementAt(i));");
    }
    }
}