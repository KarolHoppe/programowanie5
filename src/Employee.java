import java.time.LocalDate;

public class Employee {
    String imie;
    String nazwisko;
    String adres;
    String email;
    String pesel;
    int rokzazatrudnienia;

    public Employee(String imie, String nazwisko, String adres, String email, String pesel, int rokzatrudnienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.email = email;
        this.pesel = pesel;
        this.rokzazatrudnienia = rokzatrudnienia;
    }

    public int calculateSalary() {
        int baseSalary = 3000;
        int yearsWorked = LocalDate.now().getYear() - rokzazatrudnienia;
        int additionalSalary = yearsWorked * 1000;
        return baseSalary + additionalSalary;
    }
}
