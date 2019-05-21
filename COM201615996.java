public class COM201615996 {

	public static void main(String[] args) {
		int n =5;
		printRectString("gj");
		getPermutation(n);
		drawDiamond(n);
	}

	public static void printRectString(String name){
		if(name.length()%2==0){
			for(int i=0;i<name.length()+2;i+=2){
				System.out.print("-+");
			}
		}
		else{
			for(int i=0;i<name.length();i+=2){
				System.out.print("-+");
			}
			System.out.print("-");
		}
		
		String minusPlus = "";
		while(minusPlus.length()<name.length()+2){
			minusPlus +="-";
			minusPlus +="+";
		}

		System.out.print("\n"+"|"+name+"|"+"\n");

		if(name.length()%2==0){
			for(int i=0;i<name.length()+2;i+=2){
				System.out.print("+-");
			}
		}
		else{
			for(int i=0;i<name.length();i+=2){
				System.out.print("+-");
			}
			System.out.print("+");
		}
		System.out.println();
		System.out.println();

	}

	public static void getPermutation(int n){
		if(n<3){
			System.out.println("3보다 크거나 같은 수를 입력해주십시오.");
			return;
		}
		int caseOfNumber = 0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				for(int k=1;k<=n;k++){
					if(i==j||j==k||k==i){
						continue;
					}
					System.out.println(i+", "+j+", "+k);
					caseOfNumber +=1;
				}
			}
		}

		System.out.println("총 경우의 수: "+caseOfNumber);
		System.out.println();
	}

	public static void drawDiamond(int n){
		for(int i=0;i<n/2+1;i++){
			for(int j=i;j<n-1;j++){
				System.out.print("=");
			}
			for(int j=0;j<=2*i;j++){
				System.out.print("*");
			}
			for(int j=i;j<n-1;j++){
				System.out.print("=");
			}
			System.out.println();
		}
		for(int i=n/2-1;i>=0;i--){
			for(int j=i;j<n-1;j++){
				System.out.print("=");
			}
			for(int j=0;j<=2*i;j++){
				System.out.print("*");
			}
			for(int j=i;j<n-1;j++){
				System.out.print("=");
			}
			System.out.println();
		}
		System.out.println();
	}
}
