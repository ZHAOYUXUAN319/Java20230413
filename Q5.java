package String10;

/**
 * 質問５︓以下仕様のフォーマティング指⽰コードを作成してくだい。
1. 浮動⼩数点数
2. ⻑さは5桁数
3. 精度は⼩数点後2位

 * @author hangt
 *
 */
public class Q5 {

	

	public static void main(String... args) {

		 float two = 123456.99999F;
		 // one=123,456 two=123,457.00
		 System.out.println(String.format("two=%,.2f", two));
	}
}
