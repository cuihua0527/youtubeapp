package com.saika.dao;

import com.saika.model.AdminAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminAccountDao extends JpaRepository<AdminAccount, Long> {

    Optional<AdminAccount> findByEmail(String email);

    boolean existsByEmail(String email);
}
