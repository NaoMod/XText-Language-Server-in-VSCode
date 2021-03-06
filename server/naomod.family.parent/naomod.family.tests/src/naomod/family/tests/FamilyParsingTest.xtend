/*
 * generated by Xtext 2.25.0
 */
package naomod.family.tests

import com.google.inject.Inject
import naomod.family.family.Family
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(FamilyInjectorProvider)
class FamilyParsingTest {
	@Inject
	ParseHelper<Family> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Person A A id=a;
			Person B B id=b;
			Person C C id=c;
			
			a isChildOf c and b;
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
