import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
    }

    public static Employee sortBySalaryAndAlphabet(List<Employee> staff) {


        Employee employee = staff.stream().
                filter(employee1 -> employee1.getWorkStart().equals(employee1.getWorkStart())).
                max(Comparator.comparing(Employee::getSalary)).get();

        return employee;

    }
}


//TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.


