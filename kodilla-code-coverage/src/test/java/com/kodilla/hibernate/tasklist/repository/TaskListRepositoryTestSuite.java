/*

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

        //When
        List<TaskList> readTaskLists = taskListRepository.findByListName(listNameOne);
        String foundListName = readTaskLists.get(0).getListName();
        String expectedListName = "Hibernate Exercise List";

        //Then
        Assert.assertEquals(expectedListName, foundListName);

        //Cleanup
        TaskList toBeDeleted = taskListRepository.findByListName(listNameOne).get(0);
        int id = toBeDeleted.getId();
        taskListRepository.deleteById(String.valueOf(id));
        toBeDeleted = taskListRepository.findByListName(listNameTwo).get(0);
        id = toBeDeleted.getId();
        taskListRepository.deleteById(String.valueOf(id));
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
        String unexpectedListName = "Hibernate Exercise List";

        //Then
        Assert.assertNotEquals(unexpectedListName, foundListName);

        //Cleanup
        TaskList toBeDeleted = taskListRepository.findByListName(listNameOne).get(0);
        int id = toBeDeleted.getId();
        taskListRepository.deleteById(String.valueOf(id));
        toBeDeleted = taskListRepository.findByListName(listNameTwo).get(0);
        id = toBeDeleted.getId();
        taskListRepository.deleteById(String.valueOf(id));
        }

    }
*/
