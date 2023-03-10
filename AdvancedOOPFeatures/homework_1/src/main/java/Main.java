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
                sorted((o1) -> o1.getSalary() > o1.getSalary()).
                limit(1);

        return employee;

    }
}


//TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.


