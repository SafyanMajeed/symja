package org.matheclipse.core.reflection.system;

import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

public class Through extends AbstractFunctionEvaluator {

	public Through() {
	}

	@Override 
	public IExpr evaluate(final IAST functionList) {
		if (functionList.size() != 2 && functionList.size() != 3) {
			return null;
		}
		if ((functionList.get(1) instanceof IAST)) {
			IAST l1 = (IAST) functionList.get(1);
			IExpr h = l1.getHeader();
			if (h instanceof IAST) {

				IAST clonedList;
				IAST l2 = (IAST) h;
				if (functionList.size() == 3 && !l2.getHeader().equals(functionList.get(2))) {
					return l1;
				}
				IAST result = F.ast(l2.getHeader());
				for (int i = 1; i < l2.size(); i++) {
					if (l1.get(i) instanceof ISymbol || l2.get(i) instanceof IAST) {
						clonedList = (IAST) l1.clone();
						clonedList.setHeader(l2.get(i));
						result.add(clonedList);
					} else {
						result.add(l2.get(i));
					}
				}
				return result;
			}
			return l1;
		}
		return functionList.get(1);
	}
}
