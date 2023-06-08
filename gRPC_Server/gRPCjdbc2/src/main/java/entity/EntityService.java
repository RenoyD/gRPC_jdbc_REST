package entity;

import java.util.ArrayList;

import com.demp.grpcjdbc.Entity.APIResponse;
import com.demp.grpcjdbc.Entity.CreateEmployeeRequest;
import com.demp.grpcjdbc.Entity.CreateStudentRequest;
import com.demp.grpcjdbc.Entity.DeleteEmployeeRequest;
import com.demp.grpcjdbc.Entity.DeleteStudentRequest;
import com.demp.grpcjdbc.Entity.EmployeeRequest;
import com.demp.grpcjdbc.Entity.ReadEmployeeRequest;
import com.demp.grpcjdbc.Entity.ReadStudentRequest;
import com.demp.grpcjdbc.Entity.StudentRequest;
import com.demp.grpcjdbc.entityGrpc.entityImplBase;

import io.grpc.stub.StreamObserver;
import jdbcAndModel.Employee;
import jdbcAndModel.EmployeeDao;
import jdbcAndModel.Student;
import jdbcAndModel.StudentDao;

public class EntityService extends entityImplBase{

	@Override
	public void createStudent(CreateStudentRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Inside createStudent() method");
		String studentName = request.getStudentName();
		String studentPhone = request.getStudentPhone();
		String studentCity = request.getStudentCity();
		
		//DB LOGIC
		Student student = new Student(studentName,studentPhone,studentCity);
		boolean success = StudentDao.insertStudentToDB(student);
		
		APIResponse.Builder response = APIResponse.newBuilder();
		
		if (success) {
			System.out.println("Student is added successfully \n"+ student.toString());
			response.setResponseCode(200).setResponseMessage("Student successfully added to db:\n"+student.toString());
		}else {
			System.out.println("ERROR!");
			response.setResponseCode(500).setResponseMessage("Could not add Student to db");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void readStudent(ReadStudentRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Inside readStudent() method");
		ArrayList<Student> list = StudentDao.readAllStudentsFromDB();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		
		if(!list.isEmpty()) {
			String responseString = "List of all students are:\n";
			for(Student stud : list) {
				responseString += stud.toString()+"\n";
			}
			response.setResponseCode(200).setResponseMessage(responseString);
		}else {
			response.setResponseCode(500).setResponseMessage("Could not add Display students from db");
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void updateStudent(StudentRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Inside updateStudent() method");
		int studentId = request.getStudentId();
		String studentName = request.getStudentName();
		String studentPhone = request.getStudentPhone();
		String city = request.getStudentCity();

		Student student = new Student(studentId, studentName, studentPhone, city);
		APIResponse.Builder response = APIResponse.newBuilder();
		boolean success = StudentDao.updateStudentToDB(student);
		if (success) {
			System.out.println("Student is updated successfully\n"+student.toString());
			response.setResponseCode(200).setResponseMessage("Student is updated successfully\n"+student.toString());
			
		}else {
			System.out.println("ERROR!");
			response.setResponseCode(500).setResponseMessage("Could not update :(");
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void deleteStudent(DeleteStudentRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("inside deleteStudent()");
		int studentId = request.getStudentId();
		APIResponse.Builder response = APIResponse.newBuilder();
		boolean success = StudentDao.deleteStudentFromDB(studentId);
		if (success) {
			System.out.println("Student is deleted successfully with id = "+ studentId);
			response.setResponseCode(200).setResponseMessage("Student is deleted successfully with id ="+studentId);
		}else {
			System.out.println("ERROR!");
			response.setResponseCode(500).setResponseMessage("Could not delete :(");
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void createEmployee(CreateEmployeeRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Inside createEmployee() method");
		String employeeEmail = request.getEmail();
		String employeeFirstName = request.getFirstName();
		String employeeLastName = request.getLastName();
		
		//DB LOGIC
		Employee employee = new Employee(employeeEmail,employeeFirstName,employeeLastName);
		boolean success = EmployeeDao.insertEmployeeToDB(employee);
		
		APIResponse.Builder response = APIResponse.newBuilder();
		
		if (success) {
			System.out.println("Employee is added successfully \n"+ employee.toString());
			response.setResponseCode(200).setResponseMessage("Employee successfully added to db:\n"+employee.toString());
		}else {
			System.out.println("ERROR!");
			response.setResponseCode(500).setResponseMessage("Could not add Employee to db");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void readEmployee(ReadEmployeeRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Inside readEmployee() method");
		ArrayList<Employee> list = EmployeeDao.readAllEmployeesFromDB();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		
		if(!list.isEmpty()) {
			String responseString = "Employee successfully added to db:\n";
			for(Employee emp : list) {
				responseString += emp.toString()+"\n";
			}
			response.setResponseCode(200).setResponseMessage(responseString);
		}else {
			response.setResponseCode(500).setResponseMessage("Could not add Display Employee from db");
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void updateEmployee(EmployeeRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Inside updateEmployee() method");
		int employeeId = request.getEmployeeId();
		String employeeEmail = request.getEmail();
		String employeeFirstName = request.getFirstName();
		String employeeLastName = request.getLastName();

		Employee employee = new Employee(employeeId, employeeEmail, employeeFirstName, employeeLastName);
		APIResponse.Builder response = APIResponse.newBuilder();
		boolean success = EmployeeDao.updateEmployeeToDB(employee);
		if (success) {
			System.out.println("Employee is updated successfully\n"+employee.toString());
			response.setResponseCode(200).setResponseMessage("Employee is updated successfully\n"+employee.toString());
			
		}else {
			System.out.println("ERROR!");
			response.setResponseCode(500).setResponseMessage("Could not update :(");
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void deleteEmployee(DeleteEmployeeRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("inside deleteEmployee()");
		int employeeId = request.getEmployeeId();
		APIResponse.Builder response = APIResponse.newBuilder();
		boolean success = EmployeeDao.deleteEmployeeFromDB(employeeId);
		if (success) {
			System.out.println("Employee is deleted successfully with id = "+ employeeId);
			response.setResponseCode(200).setResponseMessage("Employee is deleted successfully with id ="+employeeId);
		}else {
			System.out.println("ERROR!");
			response.setResponseCode(500).setResponseMessage("Could not delete :(");
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
	

}
