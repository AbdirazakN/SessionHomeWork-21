import java.time.LocalDate;
import java.time.ZoneId;

public class Customer implements Service {
    private String name;
    private String surname;
    private Country countryOfBirth;
    private LocalDate yearOfBirth;
    private String eMail;

    public Customer(String name, String surname, Country countryOfBirth, LocalDate yearOfBirth, String eMail) {
        this.name = name;
        this.surname = surname;
        this.countryOfBirth = countryOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.eMail = eMail;
    }

//    public Customer() {
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Country getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(Country countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(LocalDate yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public int getAge() {
        return LocalDate.now().compareTo(yearOfBirth);
    }

    @Override
    public String getSameCountry() {
            if (countryOfBirth.equals(Country.KYRGYZSTAN)) {
                return countryOfBirth.name();
            } else if (countryOfBirth.equals(Country.CHINA)) {
                return countryOfBirth.name();
            } else if (countryOfBirth.equals(Country.KAZAKHSTAN)) {
                return countryOfBirth.name();
            }
        return null;
    }

    public String getAllCountry() {
            return countryOfBirth.name();
    }

    @Override
    public String getAllCustomers() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", countryOfBirth=" + countryOfBirth +
                ", yearOfBirth=" + yearOfBirth +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
