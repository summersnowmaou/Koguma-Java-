package twoarray;

public class TwoArrayDemo {

	public static void main(String[] args) {
		String[][] array=new String[4][3];
		array[0][0]="������";
		array[0][1]="����";
		array[0][2]="��ʩ̹��";
		array[1][0]="����";
		array[1][1]="��˽�";
		array[2][0]="������";
		array[2][1]="С����";
		array[3][2]="ɨ��ɮ";
		for(int i=0;i<array.length;i++){   // ѭ����
			for(int j=0;j<array[i].length;j++){   // ѭ����ǰ��(һά����)������
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
