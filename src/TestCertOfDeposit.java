import java.util.Scanner;
import java.time.LocalDate;

// TestCertofDeposit (User Input)
// Ezekiel C. Cortez BSIT-1-1B 69433 COMPROG12L

public class TestCertOfDeposit {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter details for first Certificate of Deposit:");
        CertOfDeposit Cd1 = getData(Input);

        System.out.println("Enter details for second Certificate of Deposit:");
        CertOfDeposit Cd2 = getData(Input);

        displayCert(Cd1);
        displayCert(Cd2);
    }

    public static CertOfDeposit getData(Scanner Input) {
        System.out.print("Enter certificate number: ");
        String CertNum = Input.nextLine();
        System.out.print("Enter last name: ");
        String LName = Input.nextLine();
        System.out.print("Enter balance: ");
        double Bal = Input.nextDouble();
        System.out.print("Enter issue year (yyyy): ");
        int Year = Input.nextInt();
        System.out.print("Enter issue month (1-12): ");
        int Month = Input.nextInt();
        System.out.print("Enter issue day (1-31): ");
        int Day = Input.nextInt();
        Input.nextLine();

        LocalDate IDate = LocalDate.of(Year, Month, Day);
        return new CertOfDeposit(CertNum, LName, Bal, IDate);
    }

    public static void displayCert(CertOfDeposit Cd) {
        System.out.println("Certificate of Deposit Details:");
        System.out.println("Certificate Number: " + Cd.getCertNumber());
        System.out.println("Last Name: " + Cd.getLastName());
        System.out.println("Balance: $" + Cd.getBalance());
        System.out.println("Issue Date: " + Cd.getIssueDate());
        System.out.println("Maturity Date: " + Cd.getMaturityDate());
    }
}