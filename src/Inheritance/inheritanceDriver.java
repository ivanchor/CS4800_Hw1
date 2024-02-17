package Inheritance;

public class inheritanceDriver
{
    public static void main(String[] args)
    {
        //salariedEmployee employee1 = new salariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        //hourlyEmployee employee2 = new hourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        //hourlyEmployee employee3 = new hourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        //commissionEmployee employee4 = new commissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        //salariedEmployee employee5 = new salariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        //baseEmployee employee6 = new baseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        //commissionEmployee employee7 = new commissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        salariedEmployee employee1 = new salariedEmployee();
        employee1.setFirstName("Joe");
        employee1.setLastName("Jones");
        employee1.setSSN("111-11-1111");
        employee1.setWeeklySalary(2500);

        hourlyEmployee employee2 = new hourlyEmployee();
        employee2.setFirstName("Stephanie");
        employee2.setLastName("Smith");
        employee2.setSSN("222-22-2222");
        employee2.setWage(25);
        employee2.setHoursWorked(32);

        hourlyEmployee employee3 = new hourlyEmployee();
        employee3.setFirstName("Mary");
        employee3.setLastName("Quinn");
        employee3.setSSN("333-33-3333");
        employee3.setWage(19);
        employee3.setHoursWorked(47);

        commissionEmployee employee4 = new commissionEmployee();
        employee4.setFirstName("Nicole");
        employee4.setLastName("Dior");
        employee4.setSSN("444-44-4444");
        employee4.setCommissionRate(15);
        employee4.setGrossSales(50000);

        salariedEmployee employee5 = new salariedEmployee();
        employee5.setFirstName("Renwa");
        employee5.setLastName("Chanel");
        employee5.setSSN("555-55-5555");
        employee5.setWeeklySalary(1700);

        baseEmployee employee6 = new baseEmployee();
        employee6.setFirstName("Mike");
        employee6.setLastName("Davenport");
        employee6.setSSN("666-66-6666");
        employee6.setBaseSalary(95000);

        commissionEmployee employee7 = new commissionEmployee();
        employee7.setFirstName("Mahnaz");
        employee7.setLastName("Vaziri");
        employee7.setSSN("777-77-7777");
        employee7.setCommissionRate(22);
        employee7.setGrossSales(40000);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());
        System.out.println(employee5.toString());
        System.out.println(employee6.toString());
        System.out.println(employee7.toString());
    }
}
