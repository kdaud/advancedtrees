package com.software.gci;


public class Parallel {
	
	private String subject_name;
	
	private String subject_code;
	
	private String year;
	
	private String lecturer;
	
	/**
	 * @return the subject_name
	 */
	public String getSubject_name() {
		return subject_name;
	}
	
	/**
	 * @param subject_name the subject_name to set
	 */
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	
	/**
	 * @return the subject_code
	 */
	public String getSubject_code() {
		return subject_code;
	}
	
	/**
	 * @param subject_code the subject_code to set
	 */
	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}
	
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	
	/**
	 * @return the lecturer
	 */
	public String getLecturer() {
		return lecturer;
	}
	
	/**
	 * @param lecturer the lecturer to set
	 */
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	
	public Parallel(String subject_name, String subject_code, String year, String lecturer) {
		super();
		this.subject_name = subject_name;
		this.subject_code = subject_code;
		this.year = year;
		this.lecturer = lecturer;
	}
	
	public Parallel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	//	public String getSubject_name() {
	//		return subject_name;
	//	}
	//	
	//	public void setSubject_name() {
	//		this.subject_name = subject_name;
	//	}
	
}
