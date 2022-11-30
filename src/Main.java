import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Customer деген класс тузунуз.Полерерин толтурунуз аты, фамилиясы,туулган олкосу,туулган жылы,почтасы болсун.
        //Дагы бир service деген интерфейс ачып аны анын ичине 4 метод жазыныз."
        //"1-кардардын жашын кайтаруучу метод жазыныз,2-мамлекети окшош кардарларды кайтарыныз,
        //3-кардарлардын мамлекетин сорттоп чыгарыныз,4-баардык кардарларды кайтаруучу метод жазыныз."
        //"Ал интерфейсти Customer клласына impliments кылып методдорго логикасын жазыныз.
        //Mainдан жазган логиканызды иштетиниз.

        Customer[] customers = {
                new Customer("Amir", "Abdykalyk uulu", Country.KYRGYZSTAN, LocalDate.of(2002, 1, 21), "amir02@gmail.com"),
                new Customer("Abdi", "Jolchuev", Country.KYRGYZSTAN, LocalDate.of(2001, 5, 9), "jolchuev.00@gmail.com"),
                new Customer("Amirbek", "Akylbek uulu", Country.KAZAKHSTAN, LocalDate.of(2003, 3, 21), "amir02@gmail.com"),
                new Customer("Tologon", "Amirov", Country.UZBEKISTAN, LocalDate.of(2004, 10, 30), "Tolosh.44@gmail.com"),
                new Customer("Matraim", "Mombekov", Country.RUSSIA, LocalDate.of(2000, 12, 20), "nurmatov12@gmail.com"),
                new Customer("Asylbek", "Nurmatov", Country.CHINA, LocalDate.of(2006, 6, 13), "mombekov122@gmail.com"),
                new Customer("Aigerim", "Jyrgalbek kyzy", Country.KAZAKHSTAN, LocalDate.of(1999, 11, 30), "jyrgalbekkyzy19@gmail.com"),
                new Customer("Fatima", "Alymbekov", Country.CHINA, LocalDate.of(2005, 6, 2), "fatima05@gmail.com"),

        };

        System.out.println("~~~~~~~~~~~~~~~");
        getAge(customers);
        System.out.println("~~~~~~~~~~~~~~~");
        getSameCountry(customers);
        System.out.println("~~~~~~~~~~~~~~~");
        getAllCountry(customers);
        System.out.println("~~~~~~~~~~~~~~~");
        getAllCustomers(customers);
        System.out.println("~~~~~~~~~~~~~~~");
    }

    private static void getAllCustomers(Customer[] customers) {
        for (Customer customer : customers) {
            System.out.println(customer.getAllCustomers());
        }
    }

    private static void getAllCountry(Customer[] customers) {
        for (Customer customer : customers) {
            System.out.println(customer.getAllCountry());
        }
    }

    private static void getSameCountry(Customer[] customers) {
        for (Customer customer : customers) {
            System.out.println(customer.getSameCountry());
        }
    }

    private static void getAge(Customer[] customers) {
        for (Customer customer : customers) {
            System.out.println("Customer age:  " + customer.getAge());
        }
    }
}