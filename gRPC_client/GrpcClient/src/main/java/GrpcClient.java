import com.demp.grpcjdbc.Entity.APIResponse;
import com.demp.grpcjdbc.Entity.CreateEmployeeRequest;
import com.demp.grpcjdbc.Entity.CreateEmployeeRequest.Builder;
import com.demp.grpcjdbc.Entity.CreateStudentRequest;
import com.demp.grpcjdbc.Entity.DeleteEmployeeRequest;
import com.demp.grpcjdbc.Entity.DeleteStudentRequest;
import com.demp.grpcjdbc.Entity.EmployeeRequest;
import com.demp.grpcjdbc.Entity.ReadEmployeeRequest;
import com.demp.grpcjdbc.Entity.ReadStudentRequest;
import com.demp.grpcjdbc.Entity.StudentRequest;
import com.demp.grpcjdbc.entityGrpc;
import com.demp.grpcjdbc.entityGrpc.entityBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
	
		entityBlockingStub stub = entityGrpc.newBlockingStub(channel);

		//create employee API call
//		CreateEmployeeRequest create_employee_request = CreateEmployeeRequest.newBuilder().setEmail("lemon@gmail.com").setFirstName("Lemon").setLastName("African bird").build();
//		APIResponse create_employee_response = stub.createEmployee(create_employee_request);
//		System.out.println("\nEmployee created successfully:\n"+create_employee_response);
		
		//update employee API call
		EmployeeRequest update_employee_request = EmployeeRequest.newBuilder().setEmployeeId(19).setFirstName("Tweety").setLastName("Bird").setEmail("tweety@icloud.com").build();
		APIResponse update_employee_response = stub.updateEmployee(update_employee_request);
		System.out.println("\nEmployee updated successfully\n"+update_employee_response);
		
		//delete employeee API call
		DeleteEmployeeRequest delete_employee_request = DeleteEmployeeRequest.newBuilder().setEmployeeId(20).build();
		APIResponse delete_employee_response = stub.deleteEmployee(delete_employee_request);
		System.out.println("\nEmployee deleted successfully\n"+ delete_employee_response);
		
		
		//read employee API call
		ReadEmployeeRequest read_employee_request = ReadEmployeeRequest.newBuilder().build();
		APIResponse read_employee_response = stub.readEmployee(read_employee_request);
		System.out.println("\nList of all employees are as follows:\n"+read_employee_response.getResponseMessage());
		
		//create Student API call
//		CreateStudentRequest create_student_request = CreateStudentRequest.newBuilder().setStudentCity("Disney").setStudentName("Land").setStudentPhone("641053353").build();
//		APIResponse create_student_response = stub.createStudent(create_student_request);
//		System.out.println("\nStudent created successfully: \n"+create_student_response.getResponseMessage());
		
		//update Student API call
//		StudentRequest update_student_request = StudentRequest.newBuilder().setStudentId(1).setStudentCity("Mumbai").setStudentPhone("12345").setStudentName("NewStudent").build();
//		APIResponse update_student_response = stub.updateStudent(update_student_request);
//		System.out.println("\nStudent updated successfully: \n"+update_student_response);
		
		//delete StudentAPI call
		DeleteStudentRequest delete_student_request = DeleteStudentRequest.newBuilder().setStudentId(9).build();
		APIResponse delete_student_response = stub.deleteStudent(delete_student_request);
		System.out.println("\nStudent deleted successfully: \n"+delete_student_response);
		
		//read student API call
		ReadStudentRequest read_student_request = ReadStudentRequest.newBuilder().build();
		APIResponse read_student_response = stub.readStudent(read_student_request);
		System.out.println("\nList of all students are as follows:\n"+read_student_response.getResponseMessage());
		
	}

}
