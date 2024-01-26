
import dal.EmployeeDAO;
import models.Employee;

public class test {

    public static void main(String[] args) {
        // Create an instance of EmployeeDAO or wherever your updateEmployee method is defined
        EmployeeDAO employeeDAO = new EmployeeDAO();
        // Define parameters for the update
        String name = "Updated Name";
        String phoneNumber = "Updated Phone";
        String address = "Updated Address";
        String email = "updated@email.com";
        Boolean gender = true; // true for Male, false for Female
        String image = "updated_image.jpg";
        String birthDate = "1990-01-01";
        String hireDate = "2022-01-01";
        String id = "1"; // Replace with the actual employee ID you want to update
        // Call the updateEmployee method
        employeeDAO.updateEmployee(name, phoneNumber, address, email, gender, image, birthDate, hireDate, id);
        // Optionally, retrieve the updated employee from the database
        // If your EmployeeDAO has a method to get an employee by ID, you can use it here
        Employee updatedEmployee = employeeDAO.getEmployeeById(Integer.parseInt(id));
        // Display the updated employee information
        System.out.println("Updated Employee Information:");
        System.out.println("Name: " + updatedEmployee.getName());
        System.out.println("Phone: " + updatedEmployee.getPhoneNumber());
        System.out.println("Address: " + updatedEmployee.getAddress());
        System.out.println("Email: " + updatedEmployee.getEmail());
        System.out.println("Gender: " + updatedEmployee.isGender());
        System.out.println("Image: " + updatedEmployee.getImage());
        System.out.println("Birth Date: " + updatedEmployee.getBirthDate());
        System.out.println("Hire Date: " + updatedEmployee.getHireDate());
    }
}
