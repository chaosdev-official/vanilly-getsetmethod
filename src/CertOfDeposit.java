import java.time.LocalDate;

// Get-Set Method
// Ezekiel C. Cortez BSIT-1-1B
// 69433 COMPROG12L

public class CertOfDeposit {
    private String CertNumber;
    private String LastName;
    private double Balance;
    private LocalDate IssueDate;
    private LocalDate MaturityDate;

    public CertOfDeposit(String CertNum, String LName, double Bal, LocalDate IDate) {
        CertNumber = CertNum;
        LastName = LName;
        Balance = Bal;
        IssueDate = IDate;
        MaturityDate = IDate.plusYears(1);
    }

    public String getCertNumber() {
        return CertNumber;
    }

    public void setCertNumber(String CertNum) {
        CertNumber = CertNum;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LName) {
        LastName = LName;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Bal) {
        Balance = Bal;
    }

    public LocalDate getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(LocalDate IDate) {
        IssueDate = IDate;
    }

    public LocalDate getMaturityDate() {
        return MaturityDate;
    }

    public void setMaturityDate(LocalDate MDate) {
        MaturityDate = MDate;
    }
}