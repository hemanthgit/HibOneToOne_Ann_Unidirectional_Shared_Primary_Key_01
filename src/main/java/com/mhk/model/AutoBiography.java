package com.mhk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AUTOBIOGRAPHY")
public class AutoBiography {

	@Id
    @Column(name="author_id")
    private Long authorId;
     
	@Column(name="book_name")
    private String bookName;

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "AutoBiography [authorId=" + authorId + ", bookName=" + bookName + "]";
	}
	
	
}
