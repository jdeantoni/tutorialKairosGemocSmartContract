// AspectJ classes that have been aspectized and name
package fr.inria.kairos.tuto.simplelanguage;
public aspect AspectJEvent{
void around (fr.inria.kairos.tuto.simplelanguage.Event self)  :target (self) && (call ( void fr.inria.kairos.tuto.simplelanguage.Event.fire(  ) ) ) { fr.inria.kairos.tuto.simplelanguage.semantics.rewritingrules.EventAspect.fire(self );}

}
