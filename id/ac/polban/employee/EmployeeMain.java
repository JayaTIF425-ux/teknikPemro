package id.ac.polban.employee;

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.EmployeeService;

public class EmployeeMain {
    public static void main(String[] args) {
        // Inisialisasi Department & Type (Aggregation)
        Department itDept = new Department("IT Support");
        EmploymentType ft = new EmploymentType("Full-Time");

        // Membuat Objek Employee
        Employee emp1 = new Employee(1, "jaya", itDept, ft, 5000000);
        Employee emp2 = new Employee(2, "ryan", itDept, ft, 4500000);

        // Penggunaan EmployeeService (Dependency)
        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        // Testing raise salary
        service.raiseSalary(1, 10); // Naik gaji 10%
        
        System.out.println("Nama: " + emp1.getName());
        System.out.println("Gaji Baru: Rp " + emp1.getSalary());

        System.out.println("Nama: " + emp2.getName());
        System.out.println("Gaji Baru: Rp " + emp2.getSalary());
        
        // Menampilkan penggunaan Static Method
        System.out.println("Total Karyawan Terdaftar: " + Employee.getTotalEmployees());
    }
}