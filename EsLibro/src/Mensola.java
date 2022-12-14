public class Mensola {
    private Libro[] volumi;

    private static final int NUM_MAX_VOLUMI = 15;

    public Mensola(){
        volumi = new Libro[NUM_MAX_VOLUMI];
    }

    public Mensola(Mensola mensola){

    }

    public void setVolume(Libro volume, int posizione){
        volumi[posizione] = volume;
    }

    public Libro getVolume(int posizione){

        return volumi[posizione];
    }

    public void rimuoviVolume(int posizione){
        this.volumi[posizione] = null;
    }

    public int getNumMaxVolumi(){
        return NUM_MAX_VOLUMI;
    }

    public int getNumVolumi(){
        int x = 0;
        for (Libro libri : volumi){
            if (libri != null){
                x++;
            }
        }

        return x;
    }

}
