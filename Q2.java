package String10;

/**
 * 質問２︓Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」
の拡張⼦は「docx」である。メソッドを作成して、ファイルパス（String型）から拡張⼦
を取得してください。

 * @author hangt
 *
 */
public class Q2 {

	public static String getFileType(String path) {
		int index = path.lastIndexOf('.');
		if (index == -1) {
			return "Empty";
		}
		String fileType = path.substring(index + 1);
		return fileType;
	}

	public static void main(String[] args) {
		System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
		System.out.println(getFileType("c://windows//a a.test")); // test
		System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
		System.out.println(getFileType("c://windows//aaaaa")); // Empty
	}
}
