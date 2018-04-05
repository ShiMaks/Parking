package by.htp.parking.dao;

import java.util.List;

import by.htp.parking.domain.Entity;

public interface BaseDao<T extends Entity> {
	
	void creat(T t) throws DaoException;
	
	T read(int id) throws DaoException;
	
	void update(T t) throws DaoException;
	
	void delete(int id) throws DaoException;
	
	List<T> readAll() throws DaoException ;

}
