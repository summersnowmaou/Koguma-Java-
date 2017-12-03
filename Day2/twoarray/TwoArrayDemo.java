package twoarray;

public class TwoArrayDemo {

	public static void main(String[] args) {
		String[][] array=new String[4][3];
		array[0][0]="风清扬";
		array[0][1]="孙武";
		array[0][2]="曼施坦因";
		array[1][0]="马云";
		array[1][1]="猪八戒";
		array[2][0]="王健林";
		array[2][1]="小王子";
		array[3][2]="扫地僧";
		for(int i=0;i<array.length;i++){   // 循环行
			for(int j=0;j<array[i].length;j++){   // 循环当前行(一维数组)的数据
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
