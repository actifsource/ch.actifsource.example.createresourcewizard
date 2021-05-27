package ch.actifsource.example.createresourcewizard.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RootClass extends DynamicResource implements IRootClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRootClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRootClass>() {
    
    @Override
    public IRootClass create() {
      return new RootClass();
    }
    
    @Override
    public IRootClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RootClass(resourceRepository, resource);
    }
  
  };

  public RootClass() {
    super(IRootClass.TYPE_ID);
  }
  
  public RootClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRootClass.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectInitBoolean() {
    return _getSingleAttribute(java.lang.Boolean.class, ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initBoolean);
  }
    
  public void setInitBoolean(java.lang.Boolean initBoolean) {
     _setSingleAttribute(ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initBoolean, initBoolean);
  }

  @Override
  public java.lang.String selectInitString() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initString);
  }
    
  public void setInitString(java.lang.String initString) {
     _setSingleAttribute(ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initString, initString);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.example.createresourcewizard.generic.javamodel.ITargetObjects> selectInitAssociation() {
    return _getList(ch.actifsource.example.createresourcewizard.generic.javamodel.ITargetObjects.class, ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initAssociation);
  }

  public RootClass setInitAssociation(java.util.List<? extends ch.actifsource.example.createresourcewizard.generic.javamodel.ITargetObjects> initAssociation) {
    _setList(ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initAssociation, initAssociation);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.core.javamodel.IColor> selectInitEnum() {
    return _getList(ch.actifsource.core.javamodel.IColor.class, ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initEnum);
  }

  public RootClass setInitEnum(java.util.List<? extends ch.actifsource.core.javamodel.IColor> initEnum) {
    _setList(ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initEnum, initEnum);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RootClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initBoolean, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initString, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.createresourcewizard.generic.javamodel.ITargetObjects.class, ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initAssociation, visitor);
    _acceptList(ch.actifsource.core.javamodel.IColor.class, ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initEnum, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.example.createresourcewizard.generic.javamodel.IRootClass> selectToMeInitAssociation(ch.actifsource.example.createresourcewizard.generic.javamodel.ITargetObjects object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.createresourcewizard.generic.javamodel.IRootClass.class, ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initAssociation, object.getResource());
  }
  
  public static java.util.List<ch.actifsource.example.createresourcewizard.generic.javamodel.IRootClass> selectToMeInitEnum(ch.actifsource.core.javamodel.IColor object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.createresourcewizard.generic.javamodel.IRootClass.class, ch.actifsource.example.createresourcewizard.generic.GenericPackage.RootClass_initEnum, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1ec6bd95-bed3-11eb-a569-918f3c9a692e,q1XV4w2OW1fFly6GwuA7hmOaps4=] */
