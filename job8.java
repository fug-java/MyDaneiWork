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
		 * 1.ʹ���ļ�������myfile.txt�ļ�Ϊmyfile_cp.txt
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
		 * 2.ʹ�û���������myfile.txt�ļ�Ϊmyfile_cp2.txt
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
		 * 3.Ҫ���û�����̨�����������Ա������������5������Ȼ����������Ա����Ϣ��ÿ��Ϊ
		 * һ��Ա����Ϣ����ʽ��:����,25,��,5000,2006-3-18
		 * Ȼ�󽫸ö���д�뵽�ļ�<name>.obj�����浽��ǰ��Ŀ��Ŀ¼�У�����:����.obj��
		 *
		 */
//		System.out.println("����Ա������,����5��");
//		int number = new Scanner(System.in).nextInt();
//		if (number<5) {
//			number = 5;
//		}
//		System.out.println("����Ա����Ϣ");
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
		 * 4.��ȡ��ǰ��Ŀ��Ŀ¼�����к�׺Ϊ.obj���ļ�������ЩEmp�����ȡ����
		 * �����뵽һ��List�����У�Ȼ����Ա�����ʴӶൽ�ٵ�˳���������Ա����Ϣ
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
		 * 5.ʹ���ַ������Ƶ�ǰ�����Դ�ļ�����ǰ��Ŀ��Ŀ¼�¡�
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
		 * 6.���±����ܣ�����Ҫ���û�����һ���ļ������������ļ�����������
		 * Ȼ��ͨ������̨�����ÿһ���ַ���������д�뵽���ļ��У���
		 * ʹ��GBK���뱣�档��������ַ���Ϊ"exit"ʱ�˳�����
		 *
		 */
		
		System.out.println("�������ļ���:");
		String fileName = new Scanner(System.in).nextLine();
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		
		System.out.println("��Ϊ�ļ��������,����Ϊ��׼,��exit����");
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
		 * 7.Ҫ���û�����һ���ļ������ļ�Ӧ����Test07�������ɵ��ļ���Ȼ�󽫸��ļ��������ַ���ȡ
		 * ����������UTF-8����д�뵽��һ���ļ��У�ʵ���ļ�ת�빤�������ļ�ȡ����ʽ:ԭ�ļ���_utf.txt��
		 *
		 */
		
//		System.out.println("����Ҫת����ļ�");
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
 * ����equals������Ҫ�����֣����䣬�Ա�н�ʶ���ͬ������Ϊ����һ�¡�
 * ʵ�����л��ӿڣ�������汾�š�
 *
 */
class EmpOne implements Serializable{
	
	/**
	 *  serialVersionUID �汾��
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
		return "����:" + name + ",����:" + age + ",�Ա�:" + gender + ",����:" + salary + ",��ְʱ��:"
				+ new SimpleDateFormat("yyyy-MM-dd").format(hiredate) ;
	}
	
	
	
}
