package com.job01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Stack;



public class job7 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		/*
		 * 1.����һ�����У�����Integer����Ԫ��1,2,3,4,5
		 * Ȼ��������в����ÿ��Ԫ��
		 *
		 */
//		LinkedList<Integer> list = new LinkedList<>();
//		Collections.addAll(list,1,2,3,4,5);
//		Iterator<Integer> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			System.out.print(iterator.next()+" ");
//		}
		
		
		
		/*
		 * 2.����һ��ջ������Integer����Ԫ��1,2,3,4,5
		 * Ȼ��������в����ÿ��Ԫ��
		 *
		 */
//		Stack<Integer> stack = new Stack<>();
//		
//		for (int i = 1; i <= 5; i++) {
//			stack.push(i);
//		}
//		while (!stack.isEmpty()) {
//			System.out.print(stack.pop()+" ");
//		}
		
		
		/*
		 * 3.Ҫ���û���������Ա����Ϣ����ʽΪ��
		 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
		 * ����:
		 * ����,25,��,5000,2006-02-15;����,26,Ů,6000,2007-12-24;...
		 * Ȼ��ÿ��Ա����Ϣ������Emp���󡣲����뵽һ��List�����С�
		 * ���Լ�������Ȼ�����ÿ��Ա����Ϣ��
		 * 
		 * �ٸ���Ա������ְʱ��������ְ�����ǰ������ں�
		 * ���ÿ��Ա������Ϣ��
		 *
		 */
//		System.out.println("����Ա������:");
//		int number = sc.nextInt();
//		Emp emp;
//		LinkedList<Emp> list = new LinkedList<Emp>();
//		for (int i = 0; i < number; i++) {
//			System.out.println("���Ա��:");
//			String s = new Scanner(System.in).next();
//			String[] str = s.split(",");
//			String name = str[0];
//			int age = Integer.parseInt(str[1]);
//			String gender = str[2];
//			double salary = Double.parseDouble(str[3]);
//			Date hiredate = sdf.parse(str[4]);
//			emp = new Emp(name, age, gender, salary, hiredate);
//			if (list.contains(emp)) {
//				System.out.println("�����˰�.");
//				--i;
//				continue;
//			}else {
//				list.add(emp);
//			}
//		}
//		//����ʱ������
//		Comparator<Emp> dateSort = new Comparator<Emp>() {
//			@Override
//			public int compare(Emp o1, Emp o2) {
//				Date date1 = o1.getHiredate();
//				Date date2 = o2.getHiredate();
//				if (date1.before(date2))
//					return 1;
//				return -1;
//			}
//		};
//		Collections.sort(list,dateSort);
//		for(Emp e : list){
//			System.out.println(e);
//		}
		
		
		
		
		/*
		 * 4.����һ��Map������ĳ��ѧ���ĳɼ�:
		 * �ڿ���̨�����ѧ���ɼ�����ʽ:
		 * ��Ŀ:�ɼ�;��Ŀ:�ɼ�;...
		 * ����:  
		 * ����:99;��ѧ:98;Ӣ��:97;����:96;��ѧ:95
		 * Ȼ���������ĳɼ���
		 * Ȼ�󽫻�ѧ�ĳɼ�����Ϊ96
		 * Ȼ��ɾ��Ӣ����һ�
		 * Ȼ�������Map�ֱ��ձ���key��Entry��value����ʽ�����Map��Ϣ��
		 *
		*/
		
//		Map<String, Integer> student = new HashMap<String, Integer>();
//		System.out.println("������ѧ���ɼ�,��: ����:99;��ѧ:98;Ӣ��:97;����:96;��ѧ:95  ,����exit�˳�");
//		while (true) {
//			String grades = new Scanner(System.in).nextLine();
//			if(!grades.equals("exit")){
//				String[] grade = grades.split(":");
//				student.put(grade[0], Integer.parseInt(grade[1]));
//			}else {
//				break;
//			}
//		}
		
//		//��������
//		student.put("����", 99);
//		student.put("��ѧ", 98);
//		student.put("Ӣ��", 97);
//		student.put("����", 96);
//		student.put("��ѧ", 95);
		
//		System.out.println("����ɼ�Ϊ:"+student.get("����"));
//		if (student.containsKey("��ѧ")) {
//			student.put("��ѧ", 96);
//		}
//		student.remove("Ӣ��");
//		
//		//key
//		Iterator<String> it = student.keySet().iterator();
//		while (it.hasNext()) {
//			String key = it.next();
//			int value = student.get(key);
//			System.out.println(key+":"+value);
//		}
//		for (String key : student.keySet()) {
//			System.out.println(key+":"+student.get(key));
//		}
		
		//Entry
//		Iterator<Entry<String, Integer>> it = student.entrySet().iterator();
//		while (it.hasNext()) {
//			Entry<String, Integer> next = it.next();
//			System.out.println(next.getKey()+":"+next.getValue());
//		}
//		for (Map.Entry<String,Integer> entry : student.entrySet()) {
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
		
		//value
//		Iterator<Integer> it = student.values().iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		
		/*
		 * 5.�������ַ���:
		 * ����:����;����:����;����:����;����:����;����:mike;����:jerry;����:jackson;ǰ��:green;ǰ��:nick;����:Ǯ��;����:alice
		 * ���������ַ���Ȼ��ͳ��ÿ��ְλ�ܹ�������?
		 * ʹ��Map����ͳ�ƵĽ��������key:ְλ,valueΪ��ְλ����
		 * Ȼ��ֱ������ְλ������(keySet),��ְλ����(entrySet)
		 *
		 */
//		String str = "����:����;����:����;����:����;����:����;����:mike;����:jerry;����:jackson;ǰ��:green;ǰ��:nick;����:Ǯ��;����:alice";
//		String[] job = str.split(";");
//		Map<String, Integer> hash = new HashMap<>();
//		for (int i = 0; i < job.length; i++) {
//			String[] position = job[i].split(":");
//			if (!hash.containsKey(position[0])) {
//				hash.put(position[0], 1);
//			} else {
//				hash.put(position[0], hash.get(position[0]) + 1);
//			}
//		}
//
//		for (String key : hash.keySet()) {
//			System.out.println("ְλ:" + key);
//		}
//		
//		for (Map.Entry<String,Integer> entry : hash.entrySet()) {
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
		
		
		
		
	}

}








/**
 * ����˽������:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//��ְʱ��
 * 
 * ���幹�췽�����Լ�����get,set����.
 * ����toString��������ʽ��:
 *    ����:����,����:25,�Ա�:��,н��:5000,��ְʱ��:2006-02-15
 * 
 * ����equals������Ҫ�������Լ�������ͬ������Ϊ����һ�¡�
 * 
 * ʵ��Comparable�ӿڣ�����д���󷽷�comparaTo()���ȽϹ���Ϊ����С����С��
 *
 */
class Emp implements Comparable<Emp>{
	
	private String name;
	private int age;
	private String gender;
	private double salary;
	private Date hiredate;
	
	
	public Emp() {
		super();
	}
	public Emp(String name, int age, String gender, double salary2, Date hiredate) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary2;
		this.hiredate = hiredate;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "����:" + name + ", ����:" + age + ", �Ա�:" + gender + ", н��" + salary + ", ��ְʱ��:"+ 
				new SimpleDateFormat("yyyy-MM-dd").format(hiredate);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.getAge()-o.getAge();
	}
	
	
	
	
	
	
	

}







