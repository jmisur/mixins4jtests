mixins4j
========

Enhancing java with mixins.
You can write code such as:

    @Mixin(superclass = Animal.class, delegates = {Duck.class, Dog.class})
    public class Mutant extends AnimalMixin {
    
      public static void main(String[] args) {
        Mutant mutant = new Mutant();
        mutant.bark();
        mutant.quack();
        mutant.run();
      }
    }

Class `Mutant` will inherit all inheritable methods from `Animal`, `Duck` and `Dog`.
Class `AnimalMixin` will be generated by java processor and will extend class `Animal`.

Inspired by [javadude annotations] https://code.google.com/p/javadude/

Installation
------------
Import project to eclipse and export as jar.
Import jar into [mixins4jtests](https://github.com/jmisur/mixins4jtests) and set up as java preprocessor.
