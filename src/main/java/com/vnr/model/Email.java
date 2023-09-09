package com.vnr.model;

public class Email {

	private String to;
	
	private String subject;
	
	private String content;
	
	public String getTo() {
		return to;
	}

	

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return "Email [to=" + to + ", subject=" + subject + ", content=" + content + "]";
	}
}
