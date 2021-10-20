package com.usermanagement.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.usermanagement.dao.UserDao;
import com.usermanagement.model.User;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao userDao;

	public UserServlet() {
		super();
		this.userDao = new UserDao();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		switch (action) {
		case "/new":
			showNewForm(request, response);
			break;

		case "/insert":

			try {
				insertUser(request, response);

			} catch (Exception e) {

			}
			break;

		case "/delete":

			try {

				deleteUser(request, response);

			} catch (Exception e) {
				e.printStackTrace();

			}
			break;

		case "/edit":

			try {
				showEditForm(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case "/update":

			try {
				updateUser(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		default:

			try {
				listUser(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}

			break;

		}

	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<User> listUser = userDao.selectAllUsers();

		request.setAttribute("listUser", listUser);

		RequestDispatcher disp = request.getRequestDispatcher("user-list.jsp");

		disp.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dis = request.getRequestDispatcher("user-form.jsp");

		dis.forward(request, response);

	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String addres = request.getParameter("addres");
		String contact = request.getParameter("contact");

		User newUser = new User(name, email, addres, contact);
		userDao.insertUser(newUser);
		response.sendRedirect("list");
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		userDao.deleteUser(id);
		response.sendRedirect("list");
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));

		User existingUser = userDao.selectUser(id);

		RequestDispatcher disp = request.getRequestDispatcher("user-form.jsp");

		request.setAttribute("user", existingUser);
		disp.forward(request, response);
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String addres = request.getParameter("addres");
		String contact = request.getParameter("contact");

		User book = new User(id, name, email, addres, contact);
		userDao.updateUser(book);
		response.sendRedirect("list");

	}

}
