public class Main {
    //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    //Посчитать сумму затрат на зарплаты в месяц.
    //Найти сотрудника с минимальной зарплатой.
    //Найти сотрудника с максимальной зарплатой.
    //Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    //Получить Ф. И. О. всех сотрудников (вывести в консоль).

    private static final Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 80000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 82000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 3, 84000);
        employees[3] = new Employee("Глебов Глеб Глебович", 4, 86000);
        employees[4] = new Employee("Никитов Никита Никитич", 5, 88000);
        employees[5] = new Employee("Сергеев Сергей Сергеевич", 1, 90000);
        employees[6] = new Employee("Николаев Николай Николаевич", 2, 92000);
        employees[7] = new Employee("Васильев Василий Васильевич", 3, 94000);
        employees[8] = new Employee("Аркадьев Аркадий Аркадьевич", 4, 74000);
        employees[9] = new Employee("Сеньор Помидор Помидорович", 5, 77000);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("Сумма всех зарплат " + calculateSumSalary());
        System.out.println("Сотрудник с максимальной зарплатой " + getEmployeeWithMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой " + getEmployeeWithMinSalary());
        System.out.println("Среднее значение зарплат составляет " + getEmployeeAverageSalary());
        printEmployeesName();
    }

    public static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }


    public static Employee getEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee target = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                target = employee;
            }
        }
        return target;
    }


    public static int getEmployeeAverageSalary() {
        int average = 0;
        for (Employee employee : employees) {
            if (employee != null)
                average = calculateSumSalary() / 10;
        }
        return average;
    }

    public static void printEmployeesName() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}
