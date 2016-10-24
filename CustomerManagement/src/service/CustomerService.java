package service;

import dao.CustomerDao;
import domain.Customer;

import java.util.List;

/**
 * Created by codingBoy on 16/10/23.
 */
public class CustomerService
{
    CustomerDao customerDao=new CustomerDao();

    public void add(Customer customer)
    {
        customerDao.add(customer);
    }

    public List<Customer> findAll()
    {
        return customerDao.findAll();
    }

    public Customer find(String id)
    {
        return customerDao.find(id);
    }

    public void edit(Customer customer)
    {
        customerDao.edit(customer);
    }

    public void delete(String id)
    {
        customerDao.delete(id);
    }

    public List<Customer> query(Customer customer)
    {
        return customerDao.query(customer);


    }

}
