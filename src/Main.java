import java.util.ArrayList;

public class Main {
    public static void  main (String[] args){
        Book c1 = new Book("Nizami Gəncəvi", 1, "Xosrov və Şirin", 1180, true);
        Book c2 = new Book("Məhəmməd Füzuli", 2, "Leyli və Məcnun", 1537, true);
        Book c3 = new Book("Çingiz Aytmatov", 3, "Əsrdən də uzun gün", 1980, false);
        Book c4 = new Book("Elxan Elatlı", 4, "Mələklərin ölüm hökmü", 2015, true);
        Book c5 = new Book("J.K. Rowling", 5, "Harry Potter və Fəlsəfə Daşı", 1997, true);
        Book c6 = new Book("George Orwell", 6, "1984", 1949, false);
        Book c7 = new Book("Dan Brown", 7, "Da Vinçi Şifrəsi", 2003, true);
        Book c8 = new Book("Fyodor Dostoyevski", 8, "Cinayət və Cəza", 1866, true);

        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());

        ArrayList<Book> books = new ArrayList<>();

        books.add(c1);
        books.add(c2);
        books.add(c3);
        books.add(c4);
        books.add(c5);
        books.add(c6);
        books.add(c7);
        books.add(c8);

        for ( Book a:books){
            System.out.println(a.getAuthor() + a.getId() + a.getTitle() + a.getYear() + a.isAvailable());

            for ( Book b:books){
                if (b.getYear()<2000){
                    System.out.println(b.getAuthor() + b.getId() + b.getTitle() + b.getYear() + b.isAvailable());
                }
            }
        }

    }
}