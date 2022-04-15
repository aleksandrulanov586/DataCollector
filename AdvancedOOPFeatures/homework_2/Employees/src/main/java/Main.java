import java.util.Collections;
import java.util.List;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {

        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {


        staff.stream().sorted((o1, o2) -> {
            if (o1.getSalary().equals(o2.getSalary())) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });
        //TODO Метод должен вернуть сотрудника с максимальной зарплатой среди тех,
        // кто пришёл в году, указанном в переменной year
        return staff.stream().sorted((o1, o2) -> o1.getSalary());
    }
}