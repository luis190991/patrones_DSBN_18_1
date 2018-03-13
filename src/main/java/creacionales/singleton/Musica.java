package creacionales.singleton;

/**
 * Created by luis on 09/03/18.
 */
public class Musica {

    private String cancion;
    private Double numeroRep;

    private static Musica instance;


    private Musica() {

    }

    public static Musica getInstance(){
        if(instance == null){
            instance = new Musica();
        }
        return instance;
    }



    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public Double getNumeroRep() {
        return numeroRep;
    }

    public void setNumeroRep(Double numeroRep) {
        this.numeroRep = numeroRep;
    }
}
