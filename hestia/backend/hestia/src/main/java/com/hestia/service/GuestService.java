package com.hestia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hestia.dao.CrudRepository;
import com.hestia.model.Guest;

@Service
public class GuestService {
    @Autowired
    private CrudRepository<Guest, Long> guestRepository;

    public Optional<Guest> findById(Long id) {
        return guestRepository.findById(id);
    }
}
