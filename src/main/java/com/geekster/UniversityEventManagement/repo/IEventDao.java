package com.geekster.UniversityEventManagement.repo;

import com.geekster.UniversityEventManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventDao extends JpaRepository<Event,Integer> {
    @Query(value = "Select * from Event where date =?1 ",nativeQuery = true)
    List<Event> findAllByDate(LocalDate date);
}
