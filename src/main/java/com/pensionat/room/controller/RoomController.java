package com.pensionat.room.controller;

import com.pensionat.room.dto.RoomResponse;
import com.pensionat.room.model.RoomEntity;
import com.pensionat.room.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<RoomResponse> getAllRooms() {
        return roomService.getAllRooms()
                .stream()
                .map(RoomResponse::from)
                .toList();
    }

    @PostMapping
    public RoomResponse createRoom(@RequestBody RoomEntity room) {
        RoomEntity savedRoom = roomService.createRoom(room);
        return RoomResponse.from(savedRoom);
    }
}