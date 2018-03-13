package creacionales.clone;

import creacionales.clone.enums.Sabor;
import creacionales.exceptions.NotSizeRangeException;

import java.awt.*;

/**
 * Created by luis on 09/03/18.
 */
public class Fruta {
    private Color color;
    private Double size;
    private Sabor sabor;

    public Fruta() {
    }

    public Fruta(Color color, Double size, Sabor sabor) throws NotSizeRangeException{
        this.color = color;
        if(size > 1.0d){
            throw new NotSizeRangeException();
        }
        this.size = size;
        this.sabor = sabor;
    }

    @Override
    public Fruta clone() {
        Fruta f = new Fruta();
        f.sabor = this.sabor;
        f.size = this.size;
        f.color = this.color;
        return f;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) throws NotSizeRangeException{
        if(size > 1.0d){
            throw new NotSizeRangeException();
        }
        this.size = size;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }
}
