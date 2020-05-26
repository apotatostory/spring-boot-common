package com.example.model;

import java.util.List;

import com.example.vo.OrderVo;

public class OrderResponse {
	private OrderVo product;

	private List<OrderVo> products;

	public OrderVo getProduct() {
		return product;
	}

	public void setProduct(OrderVo product) {
		this.product = product;
	}

	public List<OrderVo> getProducts() {
		return products;
	}

	public void setProducts(List<OrderVo> products) {
		this.products = products;
	}

}
