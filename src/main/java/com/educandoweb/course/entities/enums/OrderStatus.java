package com.educandoweb.course.entities.enums;

public enum OrderStatus {
	
	//Esses valores estão sendo atrelados para que haja um padrão numérico
	//E que não venha apresentar nenhum conflito ao ser inserido no banco
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	//Construtor da classe enum
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if( value.getCode() == code ) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
