package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        //Przy integerach od -128 do 127 te same obiekty są ponownie używane
        Integer a = 122;
        Integer b = 122;
        //porównuje obiekt do obiektu
        System.out.println(a == b);
        //porównuje wartości
        System.out.println(a.equals(b));

        System.out.println("-----");

        String x = "This is string";
        String y = "This is string";
        System.out.println(x == y);
        System.out.println(x.equals(y));
        //Obiekty String są używane ponownie przy identycznych wartościach

        System.out.println("-----");
        //Obiekty integer są niemutowalne
        Integer c = 100;
        Integer d = 100;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = c + 10;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = 10670;
        c = 10670;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);

        String s1 = "text";
        //wymusza stworzenie nowego obiektu
        String s2 = new String("text");

    }
}
