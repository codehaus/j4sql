package org.j4sql.annotation.extractor;


/**
 * @author Thomas Hallgren
 */
public class MissingAttributeException extends RuntimeException
{
	MissingAttributeException(String attributeName)
	{
		super("The required attribute " + attributeName + " has no value");
	}
}
