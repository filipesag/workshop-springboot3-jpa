package com.educandoweb.course.entities;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIED(3), DELIVERED(4), CANCELED(5);

	// cód. do tipo enum
	private int code;

	// contrutor do tipo enum
	private OrderStatus(int code) {
		this.code = code;
	}

	// método para acessar o cód.
	public int getCode() {
		return code;
	}

	// método para converter int para tipo enum
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code.");	
	}

}
