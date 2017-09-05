package com.frank.advance;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * mkdir��mkdirs��������
 * ʱ�䣺2017-09-05 11:06
 * ˵����1��java.io.File.mkdir()��java.io.File.mkdirs()�����ڴ���ָ��·�����ƶ�Ӧ��Ŀ¼��
 * ��java.io.File.mkdir()ֻ�ܴ���һ��Ŀ¼�Ҹ�Ŀ¼������ڣ������޷���ȷ����һ��Ŀ¼��
 * java.io.File.mkdir()���Դ����༶Ŀ¼����Ŀ¼��һ�����ڡ�
 * */

public class MkdirsAndMkdirTestMain {
	private static final String path1="path1";
	private static final String path2="path2/path2/";
	private static final String path3="path3";
	private static final String path4="path4/path4/";
	private static final String filePath1="file1.txt";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file1=new File(path1);
		if(!file1.exists()){
			file1.mkdir();
		}
		System.out.println(file1.getPath());
		
		File file2=new File(path2);
		if(!file2.exists()){
			file2.mkdir();
		}
		System.out.println(file2.getPath());
		
		File file3=new File(path3);
		if(!file3.exists()){
			file3.mkdirs();
		}
		System.out.println(file3.getPath());

		File file4=new File(path4);
		if(!file4.exists()){
			file4.mkdirs();
		}
		System.out.println(file4.getPath());
		
		File file4_1=new File(path4+filePath1);
		if(!file4_1.exists()){
			try {
				file4_1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(file4_1.getPath());
		
		try {
			PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(file4_1)));
			long current=System.currentTimeMillis();
			String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(current));
			pw.write("ʱ��:"+time);
			pw.println();
			pw.println("��ǰ�ļ�����·��:"+file4_1.getAbsolutePath());
			pw.write("��ǰ�ļ����·��:"+file4_1.getPath());
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}