package test;

import wh.entity.reference.Warehouse;

public class Main {

    public static void main(String[] args) {
        Warehouse sklad = new Warehouse();
        sklad.setId(1l);
        sklad.setName("expedition warehouse (¹2)");
        System.out.println("The current warehouse is " + sklad.getName());

    }

}
