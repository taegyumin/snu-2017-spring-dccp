
public class Execution {

	public static void main(String[] args) {
		double time = 0.0;
		Rack rack = new Rack(2,2);
		Crane crane = new Crane(0,0,2.5,5.5);

		System.out.println("The initial status of rack and crane");
		rack.showStatus();
		crane.showStatus();

		time += rack.retrieveProduct(crane, 2, 1);
		time += rack.retrieveProduct(crane, 4, 5);
		System.out.println("Total travel Time: "+time);
		System.out.println("The final status of rack and crane");
		
		rack.showStatus();
		crane.showStatus();
	}

}
