import java.util.List;
import java.util.Optional;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
    }

    public static Optional<Employee> sortBySalaryAndAlphabet(List<Employee> staff) {


        Optional<Employee> employee = staff.stream().max((o1, o2) -> {
            if (o1.getSalary() == o2.getSalary())
                return o1.getName().compareTo(o2.getName());
            else if (o1.getSalary() > o2.getSalary())
                return o1.getName().compareTo(o2.getName());
            else return -1;
        });


        return employee;

    }
}


//TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.


