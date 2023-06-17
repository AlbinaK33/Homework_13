package task_1;

public class CompanyEntity {
    private String name;
    private String catchPhrase;
    private String bs;

    public CompanyEntity(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public String getBs() {
        return bs;
    }

    @Override
    public String toString() {

        return "{ " +
                "name='" + name + '\'' +
                ", catchPhrase='" + catchPhrase + '\'' +
                ", bs='" + bs + '\'' +
                '}';
    }
}


