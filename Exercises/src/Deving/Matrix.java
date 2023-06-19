package Deving;
import java.util.Scanner;


public class Matrix {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com dois numers inteiros: ");
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		
		int[][] mat = new int[N][M];	
		
		System.out.println("Entre com a matriz: ");
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
			System.out.println("Entre com um valor a ser procurado na matriz: ");
			int x = sc.nextInt();
			
			for(int i=0; i<mat.length; i++) {
				for(int j=0; j<mat[i].length; j++) {
					if(mat[i][j] == x) {
						System.out.println("Position " + i + "," + j + ":");
					}
				}
			}
			
		}
	}
