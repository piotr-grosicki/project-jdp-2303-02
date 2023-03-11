package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.GroupDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/group")
@CrossOrigin

public class GroupController {

    @GetMapping
    public List<GroupDto> getGroups () {
        List<GroupDto> groupsList = new ArrayList<>();
        return groupsList;
    }
    @GetMapping(value = "{groupId}")
    public GroupDto getGroupById( @PathVariable long groupId ) {
        return new GroupDto();
    }

    @PostMapping
    public void createGroup(@RequestBody GroupDto groupDto) {

    }
    @PutMapping(value ="{groupId}")
    public GroupDto updateGroupById( @PathVariable long groupId) {
        return new GroupDto();
    }

}
