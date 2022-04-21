package com.project.durian.services;

import com.project.durian.dto.OrderDetailsDTO;

public interface OrderDetailsService {
    OrderDetailsDTO get(Long userId);
}
