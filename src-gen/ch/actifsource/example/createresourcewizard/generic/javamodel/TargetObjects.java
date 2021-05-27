package ch.actifsource.example.createresourcewizard.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TargetObjects extends DynamicResource implements ITargetObjects {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITargetObjects> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITargetObjects>() {
    
    @Override
    public ITargetObjects create() {
      return new TargetObjects();
    }
    
    @Override
    public ITargetObjects create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TargetObjects(resourceRepository, resource);
    }
  
  };

  public TargetObjects() {
    super(ITargetObjects.TYPE_ID);
  }
  
  public TargetObjects(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITargetObjects.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TargetObjects setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,49d8be2c-bed3-11eb-a569-918f3c9a692e,dHZJKj4m5/JPnBMfskzSLZlnyuc=] */
