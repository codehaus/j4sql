package org.j4sql.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Thomas Hallgren
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface Function
{
	enum OnNullInput { CALLED, RETURNS_NULL };

	enum Security { INVOKER, DEFINER };

	enum Type { IMMUTABLE, STABLE, VOLATILE };

	/**
	 * The element type in case the annotated function returns a
	 * <code>SETOF &lt;complex type&gt;</code>
	 */
	String complexType() default "";

	/**
	 * The name of the function. This is optional. The default is
	 * to use the name of the annotated method.
	 */
	String name() default "";

	/**
	 * The name of the schema if any.
	 */
	String schema() default "";

	/**
	 * Defines what should happen when input to the function
	 * is null.
	 */
	OnNullInput onNullInput() default OnNullInput.CALLED;

	/**
	 * Sets the security for the function invocation.
	 */
	Security security() default Security.INVOKER;

	/**
	 * The type of the function.
	 */
	Type type() default Type.VOLATILE;

	/**
	 * The Triggers that will call this function (if any).
	 */
	Trigger[] triggers() default {};
}
