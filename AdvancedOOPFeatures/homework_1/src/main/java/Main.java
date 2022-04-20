import java.util.Collections;
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


        Employee employee = staff.stream().filter(employee1 -> employee1.getWorkStart().equals(employee1.getSalary())).max((employee1, employee2) -> employee1.getSalary().equals(employee2.getSalary()));


        return employee;

    }
}


//TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.


