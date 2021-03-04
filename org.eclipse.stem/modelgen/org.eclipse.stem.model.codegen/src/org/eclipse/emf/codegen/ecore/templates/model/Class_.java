package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenDelegationKind;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenParameter;
import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimePlatform;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.stem.model.codegen.STEMGenClass;

public class Class_
{
  protected static String nl;
  public static synchronized Class_ create(String lineSeparator)
  {
    nl = lineSeparator;
    Class_ result = new Class_();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_5 = "Id";
  protected final String TEXT_6 = NL + " */";
  protected final String TEXT_7 = NL + "package ";
  protected final String TEXT_8 = ";";
  protected final String TEXT_9 = NL + "package ";
  protected final String TEXT_10 = ";";
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_14 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_15 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_16 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_17 = NL + " *";
  protected final String TEXT_18 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * <ul>";
  protected final String TEXT_19 = NL + " *   <li>{@link ";
  protected final String TEXT_20 = "#";
  protected final String TEXT_21 = " <em>";
  protected final String TEXT_22 = "</em>}</li>";
  protected final String TEXT_23 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_24 = NL + " *";
  protected final String TEXT_25 = NL + " * @see ";
  protected final String TEXT_26 = "#get";
  protected final String TEXT_27 = "()";
  protected final String TEXT_28 = NL + " * @model ";
  protected final String TEXT_29 = NL + " *        ";
  protected final String TEXT_30 = NL + " * @model";
  protected final String TEXT_31 = NL + " * @extends ";
  protected final String TEXT_32 = NL + " * @generated" + NL + " */";
  protected final String TEXT_33 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_34 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_35 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_36 = NL + " *   <li>{@link ";
  protected final String TEXT_37 = "#";
  protected final String TEXT_38 = " <em>";
  protected final String TEXT_39 = "</em>}</li>";
  protected final String TEXT_40 = NL + " * </ul>";
  protected final String TEXT_41 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */";
  protected final String TEXT_42 = NL + "public";
  protected final String TEXT_43 = " abstract";
  protected final String TEXT_44 = " class ";
  protected final String TEXT_45 = NL + "public interface ";
  protected final String TEXT_46 = NL + "{";
  protected final String TEXT_47 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_48 = " copyright = ";
  protected final String TEXT_49 = ";";
  protected final String TEXT_50 = NL;
  protected final String TEXT_51 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_52 = " mofDriverNumber = \"";
  protected final String TEXT_53 = "\";";
  protected final String TEXT_54 = NL;
  protected final String TEXT_55 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_56 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_57 = NL + "\t@";
  protected final String TEXT_58 = NL + "\tprotected Object[] ";
  protected final String TEXT_59 = ";" + NL;
  protected final String TEXT_60 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_61 = NL + "\t@";
  protected final String TEXT_62 = NL + "\tprotected int ";
  protected final String TEXT_63 = ";" + NL;
  protected final String TEXT_64 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_65 = NL + "\t@";
  protected final String TEXT_66 = NL + "\tprotected int ";
  protected final String TEXT_67 = " = 0;" + NL;
  protected final String TEXT_68 = NL + "\t/**" + NL + "\t * The cached setting delegate for the '{@link #";
  protected final String TEXT_69 = "() <em>";
  protected final String TEXT_70 = "</em>}' ";
  protected final String TEXT_71 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_72 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_73 = NL + "\t@";
  protected final String TEXT_74 = NL + "\tprotected ";
  protected final String TEXT_75 = ".Internal.SettingDelegate ";
  protected final String TEXT_76 = "__ESETTING_DELEGATE = ((";
  protected final String TEXT_77 = ".Internal)";
  protected final String TEXT_78 = ").getSettingDelegate();" + NL;
  protected final String TEXT_79 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_80 = "() <em>";
  protected final String TEXT_81 = "</em>}' ";
  protected final String TEXT_82 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_83 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_84 = NL + "\t@";
  protected final String TEXT_85 = NL + "\tprotected ";
  protected final String TEXT_86 = " ";
  protected final String TEXT_87 = ";" + NL;
  protected final String TEXT_88 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_89 = "() <em>";
  protected final String TEXT_90 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_91 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_92 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_93 = NL + "\tprotected static final ";
  protected final String TEXT_94 = "[] ";
  protected final String TEXT_95 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_96 = " [0]";
  protected final String TEXT_97 = ";" + NL;
  protected final String TEXT_98 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_99 = "() <em>";
  protected final String TEXT_100 = "</em>}' ";
  protected final String TEXT_101 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_102 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_103 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_104 = NL + "\tprotected static final ";
  protected final String TEXT_105 = " ";
  protected final String TEXT_106 = "; // TODO The default value literal \"";
  protected final String TEXT_107 = "\" is not valid.";
  protected final String TEXT_108 = " = ";
  protected final String TEXT_109 = ";";
  protected final String TEXT_110 = NL;
  protected final String TEXT_111 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_112 = NL + "\t@";
  protected final String TEXT_113 = NL + "\tprotected int ";
  protected final String TEXT_114 = " = 0;" + NL;
  protected final String TEXT_115 = NL + "\t/**" + NL + "\t * The offset of the flags representing the value of the '{@link #";
  protected final String TEXT_116 = "() <em>";
  protected final String TEXT_117 = "</em>}' ";
  protected final String TEXT_118 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_119 = "_EFLAG_OFFSET = ";
  protected final String TEXT_120 = ";" + NL + "" + NL + "\t/**" + NL + "\t * The flags representing the default value of the '{@link #";
  protected final String TEXT_121 = "() <em>";
  protected final String TEXT_122 = "</em>}' ";
  protected final String TEXT_123 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_124 = "_EFLAG_DEFAULT = ";
  protected final String TEXT_125 = ".ordinal()";
  protected final String TEXT_126 = ".VALUES.indexOf(";
  protected final String TEXT_127 = ")";
  protected final String TEXT_128 = " << ";
  protected final String TEXT_129 = "_EFLAG_OFFSET;" + NL + "" + NL + "\t/**" + NL + "\t * The array of enumeration values for '{@link ";
  protected final String TEXT_130 = " ";
  protected final String TEXT_131 = "}'" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprivate static final ";
  protected final String TEXT_132 = "[] ";
  protected final String TEXT_133 = "_EFLAG_VALUES = ";
  protected final String TEXT_134 = ".values()";
  protected final String TEXT_135 = "(";
  protected final String TEXT_136 = "[])";
  protected final String TEXT_137 = ".VALUES.toArray(new ";
  protected final String TEXT_138 = "[";
  protected final String TEXT_139 = ".VALUES.size()])";
  protected final String TEXT_140 = ";" + NL;
  protected final String TEXT_141 = NL + "\t/**" + NL + "\t * The flag";
  protected final String TEXT_142 = " representing the value of the '{@link #";
  protected final String TEXT_143 = "() <em>";
  protected final String TEXT_144 = "</em>}' ";
  protected final String TEXT_145 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_146 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_147 = "_EFLAG = ";
  protected final String TEXT_148 = " << ";
  protected final String TEXT_149 = "_EFLAG_OFFSET";
  protected final String TEXT_150 = ";" + NL;
  protected final String TEXT_151 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_152 = "() <em>";
  protected final String TEXT_153 = "</em>}' ";
  protected final String TEXT_154 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_155 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_156 = NL + "\t@";
  protected final String TEXT_157 = NL + "\tprotected ";
  protected final String TEXT_158 = " ";
  protected final String TEXT_159 = " = ";
  protected final String TEXT_160 = ";" + NL;
  protected final String TEXT_161 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_162 = NL + "\t@";
  protected final String TEXT_163 = NL + "\tprotected int ";
  protected final String TEXT_164 = " = 0;" + NL;
  protected final String TEXT_165 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_166 = " ";
  protected final String TEXT_167 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_168 = "_ESETFLAG = 1 << ";
  protected final String TEXT_169 = ";" + NL;
  protected final String TEXT_170 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_171 = " ";
  protected final String TEXT_172 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_173 = NL + "\t@";
  protected final String TEXT_174 = NL + "\tprotected boolean ";
  protected final String TEXT_175 = "ESet;" + NL;
  protected final String TEXT_176 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_177 = " = ";
  protected final String TEXT_178 = ".getFeatureID(";
  protected final String TEXT_179 = ") - ";
  protected final String TEXT_180 = ";" + NL;
  protected final String TEXT_181 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_182 = " = ";
  protected final String TEXT_183 = ".getFeatureID(";
  protected final String TEXT_184 = ") - ";
  protected final String TEXT_185 = ";" + NL;
  protected final String TEXT_186 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int \"EOPERATION_OFFSET_CORRECTION\" = ";
  protected final String TEXT_187 = ".getOperationID(";
  protected final String TEXT_188 = ") - ";
  protected final String TEXT_189 = ";" + NL;
  protected final String TEXT_190 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_191 = "public";
  protected final String TEXT_192 = "protected";
  protected final String TEXT_193 = " ";
  protected final String TEXT_194 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_195 = NL + "\t\t";
  protected final String TEXT_196 = " |= ";
  protected final String TEXT_197 = "_EFLAG";
  protected final String TEXT_198 = "_DEFAULT";
  protected final String TEXT_199 = ";";
  protected final String TEXT_200 = NL + "\t\tsetCurrentValue(";
  protected final String TEXT_201 = ");" + NL + "\t\tsetNextValue(";
  protected final String TEXT_202 = ");" + NL + "\t\tsetTempValue(";
  protected final String TEXT_203 = ");" + NL + "\t\tsetProbeValue(";
  protected final String TEXT_204 = ");" + NL + "\t\tsetErrorScale(";
  protected final String TEXT_205 = ");" + NL + "\t\tsetDeltaValue(";
  protected final String TEXT_206 = ");\t\t";
  protected final String TEXT_207 = NL + "\t}";
  protected final String TEXT_208 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_209 = NL + "\t@Override";
  protected final String TEXT_210 = NL + "\tprotected ";
  protected final String TEXT_211 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_212 = ";" + NL + "\t}" + NL;
  protected final String TEXT_213 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_214 = NL + "\t@Override";
  protected final String TEXT_215 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_216 = ";" + NL + "\t}" + NL;
  protected final String TEXT_217 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_218 = NL + "\t";
  protected final String TEXT_219 = "[] ";
  protected final String TEXT_220 = "();" + NL;
  protected final String TEXT_221 = NL + "\tpublic ";
  protected final String TEXT_222 = "[] ";
  protected final String TEXT_223 = "()" + NL + "\t{";
  protected final String TEXT_224 = NL + "\t\t";
  protected final String TEXT_225 = " list = (";
  protected final String TEXT_226 = ")";
  protected final String TEXT_227 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_228 = "(";
  protected final String TEXT_229 = "[])";
  protected final String TEXT_230 = "_EEMPTY_ARRAY;";
  protected final String TEXT_231 = NL + "\t\tif (";
  protected final String TEXT_232 = " == null || ";
  protected final String TEXT_233 = ".isEmpty()) return ";
  protected final String TEXT_234 = "(";
  protected final String TEXT_235 = "[])";
  protected final String TEXT_236 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_237 = " list = (";
  protected final String TEXT_238 = ")";
  protected final String TEXT_239 = ";";
  protected final String TEXT_240 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_241 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_242 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_243 = NL + "\t";
  protected final String TEXT_244 = " get";
  protected final String TEXT_245 = "(int index);" + NL;
  protected final String TEXT_246 = NL + "\tpublic ";
  protected final String TEXT_247 = " get";
  protected final String TEXT_248 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_249 = "(";
  protected final String TEXT_250 = ")";
  protected final String TEXT_251 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_252 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_253 = NL + "\tint get";
  protected final String TEXT_254 = "Length();" + NL;
  protected final String TEXT_255 = NL + "\tpublic int get";
  protected final String TEXT_256 = "Length()" + NL + "\t{";
  protected final String TEXT_257 = NL + "\t\treturn ";
  protected final String TEXT_258 = "().size();";
  protected final String TEXT_259 = NL + "\t\treturn ";
  protected final String TEXT_260 = " == null ? 0 : ";
  protected final String TEXT_261 = ".size();";
  protected final String TEXT_262 = NL + "\t}" + NL;
  protected final String TEXT_263 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_264 = NL + "\tvoid set";
  protected final String TEXT_265 = "(";
  protected final String TEXT_266 = "[] new";
  protected final String TEXT_267 = ");" + NL;
  protected final String TEXT_268 = NL + "\tpublic void set";
  protected final String TEXT_269 = "(";
  protected final String TEXT_270 = "[] new";
  protected final String TEXT_271 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_272 = ")";
  protected final String TEXT_273 = "()).setData(new";
  protected final String TEXT_274 = ".length, new";
  protected final String TEXT_275 = ");" + NL + "\t}" + NL;
  protected final String TEXT_276 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_277 = NL + "\tvoid set";
  protected final String TEXT_278 = "(int index, ";
  protected final String TEXT_279 = " element);" + NL;
  protected final String TEXT_280 = NL + "\tpublic void set";
  protected final String TEXT_281 = "(int index, ";
  protected final String TEXT_282 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_283 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_284 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_285 = "</b></em>' ";
  protected final String TEXT_286 = ".";
  protected final String TEXT_287 = NL + "\t * The key is of type ";
  protected final String TEXT_288 = "list of {@link ";
  protected final String TEXT_289 = "}";
  protected final String TEXT_290 = "{@link ";
  protected final String TEXT_291 = "}";
  protected final String TEXT_292 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_293 = "list of {@link ";
  protected final String TEXT_294 = "}";
  protected final String TEXT_295 = "{@link ";
  protected final String TEXT_296 = "}";
  protected final String TEXT_297 = ",";
  protected final String TEXT_298 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_299 = "}";
  protected final String TEXT_300 = ".";
  protected final String TEXT_301 = NL + "\t * The default value is <code>";
  protected final String TEXT_302 = "</code>.";
  protected final String TEXT_303 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_304 = "}.";
  protected final String TEXT_305 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_306 = "#";
  protected final String TEXT_307 = " <em>";
  protected final String TEXT_308 = "</em>}'.";
  protected final String TEXT_309 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_310 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_311 = "</em>' ";
  protected final String TEXT_312 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_313 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_314 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_315 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_316 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_317 = "</em>' ";
  protected final String TEXT_318 = ".";
  protected final String TEXT_319 = NL + "\t * @see ";
  protected final String TEXT_320 = NL + "\t * @see #isSet";
  protected final String TEXT_321 = "()";
  protected final String TEXT_322 = NL + "\t * @see #unset";
  protected final String TEXT_323 = "()";
  protected final String TEXT_324 = NL + "\t * @see #set";
  protected final String TEXT_325 = "(";
  protected final String TEXT_326 = ")";
  protected final String TEXT_327 = NL + "\t * @see ";
  protected final String TEXT_328 = "#get";
  protected final String TEXT_329 = "()";
  protected final String TEXT_330 = NL + "\t * @see ";
  protected final String TEXT_331 = "#";
  protected final String TEXT_332 = NL + "\t * @model ";
  protected final String TEXT_333 = NL + "\t *        ";
  protected final String TEXT_334 = NL + "\t * @model";
  protected final String TEXT_335 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_336 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_337 = NL + "\t";
  protected final String TEXT_338 = " ";
  protected final String TEXT_339 = "();" + NL;
  protected final String TEXT_340 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_341 = NL + "\tpublic ";
  protected final String TEXT_342 = " ";
  protected final String TEXT_343 = "_";
  protected final String TEXT_344 = "()" + NL + "\t{";
  protected final String TEXT_345 = NL + "\t\treturn ";
  protected final String TEXT_346 = "(";
  protected final String TEXT_347 = "(";
  protected final String TEXT_348 = ")eDynamicGet(";
  protected final String TEXT_349 = ", ";
  protected final String TEXT_350 = ", true, ";
  protected final String TEXT_351 = ")";
  protected final String TEXT_352 = ").";
  protected final String TEXT_353 = "()";
  protected final String TEXT_354 = ";";
  protected final String TEXT_355 = NL + "\t\treturn ";
  protected final String TEXT_356 = "(";
  protected final String TEXT_357 = "(";
  protected final String TEXT_358 = ")eGet(";
  protected final String TEXT_359 = ", true)";
  protected final String TEXT_360 = ").";
  protected final String TEXT_361 = "()";
  protected final String TEXT_362 = ";";
  protected final String TEXT_363 = NL + "\t\treturn ";
  protected final String TEXT_364 = "(";
  protected final String TEXT_365 = "(";
  protected final String TEXT_366 = ")";
  protected final String TEXT_367 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false)";
  protected final String TEXT_368 = ").";
  protected final String TEXT_369 = "()";
  protected final String TEXT_370 = ";";
  protected final String TEXT_371 = NL + "\t\t";
  protected final String TEXT_372 = " ";
  protected final String TEXT_373 = " = (";
  protected final String TEXT_374 = ")eVirtualGet(";
  protected final String TEXT_375 = ");";
  protected final String TEXT_376 = NL + "\t\tif (";
  protected final String TEXT_377 = " == null)" + NL + "\t\t{";
  protected final String TEXT_378 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_379 = ", ";
  protected final String TEXT_380 = " = new ";
  protected final String TEXT_381 = ");";
  protected final String TEXT_382 = NL + "\t\t\t";
  protected final String TEXT_383 = " = new ";
  protected final String TEXT_384 = ";";
  protected final String TEXT_385 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_386 = ";";
  protected final String TEXT_387 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_388 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_389 = ")eContainer();";
  protected final String TEXT_390 = NL + "\t\t";
  protected final String TEXT_391 = " ";
  protected final String TEXT_392 = " = (";
  protected final String TEXT_393 = ")eVirtualGet(";
  protected final String TEXT_394 = ", ";
  protected final String TEXT_395 = ");";
  protected final String TEXT_396 = NL + "\t\tif (";
  protected final String TEXT_397 = " != null && ";
  protected final String TEXT_398 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_399 = " old";
  protected final String TEXT_400 = " = (";
  protected final String TEXT_401 = ")";
  protected final String TEXT_402 = ";" + NL + "\t\t\t";
  protected final String TEXT_403 = " = ";
  protected final String TEXT_404 = "eResolveProxy(old";
  protected final String TEXT_405 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_406 = " != old";
  protected final String TEXT_407 = ")" + NL + "\t\t\t{";
  protected final String TEXT_408 = NL + "\t\t\t\t";
  protected final String TEXT_409 = " new";
  protected final String TEXT_410 = " = (";
  protected final String TEXT_411 = ")";
  protected final String TEXT_412 = ";";
  protected final String TEXT_413 = NL + "\t\t\t\t";
  protected final String TEXT_414 = " msgs = old";
  protected final String TEXT_415 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_416 = ", null, null);";
  protected final String TEXT_417 = NL + "\t\t\t\t";
  protected final String TEXT_418 = " msgs =  old";
  protected final String TEXT_419 = ".eInverseRemove(this, ";
  protected final String TEXT_420 = ", ";
  protected final String TEXT_421 = ".class, null);";
  protected final String TEXT_422 = NL + "\t\t\t\tif (new";
  protected final String TEXT_423 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_424 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_425 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_426 = ", null, msgs);";
  protected final String TEXT_427 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_428 = ".eInverseAdd(this, ";
  protected final String TEXT_429 = ", ";
  protected final String TEXT_430 = ".class, msgs);";
  protected final String TEXT_431 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_432 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_433 = ", ";
  protected final String TEXT_434 = ");";
  protected final String TEXT_435 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_436 = "(this, ";
  protected final String TEXT_437 = ".RESOLVE, ";
  protected final String TEXT_438 = ", old";
  protected final String TEXT_439 = ", ";
  protected final String TEXT_440 = "));";
  protected final String TEXT_441 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_442 = NL + "\t\treturn (";
  protected final String TEXT_443 = ")eVirtualGet(";
  protected final String TEXT_444 = ", ";
  protected final String TEXT_445 = ");";
  protected final String TEXT_446 = NL + "\t\treturn (";
  protected final String TEXT_447 = " & ";
  protected final String TEXT_448 = "_EFLAG) != 0;";
  protected final String TEXT_449 = NL + "\t\treturn ";
  protected final String TEXT_450 = "_EFLAG_VALUES[(";
  protected final String TEXT_451 = " & ";
  protected final String TEXT_452 = "_EFLAG) >>> ";
  protected final String TEXT_453 = "_EFLAG_OFFSET];";
  protected final String TEXT_454 = NL + "\t\treturn ";
  protected final String TEXT_455 = ";";
  protected final String TEXT_456 = NL + "\t\t";
  protected final String TEXT_457 = " ";
  protected final String TEXT_458 = " = basicGet";
  protected final String TEXT_459 = "();" + NL + "\t\treturn ";
  protected final String TEXT_460 = " != null && ";
  protected final String TEXT_461 = ".eIsProxy() ? ";
  protected final String TEXT_462 = "eResolveProxy((";
  protected final String TEXT_463 = ")";
  protected final String TEXT_464 = ") : ";
  protected final String TEXT_465 = ";";
  protected final String TEXT_466 = NL + "\t\treturn new ";
  protected final String TEXT_467 = "((";
  protected final String TEXT_468 = ".Internal)((";
  protected final String TEXT_469 = ".Internal.Wrapper)get";
  protected final String TEXT_470 = "()).featureMap().";
  protected final String TEXT_471 = "list(";
  protected final String TEXT_472 = "));";
  protected final String TEXT_473 = NL + "\t\treturn (";
  protected final String TEXT_474 = ")get";
  protected final String TEXT_475 = "().";
  protected final String TEXT_476 = "list(";
  protected final String TEXT_477 = ");";
  protected final String TEXT_478 = NL + "\t\treturn ((";
  protected final String TEXT_479 = ".Internal.Wrapper)get";
  protected final String TEXT_480 = "()).featureMap().list(";
  protected final String TEXT_481 = ");";
  protected final String TEXT_482 = NL + "\t\treturn get";
  protected final String TEXT_483 = "().list(";
  protected final String TEXT_484 = ");";
  protected final String TEXT_485 = NL + "\t\treturn ";
  protected final String TEXT_486 = "(";
  protected final String TEXT_487 = "(";
  protected final String TEXT_488 = ")";
  protected final String TEXT_489 = "((";
  protected final String TEXT_490 = ".Internal.Wrapper)get";
  protected final String TEXT_491 = "()).featureMap().get(";
  protected final String TEXT_492 = ", true)";
  protected final String TEXT_493 = ").";
  protected final String TEXT_494 = "()";
  protected final String TEXT_495 = ";";
  protected final String TEXT_496 = NL + "\t\treturn ";
  protected final String TEXT_497 = "(";
  protected final String TEXT_498 = "(";
  protected final String TEXT_499 = ")";
  protected final String TEXT_500 = "get";
  protected final String TEXT_501 = "().get(";
  protected final String TEXT_502 = ", true)";
  protected final String TEXT_503 = ").";
  protected final String TEXT_504 = "()";
  protected final String TEXT_505 = ";";
  protected final String TEXT_506 = NL + "\t\t";
  protected final String TEXT_507 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_508 = "' ";
  protected final String TEXT_509 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_510 = NL + "\t\t// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting" + NL + "\t\t// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.";
  protected final String TEXT_511 = "EcoreEMap";
  protected final String TEXT_512 = "BasicFeatureMap";
  protected final String TEXT_513 = "EcoreEList";
  protected final String TEXT_514 = " should be used.";
  protected final String TEXT_515 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_516 = NL + "\t}" + NL;
  protected final String TEXT_517 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_518 = NL + "\tpublic ";
  protected final String TEXT_519 = " basicGet";
  protected final String TEXT_520 = "()" + NL + "\t{";
  protected final String TEXT_521 = NL + "\t\treturn (";
  protected final String TEXT_522 = ")eDynamicGet(";
  protected final String TEXT_523 = ", ";
  protected final String TEXT_524 = ", false, ";
  protected final String TEXT_525 = ");";
  protected final String TEXT_526 = NL + "\t\treturn ";
  protected final String TEXT_527 = "(";
  protected final String TEXT_528 = "(";
  protected final String TEXT_529 = ")";
  protected final String TEXT_530 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false)";
  protected final String TEXT_531 = ").";
  protected final String TEXT_532 = "()";
  protected final String TEXT_533 = ";";
  protected final String TEXT_534 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_535 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_536 = ")eInternalContainer();";
  protected final String TEXT_537 = NL + "\t\treturn (";
  protected final String TEXT_538 = ")eVirtualGet(";
  protected final String TEXT_539 = ");";
  protected final String TEXT_540 = NL + "\t\treturn ";
  protected final String TEXT_541 = ";";
  protected final String TEXT_542 = NL + "\t\treturn (";
  protected final String TEXT_543 = ")((";
  protected final String TEXT_544 = ".Internal.Wrapper)get";
  protected final String TEXT_545 = "()).featureMap().get(";
  protected final String TEXT_546 = ", false);";
  protected final String TEXT_547 = NL + "\t\treturn (";
  protected final String TEXT_548 = ")get";
  protected final String TEXT_549 = "().get(";
  protected final String TEXT_550 = ", false);";
  protected final String TEXT_551 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_552 = "' ";
  protected final String TEXT_553 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_554 = NL + "\t}" + NL;
  protected final String TEXT_555 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_556 = NL + "\tpublic ";
  protected final String TEXT_557 = " basicSet";
  protected final String TEXT_558 = "(";
  protected final String TEXT_559 = " new";
  protected final String TEXT_560 = ", ";
  protected final String TEXT_561 = " msgs)" + NL + "\t{";
  protected final String TEXT_562 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_563 = ")new";
  protected final String TEXT_564 = ", ";
  protected final String TEXT_565 = ", msgs);";
  protected final String TEXT_566 = NL + "\t\treturn msgs;";
  protected final String TEXT_567 = NL + "\t\tmsgs = eDynamicInverseAdd((";
  protected final String TEXT_568 = ")new";
  protected final String TEXT_569 = ", ";
  protected final String TEXT_570 = ", msgs);";
  protected final String TEXT_571 = NL + "\t\treturn msgs;";
  protected final String TEXT_572 = NL + "\t\tObject old";
  protected final String TEXT_573 = " = eVirtualSet(";
  protected final String TEXT_574 = ", new";
  protected final String TEXT_575 = ");";
  protected final String TEXT_576 = NL + "\t\t";
  protected final String TEXT_577 = " old";
  protected final String TEXT_578 = " = ";
  protected final String TEXT_579 = ";" + NL + "\t\t";
  protected final String TEXT_580 = " = new";
  protected final String TEXT_581 = ";";
  protected final String TEXT_582 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_583 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_584 = NL + "\t\tboolean old";
  protected final String TEXT_585 = "ESet = (";
  protected final String TEXT_586 = " & ";
  protected final String TEXT_587 = "_ESETFLAG) != 0;";
  protected final String TEXT_588 = NL + "\t\t";
  protected final String TEXT_589 = " |= ";
  protected final String TEXT_590 = "_ESETFLAG;";
  protected final String TEXT_591 = NL + "\t\tboolean old";
  protected final String TEXT_592 = "ESet = ";
  protected final String TEXT_593 = "ESet;";
  protected final String TEXT_594 = NL + "\t\t";
  protected final String TEXT_595 = "ESet = true;";
  protected final String TEXT_596 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_597 = NL + "\t\t\t";
  protected final String TEXT_598 = " notification = new ";
  protected final String TEXT_599 = "(this, ";
  protected final String TEXT_600 = ".SET, ";
  protected final String TEXT_601 = ", ";
  protected final String TEXT_602 = "isSetChange ? null : old";
  protected final String TEXT_603 = "old";
  protected final String TEXT_604 = ", new";
  protected final String TEXT_605 = ", ";
  protected final String TEXT_606 = "isSetChange";
  protected final String TEXT_607 = "!old";
  protected final String TEXT_608 = "ESet";
  protected final String TEXT_609 = ");";
  protected final String TEXT_610 = NL + "\t\t\t";
  protected final String TEXT_611 = " notification = new ";
  protected final String TEXT_612 = "(this, ";
  protected final String TEXT_613 = ".SET, ";
  protected final String TEXT_614 = ", ";
  protected final String TEXT_615 = "old";
  protected final String TEXT_616 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_617 = "old";
  protected final String TEXT_618 = ", new";
  protected final String TEXT_619 = ");";
  protected final String TEXT_620 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_621 = NL + "\t\treturn msgs;";
  protected final String TEXT_622 = NL + "\t\treturn ((";
  protected final String TEXT_623 = ".Internal)((";
  protected final String TEXT_624 = ".Internal.Wrapper)get";
  protected final String TEXT_625 = "()).featureMap()).basicAdd(";
  protected final String TEXT_626 = ", new";
  protected final String TEXT_627 = ", msgs);";
  protected final String TEXT_628 = NL + "\t\treturn ((";
  protected final String TEXT_629 = ".Internal)get";
  protected final String TEXT_630 = "()).basicAdd(";
  protected final String TEXT_631 = ", new";
  protected final String TEXT_632 = ", msgs);";
  protected final String TEXT_633 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_634 = "' ";
  protected final String TEXT_635 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_636 = NL + "\t}" + NL;
  protected final String TEXT_637 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_638 = "#";
  protected final String TEXT_639 = " <em>";
  protected final String TEXT_640 = "</em>}' ";
  protected final String TEXT_641 = ".";
  protected final String TEXT_642 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_643 = "</em>' ";
  protected final String TEXT_644 = ".";
  protected final String TEXT_645 = NL + "\t * @see ";
  protected final String TEXT_646 = NL + "\t * @see #isSet";
  protected final String TEXT_647 = "()";
  protected final String TEXT_648 = NL + "\t * @see #unset";
  protected final String TEXT_649 = "()";
  protected final String TEXT_650 = NL + "\t * @see #";
  protected final String TEXT_651 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_652 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_653 = NL + "\tvoid set";
  protected final String TEXT_654 = "(";
  protected final String TEXT_655 = " value);" + NL;
  protected final String TEXT_656 = NL + "\tpublic void set";
  protected final String TEXT_657 = "_";
  protected final String TEXT_658 = "(";
  protected final String TEXT_659 = " ";
  protected final String TEXT_660 = ")" + NL + "\t{";
  protected final String TEXT_661 = NL + "\t\teDynamicSet(";
  protected final String TEXT_662 = ", ";
  protected final String TEXT_663 = ", ";
  protected final String TEXT_664 = "new ";
  protected final String TEXT_665 = "(";
  protected final String TEXT_666 = "new";
  protected final String TEXT_667 = ")";
  protected final String TEXT_668 = ");";
  protected final String TEXT_669 = NL + "\t\teSet(";
  protected final String TEXT_670 = ", ";
  protected final String TEXT_671 = "new ";
  protected final String TEXT_672 = "(";
  protected final String TEXT_673 = "new";
  protected final String TEXT_674 = ")";
  protected final String TEXT_675 = ");";
  protected final String TEXT_676 = NL + "\t\t";
  protected final String TEXT_677 = "__ESETTING_DELEGATE.dynamicSet(this, null, 0, ";
  protected final String TEXT_678 = "new ";
  protected final String TEXT_679 = "(";
  protected final String TEXT_680 = "new";
  protected final String TEXT_681 = ")";
  protected final String TEXT_682 = ");";
  protected final String TEXT_683 = NL + "\t\tif (new";
  protected final String TEXT_684 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_685 = " && new";
  protected final String TEXT_686 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_687 = ".isAncestor(this, ";
  protected final String TEXT_688 = "new";
  protected final String TEXT_689 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_690 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_691 = NL + "\t\t\t";
  protected final String TEXT_692 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_693 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_694 = ")new";
  protected final String TEXT_695 = ").eInverseAdd(this, ";
  protected final String TEXT_696 = ", ";
  protected final String TEXT_697 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_698 = "(";
  protected final String TEXT_699 = "new";
  protected final String TEXT_700 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_701 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_702 = "(this, ";
  protected final String TEXT_703 = ".SET, ";
  protected final String TEXT_704 = ", new";
  protected final String TEXT_705 = ", new";
  protected final String TEXT_706 = "));";
  protected final String TEXT_707 = NL + "\t\t";
  protected final String TEXT_708 = " ";
  protected final String TEXT_709 = " = (";
  protected final String TEXT_710 = ")eVirtualGet(";
  protected final String TEXT_711 = ");";
  protected final String TEXT_712 = NL + "\t\tif (new";
  protected final String TEXT_713 = " != ";
  protected final String TEXT_714 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_715 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_716 = " != null)";
  protected final String TEXT_717 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_718 = ")";
  protected final String TEXT_719 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_720 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_721 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_722 = ")new";
  protected final String TEXT_723 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_724 = ", null, msgs);";
  protected final String TEXT_725 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_726 = ")";
  protected final String TEXT_727 = ").eInverseRemove(this, ";
  protected final String TEXT_728 = ", ";
  protected final String TEXT_729 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_730 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_731 = ")new";
  protected final String TEXT_732 = ").eInverseAdd(this, ";
  protected final String TEXT_733 = ", ";
  protected final String TEXT_734 = ".class, msgs);";
  protected final String TEXT_735 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_736 = "(";
  protected final String TEXT_737 = "new";
  protected final String TEXT_738 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_739 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_740 = NL + "\t\t\tboolean old";
  protected final String TEXT_741 = "ESet = eVirtualIsSet(";
  protected final String TEXT_742 = ");";
  protected final String TEXT_743 = NL + "\t\t\tboolean old";
  protected final String TEXT_744 = "ESet = (";
  protected final String TEXT_745 = " & ";
  protected final String TEXT_746 = "_ESETFLAG) != 0;";
  protected final String TEXT_747 = NL + "\t\t\t";
  protected final String TEXT_748 = " |= ";
  protected final String TEXT_749 = "_ESETFLAG;";
  protected final String TEXT_750 = NL + "\t\t\tboolean old";
  protected final String TEXT_751 = "ESet = ";
  protected final String TEXT_752 = "ESet;";
  protected final String TEXT_753 = NL + "\t\t\t";
  protected final String TEXT_754 = "ESet = true;";
  protected final String TEXT_755 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_756 = "(this, ";
  protected final String TEXT_757 = ".SET, ";
  protected final String TEXT_758 = ", new";
  protected final String TEXT_759 = ", new";
  protected final String TEXT_760 = ", !old";
  protected final String TEXT_761 = "ESet));";
  protected final String TEXT_762 = NL + "\t\t}";
  protected final String TEXT_763 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_764 = "(this, ";
  protected final String TEXT_765 = ".SET, ";
  protected final String TEXT_766 = ", new";
  protected final String TEXT_767 = ", new";
  protected final String TEXT_768 = "));";
  protected final String TEXT_769 = NL + "\t\t";
  protected final String TEXT_770 = " old";
  protected final String TEXT_771 = " = (";
  protected final String TEXT_772 = " & ";
  protected final String TEXT_773 = "_EFLAG) != 0;";
  protected final String TEXT_774 = NL + "\t\t";
  protected final String TEXT_775 = " old";
  protected final String TEXT_776 = " = ";
  protected final String TEXT_777 = "_EFLAG_VALUES[(";
  protected final String TEXT_778 = " & ";
  protected final String TEXT_779 = "_EFLAG) >>> ";
  protected final String TEXT_780 = "_EFLAG_OFFSET];";
  protected final String TEXT_781 = NL + "\t\tif (new";
  protected final String TEXT_782 = ") ";
  protected final String TEXT_783 = " |= ";
  protected final String TEXT_784 = "_EFLAG; else ";
  protected final String TEXT_785 = " &= ~";
  protected final String TEXT_786 = "_EFLAG;";
  protected final String TEXT_787 = NL + "\t\tif (new";
  protected final String TEXT_788 = " == null) new";
  protected final String TEXT_789 = " = ";
  protected final String TEXT_790 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_791 = " = ";
  protected final String TEXT_792 = " & ~";
  protected final String TEXT_793 = "_EFLAG | ";
  protected final String TEXT_794 = "new";
  protected final String TEXT_795 = ".ordinal()";
  protected final String TEXT_796 = ".VALUES.indexOf(new";
  protected final String TEXT_797 = ")";
  protected final String TEXT_798 = " << ";
  protected final String TEXT_799 = "_EFLAG_OFFSET;";
  protected final String TEXT_800 = NL + "\t\t";
  protected final String TEXT_801 = " old";
  protected final String TEXT_802 = " = ";
  protected final String TEXT_803 = ";";
  protected final String TEXT_804 = NL + "\t\t";
  protected final String TEXT_805 = " ";
  protected final String TEXT_806 = " = new";
  protected final String TEXT_807 = " == null ? ";
  protected final String TEXT_808 = " : new";
  protected final String TEXT_809 = ";";
  protected final String TEXT_810 = NL + "\t\t";
  protected final String TEXT_811 = " = new";
  protected final String TEXT_812 = " == null ? ";
  protected final String TEXT_813 = " : new";
  protected final String TEXT_814 = ";";
  protected final String TEXT_815 = NL + "\t\t";
  protected final String TEXT_816 = " ";
  protected final String TEXT_817 = " = ";
  protected final String TEXT_818 = "new";
  protected final String TEXT_819 = ";";
  protected final String TEXT_820 = NL + "\t\t";
  protected final String TEXT_821 = " = ";
  protected final String TEXT_822 = "new";
  protected final String TEXT_823 = ";";
  protected final String TEXT_824 = NL + "\t\tObject old";
  protected final String TEXT_825 = " = eVirtualSet(";
  protected final String TEXT_826 = ", ";
  protected final String TEXT_827 = ");";
  protected final String TEXT_828 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_829 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_830 = NL + "\t\tboolean old";
  protected final String TEXT_831 = "ESet = (";
  protected final String TEXT_832 = " & ";
  protected final String TEXT_833 = "_ESETFLAG) != 0;";
  protected final String TEXT_834 = NL + "\t\t";
  protected final String TEXT_835 = " |= ";
  protected final String TEXT_836 = "_ESETFLAG;";
  protected final String TEXT_837 = NL + "\t\tboolean old";
  protected final String TEXT_838 = "ESet = ";
  protected final String TEXT_839 = "ESet;";
  protected final String TEXT_840 = NL + "\t\t";
  protected final String TEXT_841 = "ESet = true;";
  protected final String TEXT_842 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_843 = "(this, ";
  protected final String TEXT_844 = ".SET, ";
  protected final String TEXT_845 = ", ";
  protected final String TEXT_846 = "isSetChange ? ";
  protected final String TEXT_847 = " : old";
  protected final String TEXT_848 = "old";
  protected final String TEXT_849 = ", ";
  protected final String TEXT_850 = "new";
  protected final String TEXT_851 = ", ";
  protected final String TEXT_852 = "isSetChange";
  protected final String TEXT_853 = "!old";
  protected final String TEXT_854 = "ESet";
  protected final String TEXT_855 = "));";
  protected final String TEXT_856 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_857 = "(this, ";
  protected final String TEXT_858 = ".SET, ";
  protected final String TEXT_859 = ", ";
  protected final String TEXT_860 = "old";
  protected final String TEXT_861 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_862 = " : old";
  protected final String TEXT_863 = "old";
  protected final String TEXT_864 = ", ";
  protected final String TEXT_865 = "new";
  protected final String TEXT_866 = "));";
  protected final String TEXT_867 = NL + "\t\t((";
  protected final String TEXT_868 = ".Internal)((";
  protected final String TEXT_869 = ".Internal.Wrapper)get";
  protected final String TEXT_870 = "()).featureMap()).set(";
  protected final String TEXT_871 = ", ";
  protected final String TEXT_872 = "new ";
  protected final String TEXT_873 = "(";
  protected final String TEXT_874 = "new";
  protected final String TEXT_875 = ")";
  protected final String TEXT_876 = ");";
  protected final String TEXT_877 = NL + "\t\t((";
  protected final String TEXT_878 = ".Internal)get";
  protected final String TEXT_879 = "()).set(";
  protected final String TEXT_880 = ", ";
  protected final String TEXT_881 = "new ";
  protected final String TEXT_882 = "(";
  protected final String TEXT_883 = "new";
  protected final String TEXT_884 = ")";
  protected final String TEXT_885 = ");";
  protected final String TEXT_886 = NL + "\t\t";
  protected final String TEXT_887 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_888 = "' ";
  protected final String TEXT_889 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_890 = NL + "\t}" + NL;
  protected final String TEXT_891 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_892 = NL + "\tpublic ";
  protected final String TEXT_893 = " basicUnset";
  protected final String TEXT_894 = "(";
  protected final String TEXT_895 = " msgs)" + NL + "\t{";
  protected final String TEXT_896 = NL + "\t\treturn eDynamicInverseRemove((";
  protected final String TEXT_897 = ")";
  protected final String TEXT_898 = "basicGet";
  protected final String TEXT_899 = "(), ";
  protected final String TEXT_900 = ", msgs);";
  protected final String TEXT_901 = "Object old";
  protected final String TEXT_902 = " = ";
  protected final String TEXT_903 = "eVirtualUnset(";
  protected final String TEXT_904 = ");";
  protected final String TEXT_905 = NL + "\t\t";
  protected final String TEXT_906 = " old";
  protected final String TEXT_907 = " = ";
  protected final String TEXT_908 = ";";
  protected final String TEXT_909 = NL + "\t\t";
  protected final String TEXT_910 = " = null;";
  protected final String TEXT_911 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_912 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_913 = NL + "\t\tboolean old";
  protected final String TEXT_914 = "ESet = (";
  protected final String TEXT_915 = " & ";
  protected final String TEXT_916 = "_ESETFLAG) != 0;";
  protected final String TEXT_917 = NL + "\t\t";
  protected final String TEXT_918 = " &= ~";
  protected final String TEXT_919 = "_ESETFLAG;";
  protected final String TEXT_920 = NL + "\t\tboolean old";
  protected final String TEXT_921 = "ESet = ";
  protected final String TEXT_922 = "ESet;";
  protected final String TEXT_923 = NL + "\t\t";
  protected final String TEXT_924 = "ESet = false;";
  protected final String TEXT_925 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_926 = " notification = new ";
  protected final String TEXT_927 = "(this, ";
  protected final String TEXT_928 = ".UNSET, ";
  protected final String TEXT_929 = ", ";
  protected final String TEXT_930 = "isSetChange ? old";
  protected final String TEXT_931 = " : null";
  protected final String TEXT_932 = "old";
  protected final String TEXT_933 = ", null, ";
  protected final String TEXT_934 = "isSetChange";
  protected final String TEXT_935 = "old";
  protected final String TEXT_936 = "ESet";
  protected final String TEXT_937 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_938 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_939 = "' ";
  protected final String TEXT_940 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_941 = NL + "\t}" + NL;
  protected final String TEXT_942 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_943 = "#";
  protected final String TEXT_944 = " <em>";
  protected final String TEXT_945 = "</em>}' ";
  protected final String TEXT_946 = ".";
  protected final String TEXT_947 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_948 = NL + "\t * @see #isSet";
  protected final String TEXT_949 = "()";
  protected final String TEXT_950 = NL + "\t * @see #";
  protected final String TEXT_951 = "()";
  protected final String TEXT_952 = NL + "\t * @see #set";
  protected final String TEXT_953 = "(";
  protected final String TEXT_954 = ")";
  protected final String TEXT_955 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_956 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_957 = NL + "\tvoid unset";
  protected final String TEXT_958 = "();" + NL;
  protected final String TEXT_959 = NL + "\tpublic void unset";
  protected final String TEXT_960 = "_";
  protected final String TEXT_961 = "()" + NL + "\t{";
  protected final String TEXT_962 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_963 = ", ";
  protected final String TEXT_964 = ");";
  protected final String TEXT_965 = NL + "\t\teUnset(";
  protected final String TEXT_966 = ");";
  protected final String TEXT_967 = NL + "\t\t";
  protected final String TEXT_968 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_969 = NL + "\t\t";
  protected final String TEXT_970 = " ";
  protected final String TEXT_971 = " = (";
  protected final String TEXT_972 = ")eVirtualGet(";
  protected final String TEXT_973 = ");";
  protected final String TEXT_974 = NL + "\t\tif (";
  protected final String TEXT_975 = " != null) ((";
  protected final String TEXT_976 = ".Unsettable";
  protected final String TEXT_977 = ")";
  protected final String TEXT_978 = ").unset();";
  protected final String TEXT_979 = NL + "\t\t";
  protected final String TEXT_980 = " ";
  protected final String TEXT_981 = " = (";
  protected final String TEXT_982 = ")eVirtualGet(";
  protected final String TEXT_983 = ");";
  protected final String TEXT_984 = NL + "\t\tif (";
  protected final String TEXT_985 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_986 = " msgs = null;";
  protected final String TEXT_987 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_988 = ")";
  protected final String TEXT_989 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_990 = ", null, msgs);";
  protected final String TEXT_991 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_992 = ")";
  protected final String TEXT_993 = ").eInverseRemove(this, ";
  protected final String TEXT_994 = ", ";
  protected final String TEXT_995 = ".class, msgs);";
  protected final String TEXT_996 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_997 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_998 = NL + "\t\t\tboolean old";
  protected final String TEXT_999 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1000 = ");";
  protected final String TEXT_1001 = NL + "\t\t\tboolean old";
  protected final String TEXT_1002 = "ESet = (";
  protected final String TEXT_1003 = " & ";
  protected final String TEXT_1004 = "_ESETFLAG) != 0;";
  protected final String TEXT_1005 = NL + "\t\t\t";
  protected final String TEXT_1006 = " &= ~";
  protected final String TEXT_1007 = "_ESETFLAG;";
  protected final String TEXT_1008 = NL + "\t\t\tboolean old";
  protected final String TEXT_1009 = "ESet = ";
  protected final String TEXT_1010 = "ESet;";
  protected final String TEXT_1011 = NL + "\t\t\t";
  protected final String TEXT_1012 = "ESet = false;";
  protected final String TEXT_1013 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1014 = "(this, ";
  protected final String TEXT_1015 = ".UNSET, ";
  protected final String TEXT_1016 = ", null, null, old";
  protected final String TEXT_1017 = "ESet));";
  protected final String TEXT_1018 = NL + "\t\t}";
  protected final String TEXT_1019 = NL + "\t\t";
  protected final String TEXT_1020 = " old";
  protected final String TEXT_1021 = " = (";
  protected final String TEXT_1022 = " & ";
  protected final String TEXT_1023 = "_EFLAG) != 0;";
  protected final String TEXT_1024 = NL + "\t\t";
  protected final String TEXT_1025 = " old";
  protected final String TEXT_1026 = " = ";
  protected final String TEXT_1027 = "_EFLAG_VALUES[(";
  protected final String TEXT_1028 = " & ";
  protected final String TEXT_1029 = "_EFLAG) >>> ";
  protected final String TEXT_1030 = "_EFLAG_OFFSET];";
  protected final String TEXT_1031 = NL + "\t\tObject old";
  protected final String TEXT_1032 = " = eVirtualUnset(";
  protected final String TEXT_1033 = ");";
  protected final String TEXT_1034 = NL + "\t\t";
  protected final String TEXT_1035 = " old";
  protected final String TEXT_1036 = " = ";
  protected final String TEXT_1037 = ";";
  protected final String TEXT_1038 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1039 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1040 = NL + "\t\tboolean old";
  protected final String TEXT_1041 = "ESet = (";
  protected final String TEXT_1042 = " & ";
  protected final String TEXT_1043 = "_ESETFLAG) != 0;";
  protected final String TEXT_1044 = NL + "\t\tboolean old";
  protected final String TEXT_1045 = "ESet = ";
  protected final String TEXT_1046 = "ESet;";
  protected final String TEXT_1047 = NL + "\t\t";
  protected final String TEXT_1048 = " = null;";
  protected final String TEXT_1049 = NL + "\t\t";
  protected final String TEXT_1050 = " &= ~";
  protected final String TEXT_1051 = "_ESETFLAG;";
  protected final String TEXT_1052 = NL + "\t\t";
  protected final String TEXT_1053 = "ESet = false;";
  protected final String TEXT_1054 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1055 = "(this, ";
  protected final String TEXT_1056 = ".UNSET, ";
  protected final String TEXT_1057 = ", ";
  protected final String TEXT_1058 = "isSetChange ? old";
  protected final String TEXT_1059 = " : null";
  protected final String TEXT_1060 = "old";
  protected final String TEXT_1061 = ", null, ";
  protected final String TEXT_1062 = "isSetChange";
  protected final String TEXT_1063 = "old";
  protected final String TEXT_1064 = "ESet";
  protected final String TEXT_1065 = "));";
  protected final String TEXT_1066 = NL + "\t\tif (";
  protected final String TEXT_1067 = ") ";
  protected final String TEXT_1068 = " |= ";
  protected final String TEXT_1069 = "_EFLAG; else ";
  protected final String TEXT_1070 = " &= ~";
  protected final String TEXT_1071 = "_EFLAG;";
  protected final String TEXT_1072 = NL + "\t\t";
  protected final String TEXT_1073 = " = ";
  protected final String TEXT_1074 = " & ~";
  protected final String TEXT_1075 = "_EFLAG | ";
  protected final String TEXT_1076 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1077 = NL + "\t\t";
  protected final String TEXT_1078 = " = ";
  protected final String TEXT_1079 = ";";
  protected final String TEXT_1080 = NL + "\t\t";
  protected final String TEXT_1081 = " &= ~";
  protected final String TEXT_1082 = "_ESETFLAG;";
  protected final String TEXT_1083 = NL + "\t\t";
  protected final String TEXT_1084 = "ESet = false;";
  protected final String TEXT_1085 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1086 = "(this, ";
  protected final String TEXT_1087 = ".UNSET, ";
  protected final String TEXT_1088 = ", ";
  protected final String TEXT_1089 = "isSetChange ? old";
  protected final String TEXT_1090 = " : ";
  protected final String TEXT_1091 = "old";
  protected final String TEXT_1092 = ", ";
  protected final String TEXT_1093 = ", ";
  protected final String TEXT_1094 = "isSetChange";
  protected final String TEXT_1095 = "old";
  protected final String TEXT_1096 = "ESet";
  protected final String TEXT_1097 = "));";
  protected final String TEXT_1098 = NL + "\t\t((";
  protected final String TEXT_1099 = ".Internal)((";
  protected final String TEXT_1100 = ".Internal.Wrapper)get";
  protected final String TEXT_1101 = "()).featureMap()).clear(";
  protected final String TEXT_1102 = ");";
  protected final String TEXT_1103 = NL + "\t\t((";
  protected final String TEXT_1104 = ".Internal)get";
  protected final String TEXT_1105 = "()).clear(";
  protected final String TEXT_1106 = ");";
  protected final String TEXT_1107 = NL + "\t\t";
  protected final String TEXT_1108 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1109 = "' ";
  protected final String TEXT_1110 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1111 = NL + "\t}" + NL;
  protected final String TEXT_1112 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1113 = "#";
  protected final String TEXT_1114 = " <em>";
  protected final String TEXT_1115 = "</em>}' ";
  protected final String TEXT_1116 = " is set.";
  protected final String TEXT_1117 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1118 = "</em>' ";
  protected final String TEXT_1119 = " is set.";
  protected final String TEXT_1120 = NL + "\t * @see #unset";
  protected final String TEXT_1121 = "()";
  protected final String TEXT_1122 = NL + "\t * @see #";
  protected final String TEXT_1123 = "()";
  protected final String TEXT_1124 = NL + "\t * @see #set";
  protected final String TEXT_1125 = "(";
  protected final String TEXT_1126 = ")";
  protected final String TEXT_1127 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1128 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1129 = NL + "\tboolean isSet";
  protected final String TEXT_1130 = "();" + NL;
  protected final String TEXT_1131 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1132 = "_";
  protected final String TEXT_1133 = "()" + NL + "\t{";
  protected final String TEXT_1134 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_1135 = ", ";
  protected final String TEXT_1136 = ");";
  protected final String TEXT_1137 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1138 = ");";
  protected final String TEXT_1139 = NL + "\t\treturn ";
  protected final String TEXT_1140 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_1141 = NL + "\t\t";
  protected final String TEXT_1142 = " ";
  protected final String TEXT_1143 = " = (";
  protected final String TEXT_1144 = ")eVirtualGet(";
  protected final String TEXT_1145 = ");";
  protected final String TEXT_1146 = NL + "\t\treturn ";
  protected final String TEXT_1147 = " != null && ((";
  protected final String TEXT_1148 = ".Unsettable";
  protected final String TEXT_1149 = ")";
  protected final String TEXT_1150 = ").isSet();";
  protected final String TEXT_1151 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1152 = ");";
  protected final String TEXT_1153 = NL + "\t\treturn (";
  protected final String TEXT_1154 = " & ";
  protected final String TEXT_1155 = "_ESETFLAG) != 0;";
  protected final String TEXT_1156 = NL + "\t\treturn ";
  protected final String TEXT_1157 = "ESet;";
  protected final String TEXT_1158 = NL + "\t\treturn !((";
  protected final String TEXT_1159 = ".Internal)((";
  protected final String TEXT_1160 = ".Internal.Wrapper)get";
  protected final String TEXT_1161 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1162 = ");";
  protected final String TEXT_1163 = NL + "\t\treturn !((";
  protected final String TEXT_1164 = ".Internal)get";
  protected final String TEXT_1165 = "()).isEmpty(";
  protected final String TEXT_1166 = ");";
  protected final String TEXT_1167 = NL + "\t\t";
  protected final String TEXT_1168 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1169 = "' ";
  protected final String TEXT_1170 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1171 = NL + "\t}" + NL;
  protected final String TEXT_1172 = NL + "\t/**" + NL + "\t * The cached validation expression for the '{@link #";
  protected final String TEXT_1173 = "(";
  protected final String TEXT_1174 = ") <em>";
  protected final String TEXT_1175 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1176 = "(";
  protected final String TEXT_1177 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1178 = " ";
  protected final String TEXT_1179 = "__EEXPRESSION = \"";
  protected final String TEXT_1180 = "\";";
  protected final String TEXT_1181 = NL;
  protected final String TEXT_1182 = NL + "\t/**" + NL + "\t * The cached invocation delegate for the '{@link #";
  protected final String TEXT_1183 = "(";
  protected final String TEXT_1184 = ") <em>";
  protected final String TEXT_1185 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1186 = "(";
  protected final String TEXT_1187 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1188 = ".Internal.InvocationDelegate ";
  protected final String TEXT_1189 = "__EINVOCATION_DELEGATE = ((";
  protected final String TEXT_1190 = ".Internal)";
  protected final String TEXT_1191 = ").getInvocationDelegate();" + NL;
  protected final String TEXT_1192 = NL + "\t/**";
  protected final String TEXT_1193 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1194 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1195 = NL + "\t * ";
  protected final String TEXT_1196 = NL + "\t * @param ";
  protected final String TEXT_1197 = NL + "\t *   ";
  protected final String TEXT_1198 = NL + "\t * @param ";
  protected final String TEXT_1199 = " ";
  protected final String TEXT_1200 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1201 = NL + "\t * @model ";
  protected final String TEXT_1202 = NL + "\t *        ";
  protected final String TEXT_1203 = NL + "\t * @model";
  protected final String TEXT_1204 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1205 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1206 = NL + "\t";
  protected final String TEXT_1207 = " ";
  protected final String TEXT_1208 = "(";
  protected final String TEXT_1209 = ")";
  protected final String TEXT_1210 = ";" + NL;
  protected final String TEXT_1211 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1212 = NL + "\tpublic ";
  protected final String TEXT_1213 = " ";
  protected final String TEXT_1214 = "(";
  protected final String TEXT_1215 = ")";
  protected final String TEXT_1216 = NL + "\t{";
  protected final String TEXT_1217 = NL + "\t\t";
  protected final String TEXT_1218 = NL + "\t\treturn" + NL + "\t\t\t";
  protected final String TEXT_1219 = ".validate" + NL + "\t\t\t\t(";
  protected final String TEXT_1220 = "," + NL + "\t\t\t\t this," + NL + "\t\t\t\t ";
  protected final String TEXT_1221 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_1222 = "," + NL + "\t\t\t\t \"";
  protected final String TEXT_1223 = "\",";
  protected final String TEXT_1224 = NL + "\t\t\t\t ";
  protected final String TEXT_1225 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_1226 = "__EEXPRESSION," + NL + "\t\t\t\t ";
  protected final String TEXT_1227 = ".ERROR," + NL + "\t\t\t\t ";
  protected final String TEXT_1228 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t ";
  protected final String TEXT_1229 = ".";
  protected final String TEXT_1230 = ");";
  protected final String TEXT_1231 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1232 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1233 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1234 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1235 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1236 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1237 = ".";
  protected final String TEXT_1238 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1239 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1240 = "\", ";
  protected final String TEXT_1241 = ".getObjectLabel(this, ";
  protected final String TEXT_1242 = ") }),";
  protected final String TEXT_1243 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1244 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_1245 = NL + "\t\t\t";
  protected final String TEXT_1246 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_1247 = "new ";
  protected final String TEXT_1248 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_1249 = ", ";
  protected final String TEXT_1250 = ")";
  protected final String TEXT_1251 = "null";
  protected final String TEXT_1252 = ");";
  protected final String TEXT_1253 = NL + "\t\t\treturn ";
  protected final String TEXT_1254 = "(";
  protected final String TEXT_1255 = "(";
  protected final String TEXT_1256 = ")";
  protected final String TEXT_1257 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_1258 = "new ";
  protected final String TEXT_1259 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_1260 = ", ";
  protected final String TEXT_1261 = ")";
  protected final String TEXT_1262 = "null";
  protected final String TEXT_1263 = ")";
  protected final String TEXT_1264 = ").";
  protected final String TEXT_1265 = "()";
  protected final String TEXT_1266 = ";";
  protected final String TEXT_1267 = NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_1268 = " ite)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_1269 = "(ite);" + NL + "\t\t}";
  protected final String TEXT_1270 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1271 = NL + "\t}" + NL;
  protected final String TEXT_1272 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1273 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1274 = NL + "\t@Override";
  protected final String TEXT_1275 = NL + "\tpublic ";
  protected final String TEXT_1276 = " eInverseAdd(";
  protected final String TEXT_1277 = " otherEnd, int featureID, ";
  protected final String TEXT_1278 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1279 = ")" + NL + "\t\t{";
  protected final String TEXT_1280 = NL + "\t\t\tcase ";
  protected final String TEXT_1281 = ":";
  protected final String TEXT_1282 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1283 = "(";
  protected final String TEXT_1284 = ".InternalMapView";
  protected final String TEXT_1285 = ")";
  protected final String TEXT_1286 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1287 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1288 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1289 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1290 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1291 = "((";
  protected final String TEXT_1292 = ")otherEnd, msgs);";
  protected final String TEXT_1293 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1294 = ", msgs);";
  protected final String TEXT_1295 = NL + "\t\t\t\t";
  protected final String TEXT_1296 = " ";
  protected final String TEXT_1297 = " = (";
  protected final String TEXT_1298 = ")eVirtualGet(";
  protected final String TEXT_1299 = ");";
  protected final String TEXT_1300 = NL + "\t\t\t\t";
  protected final String TEXT_1301 = " ";
  protected final String TEXT_1302 = " = ";
  protected final String TEXT_1303 = "basicGet";
  protected final String TEXT_1304 = "();";
  protected final String TEXT_1305 = NL + "\t\t\t\tif (";
  protected final String TEXT_1306 = " != null)";
  protected final String TEXT_1307 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1308 = ")";
  protected final String TEXT_1309 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1310 = ", null, msgs);";
  protected final String TEXT_1311 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1312 = ")";
  protected final String TEXT_1313 = ").eInverseRemove(this, ";
  protected final String TEXT_1314 = ", ";
  protected final String TEXT_1315 = ".class, msgs);";
  protected final String TEXT_1316 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1317 = "((";
  protected final String TEXT_1318 = ")otherEnd, msgs);";
  protected final String TEXT_1319 = NL + "\t\t}";
  protected final String TEXT_1320 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1321 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1322 = NL + "\t}" + NL;
  protected final String TEXT_1323 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1324 = NL + "\t@Override";
  protected final String TEXT_1325 = NL + "\tpublic ";
  protected final String TEXT_1326 = " eInverseRemove(";
  protected final String TEXT_1327 = " otherEnd, int featureID, ";
  protected final String TEXT_1328 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1329 = ")" + NL + "\t\t{";
  protected final String TEXT_1330 = NL + "\t\t\tcase ";
  protected final String TEXT_1331 = ":";
  protected final String TEXT_1332 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1333 = ")((";
  protected final String TEXT_1334 = ".InternalMapView";
  protected final String TEXT_1335 = ")";
  protected final String TEXT_1336 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1337 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1338 = ")((";
  protected final String TEXT_1339 = ".Internal.Wrapper)";
  protected final String TEXT_1340 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1341 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1342 = ")";
  protected final String TEXT_1343 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1344 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1345 = ", msgs);";
  protected final String TEXT_1346 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1347 = "(msgs);";
  protected final String TEXT_1348 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1349 = "(null, msgs);";
  protected final String TEXT_1350 = NL + "\t\t}";
  protected final String TEXT_1351 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1352 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1353 = NL + "\t}" + NL;
  protected final String TEXT_1354 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1355 = NL + "\t@Override";
  protected final String TEXT_1356 = NL + "\tpublic ";
  protected final String TEXT_1357 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1358 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_1359 = ")" + NL + "\t\t{";
  protected final String TEXT_1360 = NL + "\t\t\tcase ";
  protected final String TEXT_1361 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1362 = ", ";
  protected final String TEXT_1363 = ".class, msgs);";
  protected final String TEXT_1364 = NL + "\t\t}";
  protected final String TEXT_1365 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1366 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1367 = NL + "\t}" + NL;
  protected final String TEXT_1368 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1369 = NL + "\t@Override";
  protected final String TEXT_1370 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1371 = ")" + NL + "\t\t{";
  protected final String TEXT_1372 = NL + "\t\t\tcase ";
  protected final String TEXT_1373 = ":";
  protected final String TEXT_1374 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1375 = "();";
  protected final String TEXT_1376 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1377 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1378 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1379 = "(";
  protected final String TEXT_1380 = "());";
  protected final String TEXT_1381 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1382 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1383 = "();";
  protected final String TEXT_1384 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1385 = ".InternalMapView";
  protected final String TEXT_1386 = ")";
  protected final String TEXT_1387 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1388 = "();";
  protected final String TEXT_1389 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1390 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1391 = "().map();";
  protected final String TEXT_1392 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1393 = ".Internal.Wrapper)";
  protected final String TEXT_1394 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1395 = "();";
  protected final String TEXT_1396 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1397 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1398 = ".Internal)";
  protected final String TEXT_1399 = "()).getWrapper();";
  protected final String TEXT_1400 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1401 = "();";
  protected final String TEXT_1402 = NL + "\t\t}";
  protected final String TEXT_1403 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1404 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1405 = NL + "\t}" + NL;
  protected final String TEXT_1406 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1407 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1408 = NL + "\t@Override";
  protected final String TEXT_1409 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1410 = ")" + NL + "\t\t{";
  protected final String TEXT_1411 = NL + "\t\t\tcase ";
  protected final String TEXT_1412 = ":";
  protected final String TEXT_1413 = NL + "\t\t\t\t((";
  protected final String TEXT_1414 = ".Internal)((";
  protected final String TEXT_1415 = ".Internal.Wrapper)";
  protected final String TEXT_1416 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1417 = NL + "\t\t\t\t((";
  protected final String TEXT_1418 = ".Internal)";
  protected final String TEXT_1419 = "()).set(newValue);";
  protected final String TEXT_1420 = NL + "\t\t\t\t((";
  protected final String TEXT_1421 = ".Setting)((";
  protected final String TEXT_1422 = ".InternalMapView";
  protected final String TEXT_1423 = ")";
  protected final String TEXT_1424 = "()).eMap()).set(newValue);";
  protected final String TEXT_1425 = NL + "\t\t\t\t((";
  protected final String TEXT_1426 = ".Setting)";
  protected final String TEXT_1427 = "()).set(newValue);";
  protected final String TEXT_1428 = NL + "\t\t\t\t";
  protected final String TEXT_1429 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1430 = "().addAll((";
  protected final String TEXT_1431 = "<? extends ";
  protected final String TEXT_1432 = ">";
  protected final String TEXT_1433 = ")newValue);";
  protected final String TEXT_1434 = NL + "\t\t\t\tset";
  protected final String TEXT_1435 = "(((";
  protected final String TEXT_1436 = ")newValue).";
  protected final String TEXT_1437 = "());";
  protected final String TEXT_1438 = NL + "\t\t\t\tset";
  protected final String TEXT_1439 = "(";
  protected final String TEXT_1440 = "(";
  protected final String TEXT_1441 = ")";
  protected final String TEXT_1442 = "newValue);";
  protected final String TEXT_1443 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1444 = NL + "\t\t}";
  protected final String TEXT_1445 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1446 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1447 = NL + "\t}" + NL;
  protected final String TEXT_1448 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1449 = NL + "\t@Override";
  protected final String TEXT_1450 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1451 = ")" + NL + "\t\t{";
  protected final String TEXT_1452 = NL + "\t\t\tcase ";
  protected final String TEXT_1453 = ":";
  protected final String TEXT_1454 = NL + "\t\t\t\t((";
  protected final String TEXT_1455 = ".Internal.Wrapper)";
  protected final String TEXT_1456 = "()).featureMap().clear();";
  protected final String TEXT_1457 = NL + "\t\t\t\t";
  protected final String TEXT_1458 = "().clear();";
  protected final String TEXT_1459 = NL + "\t\t\t\tunset";
  protected final String TEXT_1460 = "();";
  protected final String TEXT_1461 = NL + "\t\t\t\tset";
  protected final String TEXT_1462 = "((";
  protected final String TEXT_1463 = ")null);";
  protected final String TEXT_1464 = NL + "\t\t\t\tset";
  protected final String TEXT_1465 = "(";
  protected final String TEXT_1466 = ");";
  protected final String TEXT_1467 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1468 = NL + "\t\t}";
  protected final String TEXT_1469 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1470 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1471 = NL + "\t}" + NL;
  protected final String TEXT_1472 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1473 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1474 = NL + "\t@Override";
  protected final String TEXT_1475 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1476 = ")" + NL + "\t\t{";
  protected final String TEXT_1477 = NL + "\t\t\tcase ";
  protected final String TEXT_1478 = ":";
  protected final String TEXT_1479 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1480 = "();";
  protected final String TEXT_1481 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1482 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_1483 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1484 = ".Internal.Wrapper)";
  protected final String TEXT_1485 = "()).featureMap().isEmpty();";
  protected final String TEXT_1486 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1487 = " != null && !";
  protected final String TEXT_1488 = ".featureMap().isEmpty();";
  protected final String TEXT_1489 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1490 = " != null && !";
  protected final String TEXT_1491 = ".isEmpty();";
  protected final String TEXT_1492 = NL + "\t\t\t\t";
  protected final String TEXT_1493 = " ";
  protected final String TEXT_1494 = " = (";
  protected final String TEXT_1495 = ")eVirtualGet(";
  protected final String TEXT_1496 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1497 = " != null && !";
  protected final String TEXT_1498 = ".isEmpty();";
  protected final String TEXT_1499 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1500 = "().isEmpty();";
  protected final String TEXT_1501 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1502 = "();";
  protected final String TEXT_1503 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1504 = " != null;";
  protected final String TEXT_1505 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1506 = ") != null;";
  protected final String TEXT_1507 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1508 = "() != null;";
  protected final String TEXT_1509 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1510 = " != null;";
  protected final String TEXT_1511 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1512 = ") != null;";
  protected final String TEXT_1513 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1514 = "() != null;";
  protected final String TEXT_1515 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1516 = " & ";
  protected final String TEXT_1517 = "_EFLAG) != 0) != ";
  protected final String TEXT_1518 = ";";
  protected final String TEXT_1519 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1520 = " & ";
  protected final String TEXT_1521 = "_EFLAG) != ";
  protected final String TEXT_1522 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1523 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1524 = " != ";
  protected final String TEXT_1525 = ";";
  protected final String TEXT_1526 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1527 = ", ";
  protected final String TEXT_1528 = ") != ";
  protected final String TEXT_1529 = ";";
  protected final String TEXT_1530 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1531 = "() != ";
  protected final String TEXT_1532 = ";";
  protected final String TEXT_1533 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1534 = " == null ? ";
  protected final String TEXT_1535 = " != null : !";
  protected final String TEXT_1536 = ".equals(";
  protected final String TEXT_1537 = ");";
  protected final String TEXT_1538 = NL + "\t\t\t\t";
  protected final String TEXT_1539 = " ";
  protected final String TEXT_1540 = " = (";
  protected final String TEXT_1541 = ")eVirtualGet(";
  protected final String TEXT_1542 = ", ";
  protected final String TEXT_1543 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1544 = " == null ? ";
  protected final String TEXT_1545 = " != null : !";
  protected final String TEXT_1546 = ".equals(";
  protected final String TEXT_1547 = ");";
  protected final String TEXT_1548 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1549 = " == null ? ";
  protected final String TEXT_1550 = "() != null : !";
  protected final String TEXT_1551 = ".equals(";
  protected final String TEXT_1552 = "());";
  protected final String TEXT_1553 = NL + "\t\t}";
  protected final String TEXT_1554 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_1555 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_1556 = NL + "\t}" + NL;
  protected final String TEXT_1557 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1558 = NL + "\t@Override";
  protected final String TEXT_1559 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_1560 = " baseClass)" + NL + "\t{";
  protected final String TEXT_1561 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1562 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_1563 = ")" + NL + "\t\t\t{";
  protected final String TEXT_1564 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1565 = ": return ";
  protected final String TEXT_1566 = ";";
  protected final String TEXT_1567 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1568 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_1569 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1570 = NL + "\t@Override";
  protected final String TEXT_1571 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_1572 = " baseClass)" + NL + "\t{";
  protected final String TEXT_1573 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1574 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1575 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1576 = ": return ";
  protected final String TEXT_1577 = ";";
  protected final String TEXT_1578 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1579 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1580 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_1581 = ")" + NL + "\t\t\t{";
  protected final String TEXT_1582 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1583 = ": return ";
  protected final String TEXT_1584 = ";";
  protected final String TEXT_1585 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1586 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1587 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1588 = NL + "\t@Override";
  protected final String TEXT_1589 = NL + "\tpublic int eDerivedOperationID(int baseOperationID, Class";
  protected final String TEXT_1590 = " baseClass)" + NL + "\t{";
  protected final String TEXT_1591 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1592 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_1593 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1594 = ": return ";
  protected final String TEXT_1595 = ";";
  protected final String TEXT_1596 = NL + "\t\t\t\tdefault: return super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1597 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1598 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_1599 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1600 = ": return ";
  protected final String TEXT_1601 = ";";
  protected final String TEXT_1602 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1603 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1604 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID";
  protected final String TEXT_1605 = ")" + NL + "\t\t\t{";
  protected final String TEXT_1606 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1607 = ": return ";
  protected final String TEXT_1608 = ";";
  protected final String TEXT_1609 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1610 = NL + "\t\treturn super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1611 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1612 = NL + "\t@Override";
  protected final String TEXT_1613 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1614 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1615 = NL + "\t@Override";
  protected final String TEXT_1616 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1617 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1618 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1619 = NL + "\t@Override";
  protected final String TEXT_1620 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1621 = NL + "\t\t\tcase ";
  protected final String TEXT_1622 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1623 = ";";
  protected final String TEXT_1624 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1625 = NL + "\t@Override";
  protected final String TEXT_1626 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1627 = NL + "\t\t\tcase ";
  protected final String TEXT_1628 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1629 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1630 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1631 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1632 = NL + "\t@Override";
  protected final String TEXT_1633 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1634 = NL + "\tpublic Object eInvoke(int operationID, ";
  protected final String TEXT_1635 = " arguments) throws ";
  protected final String TEXT_1636 = NL + "\t{" + NL + "\t\tswitch (operationID";
  protected final String TEXT_1637 = ")" + NL + "\t\t{";
  protected final String TEXT_1638 = NL + "\t\t\tcase ";
  protected final String TEXT_1639 = ":";
  protected final String TEXT_1640 = NL + "\t\t\t\t";
  protected final String TEXT_1641 = "(";
  protected final String TEXT_1642 = "(";
  protected final String TEXT_1643 = "(";
  protected final String TEXT_1644 = ")";
  protected final String TEXT_1645 = "arguments.get(";
  protected final String TEXT_1646 = ")";
  protected final String TEXT_1647 = ").";
  protected final String TEXT_1648 = "()";
  protected final String TEXT_1649 = ", ";
  protected final String TEXT_1650 = ");" + NL + "\t\t\t\treturn null;";
  protected final String TEXT_1651 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1652 = "new ";
  protected final String TEXT_1653 = "(";
  protected final String TEXT_1654 = "(";
  protected final String TEXT_1655 = "(";
  protected final String TEXT_1656 = "(";
  protected final String TEXT_1657 = ")";
  protected final String TEXT_1658 = "arguments.get(";
  protected final String TEXT_1659 = ")";
  protected final String TEXT_1660 = ").";
  protected final String TEXT_1661 = "()";
  protected final String TEXT_1662 = ", ";
  protected final String TEXT_1663 = ")";
  protected final String TEXT_1664 = ")";
  protected final String TEXT_1665 = ";";
  protected final String TEXT_1666 = NL + "\t\t}";
  protected final String TEXT_1667 = NL + "\t\treturn super.eInvoke(operationID, arguments);";
  protected final String TEXT_1668 = NL + "\t\treturn eDynamicInvoke(operationID, arguments);";
  protected final String TEXT_1669 = NL + "\t}" + NL;
  protected final String TEXT_1670 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1671 = NL + "\t@Override";
  protected final String TEXT_1672 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1673 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1674 = ": \");";
  protected final String TEXT_1675 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1676 = ": \");";
  protected final String TEXT_1677 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1678 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1679 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1680 = NL + "\t\tif (";
  protected final String TEXT_1681 = "(";
  protected final String TEXT_1682 = " & ";
  protected final String TEXT_1683 = "_ESETFLAG) != 0";
  protected final String TEXT_1684 = "ESet";
  protected final String TEXT_1685 = ") result.append((";
  protected final String TEXT_1686 = " & ";
  protected final String TEXT_1687 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_1688 = NL + "\t\tif (";
  protected final String TEXT_1689 = "(";
  protected final String TEXT_1690 = " & ";
  protected final String TEXT_1691 = "_ESETFLAG) != 0";
  protected final String TEXT_1692 = "ESet";
  protected final String TEXT_1693 = ") result.append(";
  protected final String TEXT_1694 = "_EFLAG_VALUES[(";
  protected final String TEXT_1695 = " & ";
  protected final String TEXT_1696 = "_EFLAG) >>> ";
  protected final String TEXT_1697 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_1698 = NL + "\t\tif (";
  protected final String TEXT_1699 = "(";
  protected final String TEXT_1700 = " & ";
  protected final String TEXT_1701 = "_ESETFLAG) != 0";
  protected final String TEXT_1702 = "ESet";
  protected final String TEXT_1703 = ") result.append(";
  protected final String TEXT_1704 = "); else result.append(\"<unset>\");";
  protected final String TEXT_1705 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_1706 = ", ";
  protected final String TEXT_1707 = "));";
  protected final String TEXT_1708 = NL + "\t\tresult.append((";
  protected final String TEXT_1709 = " & ";
  protected final String TEXT_1710 = "_EFLAG) != 0);";
  protected final String TEXT_1711 = NL + "\t\tresult.append(";
  protected final String TEXT_1712 = "_EFLAG_VALUES[(";
  protected final String TEXT_1713 = " & ";
  protected final String TEXT_1714 = "_EFLAG) >>> ";
  protected final String TEXT_1715 = "_EFLAG_OFFSET]);";
  protected final String TEXT_1716 = NL + "\t\tresult.append(";
  protected final String TEXT_1717 = ");";
  protected final String TEXT_1718 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_1719 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1720 = NL + "\t@";
  protected final String TEXT_1721 = NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1722 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1723 = " getKey()" + NL + "\t{";
  protected final String TEXT_1724 = NL + "\t\treturn new ";
  protected final String TEXT_1725 = "(getTypedKey());";
  protected final String TEXT_1726 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_1727 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_1728 = " key)" + NL + "\t{";
  protected final String TEXT_1729 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_1730 = "(";
  protected final String TEXT_1731 = ")";
  protected final String TEXT_1732 = "key);";
  protected final String TEXT_1733 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_1734 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_1735 = ")key).";
  protected final String TEXT_1736 = "());";
  protected final String TEXT_1737 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_1738 = ")key);";
  protected final String TEXT_1739 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1740 = " getValue()" + NL + "\t{";
  protected final String TEXT_1741 = NL + "\t\treturn new ";
  protected final String TEXT_1742 = "(getTypedValue());";
  protected final String TEXT_1743 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_1744 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1745 = " setValue(";
  protected final String TEXT_1746 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1747 = " oldValue = getValue();";
  protected final String TEXT_1748 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_1749 = "(";
  protected final String TEXT_1750 = ")";
  protected final String TEXT_1751 = "value);";
  protected final String TEXT_1752 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_1753 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_1754 = ")value).";
  protected final String TEXT_1755 = "());";
  protected final String TEXT_1756 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_1757 = ")value);";
  protected final String TEXT_1758 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1759 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1760 = NL + "\tpublic ";
  protected final String TEXT_1761 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1762 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_1763 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_1764 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic void applyExternalDeltas(";
  protected final String TEXT_1765 = " currentTime, double continuousTime, long timeDelta, ";
  protected final String TEXT_1766 = "<";
  protected final String TEXT_1767 = "> labels)" + NL + "\t{" + NL + "\t\t// TODO Auto-generated stub. Implement applyExternalDeltas(...) for ";
  protected final String TEXT_1768 = "." + NL + "\t\tsuper.applyExternalDeltas(currentTime, continuousTime, timeDelta, labels);" + NL + "\t} // applyExternalDeltas" + NL + "" + NL + "" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic void doStochasticProcess(";
  protected final String TEXT_1769 = " label, long timeDelta)" + NL + "\t{" + NL + "\t\t// TODO Auto-generated stub. Implement doStochasticProcess(...) for ";
  protected final String TEXT_1770 = "." + NL + "\t\tsuper.doStochasticProcess(label, timeDelta);" + NL + "\t} // doStochasticProcess" + NL;
  protected final String TEXT_1771 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@SuppressWarnings(\"unused\")" + NL + "\t@Override" + NL + "\tpublic void calculateDeltas(";
  protected final String TEXT_1772 = " time, double t, long timeDelta, ";
  protected final String TEXT_1773 = "<";
  protected final String TEXT_1774 = "> labels)" + NL + "\t{" + NL + "\t\t// TODO Auto-generated stub. Implement calculateDeltas(...) for ";
  protected final String TEXT_1775 = "." + NL + "" + NL + "\t\t// Add common calculations here that needs to be done before we begin." + NL + "\t\t// For instance, adjust rate parameters here to take into account the time " + NL + "\t\t// step of the sequencer and the time period of the disease model." + NL + "\t\t// Here is an example:" + NL + "\t\t// final double adjustedTransmissionRate = getTransmissionRate() * ((double) timeDelta / (double) getTimePeriod());" + NL + "" + NL + "\t\tfor(int _i=0;_i<labels.size();++_i) {" + NL + "\t\t\t";
  protected final String TEXT_1776 = " diseaseLabel = (";
  protected final String TEXT_1777 = ")labels.get(_i);" + NL + "\t\t\t";
  protected final String TEXT_1778 = " currentDiseaseState = (";
  protected final String TEXT_1779 = ")diseaseLabel.getProbeValue();" + NL + "\t\t\t";
  protected final String TEXT_1780 = " deltaValue = (";
  protected final String TEXT_1781 = ")diseaseLabel.getDeltaValue();" + NL + "\t\t\tdeltaValue.reset();" + NL + "\t\t\t" + NL + "\t\t\t// Add code here to compute and set the delta (in deltaValue) from the current state (in currentDiseaseState)" + NL + "\t\t\t// ..." + NL + "" + NL + "\t\t\t// If you need to take into account any interventions currently in place for the region, use this " + NL + "\t\t\t// code snippet as a sample:" + NL + "\t\t\t" + NL + "\t\t\t// StandardInterventionLabel sil = findInterventionLabel((Node)diseaseLabel.getIdentifiable());" + NL + "\t\t\t// if(sil != null) {" + NL + "\t\t\t//\tdouble vaccinations = ((StandardInterventionLabelValue)sil.getCurrentValue()).getVaccinations();" + NL + "\t\t\t//    ... add code to include vaccinations (isolations etc.) into your delta calculation here  " + NL + "\t\t\t// }\t" + NL + "\t\t\t" + NL + "\t\t\t// DO NOT REMOVE THIS LINE. It's critical to ensure disease deaths are being reported to " + NL + "\t\t\t// other models that depend on it." + NL + "\t\t\tcomputeAdditionalDeltasAndExchanges(diseaseLabel, time, t, timeDelta);" + NL + "\t\t}" + NL + "" + NL + "\t} // calculateDeltas" + NL;
  protected final String TEXT_1782 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1783 = " create";
  protected final String TEXT_1784 = "Label(String populationIdentifier) {\t" + NL;
  protected final String TEXT_1785 = NL + "\t";
  protected final String TEXT_1786 = " else ";
  protected final String TEXT_1787 = " if (\"";
  protected final String TEXT_1788 = "\".equals(populationIdentifier)) {";
  protected final String TEXT_1789 = NL + "\t\t\t";
  protected final String TEXT_1790 = " label = ";
  protected final String TEXT_1791 = ".";
  protected final String TEXT_1792 = ".create";
  protected final String TEXT_1793 = "();" + NL + "\t\t\tlabel.setTypeURI(";
  protected final String TEXT_1794 = ".";
  protected final String TEXT_1795 = ");" + NL + "\t\t\treturn label;" + NL + "\t\t}";
  protected final String TEXT_1796 = NL + "\t\t";
  protected final String TEXT_1797 = " label = ";
  protected final String TEXT_1798 = ".";
  protected final String TEXT_1799 = ".create";
  protected final String TEXT_1800 = "(); ";
  protected final String TEXT_1801 = NL + "\t\t";
  protected final String TEXT_1802 = " label = super.create";
  protected final String TEXT_1803 = "Label(populationIdentifier);";
  protected final String TEXT_1804 = NL + "\t\tlabel.setTypeURI(";
  protected final String TEXT_1805 = ".";
  protected final String TEXT_1806 = ");" + NL + "" + NL + "\t\treturn label;" + NL + "\t} // create";
  protected final String TEXT_1807 = "Label" + NL;
  protected final String TEXT_1808 = NL;
  protected final String TEXT_1809 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1810 = " create";
  protected final String TEXT_1811 = "LabelValue(String populationIdentifier) {\t" + NL + " ";
  protected final String TEXT_1812 = NL + "\t\t";
  protected final String TEXT_1813 = " else ";
  protected final String TEXT_1814 = " if (\"";
  protected final String TEXT_1815 = "\".equals(populationIdentifier)) {";
  protected final String TEXT_1816 = NL + "\t\t\treturn ";
  protected final String TEXT_1817 = ".";
  protected final String TEXT_1818 = ".create";
  protected final String TEXT_1819 = "();" + NL + "\t\t}";
  protected final String TEXT_1820 = NL + "\t\treturn ";
  protected final String TEXT_1821 = ".";
  protected final String TEXT_1822 = ".create";
  protected final String TEXT_1823 = "(); ";
  protected final String TEXT_1824 = NL + "\t\treturn super.create";
  protected final String TEXT_1825 = "LabelValue(populationIdentifier);";
  protected final String TEXT_1826 = NL + "\t}" + NL;
  protected final String TEXT_1827 = NL;
  protected final String TEXT_1828 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_1829 = " set(";
  protected final String TEXT_1830 = " value) {" + NL + "\t\t";
  protected final String TEXT_1831 = " v = (";
  protected final String TEXT_1832 = ")value;" + NL + "\t\tsuper.set(v);" + NL;
  protected final String TEXT_1833 = NL + "\t\t";
  protected final String TEXT_1834 = "(v.";
  protected final String TEXT_1835 = ");";
  protected final String TEXT_1836 = NL + NL + "\t\treturn this;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_1837 = " add(";
  protected final String TEXT_1838 = " value) {" + NL + "\t\t";
  protected final String TEXT_1839 = " v = (";
  protected final String TEXT_1840 = ")value;" + NL + "\t\tsuper.add(v);" + NL;
  protected final String TEXT_1841 = NL + "\t\t";
  protected final String TEXT_1842 = "(";
  protected final String TEXT_1843 = "() + v.";
  protected final String TEXT_1844 = "());";
  protected final String TEXT_1845 = NL + NL + "\t\treturn this;\t" + NL + "\t}\t" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_1846 = " add(double value) {" + NL + "\t\tsuper.add(value);" + NL;
  protected final String TEXT_1847 = NL + "\t\t";
  protected final String TEXT_1848 = "((";
  protected final String TEXT_1849 = ")(";
  protected final String TEXT_1850 = "() + value));";
  protected final String TEXT_1851 = NL + NL + "\t\treturn this;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override\t" + NL + "\tpublic ";
  protected final String TEXT_1852 = " sub(";
  protected final String TEXT_1853 = " value) {" + NL + "\t\t";
  protected final String TEXT_1854 = " v = (";
  protected final String TEXT_1855 = ")value;" + NL + "\t\tsuper.sub(v);" + NL;
  protected final String TEXT_1856 = NL + "\t\t";
  protected final String TEXT_1857 = "(";
  protected final String TEXT_1858 = "() - v.";
  protected final String TEXT_1859 = "());";
  protected final String TEXT_1860 = NL + NL + "\t\treturn this;\t" + NL + "\t}" + NL;
  protected final String TEXT_1861 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_1862 = " sub(double value) {" + NL + "\t\tsuper.sub(value);" + NL;
  protected final String TEXT_1863 = NL + "\t\t";
  protected final String TEXT_1864 = "((";
  protected final String TEXT_1865 = ")(";
  protected final String TEXT_1866 = "() - value));";
  protected final String TEXT_1867 = NL + NL + "\t\treturn this;" + NL + "\t}";
  protected final String TEXT_1868 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_1869 = " divide(";
  protected final String TEXT_1870 = " value) {" + NL + "\t\t";
  protected final String TEXT_1871 = " v = (";
  protected final String TEXT_1872 = ")value;" + NL + "\t\tsuper.divide(v);" + NL;
  protected final String TEXT_1873 = NL + "\t\t";
  protected final String TEXT_1874 = "(";
  protected final String TEXT_1875 = "() / v.";
  protected final String TEXT_1876 = "());";
  protected final String TEXT_1877 = NL + NL + "\t\treturn this;\t" + NL + "\t}" + NL;
  protected final String TEXT_1878 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_1879 = " divide(double value) {" + NL + "\t\tsuper.divide(value);" + NL;
  protected final String TEXT_1880 = NL + "\t\t";
  protected final String TEXT_1881 = "((";
  protected final String TEXT_1882 = ")(";
  protected final String TEXT_1883 = "() - value));";
  protected final String TEXT_1884 = NL + NL + "\t\treturn this;" + NL + "\t}";
  protected final String TEXT_1885 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_1886 = " multiply(";
  protected final String TEXT_1887 = " value) {" + NL + "\t\t";
  protected final String TEXT_1888 = " v = (";
  protected final String TEXT_1889 = ")value;" + NL + "\t\tsuper.multiply(v);" + NL;
  protected final String TEXT_1890 = NL + "\t\t";
  protected final String TEXT_1891 = "(";
  protected final String TEXT_1892 = "() * v.";
  protected final String TEXT_1893 = "());";
  protected final String TEXT_1894 = NL + NL + "\t\treturn this;\t" + NL + "\t}";
  protected final String TEXT_1895 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_1896 = " multiply(double value) {" + NL + "\t\tsuper.multiply(value);" + NL;
  protected final String TEXT_1897 = NL + "\t\t";
  protected final String TEXT_1898 = "((";
  protected final String TEXT_1899 = ")(";
  protected final String TEXT_1900 = "() * value));";
  protected final String TEXT_1901 = NL + NL + "\t\treturn this;" + NL + "\t}";
  protected final String TEXT_1902 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_1903 = " scale(double scaleFactor) {" + NL + "\t\tsuper.scale(scaleFactor);" + NL;
  protected final String TEXT_1904 = NL + "\t\t";
  protected final String TEXT_1905 = "((";
  protected final String TEXT_1906 = ")(";
  protected final String TEXT_1907 = "() * scaleFactor));";
  protected final String TEXT_1908 = NL + NL + "\t\treturn this;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_1909 = " abs() {" + NL + "\t\tsuper.abs();" + NL;
  protected final String TEXT_1910 = NL + "\t\t";
  protected final String TEXT_1911 = "(Math.abs(";
  protected final String TEXT_1912 = "()));";
  protected final String TEXT_1913 = NL + "\t\treturn this;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic double max() {" + NL + "\t\tdouble maxValue = super.max();" + NL;
  protected final String TEXT_1914 = NL + "\t\tmaxValue = Math.max(maxValue, ";
  protected final String TEXT_1915 = "());";
  protected final String TEXT_1916 = NL + "\t\treturn maxValue;" + NL + "\t}" + NL;
  protected final String TEXT_1917 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic double min() {" + NL + "\t\tdouble minValue = super.min();" + NL;
  protected final String TEXT_1918 = NL + "\t\tminValue = Math.min(minValue, ";
  protected final String TEXT_1919 = "());";
  protected final String TEXT_1920 = NL + "\t\treturn minValue;" + NL + "\t}";
  protected final String TEXT_1921 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic double computeDeltaAdjustment(";
  protected final String TEXT_1922 = " value) {" + NL + "\t\t";
  protected final String TEXT_1923 = " v = (";
  protected final String TEXT_1924 = ")value;" + NL + "\t\tdouble factor = super.computeDeltaAdjustment(v);" + NL;
  protected final String TEXT_1925 = NL + "\t\tif ((double)(";
  protected final String TEXT_1926 = " + v.";
  protected final String TEXT_1927 = ") < 0.0) {" + NL + "\t\t\tfactor = Math.min(factor, (double)(-v.";
  protected final String TEXT_1928 = " / ";
  protected final String TEXT_1929 = "));" + NL + "\t\t}";
  protected final String TEXT_1930 = NL + "\t\treturn factor;" + NL + "\t} // computeDeltaAdjustment" + NL + "\t" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */\t" + NL + "\t@Override" + NL + "\tpublic void reset() {" + NL + "\t\tsuper.reset();" + NL + "\t\t";
  protected final String TEXT_1931 = NL + "\t\t";
  protected final String TEXT_1932 = ";";
  protected final String TEXT_1933 = NL + "\t} // reset" + NL;
  protected final String TEXT_1934 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */\t" + NL + "\t@Override" + NL + "\tpublic double getPopulationCount() {";
  protected final String TEXT_1935 = NL + "\t\tdouble count = 0;  ";
  protected final String TEXT_1936 = NL + "\t\tdouble count = super.getPopulationCount();  ";
  protected final String TEXT_1937 = NL + "\t";
  protected final String TEXT_1938 = NL + "\t\tcount += (double)";
  protected final String TEXT_1939 = ";";
  protected final String TEXT_1940 = NL + NL + "\t\treturn count;" + NL + "\t} // getPopulationCount";
  protected final String TEXT_1941 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic boolean avoidNegative(";
  protected final String TEXT_1942 = " value) {" + NL + "\t\t";
  protected final String TEXT_1943 = " v = (";
  protected final String TEXT_1944 = ")value;" + NL + "\t\tboolean adjusted = super.avoidNegative(v);" + NL;
  protected final String TEXT_1945 = NL + "\t\tif ((double)(";
  protected final String TEXT_1946 = " + v.";
  protected final String TEXT_1947 = ") < 0.0) {" + NL + "\t\t\tadjusted = true;" + NL + "\t\t\t";
  protected final String TEXT_1948 = ";" + NL + "\t\t}" + NL;
  protected final String TEXT_1949 = NL + "\t\treturn adjusted;" + NL + "\t}" + NL;
  protected final String TEXT_1950 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic boolean sameValue(";
  protected final String TEXT_1951 = " value) {" + NL + "\t\t";
  protected final String TEXT_1952 = " v = (";
  protected final String TEXT_1953 = ")value;" + NL + "\t\tif (!super.sameValue(v)) {" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL;
  protected final String TEXT_1954 = NL + "\t\tif (";
  protected final String TEXT_1955 = " != v.";
  protected final String TEXT_1956 = ") {" + NL + "\t\t\treturn false;" + NL + "\t\t}";
  protected final String TEXT_1957 = NL + "\t\treturn true;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_1958 = " copy() {" + NL + "\t\t";
  protected final String TEXT_1959 = " copy = ";
  protected final String TEXT_1960 = ".";
  protected final String TEXT_1961 = ".create";
  protected final String TEXT_1962 = "();" + NL + "\t\tcopy.set(this);" + NL + "\t\treturn copy;" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */\t" + NL + "\t@Override" + NL + "\tpublic void prepareCycle() {" + NL + "\t\tsuper.prepareCycle();";
  protected final String TEXT_1963 = NL + "\t\t";
  protected final String TEXT_1964 = ";";
  protected final String TEXT_1965 = NL + "\t}" + NL;
  protected final String TEXT_1966 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_1967 = " ";
  protected final String TEXT_1968 = "(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1969 = ") {";
  protected final String TEXT_1970 = NL + "\t\t\tcase ";
  protected final String TEXT_1971 = ":" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1972 = "();";
  protected final String TEXT_1973 = NL + "\t\t}" + NL + "" + NL + "\t\treturn super.";
  protected final String TEXT_1974 = "(featureID);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic void ";
  protected final String TEXT_1975 = "(int featureID, ";
  protected final String TEXT_1976 = " newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1977 = ") {";
  protected final String TEXT_1978 = NL + "\t\t\tcase ";
  protected final String TEXT_1979 = ":" + NL + "\t\t\t\tset";
  protected final String TEXT_1980 = "(newValue);" + NL + "\t\t\t\treturn;";
  protected final String TEXT_1981 = NL + "\t\t}" + NL + "\t\t" + NL + "\t\tsuper.";
  protected final String TEXT_1982 = "(featureID,newValue);" + NL + "\t}" + NL;
  protected final String TEXT_1983 = "\t";
  protected final String TEXT_1984 = NL;
  protected final String TEXT_1985 = NL + "} //";
  protected final String TEXT_1986 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2012 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    final GenClass genClass = (GenClass)((Object[])argument)[0]; final GenPackage genPackage = genClass.getGenPackage(); final GenModel genModel=genPackage.getGenModel();
    final STEMGenClass stemGenClass = STEMGenClass.get(genClass); 
    final boolean isJDK50 = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50;
    final boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); final boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    final boolean isGWT = genModel.getRuntimePlatform() == GenRuntimePlatform.GWT;
    final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    final String singleWildcard = isJDK50 ? "<?>" : "";
    final String negativeOffsetCorrection = genClass.hasOffsetCorrection() ? " - " + genClass.getOffsetCorrectionField(null) : "";
    final String positiveOffsetCorrection = genClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(null) : "";
    final String negativeOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " - EOPERATION_OFFSET_CORRECTION" : "";
    final String positiveOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " + EOPERATION_OFFSET_CORRECTION" : "";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_4);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_5);
    stringBuffer.append("$");
    }}
    stringBuffer.append(TEXT_6);
    if (isInterface) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_8);
    } else {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    genModel.markImportLocation(stringBuffer, genPackage);
    if (isImplementation) { genClass.addClassPsuedoImports(); }
    stringBuffer.append(TEXT_12);
    if (isInterface) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_14);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_18);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_22);
    }
    }
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_24);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_27);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_28);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_30);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    stringBuffer.append(TEXT_32);
    } else {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_34);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_35);
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_39);
    }
    stringBuffer.append(TEXT_40);
    }
    stringBuffer.append(TEXT_41);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_42);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_43);
    }
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getInterfaceExtends());
    }
    stringBuffer.append(TEXT_46);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_47);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_50);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_54);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_55);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_56);
    if (isGWT) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_58);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_59);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_60);
    if (isGWT) {
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_62);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_63);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_64);
    if (isGWT) {
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_67);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_72);
    if (isGWT) {
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_78);
    } else if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_83);
    if (isGWT) {
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_87);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_91);
    if (genFeature.getQualifiedListItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_96);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_97);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_102);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_103);
    }
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_107);
    } else {
    stringBuffer.append(TEXT_108);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_110);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_111);
    if (isGWT) {
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_114);
    }
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(flagIndex % 32);
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_124);
    if (isJDK50) {
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_125);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_127);
    }
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getTypeGenClassifier().getFormattedName());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_133);
    if (isJDK50) {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_134);
    } else {
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_139);
    }
    stringBuffer.append(TEXT_140);
    }
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genClass.getFlagSize(genFeature) > 1 ? "s" : "");
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genClass.getFlagMask(genFeature));
    stringBuffer.append(TEXT_148);
    if (genFeature.isEnumType()) {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_149);
    } else {
    stringBuffer.append(flagIndex % 32);
    }
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_155);
    if (isGWT) {
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_160);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_161);
    if (isGWT) {
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_164);
    }
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(flagIndex % 32 );
    stringBuffer.append(TEXT_169);
    } else {
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_172);
    if (isGWT) {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_175);
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_180);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_182);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_185);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genClass.getImplementedGenOperations().get(0).getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genClass.getQualifiedOperationID(genClass.getImplementedGenOperations().get(0)));
    stringBuffer.append(TEXT_189);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_190);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_191);
    } else {
    stringBuffer.append(TEXT_192);
    }
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_194);
    for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_197);
    if (!genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_198);
    }
    stringBuffer.append(TEXT_199);
    }
    /************** Added for STEM ModelGen **************/
    if (stemGenClass.isIntegrationLabel()) {
    String createLabelString = genModel.getImportedName(genPackage.getInterfacePackageName() +"."+ genPackage.getFactoryName()) +"."+ genPackage.getFactoryInstanceName() +".create"+ stemGenClass.getLabelValueClassName() +"()";
    stringBuffer.append(TEXT_200);
    stringBuffer.append(createLabelString);
    stringBuffer.append(TEXT_201);
    stringBuffer.append(createLabelString);
    stringBuffer.append(TEXT_202);
    stringBuffer.append(createLabelString);
    stringBuffer.append(TEXT_203);
    stringBuffer.append(createLabelString);
    stringBuffer.append(TEXT_204);
    stringBuffer.append(createLabelString);
    stringBuffer.append(TEXT_205);
    stringBuffer.append(createLabelString);
    stringBuffer.append(TEXT_206);
    }//endiflabelimpl
    stringBuffer.append(TEXT_207);
    /************** Added for STEM ModelGen **************/
    stringBuffer.append(TEXT_208);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_209);
    }
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_212);
    }
    if (isImplementation && (genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL || genModel.isDynamicDelegation()) && (genClass.getClassExtendsGenClass() == null || (genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL && !genClass.getClassExtendsGenClass().getGenModel().isDynamicDelegation()))) {
    stringBuffer.append(TEXT_213);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_214);
    }
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_216);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_217);
    if (!isImplementation) {
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_220);
    } else {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_223);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_227);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_229);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_230);
    } else {
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_233);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_235);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_239);
    }
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_241);
    }
    stringBuffer.append(TEXT_242);
    if (!isImplementation) {
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_245);
    } else {
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_248);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_250);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_251);
    }
    stringBuffer.append(TEXT_252);
    if (!isImplementation) {
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_254);
    } else {
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_256);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_258);
    } else {
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_261);
    }
    stringBuffer.append(TEXT_262);
    }
    stringBuffer.append(TEXT_263);
    if (!isImplementation) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_267);
    } else {
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_275);
    }
    stringBuffer.append(TEXT_276);
    if (!isImplementation) {
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_279);
    } else {
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_283);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_286);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_287);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_288);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_289);
    } else {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_291);
    }
    stringBuffer.append(TEXT_292);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_293);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_294);
    } else {
    stringBuffer.append(TEXT_295);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_296);
    }
    stringBuffer.append(TEXT_297);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_298);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_299);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_300);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_302);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_304);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_306);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_307);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_308);
    }
    }
    stringBuffer.append(TEXT_309);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_312);
    }
    stringBuffer.append(TEXT_313);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_315);
    }
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_318);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_321);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_323);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_326);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_329);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_331);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_332);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_333);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_334);
    }}
    stringBuffer.append(TEXT_335);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_336);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_339);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !(genModel.isReflectiveDelegation() && genModel.isDynamicDelegation()) && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || genModel.isDynamicDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature() || genFeature.isListType() && genFeature.hasSettingDelegate())) {
    stringBuffer.append(TEXT_340);
    }
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_343);
    }
    stringBuffer.append(TEXT_344);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_345);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_346);
    }
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_350);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_351);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_353);
    }
    stringBuffer.append(TEXT_354);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_355);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_356);
    }
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_359);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_361);
    }
    stringBuffer.append(TEXT_362);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_363);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_364);
    }
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_367);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_369);
    }
    stringBuffer.append(TEXT_370);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_375);
    }
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_377);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_381);
    } else {
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_384);
    }
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_386);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_389);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_395);
    }
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_407);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_412);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_416);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_420);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_421);
    }
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_423);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_426);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_428);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_429);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_430);
    }
    stringBuffer.append(TEXT_431);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_434);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_440);
    }
    stringBuffer.append(TEXT_441);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_445);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_448);
    } else {
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_453);
    }
    } else {
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_455);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_465);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_469);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_470);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_472);
    } else {
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_474);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_475);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_477);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_479);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_481);
    } else {
    stringBuffer.append(TEXT_482);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_484);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_485);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_486);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_488);
    }
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_490);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_492);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_494);
    }
    stringBuffer.append(TEXT_495);
    } else {
    stringBuffer.append(TEXT_496);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_497);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_499);
    }
    stringBuffer.append(TEXT_500);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_502);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_504);
    }
    stringBuffer.append(TEXT_505);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_509);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_510);
    if (genFeature.isMapType()) {
    stringBuffer.append(TEXT_511);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_512);
    } else {
    stringBuffer.append(TEXT_513);
    }
    stringBuffer.append(TEXT_514);
    }
    stringBuffer.append(TEXT_515);
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_516);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_517);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_520);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_525);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_526);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_527);
    }
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_530);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_532);
    }
    stringBuffer.append(TEXT_533);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_536);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_539);
    } else {
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_541);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_546);
    } else {
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_548);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_550);
    }
    } else {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_553);
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_554);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_555);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_561);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_565);
    stringBuffer.append(TEXT_566);
    } else if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_570);
    stringBuffer.append(TEXT_571);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_575);
    } else {
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_581);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_583);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_587);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_590);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_593);
    }
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_595);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_596);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_601);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_605);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_606);
    } else {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_608);
    }
    stringBuffer.append(TEXT_609);
    } else {
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_614);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_616);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_619);
    }
    stringBuffer.append(TEXT_620);
    }
    stringBuffer.append(TEXT_621);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_624);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_627);
    } else {
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_632);
    }
    } else {
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_635);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_636);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_641);
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_644);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_647);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_649);
    }
    }
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_651);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_652);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_655);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_657);
    }
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_659);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_660);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_663);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_665);
    }
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_667);
    }
    stringBuffer.append(TEXT_668);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_670);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_672);
    }
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_674);
    }
    stringBuffer.append(TEXT_675);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_677);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_679);
    }
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_681);
    }
    stringBuffer.append(TEXT_682);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_695);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_696);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_698);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_700);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_706);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_711);
    }
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_716);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_724);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_726);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_728);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_732);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_733);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_734);
    }
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_738);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_739);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_742);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_746);
    }
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_749);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_752);
    }
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_754);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_761);
    }
    stringBuffer.append(TEXT_762);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_768);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_773);
    } else {
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_780);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_786);
    } else {
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_793);
    if (isJDK50) {
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_795);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_797);
    }
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_799);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_803);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_809);
    } else {
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_814);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_819);
    } else {
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_823);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_827);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_829);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_833);
    }
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_836);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_839);
    }
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_841);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_845);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_849);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_851);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_852);
    } else {
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_854);
    }
    stringBuffer.append(TEXT_855);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_859);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_864);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_866);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_869);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_871);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_873);
    }
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_875);
    }
    stringBuffer.append(TEXT_876);
    } else {
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_878);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_880);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_882);
    }
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_884);
    }
    stringBuffer.append(TEXT_885);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_886);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_889);
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_890);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_891);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_895);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_897);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_900);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_902);
    }
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_904);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_908);
    }
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_910);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_912);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_916);
    }
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_919);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_922);
    }
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_924);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_925);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_927);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_929);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_931);
    } else {
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_933);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_934);
    } else {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_936);
    }
    stringBuffer.append(TEXT_937);
    }
    } else {
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_940);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_941);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_946);
    stringBuffer.append(TEXT_947);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_949);
    }
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_951);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_954);
    }
    stringBuffer.append(TEXT_955);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_956);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_958);
    } else {
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_960);
    }
    stringBuffer.append(TEXT_961);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_964);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_966);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_968);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_973);
    }
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_976);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_978);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_983);
    }
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_986);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_990);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_993);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_994);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_995);
    }
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_997);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1000);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1004);
    }
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1007);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1010);
    }
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1012);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1017);
    }
    stringBuffer.append(TEXT_1018);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1023);
    } else {
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1030);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1033);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1037);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1039);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1043);
    } else {
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1046);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1048);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1051);
    } else {
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1053);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1057);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1059);
    } else {
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1061);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1062);
    } else {
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1064);
    }
    stringBuffer.append(TEXT_1065);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1071);
    } else {
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1076);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1079);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1082);
    } else {
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1084);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1088);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1093);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1094);
    } else {
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1096);
    }
    stringBuffer.append(TEXT_1097);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1102);
    } else {
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1106);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1110);
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1111);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1119);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1121);
    }
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1123);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1126);
    }
    stringBuffer.append(TEXT_1127);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1128);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1130);
    } else {
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1132);
    }
    stringBuffer.append(TEXT_1133);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1136);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1138);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1140);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1145);
    }
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1150);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1152);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1155);
    } else {
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1157);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1162);
    } else {
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1166);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1170);
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1171);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation) {
    if (genOperation.isInvariant() && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genOperation.getInvariantExpression("\t\t"));
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1181);
    } else if (genOperation.hasInvocationDelegate()) {
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_1191);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(TEXT_1193);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1194);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1200);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1203);
    }}
    stringBuffer.append(TEXT_1204);
    //Class/genOperation.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1205);
    if (isJDK50) { //Class/genOperation.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1210);
    } else {
    if (genModel.useGenerics() && !genOperation.hasBody() && !genOperation.isInvariant() && genOperation.hasInvocationDelegate() && genOperation.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_1211);
    }
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1216);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(genOperation.getValidationDelegate());
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1230);
    } else {
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1243);
    }
    } else if (genOperation.hasInvocationDelegate()) { int size = genOperation.getGenParameters().size();
    stringBuffer.append(TEXT_1244);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1246);
    if (size > 0) {
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_1250);
    } else {
    stringBuffer.append(TEXT_1251);
    }
    stringBuffer.append(TEXT_1252);
    } else {
    stringBuffer.append(TEXT_1253);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1254);
    }
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1257);
    if (size > 0) {
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_1261);
    } else {
    stringBuffer.append(TEXT_1262);
    }
    stringBuffer.append(TEXT_1263);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1265);
    }
    stringBuffer.append(TEXT_1266);
    }
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_1269);
    } else {
    stringBuffer.append(TEXT_1270);
    //Class/implementedGenOperation.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1271);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1272);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_1273);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1274);
    }
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1279);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1281);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1286);
    } else {
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1288);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1289);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1292);
    } else {
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1294);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1299);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1302);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1304);
    }
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1306);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1310);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1315);
    }
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1318);
    }
    }
    stringBuffer.append(TEXT_1319);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1320);
    } else {
    stringBuffer.append(TEXT_1321);
    }
    stringBuffer.append(TEXT_1322);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1323);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1324);
    }
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1329);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1331);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1336);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1340);
    } else {
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1343);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1345);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1347);
    } else {
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1349);
    }
    }
    stringBuffer.append(TEXT_1350);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1351);
    } else {
    stringBuffer.append(TEXT_1352);
    }
    stringBuffer.append(TEXT_1353);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1354);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1355);
    }
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1359);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1363);
    }
    stringBuffer.append(TEXT_1364);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1365);
    } else {
    stringBuffer.append(TEXT_1366);
    }
    stringBuffer.append(TEXT_1367);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_1368);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1369);
    }
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1371);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1373);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1375);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1377);
    } else {
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1380);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1383);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1388);
    } else {
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1391);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1395);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1399);
    } else {
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1401);
    }
    }
    stringBuffer.append(TEXT_1402);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1403);
    } else {
    stringBuffer.append(TEXT_1404);
    }
    stringBuffer.append(TEXT_1405);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1406);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_1407);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1408);
    }
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1410);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1412);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1416);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1419);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1424);
    } else {
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1427);
    }
    } else {
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1432);
    }
    stringBuffer.append(TEXT_1433);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1437);
    } else {
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1439);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1441);
    }
    stringBuffer.append(TEXT_1442);
    }
    stringBuffer.append(TEXT_1443);
    }
    stringBuffer.append(TEXT_1444);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1445);
    } else {
    stringBuffer.append(TEXT_1446);
    }
    stringBuffer.append(TEXT_1447);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_1448);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1449);
    }
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1451);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1453);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1456);
    } else {
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1458);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1460);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1463);
    } else {
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1466);
    }
    stringBuffer.append(TEXT_1467);
    }
    stringBuffer.append(TEXT_1468);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1469);
    } else {
    stringBuffer.append(TEXT_1470);
    }
    stringBuffer.append(TEXT_1471);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_1472);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1473);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1474);
    }
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1476);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1478);
    if (genFeature.hasSettingDelegate()) {
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1480);
    } else {
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1482);
    }
    } else if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1485);
    } else {
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1488);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1491);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1498);
    } else {
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1500);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1502);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1504);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1506);
    } else {
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1508);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1510);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1512);
    } else {
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1514);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1518);
    } else {
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1522);
    }
    } else {
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1525);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1529);
    } else {
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1532);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1537);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1547);
    } else {
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1552);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1553);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1554);
    } else {
    stringBuffer.append(TEXT_1555);
    }
    stringBuffer.append(TEXT_1556);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1557);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1558);
    }
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1560);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1563);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1566);
    }
    stringBuffer.append(TEXT_1567);
    }
    stringBuffer.append(TEXT_1568);
    }
    stringBuffer.append(TEXT_1569);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1570);
    }
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1572);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1574);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1577);
    }
    stringBuffer.append(TEXT_1578);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1581);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1584);
    }
    stringBuffer.append(TEXT_1585);
    }
    stringBuffer.append(TEXT_1586);
    }
    if (genModel.isOperationReflection() && isImplementation && (!genClass.getMixinGenOperations().isEmpty() || !genClass.getOverrideGenOperations(genClass.getExtendedGenOperations(), genClass.getImplementedGenOperations()).isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty())) {
    stringBuffer.append(TEXT_1587);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1588);
    }
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1590);
    for (GenClass extendedGenClass : genClass.getExtendedGenClasses()) { List<GenOperation> extendedImplementedGenOperations = extendedGenClass.getImplementedGenOperations(); List<GenOperation> implementedGenOperations = genClass.getImplementedGenOperations();
    if (!genClass.getOverrideGenOperations(extendedImplementedGenOperations, implementedGenOperations).isEmpty()) {
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(extendedGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1592);
    for (GenOperation genOperation : extendedImplementedGenOperations) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    if (implementedGenOperations.contains(overrideGenOperation)) {
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(extendedGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_1595);
    }
    }
    stringBuffer.append(TEXT_1596);
    }
    }
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1598);
    for (GenOperation genOperation : mixinGenClass.getGenOperations()) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(mixinGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_1601);
    }
    stringBuffer.append(TEXT_1602);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_1605);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_1608);
    }
    stringBuffer.append(TEXT_1609);
    }
    stringBuffer.append(TEXT_1610);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1611);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1612);
    }
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1614);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1615);
    }
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1617);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_1618);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1619);
    }
    stringBuffer.append(TEXT_1620);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1623);
    }
    stringBuffer.append(TEXT_1624);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1625);
    }
    stringBuffer.append(TEXT_1626);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1629);
    }
    stringBuffer.append(TEXT_1630);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_1631);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1632);
    }
    if (genModel.useGenerics()) {
    LOOP: for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) {
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.isUncheckedCast()) {
    stringBuffer.append(TEXT_1633);
    break LOOP;}
    }
    }
    }
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_1637);
    for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { List<GenParameter> genParameters = genOperation.getGenParameters(); int size = genParameters.size();
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_1639);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1641);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_1642);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_1644);
    }
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1646);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1648);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_1649);
    }
    }
    stringBuffer.append(TEXT_1650);
    } else {
    stringBuffer.append(TEXT_1651);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1653);
    }
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1654);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_1655);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_1657);
    }
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1659);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1661);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_1662);
    }
    }
    stringBuffer.append(TEXT_1663);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1664);
    }
    stringBuffer.append(TEXT_1665);
    }
    }
    stringBuffer.append(TEXT_1666);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1667);
    } else {
    stringBuffer.append(TEXT_1668);
    }
    stringBuffer.append(TEXT_1669);
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1670);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1671);
    }
    stringBuffer.append(TEXT_1672);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1680);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1683);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1684);
    }
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1688);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1691);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1692);
    }
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_1698);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1701);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1702);
    }
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_1707);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1710);
    } else {
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1715);
    }
    } else {
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1717);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1718);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_1719);
    if (isGWT) {
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_1723);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1725);
    } else {
    stringBuffer.append(TEXT_1726);
    }
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_1728);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_1729);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1731);
    }
    stringBuffer.append(TEXT_1732);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_1733);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1736);
    } else {
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1738);
    }
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1740);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1742);
    } else {
    stringBuffer.append(TEXT_1743);
    }
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1747);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_1748);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1750);
    }
    stringBuffer.append(TEXT_1751);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_1752);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1755);
    } else {
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1757);
    }
    stringBuffer.append(TEXT_1758);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_1759);
    }
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_1763);
    }
    /*******************************************************************************************
     Included code from STEM 
    *******************************************************************************************/
    if(isImplementation && !genModel.isReflectiveDelegation()){
    //org.eclipse.stem.model.codegen.STEMGenClass stemGenClass = org.eclipse.stem.model.codegen.STEMGenClass.get(genClass); 
    // Add standard method stubs for all IntegrationDecorators 
    if (stemGenClass.isComputationalModel()){
    String dynamicLabelImportName = genModel.getImportedName("org.eclipse.stem.core.graph.DynamicLabel");
    String stemTimeImportName = genModel.getImportedName("org.eclipse.stem.core.model.STEMTime");
    String integrationLabelImportName = genModel.getImportedName("org.eclipse.stem.core.graph.IntegrationLabel");
    String elistImportName = genModel.getImportedName("org.eclipse.emf.common.util.EList");
    stringBuffer.append(TEXT_1764);
    stringBuffer.append( stemTimeImportName );
    stringBuffer.append(TEXT_1765);
    stringBuffer.append( elistImportName );
    stringBuffer.append(TEXT_1766);
    stringBuffer.append( dynamicLabelImportName );
    stringBuffer.append(TEXT_1767);
    stringBuffer.append( genClass.getClassName() );
    stringBuffer.append(TEXT_1768);
    stringBuffer.append( integrationLabelImportName );
    stringBuffer.append(TEXT_1769);
    stringBuffer.append( genClass.getClassName() );
    stringBuffer.append(TEXT_1770);
     String defaultLabelImportedName = genModel.getImportedName(stemGenClass.getDefaultModelLabelType()); 
     String defaultLabelValueImportedName = genModel.getImportedName(stemGenClass.getDefaultModelLabelValueType()); 
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(stemTimeImportName);
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(elistImportName);
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(dynamicLabelImportName);
    stringBuffer.append(TEXT_1774);
    stringBuffer.append( genClass.getClassName() );
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(defaultLabelImportedName);
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(defaultLabelImportedName);
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(defaultLabelValueImportedName);
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(defaultLabelValueImportedName);
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(defaultLabelValueImportedName);
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(defaultLabelValueImportedName);
    stringBuffer.append(TEXT_1781);
    }
    // Set up disease-model specific code
    if ("DiseaseModel".equals(stemGenClass.getComputationalModelType())){
    //String stdDmLblValImportName = genModel.getImportedName("org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue");
    //String stdDmLblImportName = genModel.getImportedName("org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel");
    //String dmLblValImportName = genModel.getImportedName("org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue");
    }
     if ("DiseaseModel".equals(stemGenClass.getComputationalModelType()) || "PopulationModel".equals(stemGenClass.getComputationalModelType())) { 
     Map<String,GenClass> labelGenClasses = stemGenClass.getLabelGenClasses(); 
     if (labelGenClasses != null && labelGenClasses.size() > 0) { 
     GenClass defaultLabelGenClass = stemGenClass.getDefaultLabelGenClass(); 
     String labelSuperType = genModel.getImportedName(stemGenClass.getLabelBaseType());
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(labelSuperType);
    stringBuffer.append(TEXT_1783);
    stringBuffer.append( stemGenClass.getComputationalModelType() );
    stringBuffer.append(TEXT_1784);
    int idx=0; for (Map.Entry<String,GenClass> entry : labelGenClasses.entrySet()) {
    if (entry.getValue() == null || entry.getValue() == defaultLabelGenClass) { continue; } 
    stringBuffer.append(TEXT_1785);
     if (idx > 0) {
    stringBuffer.append(TEXT_1786);
    }
    stringBuffer.append(TEXT_1787);
    stringBuffer.append( entry.getKey() );
    stringBuffer.append(TEXT_1788);
     GenClass labelGenClass = entry.getValue(); GenPackage labelGenPackage = labelGenClass.getGenPackage(); 
     String labelFactoryClassName = labelGenPackage.getInterfacePackageName() +"."+ labelGenPackage.getFactoryName(); 
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(labelSuperType);
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genModel.getImportedName(labelFactoryClassName));
    stringBuffer.append(TEXT_1791);
    stringBuffer.append( labelGenPackage.getFactoryInstanceName() );
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(labelGenClass.getName());
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(labelSuperType);
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(stemGenClass.getLabelTypeURI());
    stringBuffer.append(TEXT_1795);
     idx++; } //endfor 
     if (defaultLabelGenClass != null) { 
     GenPackage labelGenPackage = defaultLabelGenClass.getGenPackage(); String labelFactoryClassName = labelGenPackage.getInterfacePackageName() +"."+ labelGenPackage.getFactoryName(); 
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(labelSuperType);
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genModel.getImportedName(labelFactoryClassName));
    stringBuffer.append(TEXT_1798);
    stringBuffer.append( labelGenPackage.getFactoryInstanceName() );
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(defaultLabelGenClass.getName());
    stringBuffer.append(TEXT_1800);
     } else { 
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(labelSuperType);
    stringBuffer.append(TEXT_1802);
    stringBuffer.append( stemGenClass.getComputationalModelType() );
    stringBuffer.append(TEXT_1803);
     } 
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(labelSuperType);
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(stemGenClass.getLabelTypeURI());
    stringBuffer.append(TEXT_1806);
    stringBuffer.append( stemGenClass.getComputationalModelType() );
    stringBuffer.append(TEXT_1807);
     } // end if has label classes 
    stringBuffer.append(TEXT_1808);
     Map<String,GenClass> labelValueGenClasses = stemGenClass.getLabelValueGenClasses(); 
     if (labelValueGenClasses != null && labelValueGenClasses.size() > 0) { 
     GenClass defaultLabelValueGenClass = stemGenClass.getDefaultLabelValueGenClass(); 
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genModel.getImportedName(stemGenClass.getLabelValueBaseType()) );
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(stemGenClass.getComputationalModelType());
    stringBuffer.append(TEXT_1811);
    int idx=0; for (Map.Entry<String,GenClass> entry : labelValueGenClasses.entrySet()) {
    if (entry.getValue() == null || entry.getValue() == defaultLabelValueGenClass) { continue; } 
    stringBuffer.append(TEXT_1812);
     if (idx > 0) {
    stringBuffer.append(TEXT_1813);
    }
    stringBuffer.append(TEXT_1814);
    stringBuffer.append( entry.getKey() );
    stringBuffer.append(TEXT_1815);
    GenClass labelValueGenClass = entry.getValue(); GenPackage labelValueGenPackage = labelValueGenClass.getGenPackage(); 
    String labelFactoryClassName = labelValueGenPackage.getInterfacePackageName() +"."+ labelValueGenPackage.getFactoryName(); 
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genModel.getImportedName(labelFactoryClassName));
    stringBuffer.append(TEXT_1817);
    stringBuffer.append( labelValueGenPackage.getFactoryInstanceName() );
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(labelValueGenClass.getName());
    stringBuffer.append(TEXT_1819);
    idx++;}//endfor
     if (defaultLabelValueGenClass != null) { 
     GenPackage labelValueGenPackage = defaultLabelValueGenClass.getGenPackage(); String labelFactoryClassName = labelValueGenPackage.getInterfacePackageName() +"."+ labelValueGenPackage.getFactoryName(); 
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(genModel.getImportedName(labelFactoryClassName));
    stringBuffer.append(TEXT_1821);
    stringBuffer.append( labelValueGenPackage.getFactoryInstanceName() );
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(defaultLabelValueGenClass.getName());
    stringBuffer.append(TEXT_1823);
     } else { 
    stringBuffer.append(TEXT_1824);
    stringBuffer.append( stemGenClass.getComputationalModelType() );
    stringBuffer.append(TEXT_1825);
     } 
    stringBuffer.append(TEXT_1826);
     } // end if has label value classes 
     } // end if dm/pm 
    stringBuffer.append(TEXT_1827);
     // if integration label value, then add in math operations and primitive getters/setters 
     if (stemGenClass.isIntegrationLabelValue()) { 
    String integrationLabelValueImportName = genModel.getImportedName("org.eclipse.stem.core.graph.IntegrationLabelValue");
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1832);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(stemGenFeature.getSetterName());
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(stemGenFeature.getFullGetterName());
    stringBuffer.append(TEXT_1835);
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1840);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(stemGenFeature.getSetterName());
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1844);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1846);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(stemGenFeature.getSetterName());
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(stemGenFeature.getBaseType());
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1850);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1855);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(stemGenFeature.getSetterName());
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1859);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1860);
     /**** 
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1862);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(stemGenFeature.getSetterName());
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(stemGenFeature.getBaseType());
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1866);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1867);
     *****/ 
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1872);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(stemGenFeature.getSetterName());
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1876);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1877);
     /**** 
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1879);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(stemGenFeature.getSetterName());
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(stemGenFeature.getBaseType());
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1883);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1884);
     ****/ 
     /**** 
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1889);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(stemGenFeature.getSetterName());
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1893);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1894);
     ****/ 
     /**** 
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1896);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(stemGenFeature.getSetterName());
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(stemGenFeature.getBaseType());
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1900);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1901);
     ****/ 
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1903);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(stemGenFeature.getSetterName());
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(stemGenFeature.getBaseType());
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1907);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1909);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(stemGenFeature.getSetterName());
    stringBuffer.append(TEXT_1911);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1912);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1913);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable() && !stemGenFeature.isIncidenceFeature()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1915);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1916);
     /**** 
    stringBuffer.append(TEXT_1917);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable() && !stemGenFeature.isIncidenceFeature()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(stemGenFeature.getGetterName());
    stringBuffer.append(TEXT_1919);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1920);
     ****/ 
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1924);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(stemGenFeature.getFullGetterName());
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(stemGenFeature.getFullGetterName());
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(stemGenFeature.getFullGetterName());
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(stemGenFeature.getFullGetterName());
    stringBuffer.append(TEXT_1929);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1930);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1931);
    stringBuffer.append(stemGenFeature.getFullSetterName("("+stemGenFeature.getBaseType() +")0.0"));
    stringBuffer.append(TEXT_1932);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1933);
    if ("DiseaseModel".equals(stemGenClass.getDescriptor().getModelType())){
    stringBuffer.append(TEXT_1934);
    if ("DiseaseModelLabelValue".equals(genClass.getBaseGenClass().getName())) {
    stringBuffer.append(TEXT_1935);
    }else{
    stringBuffer.append(TEXT_1936);
    }
    stringBuffer.append(TEXT_1937);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable() && !stemGenFeature.isIncidenceFeature() && !stemGenFeature.isDiseaseDeathsFeature()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(stemGenFeature.getFullGetterName());
    stringBuffer.append(TEXT_1939);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1940);
    }
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1944);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(stemGenFeature.getFullGetterName());
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(stemGenFeature.getFullGetterName());
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(stemGenFeature.getFullSetterName("-v."+stemGenFeature.getFullGetterName()));
    stringBuffer.append(TEXT_1948);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1949);
    String labelValueImportName = genModel.getImportedName("org.eclipse.stem.core.graph.LabelValue");
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(labelValueImportName);
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1953);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(stemGenFeature.getFullGetterName());
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(stemGenFeature.getFullGetterName());
    stringBuffer.append(TEXT_1956);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(integrationLabelValueImportName);
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(genModel.getImportedName(genPackage.getInterfacePackageName() +"."+ genPackage.getFactoryName()));
    stringBuffer.append(TEXT_1960);
    stringBuffer.append( genPackage.getFactoryInstanceName() );
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_1962);
    for (org.eclipse.stem.model.codegen.STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    if (stemGenFeature.getGenFeature().isChangeable() && stemGenFeature.isIncidenceFeature()) {
    if (stemGenFeature.hasPrimitiveAccessor()) {
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(stemGenFeature.getFullSetterName("0.0"));
    stringBuffer.append(TEXT_1964);
    }//endifprimitiveaccessor
    }//endifchangeable
    }//endforgenfeatures
    stringBuffer.append(TEXT_1965);
     } // end if integration label value 
    /* If this class extends PrimitiveTypeOperations, then generate primitive accessors for features*/
     for (String primitiveType : stemGenClass.getPrimitiveAccessorTypes()) { 
     if (stemGenClass.shouldGeneratePrimitiveAccessors(primitiveType)) { 
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(primitiveType);
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(stemGenClass.getPrimitiveGetterName(primitiveType));
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1969);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    if (genFeature.getImportedType(genClass).equals(primitiveType)) {
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1972);
    }
    }
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(stemGenClass.getPrimitiveGetterName(primitiveType));
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(stemGenClass.getPrimitiveSetterName(primitiveType));
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(primitiveType);
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1977);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isChangeable() && genFeature.getImportedType(genClass).equals(primitiveType)) {
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1980);
    }
    }
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(stemGenClass.getPrimitiveSetterName(primitiveType));
    stringBuffer.append(TEXT_1982);
     } // end if should generate for primitive type 
    stringBuffer.append(TEXT_1983);
     } // end for primitive types 
     } // end if implementation 
    /************* End STEM Code **************/
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_1986);
    return stringBuffer.toString();
  }
}
