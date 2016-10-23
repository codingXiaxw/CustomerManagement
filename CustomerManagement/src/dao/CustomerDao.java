package dao;

import cn.itcast.jdbc.TxQueryRunner;
import domain.Customer;
import org.apache.commons.collections.buffer.CircularFifoBuffer;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codingBoy on 16/10/23.
 */
public class CustomerDao
{
    private QueryRunner qr=new TxQueryRunner();

    public void add(Customer c)
    {
        try {
            String sql = "insert into t_customer values(?,?,?,?,?,?)";
            Object[] params = {c.getId(), c.getName(), c.getGender(),
                    c.getPhone(), c.getEmail(), c.getDescription()};

            qr.update(sql, params);
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public List<Customer> findAll()
    {
        try{
            String sql="select * from t_customer";
            return qr.query(sql,new BeanListHandler<Customer>(Customer.class));
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public Customer find(String id)
    {
        try {
            String sql = "select * from t_customer where id=?";
            return qr.query(sql, new BeanHandler<Customer>(Customer.class), id);
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public void edit(Customer customer)
    {
        try{
            String sql="update t_customer set name=?,gender=?,phone=?,email=?,description=? where id=?";
            Object[] params={customer.getName(),customer.getGender(),customer.getPhone(),customer.getEmail(),customer.getDescription(),customer.getId()};

            qr.update(sql,params);
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public void delete(String id)
    {
        try {
            String sql = "delete from t_customer where id=?";

            qr.update(sql, id);
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public List<Customer> query(Customer customer) {

        try {
            StringBuilder sql = new StringBuilder("select * from t_customer where 1=1");
            List<Object> params = new ArrayList<>();

            String name = customer.getName();
            if (name != null && !name.trim().isEmpty()) {
                sql.append("and name like ?");
                params.add("%"+name+"%");
            }

            String gender = customer.getGender();
            if (gender != null && !gender.trim().isEmpty()) {
                sql.append("and gender=?");
                params.add(gender);
            }

            String phone = customer.getPhone();
            if (phone != null && !phone.trim().isEmpty()) {
                sql.append("and phone like ?");
                params.add("%"+phone+"%");
            }

            String email = customer.getEmail();
            if (email != null && !email.trim().isEmpty()) {
                sql.append("and email like ?");
                params.add("%"+email+"%");
            }

            return qr.query(sql.toString(), new BeanListHandler<Customer>(Customer.class), params.toArray());
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }


    }
}
