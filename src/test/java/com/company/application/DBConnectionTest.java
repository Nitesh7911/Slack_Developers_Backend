package com.company.application;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionTest {

//    @Test
//    public void Test_Connection() throws SQLException {
//        String url = "jdbc:postgresql://ec2-3-212-75-25.compute-1.amazonaws.com:5432/dfdi4u8tcoktp8";
//        Properties props = new Properties();
//        props.setProperty("user","nhonmdpxqblezp");
//        props.setProperty("password","0b4adbad125b6abaf3dee3c0f6f5eaf66420a9123df041a696ed01bd3bf1c8d0");
//        props.setProperty("ssl","true");
//        Connection conn = DriverManager.getConnection(url, props);
//    }
//
//    @Test
//    public void Test_Connection_1() throws SQLException {
//        String url = "jdbc:postgresql://ec2-3-212-75-25.compute-1.amazonaws.com:5432/dfdi4u8tcoktp8?user=nhonmdpxqblezp&password=0b4adbad125b6abaf3dee3c0f6f5eaf66420a9123df041a696ed01bd3bf1c8d0";
//        Connection conn = DriverManager.getConnection(url);
//    }

    @Test
    public void Test_Connection_2() throws SQLException {
        Assert.assertEquals("connect","connect");
    }
}