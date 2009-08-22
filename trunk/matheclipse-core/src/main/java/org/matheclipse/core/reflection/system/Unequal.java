package org.matheclipse.core.reflection.system;

import static org.matheclipse.basic.Util.checkCanceled;

import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;

public class Unequal extends Equal {

	public Unequal() {
	}

	@Override
	public IExpr evaluate(final IAST lst) {
		if (lst.size() > 1) {
			int b = 0;
			IAST result = (IAST) lst.clone();
			int i = 2;
			int j;
			while (i < result.size()) {
				checkCanceled();
				j = i;
				while (j < result.size()) {
					checkCanceled();
					b = compare(result.get(i - 1), result.get(j++));
					if (b == (1)) {
						return F.False;
					}
					if (b == 0) {
						return null;
					}
				}
				i++;
			}
			return F.True;

		}
		return null;
	}

}