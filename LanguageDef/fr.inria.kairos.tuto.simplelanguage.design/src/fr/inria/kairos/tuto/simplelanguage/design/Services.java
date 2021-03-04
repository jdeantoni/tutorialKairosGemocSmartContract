package fr.inria.kairos.tuto.simplelanguage.design;

import fr.inria.kairos.tuto.simplelanguage.SmartContract;
import fr.inria.kairos.tuto.simplelanguage.State;
import simplelanguage.xdsml.api.impl.SimplelanguageRTDAccessor;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public State getCurrentState(SmartContract self) {
      return SimplelanguageRTDAccessor.getcurrentState(self);
    }
}
