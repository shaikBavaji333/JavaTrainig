package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {  // Step 2 to create "Objects" in different ways

    public static void main(String[] args) {

        //3 rd method to create objects.
        List<Employee> employeeList = Arrays.asList(new Employee(1, "Teja", 2000.0),
                new Employee(2, "Bavaji", 3000.0),
                new Employee(3, "Ram", 4000.0),
                new Employee(4, "ABC", 5000.0));

        // 1 st method  to create objects.
//        Employee emp1=new Employee(1,"Teja",2000.0);
//        Employee emp2=new Employee(2,"Bavaji",3000.0);
//        Employee emp3=new Employee(3,"Ram",4000.0);

        //2 nd method to create objects.
//        employeeList.add(new Employee(1,"Teja",2000.0)
//        );
//        employeeList.add(new Employee(2,"Bavaji",3000.0)
//        );
//        employeeList.add(new Employee(3,"Ram",4000.0)
//        );
////        employeeList.add(emp2);
////        employeeList.add(emp3);
//
//        System.out.println(employeeList);

        //Filter employee who is having more than 3000
        List<Employee> employeeList1 = employeeList.stream().filter(e -> e.getEmpSal() > 3000).collect(Collectors.toList());

        System.out.println(employeeList1);


    }
}
