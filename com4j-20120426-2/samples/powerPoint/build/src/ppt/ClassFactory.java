package ppt  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  public static ppt._Application createApplication() {
    return COM4J.createInstance( ppt._Application.class, "{91493441-5A91-11CF-8700-00AA0060263B}" );
  }

  public static ppt._Global createGlobal() {
    return COM4J.createInstance( ppt._Global.class, "{91493443-5A91-11CF-8700-00AA0060263B}" );
  }

  public static ppt.OCXExtender createOLEControl() {
    return COM4J.createInstance( ppt.OCXExtender.class, "{91493446-5A91-11CF-8700-00AA0060263B}" );
  }

  public static ppt._PowerRex createPowerRex() {
    return COM4J.createInstance( ppt._PowerRex.class, "{91493448-5A91-11CF-8700-00AA0060263B}" );
  }
}
