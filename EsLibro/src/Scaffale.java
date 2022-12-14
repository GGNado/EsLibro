public class Scaffale {
    private Mensola[] ripiani;
    private static final int NUM_RIPIANI = 5;

    public Scaffale(){
        ripiani = new Mensola[NUM_RIPIANI];
        for (int i = 0; i < 5; i++){
             ripiani[i] = new Mensola();
        }
    }

    public Scaffale(Scaffale scaffale){

    }

    public void setLibro(Libro libro, int ripiano, int posizione){
        Mensola mensola = ripiani[ripiano];
        mensola.setVolume(libro, posizione);
        //ripiani[ripiano].setVolume(libro, posizione);
    }

    public Libro getLibro(int ripiano, int posizione){
        return ripiani[ripiano].getVolume(posizione);
    }

    public void rimuoviLibro(int ripiano, int posizione){
        ripiani[ripiano].rimuoviVolume(posizione);
    }

    public int getNumRipiani(){
        return ripiani.length;
    }

    public int getNumLibri(int ripiano){
        return ripiani[ripiano].getNumVolumi();
    }
}
