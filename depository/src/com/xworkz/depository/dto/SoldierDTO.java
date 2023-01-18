package com.xworkz.depository.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public abstract class SoldierDTO extends AbstractAuditDTO {
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20, message = "Name must be >=3 and <=20")
	private String name;
	@Min(value = 2, message = "the ID must be > 2")
	@Max(value = 300, message = "the ID must be <300")
	private int id;
	@Min(value = 1, message = "the ID must be > 1")
	@Max(value = 10, message = "the ID must be <10")
	private int rank;
	@NotNull
	@NotBlank
	@Size(min = 5, max = 100, message = "Name must be >=5 and <=100")
	private String country;
	@NotNull
	@NotBlank
	@Size(min = 2, max = 25, message = "Name must be >=2 and <=25")
	private String battalion;

}
