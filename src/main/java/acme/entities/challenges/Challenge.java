
package acme.entities.challenges;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Challenge extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				title;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date				deadline;

	@NotBlank
	private String				description;

	@NotBlank
	private String				rookieGoal;

	@Valid
	@NotNull
	private Money				rookieReward;

	@NotBlank
	private String				averageGoal;

	@Valid
	@NotNull
	private Money				averageReward;

	@NotBlank
	private String				expertGoal;

	@Valid
	@NotNull
	private Money				expertReward;

}
