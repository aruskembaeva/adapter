public class CompanyDB implements Company {

    private int id;
    private String name;
    private String description;
    private String foundedDate;

    public CompanyDB(int id, String name, String description, String foundedDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.foundedDate = foundedDate;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getFoundedDate() {
        return foundedDate;
    }
}