package tallerTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class employeeTest {

	 @Test
	   public void salarioUSDTipoWorker() {
	      System.out.println("Siendo el empleado de tipo Worker con USD...");
	      Employee E = new Employee((float) 420.0, "USD" ,0.5f, EmployeeType.Worker);
	      assertEquals(E.cs(), 484.33, 0.01);
	   }
	 
	 @Test
	   public void salarioUSDTipoSupervisor() {
	      System.out.println("Siendo el empleado de tipo Supervisor con USD...");
	      Employee E = new Employee((float) 420.0, "USD" ,0.5f, EmployeeType.Supervisor);
	      assertEquals(E.cs(), 484.508, 0.01);
	   }
	 
	 @Test
	   public void salarioUSDTipoManager() {
	      System.out.println("Siendo el empleado de tipo Manager con USD...");
	      Employee E = new Employee((float) 420.0, "USD" ,0.5f, EmployeeType.Manager);
	      assertEquals(E.cs(), 484.683, 0.01);
	   }

	 @Test
	   public void salarioEURTipoWorker() {
	      System.out.println("Siendo el empleado de tipo Worker con EUR ...");
	      Employee E = new Employee((float) 420.0, "EUR" ,0.5f, EmployeeType.Worker);
	      assertEquals(E.cs(), 463.33, 0.01);
	   }
	 
}
