package com.example.demo.xfactory.controller;

import com.example.demo.xfactory.model.Authority;
import com.example.demo.xfactory.persistence.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Component
@Transactional
public class AuthorityService {
    @Autowired
    private AuthorityRepository authorityRepository;

    public <S extends Authority> S save(S s) {
        return authorityRepository.save(s);
    }

    public <S extends Authority> Iterable<S> saveAll(Iterable<S> iterable) {
        return authorityRepository.saveAll(iterable);
    }

    public Optional<Authority> findById(Long aLong) {
        return authorityRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return authorityRepository.existsById(aLong);
    }

    public Iterable<Authority> findAll() {
        return authorityRepository.findAll();
    }

    public Iterable<Authority> findAllById(Iterable<Long> iterable) {
        return authorityRepository.findAllById(iterable);
    }

    public long count() {
        return authorityRepository.count();
    }

    public void deleteById(Long aLong) {
        authorityRepository.deleteById(aLong);
    }

    public void delete(Authority authority) {
        authorityRepository.delete(authority);
    }

    public void deleteAll(Iterable<? extends Authority> iterable) {
        authorityRepository.deleteAll(iterable);
    }

    public void deleteAll() {
        authorityRepository.deleteAll();
    }
}
