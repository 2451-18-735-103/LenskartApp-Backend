package com.capgemini.lenskart.dto;

public class CartDTO {
	
	private int pid;
	private int cid;
	private int cartid;
	private int quantity;
//	private int paymentId;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
//	public int getPaymentId() {
//		return paymentId;
//	}
//	public void setPaymentId(int paymentId) {
//		this.paymentId = paymentId;
//	}
			
}
