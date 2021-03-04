import 'http://www.inria.fr/teams/kairos/simplelanguage'
import _'http://www.eclipse.org/emf/2002/Ecore'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

package simplelanguage

	 --add DSE and MoCCML mapping here
	 
  context State
	def : enterIt : Event = self 
	def : leaveIt : Event = self

  context _'Event'
  	def : occurs : Event = self.fire()
  	
  	-- add behavioral invariant
  	
  context State
  	inv enterBeforeLeavingNonRentrant:
  		Relation Alternates(self.enterIt, self.leaveIt)
  
  context _'Event'
  	inv occursMeansLeavingSourceState:
  		Relation Coincides(self.occurs, self.sourceState.leaveIt)
  	
  	inv occursMeansEnteringLaterInTargetState_notForInitialState:
  		(self.oclAsType(ecore::EObject).eContainer().oclAsType(SmartContract).initialState
  			<>
  		 self.targetState
  		) implies
  			Relation Precedes(self.occurs, self.targetState.enterIt)
  
    inv occursMeansEnteringLaterInTargetState_initialState:
  		(self.oclAsType(ecore::EObject).eContainer().oclAsType(SmartContract).initialState
  			=
  		 self.targetState
  		) implies
  			let theDelay : Integer = 1 in
  			let targetEnterDelayedByOne : Event = Expression DelayFor(
  										self.targetState.enterIt,
  										self.targetState.enterIt,
  										theDelay
  			) in
  			Relation Precedes(self.occurs, targetEnterDelayedByOne)

 endpackage