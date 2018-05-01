package arquitectonicos.dao.factories.implementations.postgresql;

import arquitectonicos.dao.models.Region;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

/**
 * Created by luis on 23/03/18.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegionDaoTest {

    public static Long id = new Long("5");
    @Test
    public void aCreateTest(){
        arquitectonicos.dao.factories.interfaces.RegionDao regionDao = new RegionDao();
        Region region = new Region(id, "Asia");
        regionDao.create(region);
        Region regionToTry = regionDao.read(id);
        Assert.assertEquals(region, regionToTry);
    }

    @Test
    public void bReadTest(){
        arquitectonicos.dao.factories.interfaces.RegionDao regionDao = new RegionDao();
        List<Region> regiones = regionDao.read(String.format("WHERE region_id = %s", id));
        Assert.assertNotNull(regiones);
        for (Region region : regiones){
            System.out.println(region);
            Assert.assertNotNull(region);
        }
        //Assert.assertEquals(3, regiones.size());
    }

    @Test
    public void cReadByIdTest(){
        arquitectonicos.dao.factories.interfaces.RegionDao regionDao = new RegionDao();
        Region region = regionDao.read(id);
        Assert.assertNotNull(region);
        System.out.println(region);
    }

    @Test
    public void dUpdateTest(){
        arquitectonicos.dao.factories.interfaces.RegionDao regionDao = new RegionDao();
        Region region = regionDao.read(id);
        region.setName("Oceania");
        regionDao.update(region);
        Region regionToTry = regionDao.read(id);
        Assert.assertEquals(region, regionToTry);
    }

    @Test
    public void eDeleteTest(){
        arquitectonicos.dao.factories.interfaces.RegionDao regionDao = new RegionDao();
        regionDao.delete(id);
        Region regionToTry = regionDao.read(id);
        Assert.assertNull(regionToTry);
    }
}
