package com.teamwiski.wildskills.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tblSkillExchange")
public class SkillExchangeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SkillExchangeID;
	
	@Column
	private String status; //Completed - Cancelled - Ongoing
	private String title; //Title sa exchange para header sa exchange menu
	private LocalDateTime scheduledStart;
	private LocalDateTime scheduledEnd;

	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "student_id")
	@JsonIgnore
	private StudentEntity student;
	
	public SkillExchangeEntity() {
		super();
	}
	
	public SkillExchangeEntity(int SkillExchangeID, String status, String title, LocalDateTime scheduledStart, LocalDateTime scheduledEnd) {
		this.SkillExchangeID = SkillExchangeID;
		this.status = status;
		this.title = title;
		this.scheduledStart = scheduledStart;
		this.scheduledEnd = scheduledEnd;
	}
	
	public int getSkillExchangeID() {
		return SkillExchangeID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getScheduledStart() {
		return scheduledStart;
	}

	public void setScheduledStart(LocalDateTime scheduledStart) {
		this.scheduledStart = scheduledStart;
	}

	public LocalDateTime getScheduledEnd() {
		return scheduledEnd;
	}

	public void setScheduledEnd(LocalDateTime scheduledEnd) {
		this.scheduledEnd = scheduledEnd;
	}

	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}
	
}
