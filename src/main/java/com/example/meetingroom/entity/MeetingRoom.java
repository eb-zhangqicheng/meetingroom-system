
package com.example.meetingroom.entity;

import javax.persistence.*;

@Entity
@Table(name = "meeting_rooms")
public class MeetingRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer capacity;
    private Boolean hasProjector;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getCapacity() { return capacity; }
    public void setCapacity(Integer capacity) { this.capacity = capacity; }
    public Boolean getHasProjector() { return hasProjector; }
    public void setHasProjector(Boolean hasProjector) { this.hasProjector = hasProjector; }
}
