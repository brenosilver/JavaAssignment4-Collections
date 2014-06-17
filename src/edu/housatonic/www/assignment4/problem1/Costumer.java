//****************************************************************************************
//	Author: Breno Silva		Last Modified: 03/15/14			Project 13.5
//
//	CSC*E224				Programming Assignment IV		Problem 1
//****************************************************************************************

package edu.housatonic.www.assignment4.problem1;

public class Costumer {

	private String name;
	private int waitTime;
	private int queuePosition;
	
	public Costumer(String name, int queuePosition){
		this.name = name;
		this.queuePosition = queuePosition;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the waitTime
	 */
	public int getWaitTime() {
		return waitTime;
	}

	/**
	 * @param waitTime the waitTime to set
	 */
	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}

	/**
	 * @return the queuePosition
	 */
	public int getQueuePosition() {
		return queuePosition;
	}

	/**
	 * @param queuePosition the queuePosition to set
	 */
	public void setQueuePosition(int queuePosition) {
		this.queuePosition = queuePosition;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Costumer [name=" + name + ", waitTime=" + waitTime
				+ ", queuePosition=" + queuePosition + "]";
	}
	

}
