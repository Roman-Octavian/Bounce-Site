package com.bouncesite.services;

import com.bouncesite.model.Statistics;
import com.bouncesite.repo.StatsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatsService {
    @Autowired
    private StatsRepo statsRepo;

    public Statistics fetchAll() {
        return statsRepo.fetchStats();
    }
}
