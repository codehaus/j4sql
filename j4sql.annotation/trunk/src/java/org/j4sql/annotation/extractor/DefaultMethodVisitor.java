package org.j4sql.annotation.extractor;

import org.objectweb.asm.Attribute;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

/**
 * A <code>MethodVisitor</code> implementation that does nothing at all.
 * It is intended to be subclassed.
 * @author Thomas Hallgren
 */
public class DefaultMethodVisitor implements MethodVisitor
{
	public AnnotationVisitor visitAnnotationDefault()
	{
		return null;
	}

	public AnnotationVisitor visitAnnotation(String desc, boolean visible)
	{
		return null;
	}

	public AnnotationVisitor visitParameterAnnotation(int parameter,
		String desc, boolean visible)
	{
		return null;
	}

	public void visitAttribute(Attribute attr)
	{
	}

	public void visitInsn(int opcode)
	{
	}

	public void visitIntInsn(int opcode, int operand)
	{
	}

	public void visitVarInsn(int opcode, int var)
	{
	}

	public void visitTypeInsn(int opcode, String desc)
	{
	}

	public void visitFieldInsn(int opcode, String owner, String name,
		String desc)
	{
	}

	public void visitMethodInsn(int opcode, String owner, String name,
		String desc)
	{
	}

	public void visitJumpInsn(int opcode, Label label)
	{
	}

	public void visitLabel(Label label)
	{
	}

	public void visitLdcInsn(Object cst)
	{
	}

	public void visitIincInsn(int var, int increment)
	{
	}

	public void visitTableSwitchInsn(int min, int max, Label dflt,
		Label[] labels)
	{
	}
	public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels)
	{
	}

	public void visitMultiANewArrayInsn(String desc, int dims)
	{
	}

	public void visitTryCatchBlock(Label start, Label end, Label handler,
		String type)
	{
	}

	public void visitLocalVariable(String name, String desc, String signature,
		Label start, Label end, int index)
	{
	}

	public void visitLineNumber(int line, Label start)
	{
	}

	public void visitMaxs(int maxStack, int maxLocals)
	{
	}

	public void visitEnd()
	{
	}
}
