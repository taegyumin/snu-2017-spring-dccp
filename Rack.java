
public class Rack {

	public double cellWidth;
	public double cellHeight;
	public String[][] cells = new String[5][6];

	public Rack(double cellWidth, double cellHeight){
		this.cellWidth=cellWidth;
		this.cellHeight=cellHeight;

		for(int i=0;i<this.cells.length;i++){
			for(int j=0;j<this.cells[i].length;j++){
				if((i%2==0)&&(j%2!=0)){
					cells[i][j]="A";
				}
				else{
					cells[i][j]="X";
				}
			}
		}
	}


	public double retrieveProduct(Crane crane, int x, int y){
		double tempTime = 0.0;
		int[] array = {x,y};

		double xTime = (Math.abs(x-crane.xPosition)*cellHeight)/crane.xSpeed;
		double yTime = (Math.abs(y-crane.yPosition)*cellWidth)/crane.ySpeed;
		tempTime = Math.max(xTime, yTime);
		
		crane.move(array);
		crane.shuttles[crane.numberOfMove-1]=cells[x][y];
		cells[x][y]="X";

		return tempTime;
	}


	public void showStatus(){
		for(int i =0; i<this.cells.length;i++){
			for(int j=0; j<this.cells[i].length;j++){
				System.out.print(this.cells[i][j] +"\t");
			}
			System.out.println();
		}
	}
}