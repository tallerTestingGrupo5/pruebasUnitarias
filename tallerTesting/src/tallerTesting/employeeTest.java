package tallerTesting;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class employeeTest {

	 @Test
	   public void salarioTipoWorker() {
	      System.out.println("Siendo el empleado de tipo Worker ...");
	      Employee E = new Employee((float) 386.0, "USD" ,0, EmployeeType.Worker);
	      assertTrue(E.cs() == (float)402.083);
	   }

	
}
