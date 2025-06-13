
package com.example.meetingroom.service;

import com.example.meetingroom.entity.MeetingRoom;
import com.example.meetingroom.repository.MeetingRoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingRoomService {
    private final MeetingRoomRepository repository;

    public MeetingRoomService(MeetingRoomRepository repository) {
        this.repository = repository;
    }

    public List<MeetingRoom> findAll() {
        return repository.findAll();
    }

    public MeetingRoom save(MeetingRoom room) {
        return repository.save(room);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
