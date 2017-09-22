

import java.util.Scanner;

public class P2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] N = new int[1000];
		
		for(int i=0; i<n;i++) {
			System.out.print("정수를 입력하시오: ");
			N[i] = scan.nextInt();
		}
		int[] Z = new int[1000];
		int a;
		
		for(int j=1; j<n; j++) {
			for(int l=1; l<n; l++) {
				if(N[l]<N[l-1]) {
					a=N[l-1];
					N[l-1]=N[l];
					N[l]=a;
				}
			}	
		}
		
		for(int k=0; k<n; k++)
			System.out.println(N[k]);
		scan.close();
		
	}

}
