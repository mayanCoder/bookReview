package com.mayan.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.mayan.entity.BookReview;

@Repository
public interface BookReviewDao {

	public BookReview getBookReviewById(@Param("reviewID")int reviewID);
	public BookReview getBookReviewByTitle(@Param("title")String title);
	public List<BookReview> getBookReviewByUserID(@Param("userID")int userID);
	public List<BookReview> getBookReviewByBookName(@Param("bookName")String bookName);
	public void deleteByID(@Param("reviewID")int reviewID);
	public void updateByID(BookReview bookReview);
	public void writeReview(BookReview bookReview);
	
}
