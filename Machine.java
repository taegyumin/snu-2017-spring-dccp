
public class Machine {
	
	public double xSpeed;
	public double ySpeed;
	public double zSpeed;
	public int xPosition;
	public int yPosition;
	public int zPosition;
	public int numberOfMove=0;
	
	public void move(int[] position){
		this.xPosition=position[0];
		this.yPosition=position[1];
		this.zPosition=position[2];
		numberOfMove+=1;
	}

}
