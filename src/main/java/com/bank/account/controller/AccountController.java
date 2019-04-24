package com.bank.account.controller;

import com.bank.account.Account;
import com.bank.account.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class AccountController {

    @Autowired
    private AccountDAO accountRepository ;


    @RequestMapping ("/hello")
    public String sayHi()
    {
        return "hi";
    }

    @RequestMapping(value= "/account/list/user/{userId}", method= RequestMethod.GET)
    public List<Account> listUserAccounts(@PathVariable long userId) {

        return accountRepository.findAllByUser(userId);
    }

    @RequestMapping(value= "/account/list/user/{userId}/{dateStart}", method= RequestMethod.GET)
    public List<Account> listUserAccountsByCreationDate(@PathVariable long userId, @PathVariable Date dateStart) {

        return accountRepository.findAllByUserAndDateCreate(userId, dateStart);

    }

    @RequestMapping(value= "/account/{id}", method=RequestMethod.GET)
    public Account getAccount(@PathVariable long id) {

         Account accountFounded = accountRepository.getOne(id);

        return accountFounded;
    }

    @RequestMapping(value= "/account/{id}", method=RequestMethod.PUT)
    public Account setAccount(@RequestBody Account acc, @PathVariable long id) {
        if (acc.getId() == id)
        {
            Account a = accountRepository.saveAndFlush(acc);
            return a;
        }
        else
            return null;
    }

    @RequestMapping(value= "/account/user/create", method=RequestMethod.POST)
    public Account createAccount(@RequestBody Account acc) {
        if (accountRepository.getOne(acc.getId()) == null)
        {
            Account a = accountRepository.saveAndFlush(acc);
            return a;
        }
        else
            return null;
    }

    @RequestMapping(value= "/account/{id}/value", method=RequestMethod.GET)
    public Integer getValue(@PathVariable long id) {
        Account accountFounded = accountRepository.getOne(id);
        return accountFounded.ACC_VALEUR;
    }

    @RequestMapping(value= "/account/{id}/info", method=RequestMethod.POST)
    public Account getInfos(@RequestBody Account acc, @PathVariable long id) {
        Account accountFounded = accountRepository.getOne(id);

        return accountFounded;
    }

    @RequestMapping(value= "/account/{id}/checkTransaction/", method=RequestMethod.GET)
    public Boolean checkTransaction(@PathVariable long id) {
        Account accountFounded = accountRepository.getOne(id);

        return accountFounded.getIs_valid();
    }

}
