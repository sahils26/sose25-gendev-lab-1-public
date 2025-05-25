/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /de.buw.se.gendev.lab1/model/lab1.ecore
 * using:
 *   /de.buw.se.gendev.lab1/model/lab1.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package de.buw.se.gendev.lab1;

// import de.buw.se.gendev.lab1.Lab1Package;
// import de.buw.se.gendev.lab1.Lab1Tables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Lab1Tables provides the dispatch tables for the lab1 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Lab1Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Lab1Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_lab1 = IdManager.getNsURIPackageId("http://www.example.org/lab1", null, Lab1Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Certificates = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("Certificates", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Courses = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("Courses", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Lessons = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("Lessons", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Quizzes = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("Quizzes", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Users = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("Users", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Lab1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_18 = ValueUtil.integerValueOf("18");
	public static final /*@NonInvalid*/ String STR_ = "";
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Certificates = TypeId.ORDERED_SET.getSpecializedId(Lab1Tables.CLSSid_Certificates, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Courses = TypeId.ORDERED_SET.getSpecializedId(Lab1Tables.CLSSid_Courses, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Lessons = TypeId.ORDERED_SET.getSpecializedId(Lab1Tables.CLSSid_Lessons, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Lab1Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Certificates = new EcoreExecutorType(Lab1Package.Literals.CERTIFICATES, PACKAGE, 0);
		public static final EcoreExecutorType _Courses = new EcoreExecutorType(Lab1Package.Literals.COURSES, PACKAGE, 0);
		public static final EcoreExecutorType _Lessons = new EcoreExecutorType(Lab1Package.Literals.LESSONS, PACKAGE, 0);
		public static final EcoreExecutorType _Quizzes = new EcoreExecutorType(Lab1Package.Literals.QUIZZES, PACKAGE, 0);
		public static final EcoreExecutorType _Users = new EcoreExecutorType(Lab1Package.Literals.USERS, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Certificates,
			_Courses,
			_Lessons,
			_Quizzes,
			_Users
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Certificates__Certificates = new ExecutorFragment(Types._Certificates, Lab1Tables.Types._Certificates);
		private static final ExecutorFragment _Certificates__OclAny = new ExecutorFragment(Types._Certificates, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Certificates__OclElement = new ExecutorFragment(Types._Certificates, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Certificates__Quizzes = new ExecutorFragment(Types._Certificates, Lab1Tables.Types._Quizzes);

		private static final ExecutorFragment _Courses__Courses = new ExecutorFragment(Types._Courses, Lab1Tables.Types._Courses);
		private static final ExecutorFragment _Courses__OclAny = new ExecutorFragment(Types._Courses, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Courses__OclElement = new ExecutorFragment(Types._Courses, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Lessons__Lessons = new ExecutorFragment(Types._Lessons, Lab1Tables.Types._Lessons);
		private static final ExecutorFragment _Lessons__OclAny = new ExecutorFragment(Types._Lessons, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Lessons__OclElement = new ExecutorFragment(Types._Lessons, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Quizzes__OclAny = new ExecutorFragment(Types._Quizzes, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Quizzes__OclElement = new ExecutorFragment(Types._Quizzes, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Quizzes__Quizzes = new ExecutorFragment(Types._Quizzes, Lab1Tables.Types._Quizzes);

		private static final ExecutorFragment _Users__OclAny = new ExecutorFragment(Types._Users, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Users__OclElement = new ExecutorFragment(Types._Users, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Users__Users = new ExecutorFragment(Types._Users, Lab1Tables.Types._Users);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Certificates__issuedDate = new EcoreExecutorProperty(Lab1Package.Literals.CERTIFICATES__ISSUED_DATE, Types._Certificates, 0);
		public static final ExecutorProperty _Certificates__Users__ownsCertificate = new ExecutorPropertyWithImplementation("Users", Types._Certificates, 1, new EcoreLibraryOppositeProperty(Lab1Package.Literals.USERS__OWNS_CERTIFICATE));

		public static final ExecutorProperty _Courses__duration = new EcoreExecutorProperty(Lab1Package.Literals.COURSES__DURATION, Types._Courses, 0);
		public static final ExecutorProperty _Courses__hasLessons = new EcoreExecutorProperty(Lab1Package.Literals.COURSES__HAS_LESSONS, Types._Courses, 1);
		public static final ExecutorProperty _Courses__title = new EcoreExecutorProperty(Lab1Package.Literals.COURSES__TITLE, Types._Courses, 2);
		public static final ExecutorProperty _Courses__Users__enrolledCourses = new ExecutorPropertyWithImplementation("Users", Types._Courses, 3, new EcoreLibraryOppositeProperty(Lab1Package.Literals.USERS__ENROLLED_COURSES));

		public static final ExecutorProperty _Lessons__includesQuiz = new EcoreExecutorProperty(Lab1Package.Literals.LESSONS__INCLUDES_QUIZ, Types._Lessons, 0);
		public static final ExecutorProperty _Lessons__order = new EcoreExecutorProperty(Lab1Package.Literals.LESSONS__ORDER, Types._Lessons, 1);
		public static final ExecutorProperty _Lessons__topic = new EcoreExecutorProperty(Lab1Package.Literals.LESSONS__TOPIC, Types._Lessons, 2);
		public static final ExecutorProperty _Lessons__Courses__hasLessons = new ExecutorPropertyWithImplementation("Courses", Types._Lessons, 3, new EcoreLibraryOppositeProperty(Lab1Package.Literals.COURSES__HAS_LESSONS));

		public static final ExecutorProperty _Quizzes__title = new EcoreExecutorProperty(Lab1Package.Literals.QUIZZES__TITLE, Types._Quizzes, 0);
		public static final ExecutorProperty _Quizzes__Lessons__includesQuiz = new ExecutorPropertyWithImplementation("Lessons", Types._Quizzes, 1, new EcoreLibraryOppositeProperty(Lab1Package.Literals.LESSONS__INCLUDES_QUIZ));

		public static final ExecutorProperty _Users__age = new EcoreExecutorProperty(Lab1Package.Literals.USERS__AGE, Types._Users, 0);
		public static final ExecutorProperty _Users__email = new EcoreExecutorProperty(Lab1Package.Literals.USERS__EMAIL, Types._Users, 1);
		public static final ExecutorProperty _Users__enrolledCourses = new EcoreExecutorProperty(Lab1Package.Literals.USERS__ENROLLED_COURSES, Types._Users, 2);
		public static final ExecutorProperty _Users__ownsCertificate = new EcoreExecutorProperty(Lab1Package.Literals.USERS__OWNS_CERTIFICATE, Types._Users, 3);
		public static final ExecutorProperty _Users__username = new EcoreExecutorProperty(Lab1Package.Literals.USERS__USERNAME, Types._Users, 4);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Certificates =
			{
				Fragments._Certificates__OclAny /* 0 */,
				Fragments._Certificates__OclElement /* 1 */,
				Fragments._Certificates__Quizzes /* 2 */,
				Fragments._Certificates__Certificates /* 3 */
			};
		private static final int /*@NonNull*/ [] __Certificates = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Courses =
			{
				Fragments._Courses__OclAny /* 0 */,
				Fragments._Courses__OclElement /* 1 */,
				Fragments._Courses__Courses /* 2 */
			};
		private static final int /*@NonNull*/ [] __Courses = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Lessons =
			{
				Fragments._Lessons__OclAny /* 0 */,
				Fragments._Lessons__OclElement /* 1 */,
				Fragments._Lessons__Lessons /* 2 */
			};
		private static final int /*@NonNull*/ [] __Lessons = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Quizzes =
			{
				Fragments._Quizzes__OclAny /* 0 */,
				Fragments._Quizzes__OclElement /* 1 */,
				Fragments._Quizzes__Quizzes /* 2 */
			};
		private static final int /*@NonNull*/ [] __Quizzes = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Users =
			{
				Fragments._Users__OclAny /* 0 */,
				Fragments._Users__OclElement /* 1 */,
				Fragments._Users__Users /* 2 */
			};
		private static final int /*@NonNull*/ [] __Users = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Certificates.initFragments(_Certificates, __Certificates);
			Types._Courses.initFragments(_Courses, __Courses);
			Types._Lessons.initFragments(_Lessons, __Lessons);
			Types._Quizzes.initFragments(_Quizzes, __Quizzes);
			Types._Users.initFragments(_Users, __Users);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Certificates__Certificates = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Certificates__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Certificates__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Certificates__Quizzes = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Courses__Courses = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Courses__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Courses__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Lessons__Lessons = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Lessons__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Lessons__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Quizzes__Quizzes = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Quizzes__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Quizzes__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Users__Users = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Users__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Users__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Certificates__Certificates.initOperations(_Certificates__Certificates);
			Fragments._Certificates__OclAny.initOperations(_Certificates__OclAny);
			Fragments._Certificates__OclElement.initOperations(_Certificates__OclElement);
			Fragments._Certificates__Quizzes.initOperations(_Certificates__Quizzes);

			Fragments._Courses__Courses.initOperations(_Courses__Courses);
			Fragments._Courses__OclAny.initOperations(_Courses__OclAny);
			Fragments._Courses__OclElement.initOperations(_Courses__OclElement);

			Fragments._Lessons__Lessons.initOperations(_Lessons__Lessons);
			Fragments._Lessons__OclAny.initOperations(_Lessons__OclAny);
			Fragments._Lessons__OclElement.initOperations(_Lessons__OclElement);

			Fragments._Quizzes__OclAny.initOperations(_Quizzes__OclAny);
			Fragments._Quizzes__OclElement.initOperations(_Quizzes__OclElement);
			Fragments._Quizzes__Quizzes.initOperations(_Quizzes__Quizzes);

			Fragments._Users__OclAny.initOperations(_Users__OclAny);
			Fragments._Users__OclElement.initOperations(_Users__OclElement);
			Fragments._Users__Users.initOperations(_Users__Users);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Certificates = {
			Lab1Tables.Properties._Certificates__issuedDate,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Quizzes__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Courses = {
			Lab1Tables.Properties._Courses__duration,
			Lab1Tables.Properties._Courses__hasLessons,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Courses__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Lessons = {
			Lab1Tables.Properties._Lessons__includesQuiz,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Lessons__order,
			Lab1Tables.Properties._Lessons__topic
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Quizzes = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Quizzes__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Users = {
			Lab1Tables.Properties._Users__age,
			Lab1Tables.Properties._Users__email,
			Lab1Tables.Properties._Users__enrolledCourses,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Users__ownsCertificate,
			Lab1Tables.Properties._Users__username
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Certificates__Certificates.initProperties(_Certificates);
			Fragments._Courses__Courses.initProperties(_Courses);
			Fragments._Lessons__Lessons.initProperties(_Lessons);
			Fragments._Quizzes__Quizzes.initProperties(_Quizzes);
			Fragments._Users__Users.initProperties(_Users);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Lab1Tables();
	}

	private Lab1Tables() {
		super(Lab1Package.eNS_URI);
	}
}
