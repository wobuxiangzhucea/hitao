package com.utils;

/**
 * 分页工具类
 * @author Administrator
 *
 * @param <T>
 */
public class PageUtil<T> {
	private int code;
	private String msg;
	private long count;
	private T data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "PageUtil [code=" + code + ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
	}
	
}
