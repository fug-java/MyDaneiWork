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
		 * 1�ҳ�{1,5,46,6},{3,41,68,24,6},{4,82,1,88,62},{5,87,44}��ÿһ��һά����ڶ����������������Բ������ظ���
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
		 * 2.��text1��text2�ı����׵�����ͬ�ľ��ӷ���һ�𣬲��ҽ����Ӱ����ַ���you�������ִ�Сд�����ֵĴ����ӵ͵��������������text3�С�
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
		 * 1.�ʣ��ַ�����aa��bb,cc........zz��,���дһ�δ�������ַ����еĵ����ַ���
			Ԥ��Ч����aa
		          bb
		          ...
		          zzz
		          
		 */
		
		
		/*
		 * 2.���϶���list<sting>,
		       List.add(������������
		       List.add(�����ġ�)��
		       List.add(�����塱)��
		       List.add(��������)��
		       List.add(��������)��
		       List.add(�����ġ�)��
				�ʣ����дһ�γ���ȥ��list�е��ظ����ݣ�
		 */
		
//		List<String> lists = new LinkedList<>();
//		lists.add("����");
//		lists.add("����");
//		lists.add("����");
//		lists.add("����");
//		lists.add("����");
//		lists.add("����");
//		
//		removeRepeat(lists);
//		
//		for (String string : lists) {
//			System.out.println(string);
//		}
		
		
		
		
		/*
		 * 3.����3���̣߳�Ҫ�����߳���������̵߳����֣��Լ�ִ��˳��
			���磬�߳�a���߳�b���߳�c��
			Ҫ���������ǣ�a1b2c3;
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
