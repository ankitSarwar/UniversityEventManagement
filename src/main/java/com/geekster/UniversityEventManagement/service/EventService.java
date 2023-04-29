package com.geekster.UniversityEventManagement.service;

import com.geekster.UniversityEventManagement.model.Event;
import com.geekster.UniversityEventManagement.repo.IEventDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {

    @Autowired
    IEventDao eventDao;

    public List<Event> getEventByDate(LocalDate localDate) {
            return eventDao.findAllByDate(localDate);
    }

    public String addEvent(List<Event> events) {
        eventDao.saveAll(events);
        return "Added successfully";
    }

    public String updateEvent(Event event) {
        if(eventDao.existsById(event.getEventId())){
            eventDao.save(event);
            return "Updated successfully";
        }
        return "No Event to update like this,you can add new event with this Id ";
    }

    public String deleteEventByEventId(int eventId) {
        if(eventDao.existsById(eventId)){
            eventDao.deleteById(eventId);
            return "Deleted successfully";
        }
        return "No Event to delete with this eventId like this ";

    }

    public List<Event> getAllEvent() {
        return eventDao.findAll();
    }
}
