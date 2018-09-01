package org.lanqiao.servlet;

import org.lanqiao.dao.impl.CaipuDaoImpl;
import org.lanqiao.entity.Caipu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addCaipuServlet")
public class addCaipuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String made = request.getParameter("made");
        String image = request.getParameter("image");
        String step = request.getParameter("step");
        String count = request.getParameter("count");
        String step_image = request.getParameter("step_image");
        String u_id = request.getParameter("u_id");
        String introduce = request.getParameter("introduce");

        Caipu c = new Caipu();
        c.setC_name(name);
        c.setC_made(made);
        c.setC_image(image);
        c.setC_step(step);
        c.setC_count(Integer.parseInt(count));
        c.setC_step_image(step_image);
        c.setU_id(Integer.parseInt(u_id));
        c.setC_introduce(introduce);

        CaipuDaoImpl caipuDao = new CaipuDaoImpl();
        int ret = caipuDao.addCaipu(c);

        PrintWriter out =response.getWriter();
        out.print(ret);
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
