package com.ekart.dto;

public class UserDTO {
		private Integer userId;
		private String userName;
		private String userEmail;
		private String userPassword;
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
			result = prime * result + ((userId == null) ? 0 : userId.hashCode());
			result = prime * result + ((userName == null) ? 0 : userName.hashCode());
			result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
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
			UserDTO other = (UserDTO) obj;
			if (userEmail == null) {
				if (other.userEmail != null)
					return false;
			} else if (!userEmail.equals(other.userEmail))
				return false;
			if (userId == null) {
				if (other.userId != null)
					return false;
			} else if (!userId.equals(other.userId))
				return false;
			if (userName == null) {
				if (other.userName != null)
					return false;
			} else if (!userName.equals(other.userName))
				return false;
			if (userPassword == null) {
				if (other.userPassword != null)
					return false;
			} else if (!userPassword.equals(other.userPassword))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "UserDTO [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail
					+ ", userPassword=" + userPassword + "]";
		}
		
		
}
