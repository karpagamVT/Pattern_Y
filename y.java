package PatPro;

public class y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j =0; j <n; j++) {
				if ((j==2&&i>1)||(i==j&&j<2)||(i==0&&j==4)||(i==1&&j==3))
				{
					System.out.print("*"+" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
