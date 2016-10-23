package servlet;

import cn.itcast.commons.CommonUtils;
import cn.itcast.servlet.*;
import cn.itcast.servlet.BaseServlet;
import domain.Customer;
import service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by codingBoy on 16/10/23.
 */
public class CustomerServlet extends BaseServlet {
    private CustomerService customerService = new CustomerService();

    public String add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Customer customer = CommonUtils.toBean(request.getParameterMap(), Customer.class);
        customer.setId(CommonUtils.uuid());

        customerService.add(customer);

        request.setAttribute("msg", "恭喜，成功添加客户");

        return "/msg.jsp";
    }

    public String findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = customerService.findAll();

        request.setAttribute("cstmList", customers);

        return "/list.jsp";
    }

    public String preEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Customer customer = customerService.find(id);

        request.setAttribute("customer", customer);

        return "/edit.jsp";
    }

    public String edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Customer customer = CommonUtils.toBean(request.getParameterMap(), Customer.class);

        customerService.edit(customer);

        request.setAttribute("msg", "恭喜，编辑客户成功");
        return "/msg.jsp";
    }

    public String delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");

        customerService.delete(id);

        request.setAttribute("msg", "恭喜，删除客户成功");

        return "/msg.jsp";
    }

    public String query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Customer customer=CommonUtils.toBean(request.getParameterMap(),Customer.class);

        List<Customer> customers=customerService.query(customer);

        request.setAttribute("cstmList",customers);

        return "/list.jsp";

    }
}

