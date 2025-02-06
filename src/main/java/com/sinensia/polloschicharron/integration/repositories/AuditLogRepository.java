package com.sinensia.polloschicharron.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.polloschicharron.integration.model.AuditLog;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {

	
}
