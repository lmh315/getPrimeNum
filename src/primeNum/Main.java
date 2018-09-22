package primeNum;

import java.util.ArrayList;

public class Main {
	
	static ArrayList<Integer> pNum;
	
	public static void getPrime(int n) {
		int arr[] = new int[n+1];
		
		for(int i=2; i<=n; i++) {
			arr[i] = i;
		}
		
		for(int i=2; i<=n; i++) {
			
			if (arr[i] == 0) continue;
			
			for(int j=i+i; j<=n; j += i) {
				arr[j] = 0;
			}
		}
		for(int i=2; i<=n; i++) {
			if(arr[i] != 0) {
				pNum.add(arr[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		pNum = new ArrayList<>();
		getPrime(4000001);
		System.out.println(pNum.size());
	}
}
