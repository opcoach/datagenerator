/**
 */
package com.opcoach.generator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.opcoach.generator.MGeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface MGeneratorPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opcoach.generator/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MGeneratorPackage eINSTANCE = com.opcoach.generator.impl.MGeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.opcoach.generator.impl.MValueGeneratorImpl <em>Value Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.impl.MValueGeneratorImpl
	 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getValueGenerator()
	 * @generated
	 */
	int VALUE_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__BAD_VALUE_PROPORTION = 0;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__BAD_VALUE_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__LAST_GENERATED_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__RANDOM_SEED = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__ID = 5;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__LOCALE = 6;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__VALUE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR__PARAMETERS = 8;

	/**
	 * The number of structural features of the '<em>Value Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Generate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR___GENERATE_VALUE = 0;

	/**
	 * The number of operations of the '<em>Value Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GENERATOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.impl.MRangeGeneratorImpl <em>Range Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.impl.MRangeGeneratorImpl
	 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getRangeGenerator()
	 * @generated
	 */
	int RANGE_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__BAD_VALUE_PROPORTION = VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__BAD_VALUE_GENERATOR = VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__LAST_GENERATED_VALUE = VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__RANDOM_SEED = VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__DESCRIPTION = VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__ID = VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__LOCALE = VALUE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__VALUE_TYPE = VALUE_GENERATOR__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__PARAMETERS = VALUE_GENERATOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__LOW = VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__HIGH = VALUE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR__STEP = VALUE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Range Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR_FEATURE_COUNT = VALUE_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR___GENERATE_VALUE = VALUE_GENERATOR___GENERATE_VALUE;

	/**
	 * The operation id for the '<em>Set Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR___SET_BOUNDS__OBJECT_OBJECT = VALUE_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Range Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_GENERATOR_OPERATION_COUNT = VALUE_GENERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.impl.MReferenceGeneratorImpl <em>Reference Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.impl.MReferenceGeneratorImpl
	 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getReferenceGenerator()
	 * @generated
	 */
	int REFERENCE_GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>Bad Value Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__BAD_VALUE_PROPORTION = VALUE_GENERATOR__BAD_VALUE_PROPORTION;

	/**
	 * The feature id for the '<em><b>Bad Value Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__BAD_VALUE_GENERATOR = VALUE_GENERATOR__BAD_VALUE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Last Generated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__LAST_GENERATED_VALUE = VALUE_GENERATOR__LAST_GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__RANDOM_SEED = VALUE_GENERATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__DESCRIPTION = VALUE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__ID = VALUE_GENERATOR__ID;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__LOCALE = VALUE_GENERATOR__LOCALE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__VALUE_TYPE = VALUE_GENERATOR__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__PARAMETERS = VALUE_GENERATOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__STEP = VALUE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR__VALUES = VALUE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR_FEATURE_COUNT = VALUE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR___GENERATE_VALUE = VALUE_GENERATOR___GENERATE_VALUE;

	/**
	 * The number of operations of the '<em>Reference Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_GENERATOR_OPERATION_COUNT = VALUE_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.impl.MGeneratorParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.impl.MGeneratorParameterImpl
	 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getGeneratorParameter()
	 * @generated
	 */
	int GENERATOR_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETER__DEFAULT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.opcoach.generator.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.generator.Type
	 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;

	/**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 5;

	/**
	 * The meta object id for the '<em>Locale</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Locale
	 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getLocale()
	 * @generated
	 */
	int LOCALE = 6;


	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.MValueGenerator <em>Value Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Generator</em>'.
	 * @see com.opcoach.generator.MValueGenerator
	 * @generated
	 */
	EClass getValueGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MValueGenerator#getBadValueProportion <em>Bad Value Proportion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bad Value Proportion</em>'.
	 * @see com.opcoach.generator.MValueGenerator#getBadValueProportion()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_BadValueProportion();

	/**
	 * Returns the meta object for the reference '{@link com.opcoach.generator.MValueGenerator#getBadValueGenerator <em>Bad Value Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bad Value Generator</em>'.
	 * @see com.opcoach.generator.MValueGenerator#getBadValueGenerator()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EReference getValueGenerator_BadValueGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MValueGenerator#getLastGeneratedValue <em>Last Generated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Generated Value</em>'.
	 * @see com.opcoach.generator.MValueGenerator#getLastGeneratedValue()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_LastGeneratedValue();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MValueGenerator#getRandomSeed <em>Random Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random Seed</em>'.
	 * @see com.opcoach.generator.MValueGenerator#getRandomSeed()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_RandomSeed();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MValueGenerator#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.opcoach.generator.MValueGenerator#getDescription()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MValueGenerator#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see com.opcoach.generator.MValueGenerator#getID()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_ID();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MValueGenerator#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see com.opcoach.generator.MValueGenerator#getLocale()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_Locale();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MValueGenerator#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see com.opcoach.generator.MValueGenerator#getValueType()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EAttribute getValueGenerator_ValueType();

	/**
	 * Returns the meta object for the reference list '{@link com.opcoach.generator.MValueGenerator#getParametersList <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see com.opcoach.generator.MValueGenerator#getParametersList()
	 * @see #getValueGenerator()
	 * @generated
	 */
	EReference getValueGenerator_Parameters();

	/**
	 * Returns the meta object for the '{@link com.opcoach.generator.MValueGenerator#generateValue() <em>Generate Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Value</em>' operation.
	 * @see com.opcoach.generator.MValueGenerator#generateValue()
	 * @generated
	 */
	EOperation getValueGenerator__GenerateValue();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.MRangeGenerator <em>Range Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Generator</em>'.
	 * @see com.opcoach.generator.MRangeGenerator
	 * @generated
	 */
	EClass getRangeGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MRangeGenerator#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low</em>'.
	 * @see com.opcoach.generator.MRangeGenerator#getLow()
	 * @see #getRangeGenerator()
	 * @generated
	 */
	EAttribute getRangeGenerator_Low();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MRangeGenerator#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High</em>'.
	 * @see com.opcoach.generator.MRangeGenerator#getHigh()
	 * @see #getRangeGenerator()
	 * @generated
	 */
	EAttribute getRangeGenerator_High();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MRangeGenerator#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see com.opcoach.generator.MRangeGenerator#getStep()
	 * @see #getRangeGenerator()
	 * @generated
	 */
	EAttribute getRangeGenerator_Step();

	/**
	 * Returns the meta object for the '{@link com.opcoach.generator.MRangeGenerator#setBounds(java.lang.Object, java.lang.Object) <em>Set Bounds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Bounds</em>' operation.
	 * @see com.opcoach.generator.MRangeGenerator#setBounds(java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getRangeGenerator__SetBounds__Object_Object();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.MReferenceGenerator <em>Reference Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Generator</em>'.
	 * @see com.opcoach.generator.MReferenceGenerator
	 * @generated
	 */
	EClass getReferenceGenerator();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MReferenceGenerator#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see com.opcoach.generator.MReferenceGenerator#getStep()
	 * @see #getReferenceGenerator()
	 * @generated
	 */
	EAttribute getReferenceGenerator_Step();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MReferenceGenerator#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see com.opcoach.generator.MReferenceGenerator#getValues()
	 * @see #getReferenceGenerator()
	 * @generated
	 */
	EAttribute getReferenceGenerator_Values();

	/**
	 * Returns the meta object for class '{@link com.opcoach.generator.MGeneratorParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.opcoach.generator.MGeneratorParameter
	 * @generated
	 */
	EClass getGeneratorParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MGeneratorParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.opcoach.generator.MGeneratorParameter#getName()
	 * @see #getGeneratorParameter()
	 * @generated
	 */
	EAttribute getGeneratorParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MGeneratorParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.opcoach.generator.MGeneratorParameter#getType()
	 * @see #getGeneratorParameter()
	 * @generated
	 */
	EAttribute getGeneratorParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.generator.MGeneratorParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see com.opcoach.generator.MGeneratorParameter#getDefaultValue()
	 * @see #getGeneratorParameter()
	 * @generated
	 */
	EAttribute getGeneratorParameter_DefaultValue();

	/**
	 * Returns the meta object for enum '{@link com.opcoach.generator.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see com.opcoach.generator.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
	EDataType getCollection();

	/**
	 * Returns the meta object for data type '{@link java.util.Locale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Locale</em>'.
	 * @see java.util.Locale
	 * @model instanceClass="java.util.Locale"
	 * @generated
	 */
	EDataType getLocale();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MGeneratorFactory getGeneratorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link com.opcoach.generator.impl.MValueGeneratorImpl <em>Value Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.impl.MValueGeneratorImpl
		 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getValueGenerator()
		 * @generated
		 */
		EClass VALUE_GENERATOR = eINSTANCE.getValueGenerator();

		/**
		 * The meta object literal for the '<em><b>Bad Value Proportion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__BAD_VALUE_PROPORTION = eINSTANCE.getValueGenerator_BadValueProportion();

		/**
		 * The meta object literal for the '<em><b>Bad Value Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_GENERATOR__BAD_VALUE_GENERATOR = eINSTANCE.getValueGenerator_BadValueGenerator();

		/**
		 * The meta object literal for the '<em><b>Last Generated Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__LAST_GENERATED_VALUE = eINSTANCE.getValueGenerator_LastGeneratedValue();

		/**
		 * The meta object literal for the '<em><b>Random Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__RANDOM_SEED = eINSTANCE.getValueGenerator_RandomSeed();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__DESCRIPTION = eINSTANCE.getValueGenerator_Description();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__ID = eINSTANCE.getValueGenerator_ID();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__LOCALE = eINSTANCE.getValueGenerator_Locale();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_GENERATOR__VALUE_TYPE = eINSTANCE.getValueGenerator_ValueType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_GENERATOR__PARAMETERS = eINSTANCE.getValueGenerator_Parameters();

		/**
		 * The meta object literal for the '<em><b>Generate Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_GENERATOR___GENERATE_VALUE = eINSTANCE.getValueGenerator__GenerateValue();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.impl.MRangeGeneratorImpl <em>Range Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.impl.MRangeGeneratorImpl
		 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getRangeGenerator()
		 * @generated
		 */
		EClass RANGE_GENERATOR = eINSTANCE.getRangeGenerator();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_GENERATOR__LOW = eINSTANCE.getRangeGenerator_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_GENERATOR__HIGH = eINSTANCE.getRangeGenerator_High();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_GENERATOR__STEP = eINSTANCE.getRangeGenerator_Step();

		/**
		 * The meta object literal for the '<em><b>Set Bounds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE_GENERATOR___SET_BOUNDS__OBJECT_OBJECT = eINSTANCE.getRangeGenerator__SetBounds__Object_Object();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.impl.MReferenceGeneratorImpl <em>Reference Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.impl.MReferenceGeneratorImpl
		 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getReferenceGenerator()
		 * @generated
		 */
		EClass REFERENCE_GENERATOR = eINSTANCE.getReferenceGenerator();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_GENERATOR__STEP = eINSTANCE.getReferenceGenerator_Step();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_GENERATOR__VALUES = eINSTANCE.getReferenceGenerator_Values();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.impl.MGeneratorParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.impl.MGeneratorParameterImpl
		 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getGeneratorParameter()
		 * @generated
		 */
		EClass GENERATOR_PARAMETER = eINSTANCE.getGeneratorParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_PARAMETER__NAME = eINSTANCE.getGeneratorParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_PARAMETER__TYPE = eINSTANCE.getGeneratorParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_PARAMETER__DEFAULT_VALUE = eINSTANCE.getGeneratorParameter_DefaultValue();

		/**
		 * The meta object literal for the '{@link com.opcoach.generator.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.generator.Type
		 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em>Locale</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Locale
		 * @see com.opcoach.generator.impl.MGeneratorPackageImpl#getLocale()
		 * @generated
		 */
		EDataType LOCALE = eINSTANCE.getLocale();

	}

} //MGeneratorPackage
