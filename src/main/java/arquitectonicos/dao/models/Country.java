package arquitectonicos.dao.models;

/**
 * Created by luis on 16/04/18.
 */
public class Country extends Model{

    public static final String FIELDS = "country_id, country_name, region_id";
    public static final String TABLE = "countries";
    public static final String Q_ALL = String.format("SELECT %s FROM %s", FIELDS, TABLE);
    public static final String Q_BY_ID = String.format("%s WHERE country_id = ", Q_ALL);
    public static final String INSERT = String.format("INSERT INTO %s (%s) VALUES%s", TABLE, FIELDS, fieldsToInsert(3));
    public static final String UPDATE = String.format("UPDATE %s SET country_id = ?, country_name = ?, region_id =? WHERE country_id =", TABLE);
    public static final String DELETE = String.format("DELETE FROM %s WHERE country_id = ?", TABLE);

    private Long id;
    private String name;
    private Region region;

    public Country() {
    }

    public Country(Long id, String name, Region region) {
        this.id = id;
        this.name = name;
        this.region = region;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
