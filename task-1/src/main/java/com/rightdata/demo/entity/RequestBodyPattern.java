package com.rightdata.demo.entity;

public class RequestBodyPattern {

	private ConnectionDetails cd;
	private String pattern;
	private String catalog;
	public ConnectionDetails getCd() {
		return cd;
	}
	public void setCd(ConnectionDetails cd) {
		this.cd = cd;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getCatalog() {
		return catalog;
	}
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	
}