package com.zxg.util;

import java.awt.Image;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

/**
 * 图片压缩
 * @author slz 
 * 2013-8-29 上午09:09:13
 */
public class ReaderFile {
	
	/**
	 * 图片压缩
	 * @param oldFile 文件路径
	 * @param width  压缩后的宽度
	 * @param height  压缩后的高度
	 * @param quality  锐化程度，图片质量0-1f 
	 * @param smallIcon  压缩成功后的新名词，不要带后缀
	 * @param percentage  是否等比例缩放
	 * @return
	 */
	public static String doCompress(String oldFile, int width, int height, float quality, String smallIcon, boolean percentage) {
		   if (oldFile != null && width > 0 && height > 0) {
			   Image srcFile=null;
			   String newImage = null;
			   try {
				   File file = new File(oldFile);
				   // 文件不存在
				   if (!file.exists()) {
					   return null;
				   }
				   // 读取图片信息
				   srcFile = ImageIO.read(file);
				   int new_w = width;
				   int new_h = height;
				   if (percentage) {
					   // 为等比缩放计算输出的图片宽度及高度
					   double rate1 = ((double) srcFile.getWidth(null)) / (double) width + 0.1;
					   double rate2 = ((double) srcFile.getHeight(null)) / (double) height + 0.1;
					   double rate = rate1 > rate2 ? rate1 : rate2;
					   new_w = (int) (((double) srcFile.getWidth(null)) / rate);
					   new_h = (int) (((double) srcFile.getHeight(null)) / rate);
				   }
				   // 宽高设定
				   BufferedImage tag = new BufferedImage(new_w, new_h, BufferedImage.TYPE_INT_RGB);
				   tag.getGraphics().drawImage(srcFile, 0, 0, new_w, new_h, null);

				   // 压缩后的文件名
				   String filePrex = oldFile.substring(0, oldFile.lastIndexOf('.'));
				   newImage = filePrex + smallIcon + oldFile.substring(filePrex.length());
				   
				   // 压缩之后临时存放位置
				   FileOutputStream out = new FileOutputStream(newImage);

				   JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
				   JPEGEncodeParam jep = JPEGCodec.getDefaultJPEGEncodeParam(tag);

				   // 压缩质量
				   jep.setQuality(quality, true);
				   encoder.encode(tag, jep);

				   out.close();

			   } catch (FileNotFoundException e) {
				   e.printStackTrace();
			   } catch (IOException e) {
				   e.printStackTrace();
			   }finally{
				   srcFile.flush();
			   }
			   return newImage;
		   } else {
			   return null;
		   }
	}
	
	public static void main(String[] args) {
		String fileName = "d:/sun.jpg";
		
		doCompress(fileName, 150, 150, 1f, "004", true);
	}

}
