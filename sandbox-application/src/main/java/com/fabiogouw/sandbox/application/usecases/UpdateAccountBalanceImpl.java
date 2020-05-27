package com.fabiogouw.sandbox.application.usecases;

import com.fabiogouw.sandbox.application.ports.out.AccountRepository;

public class UpdateAccountBalanceImpl implements com.fabiogouw.sandbox.application.ports.in.UpdateAccountBalance {
    private final AccountRepository repository;

    public UpdateAccountBalanceImpl(AccountRepository repository) {
        this.repository = repository;
    }
}
