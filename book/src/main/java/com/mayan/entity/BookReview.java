package com.mayan.entity;
/**
 * �����
 * @author mayan
 *
 */
public class BookReview {
	private int reviewID;
	private String content;//���������
	private String title;//����б���
	public int getReviewID() {
		return reviewID;
	}
	public void setReviewID(int reviewID) {
		this.reviewID = reviewID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
