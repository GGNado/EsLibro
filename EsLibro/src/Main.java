public class Main {
    public static void main(String[] args) {
        Scaffale scaffale = new Scaffale();
        Libro libro = new Libro("Animali fantastici e dove trovarli", "J. K. Rowling", 160);
        Libro libro1 = new Libro("Harry potter e la pietra filosofale", "J. K. Rowling", 304);
        Libro libro2 = new Libro("Harry potter e il principe mezzosangue", "J. K. Rowling", 576);

        scaffale.setLibro(libro, 1, 1);
        scaffale.setLibro(libro1, 2, 1);
        scaffale.setLibro(libro2, 2, 2);

        System.out.println(scaffale.getLibro(1, 1).toString() + "\n");
        System.out.println(scaffale.getLibro(2, 1).toString()+ "\n");
        System.out.println(scaffale.getLibro(2, 2).toString()+ "\n");

        scaffale.setLibro(libro2, 2, 3);
        scaffale.rimuoviLibro(2, 3);
        System.out.println("In questo scaffale alla mensola 2 ci sono: " + scaffale.getNumLibri(2) + " libri");


    }
}