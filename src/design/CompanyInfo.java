package design;

public abstract class CompanyInfo {
    private final Object companyName = "Sony";
    private final Object birth = "1970";
    private final Object CEO = "Anthony Jackson";
    private final Object companyWorkers = "4000";



    public void Company() {
        System.out.println("Company: " + companyName);

    }


    public void CompanyBirth() {
        System.out.println("Year Started: " + birth);

    }

    public void CompanyCEO() {
        System.out.println("CEO of the company is: " + CEO);
    }

    public void CompanyWorkers() {

        System.out.println("Number of Employees in the Company: " + companyWorkers);
    }

    public abstract String setPerformance(int i);
}

