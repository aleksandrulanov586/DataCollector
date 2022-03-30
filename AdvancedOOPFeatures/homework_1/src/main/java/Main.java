import java.util.Collections;
import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {

        staff.sort(Employee, Employee) ->
        staff.stream().sorted(Employee., Employee.->)
        Collections.sort(staff, (employee, t1) -> {
            employee.getSalary().compareTo(t1.getSalary());
            employee.getName().compareTo(t1.getName());

            //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
        }
    }