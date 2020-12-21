/**
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.opcoach.generator.basic.BooleanGenerator;
import com.opcoach.generator.basic.CasePolicyType;
import com.opcoach.generator.basic.DateGenerator;
import com.opcoach.generator.basic.DoubleGenerator;
import com.opcoach.generator.basic.FalseGenerator;
import com.opcoach.generator.basic.FloatGenerator;
import com.opcoach.generator.basic.IDGenerator;
import com.opcoach.generator.basic.IntGenerator;
import com.opcoach.generator.basic.LongGenerator;
import com.opcoach.generator.basic.MBasicFactory;
import com.opcoach.generator.basic.MBasicPackage;
import com.opcoach.generator.basic.NullValueGenerator;
import com.opcoach.generator.basic.StringGenerator;
import com.opcoach.generator.basic.TrueGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MBasicFactoryImpl extends EFactoryImpl implements MBasicFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MBasicFactory init()
	{
		try {
			MBasicFactory theBasicFactory = (MBasicFactory)EPackage.Registry.INSTANCE.getEFactory(MBasicPackage.eNS_URI);
			if (theBasicFactory != null) {
				return theBasicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MBasicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBasicFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID()) {
			case MBasicPackage.BOOLEAN_GENERATOR: return createBooleanGenerator();
			case MBasicPackage.DATE_GENERATOR: return createDateGenerator();
			case MBasicPackage.DOUBLE_GENERATOR: return createDoubleGenerator();
			case MBasicPackage.FLOAT_GENERATOR: return createFloatGenerator();
			case MBasicPackage.ID_GENERATOR: return createIDGenerator();
			case MBasicPackage.INT_GENERATOR: return createIntGenerator();
			case MBasicPackage.LONG_GENERATOR: return createLongGenerator();
			case MBasicPackage.NULL_VALUE_GENERATOR: return createNullValueGenerator();
			case MBasicPackage.STRING_GENERATOR: return createStringGenerator();
			case MBasicPackage.TRUE_GENERATOR: return createTrueGenerator();
			case MBasicPackage.FALSE_GENERATOR: return createFalseGenerator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID()) {
			case MBasicPackage.CASE_POLICY_TYPE:
				return createCasePolicyTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID()) {
			case MBasicPackage.CASE_POLICY_TYPE:
				return convertCasePolicyTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanGenerator createBooleanGenerator()
	{
		BooleanGeneratorImpl booleanGenerator = new BooleanGeneratorImpl();
		return booleanGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateGenerator createDateGenerator()
	{
		DateGeneratorImpl dateGenerator = new DateGeneratorImpl();
		return dateGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleGenerator createDoubleGenerator()
	{
		DoubleGeneratorImpl doubleGenerator = new DoubleGeneratorImpl();
		return doubleGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloatGenerator createFloatGenerator()
	{
		FloatGeneratorImpl floatGenerator = new FloatGeneratorImpl();
		return floatGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDGenerator createIDGenerator()
	{
		IDGeneratorImpl idGenerator = new IDGeneratorImpl();
		return idGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntGenerator createIntGenerator()
	{
		IntGeneratorImpl intGenerator = new IntGeneratorImpl();
		return intGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongGenerator createLongGenerator()
	{
		LongGeneratorImpl longGenerator = new LongGeneratorImpl();
		return longGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullValueGenerator createNullValueGenerator()
	{
		NullValueGeneratorImpl nullValueGenerator = new NullValueGeneratorImpl();
		return nullValueGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringGenerator createStringGenerator()
	{
		StringGeneratorImpl stringGenerator = new StringGeneratorImpl();
		return stringGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrueGenerator createTrueGenerator()
	{
		TrueGeneratorImpl trueGenerator = new TrueGeneratorImpl();
		return trueGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FalseGenerator createFalseGenerator()
	{
		FalseGeneratorImpl falseGenerator = new FalseGeneratorImpl();
		return falseGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePolicyType createCasePolicyTypeFromString(EDataType eDataType, String initialValue)
	{
		CasePolicyType result = CasePolicyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCasePolicyTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MBasicPackage getBasicPackage()
	{
		return (MBasicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MBasicPackage getPackage()
	{
		return MBasicPackage.eINSTANCE;
	}

} //MBasicFactoryImpl
