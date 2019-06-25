package com.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class job9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 1找出{1,5,46,6},{3,41,68,24,6},{4,82,1,88,62},{5,87,44}中每一个一维数组第二大的数并输出，可以不考虑重复。
		 */
//		int[] i1 = {1,5,46,6};
//		int[] i2 = {3,41,68,24,6};
//		int[] i3 = {4,82,1,88,62};
//		int[] i4 = {5,87,44};
//		
//		System.out.println(maxOfNumberTwo(i1));
//		System.out.println(maxOfNumberTwo(i2));
//		System.out.println(maxOfNumberTwo(i3));
//		System.out.println(maxOfNumberTwo(i4));
		
		
		/*
		 * 2.在text1，text2文本中首单词相同的句子放在一起，并且将句子按照字符串you（不区分大小写）出现的次数从低到高排序，再输出到text3中。
			text1:
			make yourself at home 
			how about going to a movie
			i will be more careful 
			you life is your own affair
			
			text2:
			i miss you 
			your xiaomi phone is beautiful
			make the oxygen  for you 
			how are you doing
		 */
		
//		List<String> list = new ArrayList<>();
//		
//		File file1 = new File("test1.txt");
//		File file2 = new File("test2.txt");
//		
//		liu(list, file1);
//		liu(list, file2);
//		
//		Collections.sort(list);
//		
//		int count = 0;
//		
//		for (int i = 0; i<list.size(); i++) {
//			if (list.get(count).charAt(0) == list.get(count+1).charAt(0)) {
//				String str = list.get(count)+" "+list.get(count+1);
//				list.remove(count+1);
//				list.set(count, str);
//			}else {
//				count++;
//			}
//		}
//		
//		for (String string : list) {
//			System.out.println(string);
//		}
		
		
		
		/*
		 * 1.问：字符串“aa，bb,cc........zz”,请简写一段代码输出字符串中的单个字符：
			预期效果：aa
		          bb
		          ...
		          zzz
		          
		 */
		
		
		/*
		 * 2.集合对象list<sting>,
		       List.add(“张三”）；
		       List.add(“李四”)；
		       List.add(“王五”)；
		       List.add(“赵六”)；
		       List.add(“张三”)；
		       List.add(“李四”)；
				问：请编写一段程序去除list中的重复数据；
		 */
		
//		List<String> lists = new LinkedList<>();
//		lists.add("张三");
//		lists.add("李四");
//		lists.add("王五");
//		lists.add("赵六");
//		lists.add("张三");
//		lists.add("李四");
//		
//		removeRepeat(lists);
//		
//		for (String string : lists) {
//			System.out.println(string);
//		}
		
		
		
		
		/*
		 * 3.创建3个线程，要求在线程体中输出线程的名字，以及执行顺序；
			例如，线程a；线程b，线程c；
			要求输出结果是：a1b2c3;
		 */
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				Thread name = Thread.currentThread();
				System.out.println(name.getName());
			}
		};
		
		t1.start();
		
	}
	
	
	
	public static int maxOfNumberTwo(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-2];
	}
	
	
	public static List<String> liu(List<String> list , File file) throws Exception{
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		while ((s = br.readLine()) != null) {
			list.add(s);
		}
		br.close();
		return list;
	}
	
	
	public static List<String> removeRepeat(List<String> list) {
		
		
		HashSet<String> h = new HashSet<>(list);
		
		list.clear();
		
		list.addAll(h);
		
		return list;
		
	}
	
	
	
	
	
	
	
	
	
	

}
