package models;

/**
 *
 * @author mystogan
 */
public class Country {
    private String id, name;
    private int regionId;

    public Country() {
    }

    public Country(String country_id, String country_name) {
        this.id = country_id;
        this.name = country_name;
    }

    public Country(String country_id, String country_name, int region_id) {
        this.id = country_id;
        this.name = country_name;
        this.regionId = region_id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
    /**
     * gerRegionId() pengguanaan untuk mengambil data dari tabel Countries
     * mengembalikan nilai regionId.
     * @return 
     */
    public int getRegionId() {
        return regionId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }
    

}
