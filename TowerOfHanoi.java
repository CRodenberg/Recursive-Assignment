/*TowerOfHanoi.java
Programmer: Cole Rodenberg
Date: 3/20/16
Description: Calculating the Towers of Hanoi problem.
*/

public class TowerOfHanoi{
	private int disks;
	
	public TowerOfHanoi(){
		disks = 0;
	}//End Default Constructor
	
	public TowerOfHanoi(int numDisks){
		if(numDisks >= 1)
			disks = numDisks;
		else
			disks = 0;
	}//End Constructor with parameter
	
	public void solveTower(int N, char s1, char s2, char s3){
		if(N == 1)
			System.out.println("Move the disk " + N + " from " + s1 + " to " + s2);
		else{
			solveTower(N-1, s1, s3, s2);
			System.out.println("Move the disk " + N + " from " + s1 + " to " + s2);
			solveTower(N-1, s3, s2, s1);
		}//End else
	}//End solveTower
}//End TowerOfHanoi
