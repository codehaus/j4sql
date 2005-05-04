package org.j4sql.annotation.extractor;
/**
 * @author Thomas Hallgren
 */
public class UnrecognizedAttributeException extends IllegalArgumentException
{
	UnrecognizedAttributeException(String attributeName)
	{
		super("The attribute " + attributeName + " is not recognized");
	}
}
