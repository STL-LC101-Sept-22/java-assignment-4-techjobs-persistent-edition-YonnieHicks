package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

//@Transactional

/* Keep transactional annotation still in case I break something else*/

public interface SkillRepository extends CrudRepository<Skill, Integer> {
}