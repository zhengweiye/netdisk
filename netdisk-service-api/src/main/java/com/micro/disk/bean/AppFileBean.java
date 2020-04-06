package com.micro.disk.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class AppFileBean implements Serializable {
	private String id;
	private String appid;
	private String businessid;
	private String businesstag;
	private String pid;
	private String filename;
	private long filesize;
	private String filesuffix;
	private String fileicon;//base64
	private String typecode;
	private String filemd5;
	private Integer filetype;//0文件夹，1文件
	private Integer delstatus;//0正常，1删除
	private String createuserid;
	private String createusername;
	private Date createtime;
}
