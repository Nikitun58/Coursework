public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван", "Иванович","Иванов", 1, 208_000);
        employees[1] = new Employee("Анастасия", "Сергеевна","Безус", 2, 109_000);
        employees[2] = new Employee("Елена", "Александровна","Серчуг", 3, 155_000);
        employees[3] = new Employee("Ольга", "Александровна","Копылова", 4, 95_000);
        employees[4] = new Employee("Анна", "Владимировна","Колесникова", 5, 128_000);
        employees[5] = new Employee("Сергей", "Вячеславович","Пышка", 5, 68_000);
        employees[6] = new Employee("Юлия", "Сергеевна","Лапчук", 4, 130_000);
        employees[7] = new Employee("Леся", "Владимировна","Коболева", 3, 159_000);
        employees[8] = new Employee("Максим", "Сергеевич","Ушаков", 2, 55_000);
        employees[9] = new Employee("Александр", "Максимович","Найдовский", 1, 23_000);

        EmployeeService.printEmployeeList(employees);
        EmployeeService.calculateEmployeeSalarySumPrint(employees);
        EmployeeService.calculateEmployeeAverageSalaryPrint(employees);
        EmployeeService.calculateEmployeeSalaryMinPrint(employees);
        EmployeeService.calculateEmployeeSalaryMaxPrint(employees);
        EmployeeService.calculateallEmployeesFullNamePrint(employees);
    }
}