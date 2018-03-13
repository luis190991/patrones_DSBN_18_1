package creacionales.clone;

import creacionales.clone.enums.Sabor;

import java.awt.*;

/**
 * Created by luis on 09/03/18.
 */
public class Fruta {
    private Color color;
    private Double size;
    private Sabor sabor;

    public Fruta(Color color, Double size, Sabor sabor) {
        this.color = color;
        this.size = size;
        this.sabor = sabor;
    }

    @Override
    public boolean equals(Object obj) {
        Boolean result = Boolean.TRUE;
        if(obj instanceof Fruta) {
            Fruta f = (Fruta) obj;
            result = result && this.color.equals(f.color);
            result = result && this.size.equals(f.size);
            result = result && this.sabor.equals(f.sabor);
            return result;
        }else{
            return Boolean.FALSE;
        }
    }
}
