package com.micro.chain.handler;

import java.util.List;

import com.micro.config.RedisChunkTemp;
import com.micro.model.DiskMd5;

public interface FiledealStrategy {
	/**
	 * 文件处理
	 * @param fileid
	 * @param filemd5
	 * @param temps
	 */
	public void deal(String fileid,String filemd5,List<RedisChunkTemp> temps);
}
