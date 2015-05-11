package com.kv.resource;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-4-30 上午 11:13:39
 *
 * @author kevin
 * @version 1.1
 */
public class FileResourceExample {

	public static void main(String[] args) {
		try {
			String filePath = "E:/Workspaces/NewSpaces/KvDemo/src/files/jvm_dump.txt";
			
			Resource res1  = new FileSystemResource(filePath);
			
			Resource res2 = new ClassPathResource("files/jvm_dump.txt");
			
//			InputStream input1 = res1.getInputStream();
//			InputStream input2 = res2.getInputStream();
			System.out.println("res1 : " + res1.getFilename());
			System.out.println("res2 : " + res2.getFilename());
			
			EncodedResource encRes = new EncodedResource(res2, "UTF-8");
			String content = FileCopyUtils.copyToString(encRes.getReader());
			System.out.println("\ncontent : ==>" + content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
