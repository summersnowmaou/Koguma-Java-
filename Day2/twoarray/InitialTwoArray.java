package twoarray;

public class InitialTwoArray {

	public static void main(String[] args) {
		String[][] array={
				{"Apple","Orange","Banana"},
				{"Dog","Cat"},
				{"Phone","Machine","Book","Java","����"}
		};
		for(int i=0;i<array.length;i++){   // ѭ����
			for(int j=0;j<array[i].length;j++){   // ѭ����ǰ��(һά����)������
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
