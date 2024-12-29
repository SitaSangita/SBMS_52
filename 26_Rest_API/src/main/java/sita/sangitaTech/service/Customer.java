package sita.sangitaTech.service;

public class Customer {
	private Integer cId;
	private String name;
	private Long phno;

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", name=" + name + ", phno=" + phno + "]";
	}

}
