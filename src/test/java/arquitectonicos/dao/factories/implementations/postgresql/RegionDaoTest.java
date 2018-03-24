package arquitectonicos.dao.factories.implementations.postgresql;

import arquitectonicos.dao.models.Region;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by luis on 23/03/18.
 */
public class RegionDaoTest {

    @Test
    public void readTest(){
        arquitectonicos.dao.factories.interfaces.RegionDao regionDao = new RegionDao();
        List<Region> regiones = regionDao.read("WHERE region_id = 1");
        Assert.assertNotNull(regiones);
        for (Region region : regiones){
            System.out.println(region);
            Assert.assertNotNull(region);
        }
        //Assert.assertEquals(3, regiones.size());
    }

    @Test
    public void readByIdTest(){
        arquitectonicos.dao.factories.interfaces.RegionDao regionDao = new RegionDao();
        Region region = regionDao.read(new Long("3"));
        Assert.assertNotNull(region);
        System.out.println(region);
    }
}
