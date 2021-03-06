package com.sist.dao;

/*
 * CHALLENGE_NO NOT NULL NUMBER        
CATE         NOT NULL VARCHAR2(500) 
START_DAY    NOT NULL DATE          
TITLE        NOT NULL VARCHAR2(500) 
LIMIT        NOT NULL NUMBER        
POSTER                VARCHAR2(500) 
CONTENT               VARCHAR2(500) 
ID_LEADER    NOT NULL VARCHAR2(300) 
 */
import java.util.Date;

public class ChallengeVO {
	
	private int challenge_no;
	private String cate;
	private Date start_day;
	private String title;
	private int limit;
	private String poster;
	private String content;
	private String id_leader;
	public int getChallenge_no() {
		return challenge_no;
	}
	public void setChallenge_no(int challenge_no) {
		this.challenge_no = challenge_no;
	}
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public Date getStart_day() {
		return start_day;
	}
	public void setStart_day(Date start_day) {
		this.start_day = start_day;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getId_leader() {
		return id_leader;
	}
	public void setId_leader(String id_leader) {
		this.id_leader = id_leader;
	}
	

}
