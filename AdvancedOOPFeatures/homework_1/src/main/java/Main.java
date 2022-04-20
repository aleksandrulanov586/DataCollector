import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
    }

    public static Employee sortBySalaryAndAlphabet(List<Employee> staff) {


        Employee employee = (Employee) staff.stream().filter(employee1 -> employee1.getWorkStart() == employee1.getWorkStart());


        return employee;

    }
}


//TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.


