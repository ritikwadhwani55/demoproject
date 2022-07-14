package hello;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.*;
import java.util.*;
public class Static1{
	public static void main(String args[]) {
			int arr[] = new int[10];
			System.out.print(arr);
			for(int i=0;i<arr.length;i++) {
				arr[i]=4-i;
			}
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[j]);
			}
			int pass=1, k=0, switched=1;
			for(pass=1;pass<arr.length && switched==1;pass++) {
				switched=0;
				for(k=0;k<=arr.length-1-pass;k++) {
					if(arr[k]>arr[k+1]) {
						int temp =arr[k];
						arr[k]=arr[k+1];
						arr[k+1]=temp;
						switched=1;
					}
				}
			}
			System.out.println();
			for(k=0;k<arr.length;k++) {
				System.out.println(arr[k]);
			}
			Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().forEach(System.out::println);
//			List<Integer> l = new ArrayList<>(Arrays.asList(arr).stream());
	}
}