package com.kodilla.ecommercee.domain;


import com.kodilla.ecommercee.entity.Group;
import com.kodilla.ecommercee.repository.GroupRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupEntityTestSuite {

    @Mock
    private GroupRepository groupRepository;

    private Group group1;
    private Group group2;

    @BeforeEach
    public void setUp() {
        group1 = new Group(1, "Group 1", new ArrayList<>());
        group2 = new Group(2, "Group 2", new ArrayList<>());
    }

    @Test
    public void testFindAll() {
        //Given
        List<Group> groupList = new ArrayList<>();
        groupList.add(group1);
        groupList.add(group2);

        //When
        when(groupRepository.findAll()).thenReturn(groupList);
        List<Group> result = groupRepository.findAll();

        //Then
        assertEquals(2, result.size());
        assertTrue(result.contains(group1));
        assertTrue(result.contains(group2));
    }

    @Test
    public void testFindById() {
        //Given & when
        when(groupRepository.findById(1L)).thenReturn(Optional.of(group1));
        Optional<Group> result = groupRepository.findById(1L);

        //Then
        assertTrue(result.isPresent());
        assertEquals(group1, result.get());
    }

    @Test
    public void testDeleteById() {
        //Given & When
        groupRepository.deleteById(1L);

        //Then
        Mockito.verify(groupRepository).deleteById(1L);
    }

    @Test
    public void testSave() {
        //Given
        Group group3 = new Group(3, "Group 3", new ArrayList<>());

        //When
        when(groupRepository.save(group3)).thenReturn(group3);
        Group result = groupRepository.save(group3);

        //Then
        assertEquals(group3, result);
    }
}
