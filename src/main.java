public class main {
    public static void main(String[] args){

        Company company = new CompanyDB(1, "Luvvy", "Online shopping", "2020");


        CompanyOtherDB companyOtherDB = new CompanyOtherDB("2", "Technodom", "Electronics Retailer", "1991");

        Company newCompany = new CompanyAdapter(companyOtherDB);

        System.out.println("Company Id from DB: " + company.getId());
        System.out.println("Company Name from DB: " + company.getName());
        System.out.println("Company Description from  DB: " + company.getDescription());
        System.out.println("Company Founded Date from  DB: " + company.getFoundedDate());
        System.out.println();
        System.out.println("Company Id from New DB: " + newCompany.getId());
        System.out.println("Company Name from New DB: " + newCompany.getName());
        System.out.println("Company Description from New DB: " + newCompany.getDescription());
        System.out.println("Company Founded Date from New DB: " + newCompany.getFoundedDate());
    }
}
