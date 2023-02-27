package com.github.RuSichPT.Crypto.exchange.services;

import com.github.RuSichPT.Crypto.exchange.repositories.AdminRepository;
import com.github.RuSichPT.Crypto.exchange.repositories.entities.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository,
                            @Value("${admin.username}") String userName,
                            @Value("${admin.email}") String email) {
        this.adminRepository = adminRepository;
        createAdmin(userName, email);
    }

    @Override
    public Admin createAdmin(String userName, String email) {
        Admin admin = new Admin(userName, email);
        adminRepository.save(admin);

        return admin;
    }

    @Override
    public boolean isAdmin(String secretKey) {
        Optional<Admin> optAdmin = adminRepository.findBySecretKey(secretKey);

        return optAdmin.isPresent();
    }
}
