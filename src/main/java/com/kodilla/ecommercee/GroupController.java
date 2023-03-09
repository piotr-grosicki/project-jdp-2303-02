package com.kodilla.ecommercee;


import com.kodilla.domain.GroupDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/group")
@RequiredArgsConstructor
@CrossOrigin

public class GroupController {

    @GetMapping
    public List<GroupDto> getGroups() {
        List<GroupDto> groupsList = new ArrayList<>();
        groupsList.add(new GroupDto(1L, "testGroup1"));
        groupsList.add(new GroupDto(2L, "testGroup2"));
        return groupsList;
    }

    @GetMapping(value = "/{groupId}")
    public GroupDto getGroup(@PathVariable Long groupId) {
        return new GroupDto(1L, "test");
    }
    @PostMapping
    public void createGroup(@RequestBody GroupDto groupDto) {

    }
    @PutMapping
    public GroupDto updateGroup() {
        return new GroupDto(1L, "update test");
    }


}
