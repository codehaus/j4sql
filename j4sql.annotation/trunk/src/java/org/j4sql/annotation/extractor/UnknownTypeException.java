package org.j4sql.annotation.extractor;

/**
 * @author Thomas Hallgren
 */
public class UnknownTypeException extends RuntimeException
{
	UnknownTypeException(GenericType type)
	{
		super("Don't know how to map " + type.getClassName() + " to a SQL type");
	}
}
