package org.java.books;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        try {
            System.out.println("Quanti libri vuoi inserire?");
            int howMany = Integer.parseInt(scanner.nextLine());
            if (howMany <= 0) {
                throw new IllegalArgumentException("Il numero deve essere maggiore di 0");
            }
            Book[] ArrayBook = new Book[howMany];
            for (int i = 0; i < ArrayBook.length; i++) {
                System.out.println("Titolo del libro " + (i + 1) + "?");
                String title = scanner.nextLine();
                int pages = 0;
                try {
                    System.out.println("Quante pagine contiene il libro?");
                    pages = Integer.parseInt(scanner.nextLine());
                    if (pages <= 0) {
                        throw new IllegalArgumentException("Il numero di pagine deve essere maggiore di 0");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Non hai inserito un numero corretto");
                }
                System.out.println("Inserisci l'autore del libro");
                String author = scanner.nextLine();
                System.out.println("Inserisci l'editore del libro");
                String editor = scanner.nextLine();
                ArrayBook[i] = new Book(title, pages, author, editor);
                System.out.println(ArrayBook[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Numero non valido");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }




    }
}
