
public class HelloWorld {

	public static void main(String[] args) {
		//  Hello World! の出力
		System.out.println("Hello World!");
		System.out.println("こんにちは！！");
		System.out.println(123);
		System.out.println("おはよう");
		System.out.println(0);
		System.out.println("例外が");
		System.out.println("発生しました。");
		System.out.println("例外が\r\n発生しました。");
		String str1 = "鈴木";
		System.out.println(str1);
		String str2 ="Tanaka";
		System.out.println(str2);
		String tel ="090-1234-5678";
		System.out.println(tel);
		char char1 = 'A';
		System.out.println(char1);
		int num1 = 12345;
		System.out.println(num1);
		boolean boo= true;
		System.out.println(boo);
		String abc = "山田";
		System.out.println(abc + "さん");
		float a1 = (float)10 / 3;
		System.out.println(a1);
		double a2 = (double)10 / 3;
		System.out.println(a2);
		System.out.println(5 % 3); 
		int a = 6 % 3;
		System.out.println(a);
		int d = 10;
		System.out.println( ++d );
		System.out.println( ++d );
		System.out.println( ++d );
		System.out.println( ++d );
		int b = 10;
		System.out.println( b++ );
		System.out.println( b++ );
		System.out.println( b++ );
		System.out.println( b++ );
		int c = 10;
		System.out.println( --c );
		System.out.println( --c );
		System.out.println( --c );
		System.out.println( --c );
		int age = 35;
		if(age < 20){
		System.out.println( "未成年" );
		}else if(age >= 20 && age <= 80){
		System.out.println( "成人" );
		}else{
		System.out.println( "高齢者" );
		}
		String ao= "青";
		switch(ao){
		case "赤":
		System.out.println("赤組です");
		break;
		case "白":
		System.out.println("白組です");
		break;
		default:
		System.out.println("エラーです");
		
		
		}
	}
}