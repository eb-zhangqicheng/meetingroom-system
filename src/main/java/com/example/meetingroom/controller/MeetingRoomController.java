
package com.example.meetingroom.controller;

import com.example.meetingroom.entity.MeetingRoom;
import com.example.meetingroom.service.MeetingRoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class MeetingRoomController {
    private final MeetingRoomService service;

    public MeetingRoomController(MeetingRoomService service) {
        this.service = service;
    }

    @GetMapping
    public List<MeetingRoom> all() {
        return service.findAll();
    }

    @PostMapping
    public MeetingRoom create(@RequestBody MeetingRoom room) {
        return service.save(room);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
