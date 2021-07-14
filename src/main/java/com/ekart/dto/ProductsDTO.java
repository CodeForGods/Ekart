package com.ekart.dto;

public class ProductsDTO {
	
	private Integer prodId;
	private String prodName;
	private Float prodPrice;
	private Integer quantity;
	private String prodDescription;
	private String prodImage;
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Float getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Float prodPrice) {
		this.prodPrice = prodPrice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getProdDescription() {
		return prodDescription;
	}
	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}
	public String getProdImage() {
		return prodImage;
	}
	public void setProdImage(String prodImage) {
		this.prodImage = prodImage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prodDescription == null) ? 0 : prodDescription.hashCode());
		result = prime * result + ((prodId == null) ? 0 : prodId.hashCode());
		result = prime * result + ((prodImage == null) ? 0 : prodImage.hashCode());
		result = prime * result + ((prodName == null) ? 0 : prodName.hashCode());
		result = prime * result + ((prodPrice == null) ? 0 : prodPrice.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
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
		ProductsDTO other = (ProductsDTO) obj;
		if (prodDescription == null) {
			if (other.prodDescription != null)
				return false;
		} else if (!prodDescription.equals(other.prodDescription))
			return false;
		if (prodId == null) {
			if (other.prodId != null)
				return false;
		} else if (!prodId.equals(other.prodId))
			return false;
		if (prodImage == null) {
			if (other.prodImage != null)
				return false;
		} else if (!prodImage.equals(other.prodImage))
			return false;
		if (prodName == null) {
			if (other.prodName != null)
				return false;
		} else if (!prodName.equals(other.prodName))
			return false;
		if (prodPrice == null) {
			if (other.prodPrice != null)
				return false;
		} else if (!prodPrice.equals(other.prodPrice))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ProuctsDTO [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", quantity="
				+ quantity + ", prodDescription=" + prodDescription + ", prodImage=" + prodImage + "]";
	}
	
	
	

}
