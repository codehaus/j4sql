package org.j4sql.annotation.extractor;

import org.objectweb.asm.AnnotationVisitor;

/**
 * An <code>AnnotationVisitor</code> implementation that does nothing at all.
 * It is intended to be subclassed.
 * @author Thomas Hallgren
 */
public class DefaultAnnotationVisitor implements AnnotationVisitor
{
	public void visit(String name, Object value)
	{
	}

	public void visitEnum(String name, String desc, String value)
	{
	}

	public AnnotationVisitor visitAnnotation(String name, String desc)
	{
		return null;
	}

	public AnnotationVisitor visitArray(String name)
	{
		return null;
	}

	public void visitEnd()
	{
	}
}
