package word  ;

import com4j.*;

@IID("{000209A1-0000-0000-C000-000000000046}")
public interface _LetterContent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Duplicate"
   * </p>
   * @return  Returns a value of type word._LetterContent
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  word._LetterContent duplicate();


  /**
   * <p>
   * Getter method for the COM property "DateFormat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String dateFormat();


  /**
   * <p>
   * Setter method for the COM property "DateFormat"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  void dateFormat(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "IncludeHeaderFooter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(13)
  boolean includeHeaderFooter();


  /**
   * <p>
   * Setter method for the COM property "IncludeHeaderFooter"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  void includeHeaderFooter(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PageDesign"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String pageDesign();


  /**
   * <p>
   * Setter method for the COM property "PageDesign"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  void pageDesign(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "LetterStyle"
   * </p>
   * @return  Returns a value of type word.WdLetterStyle
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(17)
  word.WdLetterStyle letterStyle();


  /**
   * <p>
   * Setter method for the COM property "LetterStyle"
   * </p>
   * @param prop Mandatory word.WdLetterStyle parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  void letterStyle(
    word.WdLetterStyle prop);


  /**
   * <p>
   * Getter method for the COM property "Letterhead"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(19)
  boolean letterhead();


  /**
   * <p>
   * Setter method for the COM property "Letterhead"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(20)
  void letterhead(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "LetterheadLocation"
   * </p>
   * @return  Returns a value of type word.WdLetterheadLocation
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(21)
  word.WdLetterheadLocation letterheadLocation();


  /**
   * <p>
   * Setter method for the COM property "LetterheadLocation"
   * </p>
   * @param prop Mandatory word.WdLetterheadLocation parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(22)
  void letterheadLocation(
    word.WdLetterheadLocation prop);


  /**
   * <p>
   * Getter method for the COM property "LetterheadSize"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(23)
  float letterheadSize();


  /**
   * <p>
   * Setter method for the COM property "LetterheadSize"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(24)
  void letterheadSize(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RecipientName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String recipientName();


  /**
   * <p>
   * Setter method for the COM property "RecipientName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(26)
  void recipientName(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "RecipientAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String recipientAddress();


  /**
   * <p>
   * Setter method for the COM property "RecipientAddress"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(28)
  void recipientAddress(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Salutation"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String salutation();


  /**
   * <p>
   * Setter method for the COM property "Salutation"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(30)
  void salutation(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "SalutationType"
   * </p>
   * @return  Returns a value of type word.WdSalutationType
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(31)
  word.WdSalutationType salutationType();


  /**
   * <p>
   * Setter method for the COM property "SalutationType"
   * </p>
   * @param prop Mandatory word.WdSalutationType parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(32)
  void salutationType(
    word.WdSalutationType prop);


  /**
   * <p>
   * Getter method for the COM property "RecipientReference"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String recipientReference();


  /**
   * <p>
   * Setter method for the COM property "RecipientReference"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(34)
  void recipientReference(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "MailingInstructions"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String mailingInstructions();


  /**
   * <p>
   * Setter method for the COM property "MailingInstructions"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(36)
  void mailingInstructions(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "AttentionLine"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String attentionLine();


  /**
   * <p>
   * Setter method for the COM property "AttentionLine"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(38)
  void attentionLine(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Subject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String subject();


  /**
   * <p>
   * Setter method for the COM property "Subject"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(40)
  void subject(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "EnclosureNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(41)
  int enclosureNumber();


  /**
   * <p>
   * Setter method for the COM property "EnclosureNumber"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(42)
  void enclosureNumber(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "CCList"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String ccList();


  /**
   * <p>
   * Setter method for the COM property "CCList"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(44)
  void ccList(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "ReturnAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(45)
  java.lang.String returnAddress();


  /**
   * <p>
   * Setter method for the COM property "ReturnAddress"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(46)
  void returnAddress(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "SenderName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String senderName();


  /**
   * <p>
   * Setter method for the COM property "SenderName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(48)
  void senderName(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Closing"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(49)
  java.lang.String closing();


  /**
   * <p>
   * Setter method for the COM property "Closing"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(50)
  void closing(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "SenderCompany"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(51)
  java.lang.String senderCompany();


  /**
   * <p>
   * Setter method for the COM property "SenderCompany"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(52)
  void senderCompany(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "SenderJobTitle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String senderJobTitle();


  /**
   * <p>
   * Setter method for the COM property "SenderJobTitle"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(54)
  void senderJobTitle(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "SenderInitials"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(55)
  java.lang.String senderInitials();


  /**
   * <p>
   * Setter method for the COM property "SenderInitials"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(56)
  void senderInitials(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "InfoBlock"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(57)
  boolean infoBlock();


  /**
   * <p>
   * Setter method for the COM property "InfoBlock"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(58)
  void infoBlock(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RecipientCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(59)
  java.lang.String recipientCode();


  /**
   * <p>
   * Setter method for the COM property "RecipientCode"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(60)
  void recipientCode(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "RecipientGender"
   * </p>
   * @return  Returns a value of type word.WdSalutationGender
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(61)
  word.WdSalutationGender recipientGender();


  /**
   * <p>
   * Setter method for the COM property "RecipientGender"
   * </p>
   * @param prop Mandatory word.WdSalutationGender parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(62)
  void recipientGender(
    word.WdSalutationGender prop);


  /**
   * <p>
   * Getter method for the COM property "ReturnAddressShortForm"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(63)
  java.lang.String returnAddressShortForm();


  /**
   * <p>
   * Setter method for the COM property "ReturnAddressShortForm"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(64)
  void returnAddressShortForm(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "SenderCity"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(65)
  java.lang.String senderCity();


  /**
   * <p>
   * Setter method for the COM property "SenderCity"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(66)
  void senderCity(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "SenderCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(67)
  java.lang.String senderCode();


  /**
   * <p>
   * Setter method for the COM property "SenderCode"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(68)
  void senderCode(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "SenderGender"
   * </p>
   * @return  Returns a value of type word.WdSalutationGender
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(69)
  word.WdSalutationGender senderGender();


  /**
   * <p>
   * Setter method for the COM property "SenderGender"
   * </p>
   * @param prop Mandatory word.WdSalutationGender parameter.
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(70)
  void senderGender(
    word.WdSalutationGender prop);


  /**
   * <p>
   * Getter method for the COM property "SenderReference"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(71)
  java.lang.String senderReference();


  /**
   * <p>
   * Setter method for the COM property "SenderReference"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(72)
  void senderReference(
    java.lang.String prop);


  // Properties:
}
