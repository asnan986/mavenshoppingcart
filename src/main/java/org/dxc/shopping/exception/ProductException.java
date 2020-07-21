package org.dxc.shopping.exception;

public class ProductException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String productname;
	
	public ProductException() {
		super();
	}
	

	public ProductException(String productname) {
		super();
		this.productname = productname;
	}
	
	public String toString() {
		return " sorry!! the product  "+productname+ " is not available";
		
	}
	
	
	

}
