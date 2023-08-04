package practice;

public class String_ex {

	public static void main(String[] args) {
		
		String str;
		str="This is a sample data";
		System.out.println(str.length()); //21
		System.out.println(str.toUpperCase());  //THIS IS A SAMPLE DATA
		System.out.println(str.substring(1));  //his is a sample data
		System.out.println(str.substring(1, 5));//his
		System.out.println(str.contains("java"));//false
		System.out.println(str.indexOf("is"));//2
		System.out.println(str.replace("is", "are"));//Thare are a sample data
		System.out.println(str.charAt(5)); //h
		System.out.println(str.indexOf("web")); //-1
		
		System.out.println(str.split(" ")[3]);//sample
	char ch=str.charAt(3);
	System.out.println(ch);
	
		

	}

}
