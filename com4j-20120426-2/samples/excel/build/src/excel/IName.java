package excel  ;

import com4j.*;

@IID("{000208B9-0001-0000-C000-000000000046}")
public interface IName extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  @DefaultMethod
  java.lang.String get_Default();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int getIndex();


  /**
   * <p>
   * Getter method for the COM property "Category"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  java.lang.String getCategory(
    @LCID int lcidIn);


  /**
   * <p>
   * Setter method for the COM property "Category"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(13)
  void setCategory(
    @LCID int lcidIn,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "CategoryLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String getCategoryLocal();


  /**
   * <p>
   * Setter method for the COM property "CategoryLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(15)
  void setCategoryLocal(
    java.lang.String rhs);


  /**
   */

  @VTID(16)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "MacroType"
   * </p>
   * @return  Returns a value of type excel.XlXLMMacroType
   */

  @VTID(17)
  excel.XlXLMMacroType getMacroType();


  /**
   * <p>
   * Setter method for the COM property "MacroType"
   * </p>
   * @param rhs Mandatory excel.XlXLMMacroType parameter.
   */

  @VTID(18)
  void setMacroType(
    excel.XlXLMMacroType rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(19)
  java.lang.String getName(
    @LCID int lcidIn);


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(20)
  void setName(
    @LCID int lcidIn,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersTo"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getRefersTo(
    @LCID int lcidIn);


  /**
   * <p>
   * Setter method for the COM property "RefersTo"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(22)
  void setRefersTo(
    @LCID int lcidIn,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ShortcutKey"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(23)
  java.lang.String getShortcutKey();


  /**
   * <p>
   * Setter method for the COM property "ShortcutKey"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(24)
  void setShortcutKey(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(25)
  java.lang.String getValue();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(26)
  void setValue(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(27)
  boolean getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(28)
  void setVisible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "NameLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(29)
  java.lang.String getNameLocal();


  /**
   * <p>
   * Setter method for the COM property "NameLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(30)
  void setNameLocal(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersToLocal"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getRefersToLocal();


  /**
   * <p>
   * Setter method for the COM property "RefersToLocal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(32)
  void setRefersToLocal(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersToR1C1"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getRefersToR1C1(
    @LCID int lcidIn);


  /**
   * <p>
   * Setter method for the COM property "RefersToR1C1"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(34)
  void setRefersToR1C1(
    @LCID int lcidIn,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersToR1C1Local"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getRefersToR1C1Local();


  /**
   * <p>
   * Setter method for the COM property "RefersToR1C1Local"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(36)
  void setRefersToR1C1Local(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersToRange"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(37)
  excel.Range getRefersToRange();


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(38)
  java.lang.String getComment();


  /**
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(39)
  void setComment(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "WorkbookParameter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(40)
  boolean getWorkbookParameter();


  /**
   * <p>
   * Setter method for the COM property "WorkbookParameter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(41)
  void setWorkbookParameter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ValidWorkbookParameter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(42)
  boolean getValidWorkbookParameter();


  // Properties:
}
