package com.uranus.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.uranus.dbflute.cbean.cq.ciq.*;
import com.uranus.dbflute.cbean.*;
import com.uranus.dbflute.cbean.cq.*;

/**
 * The base condition-query of mst_element.
 * @author DBFlute(AutoGenerator)
 */
public class BsMstElementCQ extends AbstractBsMstElementCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MstElementCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMstElementCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from mst_element) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MstElementCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MstElementCIQ xcreateCIQ() {
        MstElementCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MstElementCIQ xnewCIQ() {
        return new MstElementCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join mst_element on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MstElementCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MstElementCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    /**
     * Add order-by as ascend. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _type;
    public ConditionValue xdfgetType()
    { if (_type == null) { _type = nCV(); }
      return _type; }
    protected ConditionValue xgetCValueType() { return xdfgetType(); }

    /**
     * Add order-by as ascend. <br>
     * type: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_Type_Asc() { regOBA("type"); return this; }

    /**
     * Add order-by as descend. <br>
     * type: {int4(10)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_Type_Desc() { regOBD("type"); return this; }

    protected ConditionValue _title;
    public ConditionValue xdfgetTitle()
    { if (_title == null) { _title = nCV(); }
      return _title; }
    protected ConditionValue xgetCValueTitle() { return xdfgetTitle(); }

    /**
     * Add order-by as ascend. <br>
     * title: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_Title_Asc() { regOBA("title"); return this; }

    /**
     * Add order-by as descend. <br>
     * title: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_Title_Desc() { regOBD("title"); return this; }

    protected ConditionValue _isChecked;
    public ConditionValue xdfgetIsChecked()
    { if (_isChecked == null) { _isChecked = nCV(); }
      return _isChecked; }
    protected ConditionValue xgetCValueIsChecked() { return xdfgetIsChecked(); }

    /**
     * Add order-by as ascend. <br>
     * is_checked: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_IsChecked_Asc() { regOBA("is_checked"); return this; }

    /**
     * Add order-by as descend. <br>
     * is_checked: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_IsChecked_Desc() { regOBD("is_checked"); return this; }

    protected ConditionValue _isRoot;
    public ConditionValue xdfgetIsRoot()
    { if (_isRoot == null) { _isRoot = nCV(); }
      return _isRoot; }
    protected ConditionValue xgetCValueIsRoot() { return xdfgetIsRoot(); }

    /**
     * Add order-by as ascend. <br>
     * is_root: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_IsRoot_Asc() { regOBA("is_root"); return this; }

    /**
     * Add order-by as descend. <br>
     * is_root: {bool(1)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_IsRoot_Desc() { regOBD("is_root"); return this; }

    protected ConditionValue _createDate;
    public ConditionValue xdfgetCreateDate()
    { if (_createDate == null) { _createDate = nCV(); }
      return _createDate; }
    protected ConditionValue xgetCValueCreateDate() { return xdfgetCreateDate(); }

    /**
     * Add order-by as ascend. <br>
     * create_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_CreateDate_Asc() { regOBA("create_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * create_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_CreateDate_Desc() { regOBD("create_date"); return this; }

    protected ConditionValue _updateDate;
    public ConditionValue xdfgetUpdateDate()
    { if (_updateDate == null) { _updateDate = nCV(); }
      return _updateDate; }
    protected ConditionValue xgetCValueUpdateDate() { return xdfgetUpdateDate(); }

    /**
     * Add order-by as ascend. <br>
     * update_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_UpdateDate_Asc() { regOBA("update_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsMstElementCQ addOrderBy_UpdateDate_Desc() { regOBD("update_date"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMstElementCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMstElementCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MstElementCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MstElementCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MstElementCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MstElementCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MstElementCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MstElementCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MstElementCQ> _myselfExistsMap;
    public Map<String, MstElementCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MstElementCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MstElementCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MstElementCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MstElementCB.class.getName(); }
    protected String xCQ() { return MstElementCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
