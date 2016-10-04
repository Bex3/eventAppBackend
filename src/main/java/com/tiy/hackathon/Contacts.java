package com.tiy.hackathon;

import javax.persistence.*;

/**
 * Created by Brett on 9/30/16.
 */

@Entity
@Table(name = "contacts")
public class Contacts {

	@Id
	@GeneratedValue
	int id;

	@OneToOne
	User initialContact;

	@OneToOne
	User contacted;

	@Column(nullable = false)
//	boolean giveInfo;
	String status; //PENDING_APPROVAL, APPROVED, DENIED

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getInitialContact() {
		return initialContact;
	}

	public void setInitialContact(User initialContact) {
		this.initialContact = initialContact;
	}

	public User getContacted() {
		return contacted;
	}

	public void setContacted(User contacted) {
		this.contacted = contacted;
	}

//	public boolean isGiveInfo() {
//		return giveInfo;
//	}
//
//	public void setGiveInfo(boolean giveInfo) {
//		this.giveInfo = giveInfo;
//	}

	public Contacts(User initialContact, User contacted, String status) {
		this.initialContact = initialContact;
		this.contacted = contacted;
		this.status = status;
	}

	public Contacts() {

	}
}
