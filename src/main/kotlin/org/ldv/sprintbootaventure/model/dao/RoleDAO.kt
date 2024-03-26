package org.ldv.sprintbootaventure.model.dao

import org.ldv.sprintbootaventure.model.entity.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleDAO : JpaRepository<Role, Long> {
    
}