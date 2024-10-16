public class EmployeeMain {

    public static void main(String[] args) {

        Employee emp=new Employee();
        emp.setEmpId(123);
        emp.setEmpName("Teja");
        emp.setEmpSalary(1000.0);


        System.out.println("EmpID ::"+emp.getEmpId()+"-EMPNAME::"+emp.getEmpName()+"-EMPSAl ::"+emp.getEmpSalary());
    }
}
