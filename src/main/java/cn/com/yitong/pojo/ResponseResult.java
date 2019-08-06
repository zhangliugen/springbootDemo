package cn.com.yitong.pojo;

public class ResponseResult {
	public Integer status;
	public String msg;
	public Object data;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public ResponseResult(Integer status, String msg, Object data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	public ResponseResult(Object data) {
		this.status = 200;
		this.msg = "交易成功";
		this.data = data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public static ResponseResult ok(Object data) {
		return new ResponseResult(data);
	}
}
