package creacionales.clone;

/**
 * Created by luis on 12/03/18.
 */
public class Fresa extends Fruta{

    @Override
    public boolean equals(Object obj) {
        Boolean result =  super.equals(obj);
        if(result && obj instanceof Fresa){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }

    }
}
