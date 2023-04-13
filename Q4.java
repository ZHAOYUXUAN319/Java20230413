package String10;

/**
 * 質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似て
いるメソッドを実装してください。
 * @author hangt
 *
 */
public class Q4 {

	public static void main(String[] args) {
		String str1 = null;
		String str2 = "";
		String str3 = "Hello, world!";

		System.out.println(isNullOrEmpty(str1)); // true
		System.out.println(isNullOrEmpty(str2)); // true
		System.out.println(isNullOrEmpty(str3)); // false

	}
	public static boolean isNullOrEmpty(String value) {
	    return value == null || value.isEmpty();
	}



}


