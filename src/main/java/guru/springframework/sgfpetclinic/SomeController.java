package guru.springframework.sgfpetclinic;

public class SomeController {

	private final MyService myService;

	public SomeController(MyService myService) {
		this.myService = myService;
	}
	
}
