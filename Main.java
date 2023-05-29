public class Main {
    public static void main(String[] args) {
        Company yandex = new Company("Yandex", "Russia");
        Company google = new Company("Google","USA");
        Company tencent = new Company("Tencent","China");

        HRAgency hh = new HRAgency("HH");

        hh.registerCompany(yandex);
        hh.registerCompany(google);
        hh.registerCompany(tencent);

        Vacancy vacancyYandex1 = new Vacancy(yandex,"Java Developer",false,
                "Junior",1200,4);
        Vacancy vacancyYandex2 = new Vacancy(yandex,"Python Backend",false,
                "Junior",1200,4);
        Vacancy vacancyYandex3 = new Vacancy(yandex,"C# Fullstack",false,
                "Junior",1200,4);



        Trainee alex = new Trainee("Alex", 1300, "Junior");
        Trainee mary = new Trainee("Mary",1100,"Junior");


        Middel alex1 = new Middel("Alex", 2000, "Middle");
        Middel mary1 = new Middel("Mary",3500,"Middle");


        Senior alex2 = new Senior("Alex", 4500, "Senior");
        Senior mary2 = new Senior("Mary",5600,"Senior");






    }
}