package com.bank.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface AccountDAO extends JpaRepository<Account,Long> {
    List<Account> findAllByUser(long user);
    List<Account> findAllByDateCreate(Date dateStart);
    List<Account> findAllByUserAndDateCreate(long id, Date dateStart);
}
