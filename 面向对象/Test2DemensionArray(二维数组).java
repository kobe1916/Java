package 数组2;

public class Test2DemensionArray {
	public static void main(String[] args) {
		int[][] a= new int[3][];
		
		a[0] = new int[] {20,30};
		a[1] = new int[] {10,15,80};
		a[2] = new int[] {450,60};
		
		System.out.println(a[1][2]);
		
		//静态化初始二维数组
		int[][] b = {
				{20,30,40},
				{50,20},
				{100,200,300,400}
		};
		System.out.println(b[2][3]);
	}

}
