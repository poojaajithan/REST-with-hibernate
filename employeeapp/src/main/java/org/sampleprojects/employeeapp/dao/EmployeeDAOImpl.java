package org.sampleprojects.employeeapp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sampleprojects.employeeapp.model.Employees;

public class EmployeeDAOImpl implements EmployeeDAO {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public void insertEmployee(Employees employee) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void updateEmployee(Employees employee) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(employee);
		session.getTransaction().commit();
		session.close();	
	}

	@Override
	public void deleteEmployee(int employeeID) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Employees employee = session.get(Employees.class, employeeID);
		session.delete(employee);
		session.getTransaction().commit();
		session.close();	
		
	}

	public List<Employees> listEmployees() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Employees");
		List<Employees> employeeList = (List<Employees>)query.list();
		session.getTransaction().commit();
		session.close();
		return employeeList;
		
	}

}
