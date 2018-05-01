package arquitectonicos.dao.factories.implementations.postgresql;

import arquitectonicos.dao.models.Model;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by luis on 16/04/18.
 */
public class ModelTest {

    @Test
    public void fieldsToInsertTest(){
        String okValue = "( ?, ?)";
        String badValue = "( ?, ?,)";
        Assert.assertEquals(okValue, Model.fieldsToInsert(2));

        Assert.assertNotEquals(badValue, Model.fieldsToInsert(2));
    }
}
