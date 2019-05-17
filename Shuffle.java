package cn.tedu.day01;

import java.util.Random;
/**
 * 一整副扑克牌随机排序
 * 
 *
 */
public class Shuffle {
public static void main(String[] args) {
	Random   random=new  Random();
	String []  arr= {"黑桃A","黑桃2","黑桃3","黑桃4","黑桃5",
			"黑桃6","黑桃7","黑桃8","黑桃9","黑桃10","黑桃J","黑桃Q","黑桃K",
			"红桃A","红桃2","红桃3","红桃4","红桃5","红桃6","红桃7","红桃8","红桃9",
			"红桃10","红桃J","红桃Q","红桃K",
			"方块A","方块2","方块3","方块4","方块5","方块6",
			"方块7","方块8","方块9","方块10","方块J","方块Q","方块K",
			"草花A","草花2","草花3","草花4","草花5","草花6","草花7",
			"草花8","草花9","草花10","草花J","草花Q","草花K",
			"大怪"," 小怪"};
	for(int i=arr.length-1;i>0;i--) {
		int  j=random.nextInt(i);
		String  t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
		
	}
	//System.out.print(Arrays.toString(arr));
	
	for (int  i =0; i < 5; i++) {
		for(int  j=0;j<10;j++) {
			System.out.print("\t"+arr[i*10+j]+",");
		}
		System.out.println();
	}
	System.out.println("\t"+arr[50]+","+"\t"+arr[51]+","+"\t"+arr[52]+","+"\t"+arr[53]);
}
}
