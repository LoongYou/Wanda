package vba  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  public static vba._Windows createWindows() {
    return COM4J.createInstance( vba._Windows.class, "{0002E185-0000-0000-C000-000000000046}" );
  }

  public static vba._LinkedWindows createLinkedWindows() {
    return COM4J.createInstance( vba._LinkedWindows.class, "{0002E187-0000-0000-C000-000000000046}" );
  }

  public static vba._ReferencesEvents createReferencesEvents() {
    return COM4J.createInstance( vba._ReferencesEvents.class, "{0002E119-0000-0000-C000-000000000046}" );
  }

  public static vba._CommandBarControlEvents createCommandBarEvents() {
    return COM4J.createInstance( vba._CommandBarControlEvents.class, "{0002E132-0000-0000-C000-000000000046}" );
  }

  public static vba._ProjectTemplate createProjectTemplate() {
    return COM4J.createInstance( vba._ProjectTemplate.class, "{32CDF9E0-1602-11CE-BFDC-08002B2B8CDA}" );
  }

  public static vba._VBProject createVBProject() {
    return COM4J.createInstance( vba._VBProject.class, "{0002E169-0000-0000-C000-000000000046}" );
  }

  public static vba._VBProjects createVBProjects() {
    return COM4J.createInstance( vba._VBProjects.class, "{0002E101-0000-0000-C000-000000000046}" );
  }

  public static vba._Components createComponents() {
    return COM4J.createInstance( vba._Components.class, "{BE39F3D6-1B13-11D0-887F-00A0C90F2744}" );
  }

  public static vba._VBComponents createVBComponents() {
    return COM4J.createInstance( vba._VBComponents.class, "{BE39F3D7-1B13-11D0-887F-00A0C90F2744}" );
  }

  public static vba._Component createComponent() {
    return COM4J.createInstance( vba._Component.class, "{BE39F3D8-1B13-11D0-887F-00A0C90F2744}" );
  }

  public static vba._VBComponent createVBComponent() {
    return COM4J.createInstance( vba._VBComponent.class, "{BE39F3DA-1B13-11D0-887F-00A0C90F2744}" );
  }

  public static vba._Properties createProperties() {
    return COM4J.createInstance( vba._Properties.class, "{0002E18B-0000-0000-C000-000000000046}" );
  }

  public static vba._AddIns createAddins() {
    return COM4J.createInstance( vba._AddIns.class, "{DA936B63-AC8B-11D1-B6E5-00A0C90F2744}" );
  }

  public static vba._CodeModule createCodeModule() {
    return COM4J.createInstance( vba._CodeModule.class, "{0002E170-0000-0000-C000-000000000046}" );
  }

  public static vba._CodePanes createCodePanes() {
    return COM4J.createInstance( vba._CodePanes.class, "{0002E174-0000-0000-C000-000000000046}" );
  }

  public static vba._CodePane createCodePane() {
    return COM4J.createInstance( vba._CodePane.class, "{0002E178-0000-0000-C000-000000000046}" );
  }

  public static vba._References createReferences() {
    return COM4J.createInstance( vba._References.class, "{0002E17C-0000-0000-C000-000000000046}" );
  }
}
