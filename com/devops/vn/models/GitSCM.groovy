package com.devops.vn.models

class GitSCM extends Object{

	String gitURL;
	String token;
	String branch;

	public String getGitURL() {
		return this.gitURL;
	}
	
	public void setGitURL(String gitURL) {
		this.gitURL = gitURL;
	}

	public String getToken() {
		return this.token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getBranch() {
		return this.branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
}