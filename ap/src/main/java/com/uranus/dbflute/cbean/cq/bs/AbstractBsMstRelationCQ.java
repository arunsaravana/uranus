package com.uranus.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.uranus.dbflute.allcommon.*;
import com.uranus.dbflute.cbean.*;
import com.uranus.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of mst_relation.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMstRelationCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMstRelationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "mst_relation";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * parent_id: {PK, NotNull, int4(10)}
     * @param parentId The value of parentId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentId_Equal(Integer parentId) {
        doSetParentId_Equal(parentId);
    }

    protected void doSetParentId_Equal(Integer parentId) {
        regParentId(CK_EQ, parentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * parent_id: {PK, NotNull, int4(10)}
     * @param parentId The value of parentId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentId_NotEqual(Integer parentId) {
        doSetParentId_NotEqual(parentId);
    }

    protected void doSetParentId_NotEqual(Integer parentId) {
        regParentId(CK_NES, parentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * parent_id: {PK, NotNull, int4(10)}
     * @param parentId The value of parentId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentId_GreaterThan(Integer parentId) {
        regParentId(CK_GT, parentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * parent_id: {PK, NotNull, int4(10)}
     * @param parentId The value of parentId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentId_LessThan(Integer parentId) {
        regParentId(CK_LT, parentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * parent_id: {PK, NotNull, int4(10)}
     * @param parentId The value of parentId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentId_GreaterEqual(Integer parentId) {
        regParentId(CK_GE, parentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * parent_id: {PK, NotNull, int4(10)}
     * @param parentId The value of parentId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentId_LessEqual(Integer parentId) {
        regParentId(CK_LE, parentId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * parent_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of parentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of parentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setParentId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setParentId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * parent_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of parentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of parentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setParentId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueParentId(), "parent_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * parent_id: {PK, NotNull, int4(10)}
     * @param parentIdList The collection of parentId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentId_InScope(Collection<Integer> parentIdList) {
        doSetParentId_InScope(parentIdList);
    }

    protected void doSetParentId_InScope(Collection<Integer> parentIdList) {
        regINS(CK_INS, cTL(parentIdList), xgetCValueParentId(), "parent_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * parent_id: {PK, NotNull, int4(10)}
     * @param parentIdList The collection of parentId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentId_NotInScope(Collection<Integer> parentIdList) {
        doSetParentId_NotInScope(parentIdList);
    }

    protected void doSetParentId_NotInScope(Collection<Integer> parentIdList) {
        regINS(CK_NINS, cTL(parentIdList), xgetCValueParentId(), "parent_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * parent_id: {PK, NotNull, int4(10)}
     */
    public void setParentId_IsNull() { regParentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * parent_id: {PK, NotNull, int4(10)}
     */
    public void setParentId_IsNotNull() { regParentId(CK_ISNN, DOBJ); }

    protected void regParentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParentId(), "parent_id"); }
    protected abstract ConditionValue xgetCValueParentId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * child_id: {PK, NotNull, int4(10)}
     * @param childId The value of childId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildId_Equal(Integer childId) {
        doSetChildId_Equal(childId);
    }

    protected void doSetChildId_Equal(Integer childId) {
        regChildId(CK_EQ, childId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * child_id: {PK, NotNull, int4(10)}
     * @param childId The value of childId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildId_NotEqual(Integer childId) {
        doSetChildId_NotEqual(childId);
    }

    protected void doSetChildId_NotEqual(Integer childId) {
        regChildId(CK_NES, childId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * child_id: {PK, NotNull, int4(10)}
     * @param childId The value of childId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildId_GreaterThan(Integer childId) {
        regChildId(CK_GT, childId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * child_id: {PK, NotNull, int4(10)}
     * @param childId The value of childId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildId_LessThan(Integer childId) {
        regChildId(CK_LT, childId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * child_id: {PK, NotNull, int4(10)}
     * @param childId The value of childId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildId_GreaterEqual(Integer childId) {
        regChildId(CK_GE, childId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * child_id: {PK, NotNull, int4(10)}
     * @param childId The value of childId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChildId_LessEqual(Integer childId) {
        regChildId(CK_LE, childId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * child_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of childId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of childId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setChildId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setChildId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * child_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of childId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of childId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setChildId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChildId(), "child_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * child_id: {PK, NotNull, int4(10)}
     * @param childIdList The collection of childId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChildId_InScope(Collection<Integer> childIdList) {
        doSetChildId_InScope(childIdList);
    }

    protected void doSetChildId_InScope(Collection<Integer> childIdList) {
        regINS(CK_INS, cTL(childIdList), xgetCValueChildId(), "child_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * child_id: {PK, NotNull, int4(10)}
     * @param childIdList The collection of childId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChildId_NotInScope(Collection<Integer> childIdList) {
        doSetChildId_NotInScope(childIdList);
    }

    protected void doSetChildId_NotInScope(Collection<Integer> childIdList) {
        regINS(CK_NINS, cTL(childIdList), xgetCValueChildId(), "child_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * child_id: {PK, NotNull, int4(10)}
     */
    public void setChildId_IsNull() { regChildId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * child_id: {PK, NotNull, int4(10)}
     */
    public void setChildId_IsNotNull() { regChildId(CK_ISNN, DOBJ); }

    protected void regChildId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChildId(), "child_id"); }
    protected abstract ConditionValue xgetCValueChildId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MstRelationCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MstRelationCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MstRelationCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MstRelationCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MstRelationCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MstRelationCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MstRelationCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MstRelationCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MstRelationCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MstRelationCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MstRelationCB&gt;() {
     *     public void query(MstRelationCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MstRelationCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MstRelationCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MstRelationCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MstRelationCQ sq);

    protected MstRelationCB xcreateScalarConditionCB() {
        MstRelationCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MstRelationCB xcreateScalarConditionPartitionByCB() {
        MstRelationCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected MstRelationCB newMyCB() {
        return new MstRelationCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MstRelationCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
