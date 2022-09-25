package com.poly.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.MappingDispatchAction;

import com.poly.dao.UserDao;
import com.poly.model.User;
import com.poly.services.UserService;

public class UserAction extends MappingDispatchAction {
	
	public ActionForward addUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		User user = (User) form;
		user.setName("Hello struts");

		return mapping.findForward("addUser");
	}
	
	public ActionForward deleteUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		User user = (User) form;
		user.setName("Hello struts");

		return mapping.findForward("deleteUser");
	}
	
	public ActionForward updateUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		User user = (User) form;
		user.setName("Hello struts");
		
		return mapping.findForward("updateUser");
	}
	
	public ActionForward viewUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int id = Integer.valueOf(request.getParameter("id"));
		UserService service = new UserService();
		User user = service.getUserById(id);

		request.setAttribute("u", user);

		return mapping.findForward("viewUser");
			
	}
	
	public ActionForward listUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		UserService service = new UserService();
		List<User> list = service.getUsers();
		
		request.setAttribute("userList", list);
		return mapping.findForward("listUser");
			
	}
	
	

}
