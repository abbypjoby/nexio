package com.example.nexio.repo;

import com.example.nexio.model.NexioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NexioRepo extends JpaRepository<NexioEntity, Long> {

    List<NexioEntity> findAll();

}
