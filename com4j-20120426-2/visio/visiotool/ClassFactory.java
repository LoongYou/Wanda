package visiotool  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * A running instance of Visio. ProgId: "Visio.Application"
   */
  public static visiotool.IVApplication createApplication() {
    return COM4J.createInstance( visiotool.IVApplication.class, "{00021A20-0000-0000-C000-000000000046}" );
  }

  /**
   * The object to create to make an invisible Visio instance. ProgId: "Visio.InvisibleApp".
   */
  public static visiotool.IVInvisibleApp createInvisibleApp() {
    return COM4J.createInstance( visiotool.IVInvisibleApp.class, "{000D0A26-0000-0000-C000-000000000046}" );
  }
}
