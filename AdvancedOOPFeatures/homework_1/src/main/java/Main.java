import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main implements Comparator<Employee> {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {

        Collections.sort(staff, (employee, t1) -> {
            employee.getSalary().compareTo(t1.getSalary());
            employee.getName().compareTo(t1.getName());


        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
    }


    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}