package com.ekart.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class SellerDTO {
	private Integer sellerId;
	private String sellerName;
	private String sellerEmail;
	private String sellerAddress;
	private String sellerPassword;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="seller_id")
	private List<ProductsDTO> products;
	
	public List<ProductsDTO> getProducts() {
		return products;
	}
	public void setProducts(List<ProductsDTO> products) {
		this.products = products;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	public String getSellerAddress() {
		return sellerAddress;
	}
	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}
	public String getSellerPassword() {
		return sellerPassword;
	}
	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sellerAddress == null) ? 0 : sellerAddress.hashCode());
		result = prime * result + ((sellerEmail == null) ? 0 : sellerEmail.hashCode());
		result = prime * result + ((sellerId == null) ? 0 : sellerId.hashCode());
		result = prime * result + ((sellerName == null) ? 0 : sellerName.hashCode());
		result = prime * result + ((sellerPassword == null) ? 0 : sellerPassword.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SellerDTO other = (SellerDTO) obj;
		if (sellerAddress == null) {
			if (other.sellerAddress != null)
				return false;
		} else if (!sellerAddress.equals(other.sellerAddress))
			return false;
		if (sellerEmail == null) {
			if (other.sellerEmail != null)
				return false;
		} else if (!sellerEmail.equals(other.sellerEmail))
			return false;
		if (sellerId == null) {
			if (other.sellerId != null)
				return false;
		} else if (!sellerId.equals(other.sellerId))
			return false;
		if (sellerName == null) {
			if (other.sellerName != null)
				return false;
		} else if (!sellerName.equals(other.sellerName))
			return false;
		if (sellerPassword == null) {
			if (other.sellerPassword != null)
				return false;
		} else if (!sellerPassword.equals(other.sellerPassword))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SellerDTO [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerEmail=" + sellerEmail
				+ ", sellerAddress=" + sellerAddress + ", sellerPassword=" + sellerPassword + "]";
	}
	
	
}
