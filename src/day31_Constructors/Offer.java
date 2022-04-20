package day31_Constructors;

public class Offer {

    public String location, companyName, jobTitle;
    public double salary;
    public boolean hasBenefit, hasPTO, isWFH, isFullTime;
    //              fayda,  (PTO)paid time off, (WFH)working from home


    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
        this.hasPTO = hasPTO;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= €" + salary +
                ", hasBenefit=" + hasBenefit +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                ", hasPTO=" + hasPTO +
                '}';
    }
}

                    /*
       warmup tasks:
                    Offer Task:
                    1. Create a custom class named Offer

                    Attributes:
                            location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

                    Actions:
                            setInfo(): sets all the instance variables
                            toString(): returns the full info of the Offer Object
 */