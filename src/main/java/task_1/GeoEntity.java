package task_1;

public class GeoEntity {
    private String lat;
    private String lng;

    public GeoEntity(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLat() {
        return lat;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLng() {
        return lng;
    }

    @Override
    public String toString() {
        return "{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }


}




