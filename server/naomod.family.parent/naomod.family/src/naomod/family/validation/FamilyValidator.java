/*
 * generated by Xtext 2.25.0
 */
package naomod.family.validation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


import org.eclipse.xtext.validation.Check;

import naomod.family.family.Family;
import naomod.family.family.FamilyPackage;
import naomod.family.family.Person;
import naomod.family.family.Relation;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class FamilyValidator extends AbstractFamilyValidator {
	
	
	/** Checks that the same person doesn't appear multiple times in a parents' declaration.
	 * @param relation
	 */
	@Check
	public void checkParents(Relation relation) {
		Person person = relation.getPerson();
		Person parentOne = relation.getParentOne();
		Person parentTwo = relation.getParentTwo();
		
		if (person==parentOne) error("Parents have to be different to their child.", FamilyPackage.Literals.RELATION__PARENT_ONE);
		if (person==parentTwo) error("Parents have to be different to their child.", FamilyPackage.Literals.RELATION__PARENT_TWO);
		if (parentOne==parentTwo) error("Parents have to be unique.", FamilyPackage.Literals.RELATION__PARENT_TWO);
	}
	
	
	/** Checks that for the same person, a maximum of one parents' declaration can exist.
	 * @param family
	 */
	@Check
	public void checkUniqueParentsRelation(Family family) {
		Set<Person> personsWithParents = new HashSet<>();
		for (Relation relation : family.getRelations()) {
			if (!personsWithParents.add(relation.getPerson())) error("A person can only have one parents' declaration.", FamilyPackage.Literals.FAMILY__RELATIONS);
		}
	}
	
	
	/** Checks that the family tree doesn't contain cycles.
	 * @param family
	 */
	@Check
	public void checkCoherence(Family family) {
		Map<Person, Set<Person>> parents = new HashMap<>();
		for (Relation relation : family.getRelations()) {
			Person currentPerson = relation.getPerson();
			
			Set<Person> currentPersonParents = new HashSet<>();
			currentPersonParents.add(relation.getParentOne());
			currentPersonParents.add(relation.getParentTwo());
			checkCoherence(currentPerson, currentPersonParents, parents);
			
			parents.put(currentPerson, currentPersonParents);
		}
	}


	/** Checks that the ID of each person is unique.
	 * @param family
	 */
	@Check
	public void checkIDsUniqueness(Family family) {
		Set<String> ids = new HashSet<>();
		for (Person person : family.getMembers()) {
			if (!ids.add(person.getName())) error("IDs need to be unique.", FamilyPackage.Literals.FAMILY__MEMBERS);
		}
	}
	
	
	private void checkCoherence(Person currentPerson, Set<Person> ancestors, Map<Person, Set<Person>> parents) {
		Iterator<Person> ite = ancestors.iterator();
		Set<Person> ancestorOneParents = parents.get(ite.next());
		Set<Person> ancestorTwoParents = parents.get(ite.next());
		
		boolean isAncestorOneCoherent = ancestorOneParents==null || !ancestorOneParents.contains(currentPerson);
		boolean isAncestorTwoCoherent = ancestorTwoParents==null || !ancestorTwoParents.contains(currentPerson);
		
		if (isAncestorOneCoherent && isAncestorTwoCoherent) {
			if (ancestorOneParents!=null) checkCoherence(currentPerson, ancestorOneParents, parents);
			if (ancestorTwoParents!=null) checkCoherence(currentPerson, ancestorTwoParents, parents);
		} else {
			error("There is an incoherence in the family tree.", FamilyPackage.Literals.FAMILY__RELATIONS);
		}
	}
}
