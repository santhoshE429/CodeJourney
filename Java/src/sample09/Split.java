package sample09;
import java.util.*;

public class Split {

	public static void main(String[] args) {
		String str="Hi how are you";
		String []res=str.split("");
		String []r1=str.split(" ");
		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(r1));

	}

}
