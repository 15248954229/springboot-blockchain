package com.sjj.springboot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.common.hash.Hashing;
import com.sjj.springboot.pojo.Block;

public class BlockchainUtil {
	/**
	 * ���������hashֵ
	 * 
	 * @param block
	 *            ����
	 * @return
	 */
	public static String calculateHash(Block block) {
		String record = (block.getIndex()) + block.getTimestamp() + (block.getVac()) + block.getPrevHash();
		return Hashing.sha256().hashBytes(record.getBytes()).toString();
	}

	/**
	 * ���������
	 * 
	 * @param oldBlock
	 * @param vac
	 * @return
	 */
	public static Block generateBlock(Block oldBlock, int vac) {
		Block newBlock = new Block();
		newBlock.setIndex(oldBlock.getIndex() + 1);
		newBlock.setTimestamp(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		newBlock.setVac(vac);
		newBlock.setPrevHash(oldBlock.getHash());
		newBlock.setHash(calculateHash(newBlock));
		return newBlock;
	}

	/**
	 * У������ĺϷ��ԣ���Ч�ԣ�
	 * 
	 * @param newBlock
	 * @param oldBlock
	 * @return
	 */
	public static boolean isBlockValid(Block newBlock, Block oldBlock) {
		if (oldBlock.getIndex() + 1 != newBlock.getIndex()) {
			return false;
		}
		if (!oldBlock.getHash().equals(newBlock.getPrevHash())) {
			return false;
		}
		if (!calculateHash(newBlock).equals(newBlock.getHash())) {
			return false;
		}
		return true;
	}
}
