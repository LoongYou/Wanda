package word  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  public static word._Global createGlobal() {
    return COM4J.createInstance( word._Global.class, "{000209F0-0000-0000-C000-000000000046}" );
  }

  public static word._Application createApplication() {
    return COM4J.createInstance( word._Application.class, "{000209FF-0000-0000-C000-000000000046}" );
  }

  public static word._Document createDocument() {
    return COM4J.createInstance( word._Document.class, "{00020906-0000-0000-C000-000000000046}" );
  }

  public static word._Font createFont() {
    return COM4J.createInstance( word._Font.class, "{000209F5-0000-0000-C000-000000000046}" );
  }

  public static word._ParagraphFormat createParagraphFormat() {
    return COM4J.createInstance( word._ParagraphFormat.class, "{000209F4-0000-0000-C000-000000000046}" );
  }

  public static word._OLEControl createOLEControl() {
    return COM4J.createInstance( word._OLEControl.class, "{000209F2-0000-0000-C000-000000000046}" );
  }

  public static word._LetterContent createLetterContent() {
    return COM4J.createInstance( word._LetterContent.class, "{000209F1-0000-0000-C000-000000000046}" );
  }
}
