package creacionales.clone;

import creacionales.clone.enums.Sabor;
import creacionales.exceptions.NotSizeRangeException;

import java.awt.*;

/**
 * Created by luis on 09/03/18.
 */
public class Saborear {

    public static void main(String[] args) {
        Fruta uva = null;
        try {
            uva = new Fruta(Color.blue, 0.1d, Sabor.ACIDO);
        }catch (NotSizeRangeException ex){

        }
        Fruta mora;
        try {
             mora = new Fruta(Color.blue, 2.0d, Sabor.ACIDO);
        }catch (NotSizeRangeException ex){
            mora = uva.clone();
        }


        Fruta mora2 = mora.clone();

        System.out.println(mora.equals(mora2));
       /* mora2.setSize(0.2d);
        System.out.println(mora.equals(mora2));*/
    }
}
