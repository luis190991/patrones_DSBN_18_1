package arquitectonicos.dao.factories.implementations.postgresql;

import arquitectonicos.dao.conecctions.Conexion;
import arquitectonicos.dao.models.Region;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis on 23/03/18.
 */
public class RegionDao implements arquitectonicos.dao.factories.interfaces.RegionDao{
    @Override
    public void create(Region obj) {
        try {
            Conexion conexion = Conexion.getInstance();
            PreparedStatement ps = conexion.getConn().prepareStatement(Region.INSERT);
            Integer i =1;
            ps.setLong(i++, obj.getId());
            ps.setString(i++, obj.getName());
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {

        }
    }

    @Override
    public List<Region> read(String criteria) {
        List<Region> regiones = new ArrayList<>();
        try {
            Conexion conexion = Conexion.getInstance();
            Statement st = conexion.getConn().createStatement();
            ResultSet rs = st.executeQuery(String.format("%s %s",Region.Q_ALL, criteria));
            while(rs.next()){
                regiones.add(makeRegion(rs));
            }
        }catch (ClassNotFoundException | SQLException ex){

        }
        return regiones;
    }

    @Override
    public Region read(Long id) {
        Region region = null;
        try {
            Connection conexion = Conexion.getInstance().getConn();
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(String.format("%s %s",Region.Q_BY_ID, id));
            if(rs.next()){
                region = makeRegion(rs);
            }
        }catch (ClassNotFoundException | SQLException ex){

        }
        return region;
    }

    @Override
    public void update(Region obj) {
        try {
            Conexion conexion = Conexion.getInstance();
            PreparedStatement ps = conexion.getConn()
                    .prepareStatement(String.format("%s %s",Region.UPDATE, obj.getId()));
            Integer i =1;
            ps.setLong(i++, obj.getId());
            ps.setString(i++, obj.getName());
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {

        }
    }

    @Override
    public void delete(Long id) {
        try {
            Conexion conexion = Conexion.getInstance();
            PreparedStatement ps = conexion.getConn()
                    .prepareStatement(Region.DELETE);
            Integer i =1;
            ps.setLong(i++, id);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {

        }
    }

    private Region makeRegion(ResultSet rs) throws SQLException {
        Region region = new Region();
        Integer i = 1;
        region.setId(rs.getLong(i++));
        region.setName(rs.getString(i++));
        return region;
    }
}
