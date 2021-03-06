/*
 * generated by Xtext 2.24.0
 */
package naomod.family.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import naomod.family.ide.contentassist.antlr.internal.InternalFamilyParser;
import naomod.family.services.FamilyGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class FamilyParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(FamilyGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, FamilyGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFamilyAccess().getGroup(), "rule__Family__Group__0");
			builder.put(grammarAccess.getPersonAccess().getGroup(), "rule__Person__Group__0");
			builder.put(grammarAccess.getRelationAccess().getGroup(), "rule__Relation__Group__0");
			builder.put(grammarAccess.getFamilyAccess().getMembersAssignment_0(), "rule__Family__MembersAssignment_0");
			builder.put(grammarAccess.getFamilyAccess().getRelationsAssignment_1(), "rule__Family__RelationsAssignment_1");
			builder.put(grammarAccess.getPersonAccess().getFirstNameAssignment_1(), "rule__Person__FirstNameAssignment_1");
			builder.put(grammarAccess.getPersonAccess().getLastNameAssignment_2(), "rule__Person__LastNameAssignment_2");
			builder.put(grammarAccess.getPersonAccess().getNameAssignment_4(), "rule__Person__NameAssignment_4");
			builder.put(grammarAccess.getRelationAccess().getPersonAssignment_0(), "rule__Relation__PersonAssignment_0");
			builder.put(grammarAccess.getRelationAccess().getParentOneAssignment_2(), "rule__Relation__ParentOneAssignment_2");
			builder.put(grammarAccess.getRelationAccess().getParentTwoAssignment_4(), "rule__Relation__ParentTwoAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private FamilyGrammarAccess grammarAccess;

	@Override
	protected InternalFamilyParser createParser() {
		InternalFamilyParser result = new InternalFamilyParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FamilyGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FamilyGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
