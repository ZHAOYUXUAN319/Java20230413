package String10;

/**
 * 質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂
字 = 3バイト。以下⽂字列のバイト数と桁数を求めてください。
 * @author hangt
 *
 */
public class Q3 {

	public static void main(String[] args) {
		 String values = "abced12345あいうえお１２３４５";

		// バイト数の取得
		int bytes = values.getBytes().length;
		System.out.println("バイト数: " + bytes);

		// 桁数の取得
		int digit = values.length();
		System.out.println("桁数: " + digit);

		}

}
