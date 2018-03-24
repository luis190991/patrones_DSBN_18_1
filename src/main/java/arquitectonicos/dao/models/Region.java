package arquitectonicos.dao.models;

/**
 * Created by luis on 16/03/18.
 */
public class Region {
    public static final String FIELDS = "region_id, region_name";
    public static final String TABLE = "regions";
    public static final String Q_ALL = String.format("SELECT %s FROM %s", FIELDS, TABLE);
    public static final String Q_BY_ID = String.format("%s WHERE region_id = ", Q_ALL);
    private Long id;
    private String name;

    public Region() {
    }

    public Region(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return String.format("%s - %s", this.getId(), this.getName());
    }
}
