package com.saika.service;

import com.saika.dao.AdminAccountDao;
import com.saika.model.AdminAccount;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

    private final AdminAccountDao adminAccountDao;

    public LoginServiceImp(AdminAccountDao adminAccountDao) {
        this.adminAccountDao = adminAccountDao;
    }

    @Override
    public AdminAccount authenticate(String email, String password) {
        String normalizedEmail = normalize(email);
        String normalizedPassword = normalize(password);
        if (normalizedEmail == null || normalizedPassword == null) {
            return null;
        }

        return adminAccountDao.findByEmail(normalizedEmail)
            .filter(account -> account.getPassword().equals(normalizedPassword))
            .orElse(null);
    }

    @Override
    public void createDefaultAdminIfMissing() {
        String defaultEmail = "admin@youtubu.com";
        if (adminAccountDao.existsByEmail(defaultEmail)) {
            return;
        }
        adminAccountDao.save(new AdminAccount(
            defaultEmail,
            "Saika0527@",
            "Saika Admin",
            "MASTER"
        ));
    }

    private String normalize(String value) {
        if (value == null) {
            return null;
        }
        String trimmed = value.trim();
        return trimmed.isEmpty() ? null : trimmed;
    }
}
