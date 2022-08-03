package com.larry.testspringpostgres.repository;

import com.larry.testspringpostgres.entity.UserControl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserControlRepository extends JpaRepository<UserControl, Long> {
}
