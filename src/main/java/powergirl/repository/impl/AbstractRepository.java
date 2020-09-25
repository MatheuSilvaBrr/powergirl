package powergirl.repository.impl;

public interface AbstractRepository<T> {
	
	public T save(T entity);
	public T GetById(long id);
	public T remove(T entity);

}
