package com.k62j.uet.suggest_come_out.dao;

import com.k62j.uet.suggest_come_out.models.entity.DecisiveTreeCondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDecisiveTreeConditionDAO extends JpaRepository<DecisiveTreeCondition, String> {
}
