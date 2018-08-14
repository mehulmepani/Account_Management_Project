package com.mm.accountManagmentSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mm.accountManagmentSpringBoot.model.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {

}
