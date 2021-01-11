package zpractice;

import java.util.*;

public class Patter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size = ");
		int size = in.nextInt();

		int[][] matrix = new int[size][size];

		int locX = 0, locY = 0;
		int col = 0;

		int value = size;
		int count = size;
		int x = size;
		boolean flag = true;

		for (int i = 0; i < size; i++) {
			while (col < size) {
				if (i == 0) {
					matrix[i][col++] = value;
				} else if (i == size - 1) {
					matrix[i][col++] = count--;
				} else {
					if (flag) {
						for (int k = 0; k < i; k++) {
							matrix[i][col++] = x--;
						}
						flag = false;
					}

					matrix[i][col++] = x;

				}

			}

			col = 0;
			x = size;
			flag = true;
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
