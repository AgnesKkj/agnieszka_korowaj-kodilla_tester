package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelectUsersAndPosts {

    @Before
    public void cleanDataBaseRecords() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        Statement statement = dbManager.getConnection().createStatement();

        String deleteQuery = "DELETE FROM POSTS\n" +
                "WHERE ID = 20;";
        statement.executeUpdate(deleteQuery);
        deleteQuery = "DELETE FROM POSTS\n" +
                "WHERE ID = 21;";
        statement.executeUpdate(deleteQuery);
        deleteQuery = "DELETE FROM POSTS\n" +
                "WHERE ID = 22;";
        statement.executeUpdate(deleteQuery);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        Statement statement = dbManager.getConnection().createStatement();

        String countQuery = "SELECT COUNT(DISTINCT U.ID) \n" +
                "FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "HAVING COUNT(P.BODY) > 2;";

        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(DISTINCT U.ID)");
        }
        System.out.println("Initial count: " + count);

        String addQuery = "INSERT INTO POSTS(ID,USER_ID,BODY) VALUES (20,2,'I burned my cookies.')";
        statement.executeUpdate(addQuery);
        addQuery = "INSERT INTO POSTS(ID,USER_ID,BODY) VALUES (21,2,'Now shops are closed and I cannot buy any.')";
        statement.executeUpdate(addQuery);
        addQuery = "INSERT INTO POSTS(ID,USER_ID,BODY) VALUES (22,2,'Shame.')";
        statement.executeUpdate(addQuery);

        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(P.BODY) AS POST_NUMBER\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY U.LASTNAME\n" +
                "HAVING COUNT(P.BODY) > 2;";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

       //Then

        int counter = 0;
        while(rs.next()) {
            System.out.println("End query names: " + rs.getString("U.FIRSTNAME") + ", " +
                    rs.getString("U.LASTNAME"));
            counter++;
        }
        System.out.println("End query count: " + counter);

        int expected = count + 1;
        Assert.assertEquals(expected, counter);

        rs.close();
        statement.close();

    }


}