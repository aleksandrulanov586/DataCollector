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


        Employee employee = staff.stream().filter(employee1 -> {
            if (employee1.getWorkStart() == employee1.getWorkStart())
                return employee1.getName().equals(employee1.getName());
            else if (employee1.getSalary() > employee1.getSalary())
                return employee1.getName().equals(employee1.getName());
            else return false;
        });
        return employee;

    }
}


//TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.


