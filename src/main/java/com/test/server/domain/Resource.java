package com.test.server.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="m10_resource")
public class Resource {
	
	private Long id;
	private String fullName;
	private String shortName;
	private String description;
	private Long sortOrder;
	private Boolean active;
	
	private Set<ResourcePermission> resourcePermission = new HashSet<ResourcePermission>();
	
//	 public Resource() {
//		// TODO Auto-generated constructor stub
//	}
	
	
	@Id
	@Column(name="resource_id",unique = true,nullable = false,precision = 15, scale =0)
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="m10_resource_seq")
	@SequenceGenerator(name="m10_resource_seq",sequenceName="m10_resource_seq",allocationSize=1)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="resource_fullname",nullable=false,length= 500)
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@Column(name="resource_shortName",nullable=false,length=500)
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	@Column(name="resouce_description",length=5000)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="sort_Order_1",precision=6,scale=0)
	public Long getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}
	@Column(name="active",nullable=false)
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="resource")
//	@JoinColumn(name="resource_id")
	public Set<ResourcePermission> getResourcePermission() {
		return resourcePermission;
	}
	public void setResourcePermission(Set<ResourcePermission> resourcePermission) {
		this.resourcePermission = resourcePermission;
	}
	

}
