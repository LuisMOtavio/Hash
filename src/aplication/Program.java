package aplication;

import java.util.Scanner;

import board.Board;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Board board = new Board(3, 3);
		boolean win = false;
		char[][] mat = new char[3][3];
		board.placeBoard();
		int linha1 = 0;
		int coluna1 = 0;
		
		

		while (win == false) {
			System.out.println("Player 1: ");
			System.out.print("Linha: ");
			int linha = sc.nextInt();
			System.out.print("Coluna: ");
			int coluna = sc.nextInt();
			mat[linha][coluna] = 'x';

			for (int i = 0; i < 3; i++) {
				System.out.println();
				System.out.print( i + "  ");

				for (int j = 0; j < 3; j++) {
					
					if (mat[i][j] == 0 ) {
						System.out.print("| ");
					} if (mat[i][j] == 'x' ){
						System.out.print(mat[linha][coluna]+" ");
					}
						
						if (mat[i][j]=='o') {
							System.out.print(mat[linha1][coluna1]+" ");
						}

					
				}

			}
			System.out.println();
			System.out.println("  0 1 2");

			// primeira lina
			if (mat[0][0] == 'x' && mat[0][1] == 'x' && mat[0][2] == 'x') {
				win = true;
				break;

			}

			// segunda linha
			if (mat[1][0] == 'x' && mat[1][1] == 'x' && mat[1][2] == 'x') {
				win = true;
				System.out.println("Voce venceu!");
				break;
			}

			// terceira linha
			if (mat[2][0] == 'x' && mat[2][1] == 'x' && mat[2][2] == 'x') {
				win = true;
				System.out.println("Voce venceu!");
				break;

			}

			// diagonal
			if (mat[0][0] == 'x' && mat[1][1] == 'x' && mat[2][2] == 'x') {
				win = true;
				System.out.println("Voce venceu!");
				break;

			}
			// primeira coluna
			if (mat[0][0] == 'x' && mat[1][0] == 'x' && mat[2][0] == 'x') {
				win = true;
				System.out.println("Voce venceu!");
				break;

			}
			// segunda coluna
			if (mat[0][1] == 'x' && mat[1][1] == 'x' && mat[2][1] == 'x') {
				win = true;
				System.out.println("Voce venceu!");
				break;

			}
			// terceira coluna
			if (mat[0][2] == 'x' && mat[1][2] == 'x' && mat[2][2] == 'x') {
				win = true;
				System.out.println("Voce venceu!");
				break;

			}

			System.out.println("Player 2: ");
			System.out.print("Linha: ");
			linha1 = sc.nextInt();
			System.out.print("Coluna: ");
			coluna1 = sc.nextInt();
			mat[linha1][coluna1] = 'o';

			for (int i = 0; i < 3; i++) {
				System.out.println();
				System.out.print( i + "  ");

				for (int j = 0; j < 3; j++) {
					
					if (mat[i][j] == 0) {
						System.out.print("| ");
					} if (mat[i][j] == 'o')  {
						System.out.print(mat[linha1][coluna1]+" ");
					}
						if(mat[i][j]=='x') {
							System.out.print(mat[linha][coluna]+" ");
						}

					
				}

			}
			System.out.println();
			System.out.println("  0 1 2");


			// primeira lina
			if (mat[0][0] == 'o' && mat[0][1] == 'o' && mat[0][2] == 'o') {
				win = true;
				System.out.println("Voce venceu!");
				break;

			}

			// segunda linha
			if (mat[1][0] == 'o' && mat[1][1] == 'o' && mat[1][2] == 'o') {
				win = true;
				System.out.println("Voce venceu!");
				break;

			}

			// terceira linha
			if (mat[2][0] == 'o' && mat[2][1] == 'o' && mat[2][2] == 'o') {
				win = true;
				System.out.println("Voce venceu!");
				break;

			}

			// diagonal
			if (mat[0][0] == 'o' && mat[1][1] == 'o' && mat[2][2] == 'o') {
				win = true;
				System.out.println("Voce venceu!");
				break;

			}
			// primeira coluna
			if (mat[0][0] == 'o' && mat[1][0] == 'o' && mat[2][0] == 'o') {
				win = true;
				System.out.println("Voce venceu!");
				break;

			}
			// segunda coluna
			if (mat[0][1] == 'o' && mat[1][1] == 'o' && mat[2][1] == 'o') {
				win = true;
				System.out.println("Voce venceu!");
				break;

			}
			// terceira coluna
			if (mat[0][2] == 'o' && mat[1][2] == 'o' && mat[2][2] == 'o') {
				win = true;
				System.out.println("Voce venceu!");
				break;

			}

		}

	}

}
