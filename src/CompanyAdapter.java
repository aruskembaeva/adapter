public class CompanyAdapter implements Company {

 private CompanyOtherDB companyOtherDB;

 public CompanyAdapter(CompanyOtherDB companyOtherDB) {
  this.companyOtherDB = companyOtherDB;
 }

 @Override
 public int getId() {
  return Integer.parseInt(companyOtherDB.getCid());
 }
 @Override
 public String getName() {
  return companyOtherDB.getCompanyName();
 }
 @Override
 public String getDescription() {
  return companyOtherDB.getCompanyInformation();
 }
 @Override
 public String getFoundedDate() {
  return companyOtherDB.getDateFounded();
 }
}