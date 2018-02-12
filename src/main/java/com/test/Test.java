package com.test;

import java.sql.*;

/**
 * Created by debasish paul on 09-11-2017.
 */
public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:derby://192.168.33.207:1530/CRM;ssl=basic","CRM","CRM");
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT * " +
                    "FROM APP.Acc");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                System.out.println(resultSet.getString("Account_ID")+":"+resultSet.getString("Account1"));
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
