package com.xworkz.depository.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@AllArgsConstructor
@Setter
@Getter

public abstract class AbstractAuditDTO implements Serializable {

	private String createdBy;
	private LocalDateTime createdAt;
	private String updatedBy;
	private LocalDateTime updatedAt;
	
}
