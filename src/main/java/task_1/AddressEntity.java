package task_1;

public class AddressEntity {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private GeoEntity geo;

    public AddressEntity(String street, String suite, String city, String zipcode, GeoEntity geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getSuite() {
        return suite;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setGeo(GeoEntity geo) {
        this.geo = geo;
    }

    public GeoEntity getGeo() {
        return geo;
    }

    public String toString() {
        return "{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", geo" + geo +
                '}';
    }
}


