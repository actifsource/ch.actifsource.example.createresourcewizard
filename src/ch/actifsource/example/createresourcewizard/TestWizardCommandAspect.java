package ch.actifsource.example.createresourcewizard;

import javax.annotation.CheckForNull;
import ch.actifsource.core.INode;
import ch.actifsource.core.PackagedResource;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.set.INodeList;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.ui.wizard.newresource.aspect.IWizardCommandAspect;
import ch.actifsource.util.collection.IMap;
import ch.actifsource.util.filter.IFilter;

public class TestWizardCommandAspect implements IWizardCommandAspect {

  /**
   * Returns the initial value from the field.
   */
  @CheckForNull
  public INodeList getInitialValue(IReadJobExecutor executor, String fieldName) {
    // TODO User implementation
    return null;
  }
 
  /**
   * Returns the node range filter from the field. 
   * @param fieldName
   * @return
   */
  @CheckForNull 
  public IFilter<INode> getValueFilter(IReadJobExecutor executor, String fieldName) {
    // TODO User implementation
    return null;
  }
    
  /**
   * Returns true if the editor field is enabled or false if disabled.
   * Returns null if no change.
   */
  @CheckForNull
  public Boolean isEnabled(IReadJobExecutor executor, String fieldName, IMap<String, INodeList> fieldNameToValuesMap) {
    // TODO User implementation
    return null;
  }
  
  /**
   * Run the finish action if the wizard is finished.
   * @param modifiable              Global modifications allowed
   * @param resource                New resource resource 
   * @param fieldNameToValuesMap    Field values.
   */
  public void runFinish(IModifiable modifiable, PackagedResource resource, IMap<String, INodeList> fieldNameToValuesMap) {
    // TODO User implementation
  }

}
