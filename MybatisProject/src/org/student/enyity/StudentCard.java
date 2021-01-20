package org.student.enyity;

public class StudentCard {
	
	private int cardid ;
	private String cardname;
	
	public int getCardid() {
		return cardid;
	}
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	@Override
	public String toString() {
		return "cardid=" + cardid + ", cardname=" + cardname + "]";
	}
}
