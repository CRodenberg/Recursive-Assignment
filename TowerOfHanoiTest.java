/*TowerOfHanoiTest.java
Programmer: Cole Rodenberg
Date: 3/20/16
Description: Testing the TowerOfHanoi class.
*/

import java.util.Scanner;

public class TowerOfHanoiTest{
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[]args){
		System.out.print("Please enter the number of disks: ");
		int N = console.nextInt();
		char s1 = 'A', s2 = 'B', s3 = 'C';
		TowerOfHanoi toh = new TowerOfHanoi(N);
		toh.solveTower(N, s1, s2, s3);
	}//main
}//TowerOfHanoiTest
