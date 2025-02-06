package com.sinensia.polloschicharron.integration.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "AUDITLOG")
public class AuditLog {

	@Id
	@GeneratedValue(generator = "AUDIT_SEQ")
	private Long id;

	private String httpMethod;
	private String path;
	private String ipAddress;
	private LocalDateTime timestamps;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public LocalDateTime getTimestamp() {
		return timestamps;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamps = timestamp;
	}
}
