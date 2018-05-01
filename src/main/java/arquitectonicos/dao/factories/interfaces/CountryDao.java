package arquitectonicos.dao.factories.interfaces;

import arquitectonicos.dao.models.Country;

import java.util.List;

/**
 * Created by luis on 16/04/18.
 */
public interface CountryDao {

    public void create(Country obj);

    public List<Country> read(String criteria);

    public Country read(Long id);

    public void update(Country obj);

    public void delete(Long id);
}
