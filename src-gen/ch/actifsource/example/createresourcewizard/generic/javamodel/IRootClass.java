package ch.actifsource.example.createresourcewizard.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRootClass extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1ec6bd95-bed3-11eb-a569-918f3c9a692e");
  
  public java.lang.String selectInitString();
  
  public java.lang.Boolean selectInitBoolean();
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.createresourcewizard.generic.javamodel.ITargetObjects> selectInitAssociation();
  
  public java.util.List<? extends ch.actifsource.core.javamodel.IColor> selectInitEnum();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1ec6bd95-bed3-11eb-a569-918f3c9a692e,chfpz6l/tTnq4hLtlrUnsWRgGqo=] */
