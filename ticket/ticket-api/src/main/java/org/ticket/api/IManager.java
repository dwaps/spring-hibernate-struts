package org.ticket.api;

import java.util.List;

public interface IManager<T> {
	T getOne(Long pId) throws Exception;
	List<T> getList();
}
