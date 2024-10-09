package com.spring;

public class Student {
		
		private int stid;
		private String firstName;
		private String lastName;
		
		public Student()
		{
			
		}

		public int getStid() {
			return stid;
		}

		public void setStid(int stid) {
			this.stid = stid;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		@Override
		public String toString() {
			return "Student [stid=" + stid + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		
		

	

}
