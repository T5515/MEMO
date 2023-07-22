package bean;

import java.io.Serializable;

public class MEMObean implements Serializable{
	
	//フィールド
	private String id;
	private String title;
	private String content;
	private StringBuilder pop;
	
	public String getid() {
		return id;
	}
	
	public void setid(String ID) {
		this.id = ID;
	}
	
	public String gettitle() {
		return title;
	}
	
	public void settitle(String Title) {
		this.title = Title;
	}
	
	public String getcontent() {
		return content;
	}
	
	public void setcontent(String Content) {
		this.content = Content;
	}
	
	public StringBuilder getpop() {
		return pop;
	}
	
	public void setpop(StringBuilder Pop) {
		this.pop = Pop;
	}
}