package speech.types  ;

import com4j.*;

/**
 * ISpeechGrammarRuleState Interface
 */
@IID("{D4286F2C-EE67-45AE-B928-28D695362EDA}")
public interface ISpeechGrammarRuleState extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Rule
   * </p>
   * <p>
   * Getter method for the COM property "Rule"
   * </p>
   * @return  Returns a value of type speech.types.ISpeechGrammarRule
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  speech.types.ISpeechGrammarRule rule();


  /**
   * <p>
   * Transitions
   * </p>
   * <p>
   * Getter method for the COM property "Transitions"
   * </p>
   * @return  Returns a value of type speech.types.ISpeechGrammarRuleStateTransitions
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  speech.types.ISpeechGrammarRuleStateTransitions transitions();


  @VTID(8)
  @ReturnValue(defaultPropertyThrough={speech.types.ISpeechGrammarRuleStateTransitions.class})
  speech.types.ISpeechGrammarRuleStateTransition transitions(
    int index);

  /**
   * <p>
   * AddWordTransition
   * </p>
   * @param destState Mandatory speech.types.ISpeechGrammarRuleState parameter.
   * @param words Mandatory java.lang.String parameter.
   * @param separators Optional parameter. Default value is " "
   * @param type Optional parameter. Default value is 1
   * @param propertyName Optional parameter. Default value is ""
   * @param propertyId Optional parameter. Default value is 0
   * @param propertyValue Optional parameter. Default value is ""
   * @param weight Optional parameter. Default value is 1.0f
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void addWordTransition(
    speech.types.ISpeechGrammarRuleState destState,
    java.lang.String words,
    @Optional @DefaultValue(" ") java.lang.String separators,
    @Optional @DefaultValue("1") speech.types.SpeechGrammarWordType type,
    @Optional @DefaultValue("") java.lang.String propertyName,
    @Optional @DefaultValue("0") int propertyId,
    @Optional @DefaultValue("") java.lang.Object propertyValue,
    @Optional @DefaultValue("1") float weight);


  /**
   * <p>
   * AddRuleTransition
   * </p>
   * @param destinationState Mandatory speech.types.ISpeechGrammarRuleState parameter.
   * @param rule Mandatory speech.types.ISpeechGrammarRule parameter.
   * @param propertyName Optional parameter. Default value is ""
   * @param propertyId Optional parameter. Default value is 0
   * @param propertyValue Optional parameter. Default value is ""
   * @param weight Optional parameter. Default value is 1.0f
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void addRuleTransition(
    speech.types.ISpeechGrammarRuleState destinationState,
    speech.types.ISpeechGrammarRule rule,
    @Optional @DefaultValue("") java.lang.String propertyName,
    @Optional @DefaultValue("0") int propertyId,
    @Optional @DefaultValue("") java.lang.Object propertyValue,
    @Optional @DefaultValue("1") float weight);


  /**
   * <p>
   * AddSpecialTransition
   * </p>
   * @param destinationState Mandatory speech.types.ISpeechGrammarRuleState parameter.
   * @param type Mandatory speech.types.SpeechSpecialTransitionType parameter.
   * @param propertyName Optional parameter. Default value is ""
   * @param propertyId Optional parameter. Default value is 0
   * @param propertyValue Optional parameter. Default value is ""
   * @param weight Optional parameter. Default value is 1.0f
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  void addSpecialTransition(
    speech.types.ISpeechGrammarRuleState destinationState,
    speech.types.SpeechSpecialTransitionType type,
    @Optional @DefaultValue("") java.lang.String propertyName,
    @Optional @DefaultValue("0") int propertyId,
    @Optional @DefaultValue("") java.lang.Object propertyValue,
    @Optional @DefaultValue("1") float weight);


  // Properties:
}
