package com.sinensia.polloschicharron.business.services.impl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.sinensia.polloschicharron.integration.model.AuditLog;
import com.sinensia.polloschicharron.integration.repositories.AuditLogRepository;

import java.time.LocalDateTime;

@Component
public class AuditInterceptor implements HandlerInterceptor {

    private final AuditLogRepository auditLogRepository;

    public AuditInterceptor(AuditLogRepository auditLogRepository) {
        this.auditLogRepository = auditLogRepository;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        AuditLog log = new AuditLog();
        log.setHttpMethod(request.getMethod());
        log.setPath(request.getRequestURI());
        log.setTimestamp(LocalDateTime.now());
        auditLogRepository.save(log);
        return true;
    }
}
