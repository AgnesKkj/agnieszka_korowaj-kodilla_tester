package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        //część 1, tworzenie obiektów bez kolekcji
        BookManager.createBook("The Lord of the Rings", "J. R. R. Tolkien");
        BookManager.createBook("Catcher in the Rye", "J.D. Salinger");
        BookManager.createBook("Crime and Punishment", "F. Dostoyevsky");
        BookManager.createBook("Catcher in the Rye", "J.D. Salinger");
        BookManager.createBook("Crime and Punishment", "F. Dostoyevsky");

        //część 2, dodajemy kolekcję w BookManager
        System.out.println("-----");
        System.out.println("Directory size: " + BookManager.bookDirectory.size());
        for (int i = 0; i < BookManager.bookDirectory.size(); i++) {
            System.out.println("Book: " + BookManager.bookDirectory.get(i));
            System.out.println("Object hashCode: " + BookManager.bookDirectory.get(i).hashCode());
        }

        //porównywanie po hashCode - tutaj nie wiem, jak porządnie przeiterować, żeby porównywało "każdy z każdym"
        System.out.println("-----");
        for (int i = 0; i < BookManager.bookDirectory.size() - 1; i++) {
            if (BookManager.bookDirectory.contains(BookManager.bookDirectory.get(i)) == true) {
                System.out.println("Are objects same by index?");
                System.out.println(BookManager.bookDirectory.get(i).getTitle() == BookManager.bookDirectory.get(i + 1).getTitle());
                System.out.println("Do objects have the same hashCodes?");
                System.out.println(BookManager.bookDirectory.get(i).equals(BookManager.bookDirectory.get(i + 1)));
            }
        }

        //po pierwszym sprawdzeniu kolekcja ma 5 elementów i są w niej elementy identyczne
        //po dodaniu części 3, kolekcja ma 3 elementy i żadne nie mają takiego samego hashCode

    }
}


