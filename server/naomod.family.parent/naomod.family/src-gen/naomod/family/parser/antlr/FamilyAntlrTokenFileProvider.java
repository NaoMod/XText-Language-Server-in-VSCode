/*
 * generated by Xtext 2.24.0
 */
package naomod.family.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FamilyAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("naomod/family/parser/antlr/internal/InternalFamily.tokens");
	}
}
