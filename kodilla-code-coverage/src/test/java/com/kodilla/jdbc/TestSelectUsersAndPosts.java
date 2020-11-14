package com.kodilla.jdbc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelectUsersAndPosts {

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String addQuery = "insert into posts(id,user_id,body) values (20,2,\"I burned my cookies.\")";
        statement.executeUpdate(addQuery);
        String addQueryTwo = "insert into posts(id,user_id,body) values (21,2,\"Now shops are closed and I can't buy any.\")";
        statement.executeUpdate(addQueryTwo);
        String addQueryThree = "insert into posts(id,user_id,body) values (22,2,\"Shame.\")";
        statement.executeUpdate(addQueryThree);

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
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 1;
        Assert.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @After
    public void removeEntries() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        Statement statement = dbManager.getConnection().createStatement();
        String deleteQuery = "delete from posts\n" +
                "where id = 20;\n" +
                "delete from posts\n" +
                "where id = 21;\n" +
                "delete from posts\n" +
                "where id = 22;\n";
        statement.executeUpdate(deleteQuery);
    }

}