package com.job01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class job9 {

	
	
	public static void main(String[] args) throws Exception {
		
		/*
		 * 
		 * 1�ҳ�{1,5,46,6},{3,41,68,24,6},{4,82,1,88,62},{5,87,44}��ÿһ��һά����ڶ����������������Բ������ظ���
		 * 
		 */


//			int[] i1 = {1,5,46,6};
//			int[] i2 = {3,41,68,24,6};
//			int[] i3 = {4,82,1,88,62};
//			int[] i4 = {5,87,44};
//			
//			System.out.println(maxOfNumberTwo(i1));
//			System.out.println(maxOfNumberTwo(i2));
//			System.out.println(maxOfNumberTwo(i3));
//			System.out.println(maxOfNumberTwo(i4));
		
		/*
		 * 2.��text1��text2�ı����׵�����ͬ�ľ��ӷ���һ�𣬲��ҽ����Ӱ����ַ���you�������ִ�Сд�����ֵĴ����ӵ͵��������������text3�С�
		 * 
		 * text1:
		 *	make yourself at home
		 *	how about going to a movie
		 *	i will be more careful 
		 *	you life is your own affair
		 *	
		 *	text2:
		 *	i miss you 
		 *	your xiaomi phone is beautiful
		 *  make the oxygen  for you 
		 *  how are you doing
		 *	
		 */		
			
//		List<String> list1 = new ArrayList<>();
//		
//		List<String> list2 = new ArrayList<>();
//		
//		List<String> list3 = new ArrayList<>();
//		
//		String path1 = "text1.txt";
//		
//		String path2 = "text2.txt";
//		
//		String path3 = "text3.txt";
//		
//		String str = "you";
//		
//		readerStream(list1, path1);
//		readerStream(list2, path2);
//		
//		Collections.sort(list1);
//		Collections.sort(list2);
//		
//		//�ǳ���ʵ�õ�ƴ�ӷ���,�����Ƽ�
//		for (int i = 0; i < list1.size(); i++) {
//			list3.add(list1.get(i)+" "+list2.get(i));
//		}
//		
//		sortListOfStr(list3,str);
//		
//		
//		writerStream(list3,path3);
//		
//		
//		for (String string : list3) {
//			
//			System.out.println(string);
//			
//		}
		
		
		/*
		 * 
		 * 3.���϶���list<sting>,
		 *      List.add(������������
		 *      List.add(�����ġ�)��
		 *      List.add(�����塱)��
		 *      List.add(��������)��
		 *      List.add(��������)��
		 *      List.add(�����ġ�)��
		 *	�ʣ����дһ�γ���ȥ��list�е��ظ����ݣ�
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
		 * 
		 * 4.�ʣ��ַ�����aa��bb,cc........zz��,���дһ�δ������������еĵ����ַ���
		 *Ԥ��Ч����aa
		 *        bb
		 *        ...
		 *        zzz
		 */
	
//		String str = "aa,bb,cc........zz";
//		
//		str = str.replaceAll("\\.+", ",\\.\\.\\.,");
//		
//		String[] arr = str.split(",");
//		
//		for (String s : arr) {
//			System.out.println(s);
//		}
		
		/*
		 *	5.����3���̣߳�Ҫ�����߳���������̵߳����֣��Լ�ִ��˳��
		 *	���磬�߳�a���߳�b���߳�c��
		 *	Ҫ���������ǣ�a1b2c3;
		 * 
		 */
		
//		Thread t1 = new Thread(){
//			@Override
//			public void run() {
//				this.setName("a1");
//				System.out.print(this.getName());
//			}
//		};
//		Thread t2 = new Thread(){
//			@Override
//			public void run() {
//				this.setName("b2");
//				System.out.print(this.getName());
//			}
//		};
//		Thread t3 = new Thread(){
//			@Override
//			public void run() {
//				this.setName("c3");
//				System.out.print(this.getName());
//			}
//		};
//		t1.start();
//		t1.join();
//		t2.start();
//		t2.join();
//		t3.start();
		
		
		
	}
	
	
		
	
	
	public static List<String> readerStream(List<String> list ,String path) throws Exception{
		
		File file = new File(path);
		
		if (!file.exists()) {
			System.out.println("�ļ�������");
			return list;
		}
		
		FileInputStream fis = new FileInputStream(path);
		
		InputStreamReader isr = new InputStreamReader(fis,"GBK");
		
		BufferedReader br = new BufferedReader(isr);
		
		String s = null;
		
		while ((s = br.readLine()) != null) {
			list.add(s);
		}
		
		br.close();
		
		return list;
		
	}
	
	
	public static void writerStream(List<String> list, String path) throws Exception{
		
		FileOutputStream fos = new FileOutputStream(path);
		
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		PrintWriter pw = new PrintWriter(bw);
		
		for (String string : list) {
			pw.println(string);
		}
		
		pw.close();
		
		
		
	}
	
	public static int maxOfNumberTwo(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-2];
	}
	
	
	public static List<String> removeRepeat(List<String> list) {
		
		
		HashSet<String> h = new HashSet<>(list);
		
		list.clear();
		
		list.addAll(h);
		
		return list;
		
	}
	
	
	/**
	 * 
	 * @param ����ļ���
	 * @param ���ݵ��ַ���
	 * @return
	 */
	public static List<String> sortListOfStr(List<String> list,String str){
		
		
		Comparator<String> com = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				int a=0;
				int b=0;
				while (o1.contains(str)) {
					o1 = o1.replaceFirst(str, "faq");
					a++;
				}
				while (o2.contains(str)) {
					o2 = o2.replaceFirst(str, "faq");
					b++;
				}
				return a-b;
			}
		};
		
		Collections.sort(list,com);
		
		return list;
		
	}
	
	
	
	
}
