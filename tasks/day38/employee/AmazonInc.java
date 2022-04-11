package day38.employee;

public class AmazonInc {

    public static void main(String[] args) {

        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Ali","Amazon",40,141,50000);
        Developer developer = new Developer("Veli","Senior Developer", "Amazon",40,241,70000);
        Driver driver = new Driver("Sakir", "Amazon", 50,341,40000);


        developer.work();
        businessAnalyst.work();
        driver.work();

    }
}
