package abstractMerhods;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I have implemented the draw() feature myself. I undestood how getters and setters work together
		// I also understood interface implementation and how different objects can react different to the interface methods
		// - 16425
		
		
		rectangle figure1 = new rectangle(5, 10);
		figure1.area();
		figure1.draw();
		System.out.println("\n");
		
		circle figure2 = new circle(2);
		figure2.area();
		figure2.draw();
		System.out.println("\n");
		
		square figure3 = new square(7);
		figure3.area();
		figure3.draw();
		System.out.println("\n");
		
	}

}
