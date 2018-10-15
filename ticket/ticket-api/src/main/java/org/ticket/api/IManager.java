package org.ticket.api;

import java.util.List;

public interface IManager<T, S> {
	T getOne(Long pId) throws Exception;
	List<T> getList();
	List<T> getList(S search);
}
