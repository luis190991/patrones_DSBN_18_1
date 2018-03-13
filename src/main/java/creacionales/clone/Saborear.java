package creacionales.clone;

import creacionales.clone.enums.Sabor;

import java.awt.*;

/**
 * Created by luis on 09/03/18.
 */
public class Saborear {
    public static void main(String[] args) {
        Fruta moras = new Fruta(Color.blue, 0.1d, Sabor.ACIDO);
        Fruta uvas = new Fruta(Color.blue, 0.1d, Sabor.ACIDO);
        System.out.println(moras.equals(uvas));
    }
}
