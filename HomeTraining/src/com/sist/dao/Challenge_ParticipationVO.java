package com.sist.dao;


/*
 * 
CHALLENGE_NO NOT NULL NUMBER        
CHALLENGE_ID NOT NULL VARCHAR2(500) 
 */
public class Challenge_ParticipationVO {
	private int challenge_no;
	private String challenge_id;
	public int getChallenge_no() {
		return challenge_no;
	}
	public void setChallenge_no(int challenge_no) {
		this.challenge_no = challenge_no;
	}
	public String getChallenge_id() {
		return challenge_id;
	}
	public void setChallenge_id(String challenge_id) {
		this.challenge_id = challenge_id;
	}
	
	
	
}
