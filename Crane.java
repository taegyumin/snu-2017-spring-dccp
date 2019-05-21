
public class Crane extends Machine{
	public String[] shuttles = new String[2];

	public Crane(int x, int y, double xSpeed, double ySpeed){
		this.xPosition=x;
		this.yPosition=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;

		for(int i=0;i<shuttles.length;i++){
			shuttles[i]="X";
		}
	}

	@Override
	public void move(int[] position){
		this.xPosition=position[0];
		this.yPosition=position[1];

		numberOfMove+=1;
	}

	public void showStatus(){
		System.out.print("Shuttles: ");
		for(int i=0; i<this.shuttles.length;i++){
			System.out.print(this.shuttles[i]+"\t");
		}
		System.out.println();
	}

}
