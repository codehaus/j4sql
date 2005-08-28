/*
 * Created on Aug 28, 2005
 */

package org.j4sql.examples;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;


/**
 * Some java utility function to use inside an RDBMS.
 * 
 * @author Laszlo Hornyak
 */
public class JavaUtilExamples {

	/**
	 * Get stringified property from serialized object. More documentation than code.
	 * 
	 * @param sObject							A serialized object
	 * @param property							the name of the property to get from the class
	 * @return									the String representation of the value of the property of the object
	 * @throws IOException						on IO error
	 * @throws ClassNotFoundException			if the object is of a class that is not available in the VM
	 * @throws IllegalAccessException			if the poperty is not available
	 * @throws InvocationTargetException		if the getter method throws an exception
	 * @throws NoSuchMethodException			if no getter method for the property
	 * 
	 * @j4sql.function name="get_property" deterministic="true" sqlAccess="no"
	 * 
	 */
	public static String getProperty(byte[] sObject, String property)
			throws IOException, ClassNotFoundException, IllegalAccessException,
			InvocationTargetException, NoSuchMethodException {
		ByteArrayInputStream bis = new ByteArrayInputStream(sObject);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Object obj = ois.readObject();
		return BeanUtils.getSimpleProperty(obj, property);
	}

}