package com.saika.service;

import com.saika.model.AdminAccount;

public interface LoginService {

    AdminAccount authenticate(String email, String password);

    void createDefaultAdminIfMissing();
}
