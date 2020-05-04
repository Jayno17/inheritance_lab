import Staff.Employee;
import Staff.Management.Director;
import Staff.Management.Manager;
import Staff.techStaff.DatabaseAdmin;
import Staff.techStaff.Developer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;
    Developer developer;
    DatabaseAdmin databaseAdmin;
    Director director;

    @Test
    public void canRaiseSalary(){
        employee = new Manager("Melinda", "NI123456", 100.0, "Exec");
        employee.raiseSalary(10.0);
        assertEquals(110.0, employee.getSalary(), 1.0);
    }

    @Test
    public void canPayBonus(){
        employee = new Manager("Melinda", "NI123456", 100.0, "Exec");
        assertEquals(1.0,employee.payBonus(), 1.0);
    }

    @Test
    public void canRaiseDevSalary() {
        developer = new Developer("Juan","VF5678345",50.00);
        developer.raiseSalary(50.00);
        assertEquals(100.00, developer.getSalary(), 1.00);
    }

    @Test
    public void canPayDevBonus() {
        developer = new Developer("Juan", "VF5678345", 50.00);
        assertEquals(0.5, developer.payBonus(), 1.0);
    }

    @Test
    public void canRaiseDbAdminSalary() {
        databaseAdmin = new DatabaseAdmin("Jess","GH678345",60.00);
        databaseAdmin.raiseSalary(50.00);
        assertEquals(110.00, databaseAdmin.getSalary(), 1.00);
    }

    @Test
    public void canPayDbAdminBonus() {
        databaseAdmin = new DatabaseAdmin("Jess","GH678345",60.00);
        assertEquals(0.6, databaseAdmin.payBonus(), 1.0);
    }
    @Test
    public void canRaiseDirectorSalary() {
        director = new Director("Mary", "NI123457", 1000.0, "Exec", 100000.0);
        director.raiseSalary(50.00);
        assertEquals(1050.00, director.getSalary(), 1.00);
    }

    @Test
    public void canPayDirector() {
        director = new Director("Mary", "NI123457", 1000.0, "Exec", 100000.0);
        assertEquals(10, director.payBonus(), 1.0);
    }
}
