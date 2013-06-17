package org.animals;

import org.animals.base.Animal;
import org.animals.birds.Duck;
import org.mixins4j.Mixin;

@Mixin(superclass = Animal.class, delegates = {Duck.class, Dog.class})
public class Mutant extends AnimalMixin {

	public static void main(String[] args) {
		Mutant mutant = new Mutant();
		mutant.bark();
		mutant.quack();
		mutant.run();
	}
}
