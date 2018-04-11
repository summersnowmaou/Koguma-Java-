package twoarray;

public class InitialTwoArray {

	public static void main(String[] args) {
		String[][] array={
				{"Apple","Orange","Banana"},
				{"Dog","Cat"},
				{"Phone","Machine","Book","Java","兵法"}
		};
		for(int i=0;i<array.length;i++){   // 循环行
			for(int j=0;j<array[i].length;j++){   // 循环当前行(一维数组)的数据
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
