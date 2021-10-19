public class CompanyOtherDB {

    private String cid;
    private String companyName;
    private String companyInformation;
    private String dateFounded;

    public CompanyOtherDB(String cid, String companyName, String companyInformation, String dateFounded) {
        this.cid = cid;
        this.companyName = companyName;
        this.companyInformation = companyInformation;
        this.dateFounded = dateFounded;
    }

    public String getCid() {
        return cid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyInformation() {
        return companyInformation;
    }

    public String getDateFounded() {
        return dateFounded;
    }
}