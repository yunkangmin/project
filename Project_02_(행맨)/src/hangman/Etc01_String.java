package hangman;

public class Etc01_String {

	public static void main(String[] args) {
		String str="STRCRAFT";
		char[] ar= str.toCharArray();
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);//char
		}
		System.out.println("================");
		String[]arr=str.split("");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" / "+(arr[i].equals("R")));
		}
	}

}
