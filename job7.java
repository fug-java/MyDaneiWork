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
		 * 1.创建一个队列，存入Integer类型元素1,2,3,4,5
		 * 然后遍历队列并输出每个元素
		 *
		 */
//		LinkedList<Integer> list = new LinkedList<>();
//		Collections.addAll(list,1,2,3,4,5);
//		Iterator<Integer> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			System.out.print(iterator.next()+" ");
//		}
		
		
		
		/*
		 * 2.创建一个栈，存入Integer类型元素1,2,3,4,5
		 * 然后遍历队列并输出每个元素
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
		 * 3.要求用户输入若干员工信息，格式为：
		 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
		 * 例如:
		 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
		 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
		 * 并对集合排序，然后输出每个员工信息。
		 * 
		 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
		 * 输出每个员工的信息。
		 *
		 */
//		System.out.println("输入员工个数:");
//		int number = sc.nextInt();
//		Emp emp;
//		LinkedList<Emp> list = new LinkedList<Emp>();
//		for (int i = 0; i < number; i++) {
//			System.out.println("添加员工:");
//			String s = new Scanner(System.in).next();
//			String[] str = s.split(",");
//			String name = str[0];
//			int age = Integer.parseInt(str[1]);
//			String gender = str[2];
//			double salary = Double.parseDouble(str[3]);
//			Date hiredate = sdf.parse(str[4]);
//			emp = new Emp(name, age, gender, salary, hiredate);
//			if (list.contains(emp)) {
//				System.out.println("换个人吧.");
//				--i;
//				continue;
//			}else {
//				list.add(emp);
//			}
//		}
//		//按照时间排序
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
		 * 4.创建一个Map，保存某个学生的成绩:
		 * 在控制台输入该学生成绩，格式:
		 * 科目:成绩;科目:成绩;...
		 * 例如:  
		 * 语文:99;数学:98;英语:97;物理:96;化学:95
		 * 然后输出物理的成绩。
		 * 然后将化学的成绩设置为96
		 * 然后删除英语这一项。
		 * 然后遍历该Map分别按照遍历key，Entry，value的形式输出该Map信息。
		 *
		*/
		
//		Map<String, Integer> student = new HashMap<String, Integer>();
//		System.out.println("请输入学生成绩,例: 语文:99;数学:98;英语:97;物理:96;化学:95  ,输入exit退出");
//		while (true) {
//			String grades = new Scanner(System.in).nextLine();
//			if(!grades.equals("exit")){
//				String[] grade = grades.split(":");
//				student.put(grade[0], Integer.parseInt(grade[1]));
//			}else {
//				break;
//			}
//		}
		
//		//测试数据
//		student.put("语文", 99);
//		student.put("数学", 98);
//		student.put("英语", 97);
//		student.put("物理", 96);
//		student.put("化学", 95);
		
//		System.out.println("物理成绩为:"+student.get("物理"));
//		if (student.containsKey("化学")) {
//			student.put("化学", 96);
//		}
//		student.remove("英语");
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
		 * 5.有下列字符串:
		 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
		 * 分析上述字符串然后统计每个职位总共多少人?
		 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
		 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
		 *
		 */
//		String str = "销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice";
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
//			System.out.println("职位:" + key);
//		}
//		
//		for (Map.Entry<String,Integer> entry : hash.entrySet()) {
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
		
		
		
		
	}

}








/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * 
 * 实现Comparable接口，并重写抽象方法comparaTo()，比较规则为年龄小的人小。
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
		return "姓名:" + name + ", 年龄:" + age + ", 性别:" + gender + ", 薪资" + salary + ", 入职时间:"+ 
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







