package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import main.ThreadsController;
import main.Tuple;

class ThreadsControllerTest {

	private ThreadsController threadController ; 
	private Tuple tuple ; 
	
	@BeforeAll
    public static void setupAll() {
        System.out.println("Should Print Before All Tests Commence!!");
    }

    @BeforeEach
    public void setup() {
        System.out.println("Instantiating Term Rate Test scripts");
        tuple = new Tuple(1, 3);
        threadController= new ThreadsController(tuple);
    }
    
//    @Test
//    @DisplayName("Should run")
//    public void shouldmoveInterne() {
//    	threadController.run;
//    	doNothing().when(yourMock).yourMockedMethod();
//    	
//    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("Should Execute After Each Test");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("Should be executed at the end of the Test");
    }
}
