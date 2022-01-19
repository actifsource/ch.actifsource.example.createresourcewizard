package ch.actifsource.example.createresourcewizard;

import javax.annotation.CheckForNull;
import ch.actifsource.core.INode;
import ch.actifsource.core.PackagedResource;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.set.INodeList;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.util.NodeUtil;
import ch.actifsource.ui.wizard.newresource.aspect.IWizardCommandAspect;
import ch.actifsource.util.collection.IMap;
import ch.actifsource.util.filter.IFilter;

public class TestWizardCommandAspect implements IWizardCommandAspect {

  /**
   * Returns the initial value from the field.
   */
  @Override
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
  @Override
  @CheckForNull 
  public IFilter<INode> getValueFilter(IReadJobExecutor executor, String fieldName) {
    // TODO User implementation
    return null;
  }
    
  /**
   * Returns the preferred value from the field.
   */
  @Override
  @CheckForNull
  public INodeList getValue(IReadJobExecutor executor, String fieldName, IMap<String, INodeList> fieldNameToValuesMap) {
    if (!fieldName.equals("BooleanLiteralRangeTest")) return null;
    
    INodeList nodes = fieldNameToValuesMap.get("BooleanAttributeRangeTest");
    if (nodes == null) return null;
    
    if (LiteralUtil.getBooleanValue(nodes.getFirstOrNull(), false)) {
      return null;
    }
    return NodeUtil.asNodeList(LiteralUtil.create(false));
  }
  
  /**
   * Returns true if the editor field is enabled or false if disabled.
   * Returns null if no change.
   */
  @Override
  @CheckForNull
  public Boolean isEnabled(IReadJobExecutor executor, String fieldName, IMap<String, INodeList> fieldNameToValuesMap) {
    if (!fieldName.equals("BooleanLiteralRangeTest")) return null;
    
    INodeList nodes = fieldNameToValuesMap.get("BooleanAttributeRangeTest");
    if (nodes == null) return false;
    return LiteralUtil.getBooleanValue(nodes.getFirstOrNull(), true);
  }
  
  /**
   * Run the finish action if the wizard is finished.
   * @param modifiable              Global modifications allowed
   * @param resource                New resource resource 
   * @param fieldNameToValuesMap    Field values.
   */
  @Override
  public void runFinish(IModifiable modifiable, PackagedResource resource, IMap<String, INodeList> fieldNameToValuesMap) {
    // TODO User implementation
  }

}
