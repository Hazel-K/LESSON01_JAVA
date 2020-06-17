package blog.hyojin4588.first.level2;

public class NamedLoop {

	public static void main(String[] args) {

		Parent:
		for (int i = 0; i < 5; i++) {
			// Append1:
			for (int j = 0; j < 20; j++) {

				if (j == 15) {

					break Parent; // Also can be use 'continue'

				} // this 'if' is break first 'for' as Parent

				System.out.printf("%d - %d\n", i, j);

			}

		}

	}

}
