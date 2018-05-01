package arquitectonicos.dao.models;

/**
 * Created by luis on 16/04/18.
 */
public class Model {

    public static String fieldsToInsert(Integer numero){
        String fieldsToInsertStr = "";
        for (int i = 0; i < numero; i++) {
            fieldsToInsertStr = String.format("%s ?,", fieldsToInsertStr);
        }
        return String.format("(%s)", fieldsToInsertStr.substring(0, fieldsToInsertStr.length()-1));
    }
}
