public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int year = 2021 - hireYear;
        double raise = 0;
        if (year < 10) {
            raise = salary * 0.05;
        } else if (year >= 10 && year <= 19) {
            raise = salary * 0.1;
        } else {
            raise = salary * 0.15;
        }
        salary += raise;
        return raise;
    }

    public String toString() {
        double totalSalary = salary + bonus() - tax();
        return "Adi : " + name + "\nMaaşi : " + salary + "\nÇalişma Saati : " + workHours +
                "\nBaşlangiç Yili : " + hireYear + "\nVergi : " + tax() +
                "\nBonus : " + bonus() + "\nMaaş Artişi : " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : " + totalSalary +
                "\nToplam Maaş : " + (totalSalary + salary - raiseSalary());
    }
}