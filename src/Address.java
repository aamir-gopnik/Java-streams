public class Address {

    private final int id;
    private final String addressLine1;
    private final String streetName;
    private final String cityName;
    private final String districtName;
    private final String countryName;

    public Address(int id, String addressLine1, String streetName, String cityName, String districtName, String countryName) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.streetName = streetName;
        this.cityName = cityName;
        this.districtName = districtName;
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressLine1='" + addressLine1 + '\'' +
                ", streetName='" + streetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", districtName='" + districtName + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
