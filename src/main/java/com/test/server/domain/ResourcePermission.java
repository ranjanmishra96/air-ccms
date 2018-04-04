package com.test.server.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="m11_resource_permission")
public class ResourcePermission {
	
	private Long id;
	private Resource resource;
	private Boolean active;
	
	
//	 public ResourcePermission() {
//		// TODO Auto-generated constructor stub
//	}
	
	@Id
	@Column(name="resource_permission_id",unique=true,nullable=false,precision =15,scale=0)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="m11_resource_permission_seq")
	@SequenceGenerator(name="m11_resource_permission_seq",sequenceName="m11_resource_permission_seq",allocationSize=1)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	//@Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	@JoinColumn(name="resource_id")
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	@Column(name="active",nullable=false)
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	

}
