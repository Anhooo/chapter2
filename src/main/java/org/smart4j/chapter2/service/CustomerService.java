package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.util.PropsUtil;

import java.util.List;
import java.util.Map;
import java.util.Properties;



public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static{
        Properties conf = PropsUtil.loadProps("config.properties");
        DRIVER = conf.getProperty("jdbc.driver");
        URL = conf.getProperty("jdbc.url");
        USERNAME = conf.getProperty("jdbc.username");
        PASSWORD = conf.getProperty("jdbc.password");
        try{
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e){
            LOGGER.error("can not load jdbc driver", e);
        }
    }



    public List<Customer> getCustomerList(String keyword){
        //TODO
        return null;
    }

    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }


    public Customer getCustomer(long id){
        //TODO
        return null;
    }

    public boolean createCustomer(Map<String, Object> fieldMap){
        //TODO
        return false;
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap){
        //TODO
        return false;
    }
    public boolean deleteCustomer(long id){
        //TODO
        return false;
    }
}
