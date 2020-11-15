package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private TaskList taskList;
    private String listNameOne = "Hibernate Exercise List";
    private String descriptionOne = "Task list to be tested with Hibernate";
    private String listNameTwo = "Java Learning List";
    private String descriptionTwo = "Task listing Java exercises";

    @Test
    public void testDoesFindExpectedListByListName() throws SQLException {
        //Given
        TaskList taskListOne = new TaskList(listNameOne, descriptionOne);
        taskListRepository.save(taskListOne);
        TaskList taskListTwo = new TaskList(listNameTwo, descriptionTwo);
        taskListRepository.save(taskListTwo);
        int listOneId = taskListOne.getId();
        int listTwoId = taskListTwo.getId();
        System.out.println("List one ID: " + listOneId + ", list two ID: " + listTwoId);

        //When
        List<TaskList> readTaskLists = taskListRepository.findByListName(listNameOne);
        String foundListName = readTaskLists.get(0).getListName();

        //Then
        Assert.assertEquals(listNameOne, foundListName);

        //Cleanup
        List<TaskList> tempList = (List<TaskList>) taskListRepository.findByListName(listNameOne);
        int id = tempList.get(0).getId();
        taskListRepository.deleteById(id);
        tempList = (List<TaskList>) taskListRepository.findByListName(listNameTwo);
        id = tempList.get(0).getId();
        taskListRepository.deleteById(id);
    }

    @Test
    public void testDoesNotFindUnexpectedListByListName() {
        //Given
        TaskList taskListOne = new TaskList(listNameOne, descriptionOne);
        taskListRepository.save(taskListOne);
        TaskList taskListTwo = new TaskList(listNameTwo, descriptionTwo);
        taskListRepository.save(taskListTwo);

        //When
        List<TaskList> readTaskLists = taskListRepository.findByListName(listNameTwo);
        String foundListName = readTaskLists.get(0).getListName();

        //Then
        Assert.assertNotEquals(listNameOne, foundListName);

        //Cleanup
        List<TaskList> tempList = (List<TaskList>) taskListRepository.findByListName(listNameOne);
        int id = tempList.get(0).getId();
        taskListRepository.deleteById(id);
        tempList = (List<TaskList>) taskListRepository.findByListName(listNameTwo);
        id = tempList.get(0).getId();
        taskListRepository.deleteById(id);
        }

    }