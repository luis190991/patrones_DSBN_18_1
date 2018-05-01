
package arquitectonicos.dao.factories.implementations.postgresql;

import arquitectonicos.dao.conecctions.Conexion;
import arquitectonicos.dao.factories.interfaces.*;
import arquitectonicos.dao.factories.interfaces.RegionDao;
import arquitectonicos.dao.models.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis on 23/03/18.
 */
public class CountryDao implements arquitectonicos.dao.factories.interfaces.CountryDao{

    private arquitectonicos.dao.factories.interfaces.RegionDao regionDao;

    public CountryDao(RegionDao regionDao) {
        this.regionDao = regionDao;
    }

    @Override
    public void create(Country obj) {
        try {
            Conexion conexion = Conexion.getInstance();
            PreparedStatement ps = conexion.getConn().prepareStatement(Country.INSERT);
            Integer i =1;
            ps.setLong(i++, obj.getId());
            ps.setString(i++, obj.getName());
            ps.setLong(i++, obj.getRegion().getId());
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {

        }
    }

    @Override
    public List<Country> read(String criteria) {
        List<Country> paises = new ArrayList<>();
        try {
            Conexion conexion = Conexion.getInstance();
            Statement st = conexion.getConn().createStatement();
            ResultSet rs = st.executeQuery(String.format("%s %s",Country.Q_ALL, criteria));
            while(rs.next()){
                paises.add(makeCountry(rs));
            }
        }catch (ClassNotFoundException | SQLException ex){

        }
        return paises;
    }

    @Override
    public Country read(Long id) {
        Country region = null;
        try {
            Connection conexion = Conexion.getInstance().getConn();
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(String.format("%s %s",Country.Q_BY_ID, id));
            if(rs.next()){
                region = makeCountry(rs);
            }
        }catch (ClassNotFoundException | SQLException ex){

        }
        return region;
    }

    @Override
    public void update(Country obj) {
        try {
            Conexion conexion = Conexion.getInstance();
            PreparedStatement ps = conexion.getConn()
                    .prepareStatement(String.format("%s %s",Country.UPDATE, obj.getId()));
            Integer i =1;
            ps.setLong(i++, obj.getId());
            ps.setString(i++, obj.getName());
            ps.setLong(i++, obj.getRegion().getId());
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {

        }
    }

    @Override
    public void delete(Long id) {
        try {
            Conexion conexion = Conexion.getInstance();
            PreparedStatement ps = conexion.getConn()
                    .prepareStatement(Country.DELETE);
            Integer i =1;
            ps.setLong(i++, id);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {

        }
    }

    private Country makeCountry(ResultSet rs) throws SQLException {
        Country  country = new Country();
        Integer i = 1;
        country.setId(rs.getLong(i++));
        country.setName(rs.getString(i++));
        Long regionId = rs.getLong(i++);
        country.setRegion(regionDao.read(regionId));
        return country;
    }

    public RegionDao getRegionDao() {
        return regionDao;
    }

    public void setRegionDao(RegionDao regionDao) {
        this.regionDao = regionDao;
    }
}
