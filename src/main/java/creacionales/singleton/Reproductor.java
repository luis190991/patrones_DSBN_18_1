package creacionales.singleton;

/**
 * Created by luis on 09/03/18.
 */
public class Reproductor {

    public void play(){
        Musica m = Musica.getInstance();
        m.setCancion("Cancion 1");
        m.setNumeroRep(5.0d);
    }

    public void stop(){
        Musica m = Musica.getInstance();
        m.setCancion("Cancion 1");
        if(m.getNumeroRep().equals(5.0d)){
            System.out.println("Cancion detenida");
        }else{
            System.out.println("Esta canción no se esta reproduciendo.");
        }
    }

    public static void main(String[] args) {
        Reproductor r = new Reproductor();
        r.play();
        r.stop();
    }
}
