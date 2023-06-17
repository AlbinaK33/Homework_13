package task_1;

public class UserEntity {
    private int id;
    private String name;
    private String username;
    private String email;
    private AddressEntity address;
    private String phone;
    private String website;
    private CompanyEntity company;

    public UserEntity(int id, String name, String username, String email, AddressEntity address, String phone, String website, CompanyEntity company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address" + address +
                '}'+ '\'' +
                '}'+ '\'' +
                "phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + company + '\'' +
                '}';
    }
}
