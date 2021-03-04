package fr.inria.kairos.tuto.simplelanguage.semantics.rewritingrules;

import fr.inria.kairos.tuto.simplelanguage.SmartContract
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.kairos.tuto.simplelanguage.State
import fr.inria.kairos.tuto.simplelanguage.Event

import static extension fr.inria.kairos.tuto.simplelanguage.semantics.rewritingrules.SmartContractAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod

@Aspect(className = SmartContract)
class SmartContractAspect{
	public var State currentState
	
	@InitializeModel
	def void initialize(String[] unused){
		println("initialize")
		_self.currentState = _self.initialState
	}
}



@Aspect (className = Event)
class EventAspect{
	@Step
	@ReplaceAspectMethod
	def void fire(){
		println("fire "+_self.name)
		(_self.eContainer as SmartContract).currentState = _self.targetState
	}
	
}
