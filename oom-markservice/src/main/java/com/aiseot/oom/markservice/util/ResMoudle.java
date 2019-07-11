package com.aiseot.oom.markservice.util;


public class ResMoudle {
	private int code;
	private String message;
	private boolean success;
	private Object object;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "ResMoudle{" +
				"code=" + code +
				", message='" + message + '\'' +
				", success=" + success +
				", object=" + object +
				'}';
	}

	public ResMoudle(int code, String message, boolean success, Object object) {
		super();
		this.code = code;
		this.message = message;
		this.success = success;
		this.object = object;
	}
	public ResMoudle() {}
	
	
	

}
