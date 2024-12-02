package com.ashokit.dto;

public class Vehcile {
	private int vId;
	private String vName;
	private Double vPrice;
	public Vehcile(int vId, String vName, Double vPrice) {
		super();
		this.vId = vId;
		this.vName = vName;
		this.vPrice = vPrice;
	}
	public Vehcile() {

	}
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public Double getvPrice() {
		return vPrice;
	}
	public void setvPrice(Double vPrice) {
		this.vPrice = vPrice;
	}
	
	@Override
	public String toString() {
		return "Vehcile [vId=" + vId + ", vName=" + vName + ", vPrice=" + vPrice + "]";
	}
	

}
