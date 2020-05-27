package com.fabiogouw.sandbox.application.ports.out;

import com.fabiogouw.sandbox.domain.Account;

public interface AccountRepository {
    Account loadByCustomer(int customerId);
}
