package it.rhai.reading;

import java.util.Collection;

/**
 * This interface easily represents an object that can translate a collection of
 * data to another collection of data, changing their type
 * 
 * @author simone
 *
 * @param <T>: the type of data to be handled
 * @param <K>: the type of the resulting collection
 */
public interface DataHandler<T> {

	/**
	 * Handle a collection of data
	 * 
	 * @param data
	 */
	public void handle(Collection<T> data);

}