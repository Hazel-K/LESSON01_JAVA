package blog.hyojin4588.second;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// gugudan(2, 5);
		// Gugudan a = new Gugudan();
		// a.gugudan(2, 5);

		// int sum = sum(1,2,3,4,5,6);
		// System.out.println(sum);
		// int result = Utils.parseStringToInt("aa10", 1);
		// int result1 = Utils.parseStringToInt("10");
		// System.out.println(result);
		// System.out.println(result1);

		// int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 };
		// Utils.sortASC(arr);
		// Utils.sortDESC(arr);
		// Utils.printArr(arr);
		
		int[] rArr = Utils.createRandomArr(1, 9, 5);
		Utils.printArr(rArr);
		// 1 ~ 9 랜덤한 값을 5칸 가지는 정수형 배열을 리턴하시오
	}

	public void gugudan(int startNum, int endNum) {
		for (; startNum <= endNum; startNum++) {
			for (int i = 1; i < 10; i++) {
				if ((startNum * i) % 2 == 0) {
					System.out.printf("%d * %d = %d\n", startNum, i, startNum * i);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int sum(int... args) {
		int temp = 0;
		for (int i = 0; i < args.length; i++) {
			temp += args[i];
		}
		return temp;
	}

}

class Utils {

	public static int parseStringToInt(String strI, int iNum) {
		try {
			return Integer.parseInt(strI);
		} catch (Exception e) {
			return iNum;
		}
	}

	public static int parseStringToInt(String strI) {
		try {
			return Integer.parseInt(strI);
		} catch (Exception e) {
			return 0;
		}
	}

	public static int[] sortASC(int[] args) {
		int iNum1 = 0;
		int iNum2 = 0;
		for (int i = 0; i < args.length - 1; i++) {
			iNum1 = i;
			for (int j = iNum1 + 1; j < args.length; j++) {
				if (args[iNum1] > args[j]) {
					iNum1 = j;
				}
			}
			iNum2 = args[i];
			args[i] = args[iNum1];
			args[iNum1] = iNum2;
		}
		return args;
	}
	
	public static int[] sortDESC(int[] args) {
		int iNum1 = 0;
		int iNum2 = 0;
		for (int i = 0; i < args.length - 1; i++) {
			iNum1 = i;
			for (int j = iNum1 + 1; j < args.length; j++) {
				if (args[iNum1] < args[j]) {
					iNum1 = j;
				}
			}
			iNum2 = args[i];
			args[i] = args[iNum1];
			args[iNum1] = iNum2;
		}
		return args;
	}

	public static void printArr(int[] args) {
		for (int i = 0; i < args.length; i++) {
			if (i == args.length - 1) {
				System.out.println(args[i]);
			} else {
				System.out.print(args[i] + ", ");
			}
		}
	}

	public static int[] createRandomArr(int a, int b, int c) {
		int[] temp = new int[c];
		for (int i = 0; i < c; i++) {
			temp[i] = (int)(Math.random() * b + a);
		}
		return temp;
	}
}