package certificao.string;

public class TesteString {
	
	private String str1 = "teste";
	private String str2 = "teste";
	
	public static void main(String... args){
		
		TesteString ex = new TesteString();
		ex.teste();
	}
	public void teste(){
		System.out.println(str1 == "teste");
		System.out.println(str1 == "tes"+"te");
		System.out.println(str1 == getStr1()+getStr12());
		System.out.println(str1 == new String("teste"));
		System.out.println(new String("teste") == "te"+"ste");
		System.out.println(str1 == str2);
	}
	
	public String getStr1(){
		return "te";
	}
	public String getStr12(){
		return "te";
	}
}
