package tallerTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class employeeTest {

	 @Test
	   public void salarioUSDTipoWorker() {
	      System.out.println("Calculando salario siendo el empleado de tipo Worker con USD...");
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
	 
	 
	 
	 
	 
	 @Test
	   public void salarioEURTipoSupervisor() {
	      System.out.println("Calculando salario siendo el empleado de tipo Supervisor con EUR...");
	      Employee E = new Employee((float) 420.0, "EUR" ,0.5f, EmployeeType.Supervisor);
	      assertEquals(E.cs(), 463.508, 0.01);
	   }
	 
	 @Test
	   public void salarioEURTipoManager() {
	      System.out.println("Calculando salario siendo el empleado de tipo Manager con EUR...");
	      Employee E = new Employee((float) 420.0, "EUR" ,0.5f, EmployeeType.Manager);
	      assertEquals(E.cs(), 463.683, 0.01);
	   }
	 
	 
	 @Test
	   public void bonusAnualEURTipoWorker() {
	      System.out.println("Calculando bonus siendo el empleado de tipo Worker con EUR ...");
	      Employee E = new Employee((float) 500.0, "EUR" ,0.5f, EmployeeType.Worker);
	      assertTrue(E.CalculateYearBonus()==386.0f);
	   }
	 
	 
	 @Test
	   public void bonusAnualEURTipoSupervisor() {
	      System.out.println("Calculando bonus siendo el empleado de tipo Supervisor con EUR...");
	      Employee E = new Employee((float) 600.0, "EUR" ,0.5f, EmployeeType.Supervisor);
	      assertTrue(E.CalculateYearBonus()==763f);
	   }
	 
	 
	 @Test
	   public void bonusAnualEURTipoManager() {
	      System.out.println("Calculando bonus siendo el empleado de tipo Manager con EUR...");
	      Employee E = new Employee((float) 700.0, "EUR" ,0.5f, EmployeeType.Manager);
	      assertTrue(E.CalculateYearBonus()==1051f);
	   }
	 
	  
	 @Test
	   public void bonusAnualUSDTipoWorker() {
	      System.out.println("Calculando bonus siendo el empleado de tipo Worker con USD...");
	      Employee E = new Employee((float) 500.0, "USD" ,0.5f, EmployeeType.Worker);
	      assertTrue(E.CalculateYearBonus()==386.0f);
	   }
	 
	 @Test
	   public void bonusAnualUSDTipoSupervisor() {
	      System.out.println("Calculando bonus siendo el empleado de tipo Supervisor con USD...");
	      Employee E = new Employee((float) 600.0, "USD" ,0.5f, EmployeeType.Supervisor);
	      assertTrue(E.CalculateYearBonus()==793f);
	   }
	 
	 @Test
	   public void bonusAnualUSDTipoManager() {
	      System.out.println("Calculando bonus siendo el empleado de tipo Manager con USD...");
	      Employee E = new Employee((float) 700.0, "USD" ,0.5f, EmployeeType.Manager);
	      assertTrue(E.CalculateYearBonus()==1086f);
	   }

	 
}


	