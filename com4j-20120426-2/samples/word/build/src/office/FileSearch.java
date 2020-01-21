package office  ;

import com4j.*;

@IID("{000C0332-0000-0000-C000-000000000046}")
public interface FileSearch extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "SearchSubFolders"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  boolean searchSubFolders();


  /**
   * <p>
   * Setter method for the COM property "SearchSubFolders"
   * </p>
   * @param searchSubFoldersRetVal Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  void searchSubFolders(
    boolean searchSubFoldersRetVal);


  /**
   * <p>
   * Getter method for the COM property "MatchTextExactly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  boolean matchTextExactly();


  /**
   * <p>
   * Setter method for the COM property "MatchTextExactly"
   * </p>
   * @param matchTextRetVal Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  void matchTextExactly(
    boolean matchTextRetVal);


  /**
   * <p>
   * Getter method for the COM property "MatchAllWordForms"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  boolean matchAllWordForms();


  /**
   * <p>
   * Setter method for the COM property "MatchAllWordForms"
   * </p>
   * @param matchAllWordFormsRetVal Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  void matchAllWordForms(
    boolean matchAllWordFormsRetVal);


  /**
   * <p>
   * Getter method for the COM property "FileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String fileName();


  /**
   * <p>
   * Setter method for the COM property "FileName"
   * </p>
   * @param fileNameRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  void fileName(
    java.lang.String fileNameRetVal);


  /**
   * <p>
   * Getter method for the COM property "FileType"
   * </p>
   * @return  Returns a value of type office.MsoFileType
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoFileType fileType();


  /**
   * <p>
   * Setter method for the COM property "FileType"
   * </p>
   * @param fileTypeRetVal Mandatory office.MsoFileType parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  void fileType(
    office.MsoFileType fileTypeRetVal);


  /**
   * <p>
   * Getter method for the COM property "LastModified"
   * </p>
   * @return  Returns a value of type office.MsoLastModified
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  office.MsoLastModified lastModified();


  /**
   * <p>
   * Setter method for the COM property "LastModified"
   * </p>
   * @param lastModifiedRetVal Mandatory office.MsoLastModified parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  void lastModified(
    office.MsoLastModified lastModifiedRetVal);


  /**
   * <p>
   * Getter method for the COM property "TextOrProperty"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String textOrProperty();


  /**
   * <p>
   * Setter method for the COM property "TextOrProperty"
   * </p>
   * @param textOrProperty Mandatory java.lang.String parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  void textOrProperty(
    java.lang.String textOrProperty);


  /**
   * <p>
   * Getter method for the COM property "LookIn"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String lookIn();


  /**
   * <p>
   * Setter method for the COM property "LookIn"
   * </p>
   * @param lookInRetVal Mandatory java.lang.String parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(24)
  void lookIn(
    java.lang.String lookInRetVal);


  /**
   * @param sortBy Optional parameter. Default value is 1
   * @param sortOrder Optional parameter. Default value is 1
   * @param alwaysAccurate Optional parameter. Default value is false
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(25)
  int execute(
    @Optional @DefaultValue("1") office.MsoSortBy sortBy,
    @Optional @DefaultValue("1") office.MsoSortOrder sortOrder,
    @Optional @DefaultValue("-1") boolean alwaysAccurate);


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  void newSearch();


  /**
   * <p>
   * Getter method for the COM property "FoundFiles"
   * </p>
   * @return  Returns a value of type office.FoundFiles
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  office.FoundFiles foundFiles();


  @VTID(27)
  @ReturnValue(defaultPropertyThrough={office.FoundFiles.class})
  java.lang.String foundFiles(
    int index,
    @LCID int lcid);

  /**
   * <p>
   * Getter method for the COM property "PropertyTests"
   * </p>
   * @return  Returns a value of type office.PropertyTests
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  office.PropertyTests propertyTests();


  @VTID(28)
  @ReturnValue(defaultPropertyThrough={office.PropertyTests.class})
  office.PropertyTest propertyTests(
    int index,
    @LCID int lcid);

  /**
   * <p>
   * Getter method for the COM property "SearchScopes"
   * </p>
   * @return  Returns a value of type office.SearchScopes
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(29)
  office.SearchScopes searchScopes();


  @VTID(29)
  @ReturnValue(defaultPropertyThrough={office.SearchScopes.class})
  office.SearchScope searchScopes(
    int index);

  /**
   * <p>
   * Getter method for the COM property "SearchFolders"
   * </p>
   * @return  Returns a value of type office.SearchFolders
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(30)
  office.SearchFolders searchFolders();


  @VTID(30)
  @ReturnValue(defaultPropertyThrough={office.SearchFolders.class})
  office.ScopeFolder searchFolders(
    int index);

  /**
   * <p>
   * Getter method for the COM property "FileTypes"
   * </p>
   * @return  Returns a value of type office.FileTypes
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(31)
  office.FileTypes fileTypes();


  @VTID(31)
  @ReturnValue(defaultPropertyThrough={office.FileTypes.class})
  office.MsoFileType fileTypes(
    int index);

  /**
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(32)
  void refreshScopes();


  // Properties:
}
