package arquitectonicos.dao.factories.interfaces;

import arquitectonicos.dao.models.Region;

import java.util.List;

/**
 * Created by luis on 16/03/18.
 */
public interface RegionDao {

    public void create(Region obj);

    public List<Region> read(String criteria);

    public Region read(Long id);

    public void update(Region obj);

    public void delete(Long id);
}
