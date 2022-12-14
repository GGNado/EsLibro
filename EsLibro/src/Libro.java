public class Libro {
    private String titolo;
    private String autore;
    private int numeroPagine;
    private final double costoPagina = 0.05;
    private final double COSTO_FISSO = 5.5;

    public Libro(String titolo, String autore, int numeroPagine){
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    public Libro(Libro libro){

    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public double prezzo(){
        return numeroPagine * costoPagina;
    }

    public String toString(){

        return "Titolo: " + getTitolo() + "\nAutore: " + getAutore() + "\nN.Pagine: " + getNumeroPagine() + "\nPrezzo Libro: $" + prezzo();
    }
}
