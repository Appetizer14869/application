package com.application.myapp.repository;

import com.application.myapp.domain.Job;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;

public interface JobRepositoryWithBagRelationships {
    Optional<Job> fetchBagRelationships(Optional<Job> job);

    List<Job> fetchBagRelationships(List<Job> jobs);

    Page<Job> fetchBagRelationships(Page<Job> jobs);
}
