package com.electrocorhuila.application;

import com.electrocorhuila.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String calculateTariff(User user) {
        int stratum = user.getSocioeconomicStratum();
        switch (stratum) {
            case 1: return "Low tariff";
            case 2: return "Medium tariff";
            case 3: return "High tariff";
            default: return "Unknown tariff";
        }
    }
}
