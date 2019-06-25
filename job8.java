package com.job01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class job8 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 1.使用文件流复制myfile.txt文件为myfile_cp.txt
		 *
		 */
//		File file = new File("myfile.txt");
//		if(!file.exists())file.createNewFile();
//		FileInputStream fis = new FileInputStream(file);
//		FileOutputStream fos = new FileOutputStream("myfile_cp.txt");
//		byte[] bye = new byte[1024];
//		int read;
//		while ((read = fis.read(bye)) != -1) {
//			fos.write(bye, 0, read);
//			fos.flush();
//		}
//		fis.close();
//		fos.close();
		
		
		
		
		
		/*
		 * 2.使用缓冲流复制myfile.txt文件为myfile_cp2.txt
		 *
		 */
//		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myfile.txt"));
//		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myfile_cp2.txt"));
//		byte[] bye = new byte[1024];
//		int read;
//		while ((read = bis.read(bye)) != -1) {
//			bos.write(bye, 0, read);
//			bos.flush();
//		}
//		bis.close();
//		bos.close();
		
		
		/*
		 * 3.要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
		 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
		 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
		 *
		 */
//		System.out.println("输入员工人数,至少5个");
//		int number = new Scanner(System.in).nextInt();
//		if (number<5) {
//			number = 5;
//		}
//		System.out.println("输入员工信息");
//		for (int i = 0; i < number; i++) {
//			String info = new Scanner(System.in).next();
//			String[] names = info.split(",");
//			String fileName = names[0]+".obj";
//			FileOutputStream fos = new FileOutputStream(fileName);
//			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
//			BufferedWriter bw = new BufferedWriter(osw);
//			PrintWriter pw = new PrintWriter(bw);
//			pw.println(info);
//			pw.flush();
//			pw.close();
//		}
		
		
		
		
		/*
		 * 4.读取当前项目根目录下所有后缀为.obj的文件，将这些Emp对象读取出来
		 * 并存入到一个List集合中，然后按照员工工资从多到少的顺序依次输出员工信息
		 *
		 */
		
//		File file = new File("./");
//		List<EmpOne> list = new LinkedList<>();
//		EmpOne empOne ;
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		File[] files = file.listFiles(new FileFilter() {
//			@Override
//			public boolean accept(File pathname) {
//				return pathname.getName().endsWith(".obj");
//			}
//		});
//		
//		for (File f : files) {
//			FileInputStream fis = new FileInputStream(f);
//			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
//			BufferedReader br = new BufferedReader(isr);
//			
//			String infos = null ;
//			infos = br.readLine();
//			br.close();
//			
//			String[] info = infos.split(",");
//			String name = info[0];
//			int age = Integer.parseInt(info[1]);
//			String gender = info[2];
//			int salary = Integer.parseInt(info[3]);
//			Date hiredate = sdf.parse(info[4]);
//			empOne = new EmpOne(name, age, gender, salary, hiredate);
//			list.add(empOne);
//		}
//		
//		Comparator<EmpOne> salarySort = new Comparator<EmpOne>() {
//			@Override
//			public int compare(EmpOne o1, EmpOne o2) {
//				if(o1.getSalary()>o2.getSalary())
//					return -1;
//				return 1;
//			}
//		};
//		Collections.sort(list,salarySort);
//		
//		for(EmpOne e : list){
//			System.out.println(e);
//		}
		
		
		/*
		 * 5.使用字符流复制当前程序的源文件到当前项目根目录下。
		 *
		 */
		
//		job8 job = new job8();
//		String path = "src\\"+job.getClass().getName();
//		path = path.replace(".", "\\")+".java";
//		String file = path.substring(path.lastIndexOf("\\")+1);
//		FileInputStream fis = new FileInputStream(file);
//		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
//		BufferedReader br = new BufferedReader(isr);
//		FileOutputStream fos = new FileOutputStream(file);
//		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
//		BufferedWriter bw = new BufferedWriter(osw);
//		PrintWriter pw = new PrintWriter(bw);
//		String s = null;
//		while ((s = br.readLine()) != null) {
//			pw.println(s);
//		}
//		br.close();
//		pw.close();
		
		
		
		/*
		 * 6.记事本功能，首先要求用户输入一个文件名，并将该文件创建出来，
		 * 然后通过控制台输入的每一行字符串都按行写入到该文件中，并
		 * 使用GBK编码保存。当输入的字符串为"exit"时退出程序。
		 *
		 */
		
		System.out.println("请输入文件名:");
		String fileName = new Scanner(System.in).nextLine();
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		
		System.out.println("请为文件添加内容,以行为标准,按exit结束");
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		while (true) {
			String line = new Scanner(System.in).nextLine();
			if (line.equals("exit")) {
				break;
			}else{
				
			}
		}
		
		
		
		
		
		/*
		 * 7.要求用户输入一个文件，该文件应当是Test07程序生成的文件，然后将该文件中所有字符读取
		 * 出来，并以UTF-8编码写入到另一个文件中，实现文件转码工作，该文件取名格式:原文件名_utf.txt。
		 *
		 */
		
//		System.out.println("输入要转码的文件");
//		String file  = new Scanner(System.in).nextLine();
//		String[] str = file.split("\\.");
//		String encodeFileName = str[0]+"_utf"+"."+str[1];
//		
//		FileInputStream fis = new FileInputStream(file);
//		InputStreamReader isr = new InputStreamReader(fis,"GBK");
//		BufferedReader br = new BufferedReader(isr);
//		FileOutputStream fos = new FileOutputStream(encodeFileName);
//		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
//		BufferedWriter bw = new BufferedWriter(osw);
//		PrintWriter pw = new PrintWriter(bw);
//		String s = null;
//		
//		while ((s = br.readLine()) != null) {
//			pw.println(s);
//		}
//		br.close();
//		pw.close();
		
		
		
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
 * 定义equals方法，要求名字，年龄，性别，薪资都相同，则认为内容一致。
 * 实现序列化接口，并定义版本号。
 *
 */
class EmpOne implements Serializable{
	
	/**
	 *  serialVersionUID 版本号
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private String gender;
	private int salary;
	private Date hiredate;
	
	public EmpOne() {
		super();
	}
	public EmpOne(String name, int age, String gender, int salary, Date hiredate) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
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
		EmpOne other = (EmpOne) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
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
	public int getSalary() {
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
	public String toString() {
		return "姓名:" + name + ",年龄:" + age + ",性别:" + gender + ",工资:" + salary + ",入职时间:"
				+ new SimpleDateFormat("yyyy-MM-dd").format(hiredate) ;
	}
	
	
	
}
