package cn.tedu.day01;

public class card {

	public static void main(String[] args) {
		String[]  arr1= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[]  arr2= {"黑桃","红桃","草花","方块"};
        for(int  i=0;i<arr1.length;i++) {
        	for(int  j=0;j<arr2.length;j++) {
        		System.out.print("\t"+arr2[j]+arr1[i]);
        	}
        	System.out.println();
        }
        System.out.println("\t"+"大怪"+"\t"+"小怪");
	}

}
