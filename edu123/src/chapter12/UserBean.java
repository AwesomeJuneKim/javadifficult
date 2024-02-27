package chapter12;

import java.io.Serializable;

public class UserBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;// 추가됨
	private String id;
	private String name;
	private String tel;
	private String address;// generator constructor 사용
	
	public UserBean() {
		
	}
	public UserBean(String id, String name, String tel, String address) {
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		this.tel=tel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	//source-> toString 추가없이 제너레이트
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", tel=" + tel + ", address=" + address + "]";
	}
	
	}



