package org.j4sql.annotation.extractor;


/**
 * @author Thomas Hallgren
 */
public class MalformedTriggerException extends RuntimeException
{
	MalformedTriggerException(FunctionVisitor function)
	{
		super("Function " + function.getClassName() +
			'.' + function.getMethodName() +
			" is not a valid trigger function");
	}
}
