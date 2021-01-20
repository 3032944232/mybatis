package org.student.enyity;

public class StudentAndCard {
	private int stuno;
	private String stuname;
	private int stuage;
	private int cardid ;
	private String cardname;
	
	public StudentAndCard() {
	}
	
	public StudentAndCard(int stuno, String stuname, int stuage, int cardid, String cardname) {
		this.stuno = stuno;
		this.stuname = stuname;
		this.stuage = stuage;
		this.cardid = cardid;
		this.cardname = cardname;
	}
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getStuage() {
		return stuage;
	}
	public void setStuage(int stuage) {
		this.stuage = stuage;
	}
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
		return "StudentAndCard [stuno=" + stuno + ", stuname=" + stuname + ", stuage=" + stuage + ", cardid=" + cardid
				+ ", cardname=" + cardname + "]";
	}
	
}
