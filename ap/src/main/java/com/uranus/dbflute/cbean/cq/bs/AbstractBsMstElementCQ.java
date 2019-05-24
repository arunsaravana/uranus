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
 * The abstract condition-query of mst_element.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMstElementCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMstElementCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "mst_element";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_Equal(Integer id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_NotEqual(Integer id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Integer id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterThan(Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessThan(Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterEqual(Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessEqual(Integer id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueId(), "id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param idList The collection of id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_InScope(Collection<Integer> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Integer> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param idList The collection of id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_NotInScope(Collection<Integer> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Integer> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "id"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type: {int4(10)}
     * @param type The value of type as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setType_Equal(Integer type) {
        doSetType_Equal(type);
    }

    protected void doSetType_Equal(Integer type) {
        regType(CK_EQ, type);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type: {int4(10)}
     * @param type The value of type as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setType_NotEqual(Integer type) {
        doSetType_NotEqual(type);
    }

    protected void doSetType_NotEqual(Integer type) {
        regType(CK_NES, type);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type: {int4(10)}
     * @param type The value of type as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setType_GreaterThan(Integer type) {
        regType(CK_GT, type);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type: {int4(10)}
     * @param type The value of type as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setType_LessThan(Integer type) {
        regType(CK_LT, type);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type: {int4(10)}
     * @param type The value of type as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setType_GreaterEqual(Integer type) {
        regType(CK_GE, type);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type: {int4(10)}
     * @param type The value of type as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setType_LessEqual(Integer type) {
        regType(CK_LE, type);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type: {int4(10)}
     * @param minNumber The min number of type. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of type. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setType_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setType_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type: {int4(10)}
     * @param minNumber The min number of type. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of type. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setType_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueType(), "type", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type: {int4(10)}
     * @param typeList The collection of type as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_InScope(Collection<Integer> typeList) {
        doSetType_InScope(typeList);
    }

    protected void doSetType_InScope(Collection<Integer> typeList) {
        regINS(CK_INS, cTL(typeList), xgetCValueType(), "type");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type: {int4(10)}
     * @param typeList The collection of type as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setType_NotInScope(Collection<Integer> typeList) {
        doSetType_NotInScope(typeList);
    }

    protected void doSetType_NotInScope(Collection<Integer> typeList) {
        regINS(CK_NINS, cTL(typeList), xgetCValueType(), "type");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type: {int4(10)}
     */
    public void setType_IsNull() { regType(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type: {int4(10)}
     */
    public void setType_IsNotNull() { regType(CK_ISNN, DOBJ); }

    protected void regType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueType(), "type"); }
    protected abstract ConditionValue xgetCValueType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * title: {text(2147483647)}
     * @param title The value of title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_Equal(String title) {
        doSetTitle_Equal(fRES(title));
    }

    protected void doSetTitle_Equal(String title) {
        regTitle(CK_EQ, title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * title: {text(2147483647)}
     * @param title The value of title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_NotEqual(String title) {
        doSetTitle_NotEqual(fRES(title));
    }

    protected void doSetTitle_NotEqual(String title) {
        regTitle(CK_NES, title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * title: {text(2147483647)}
     * @param title The value of title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_GreaterThan(String title) {
        regTitle(CK_GT, fRES(title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * title: {text(2147483647)}
     * @param title The value of title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_LessThan(String title) {
        regTitle(CK_LT, fRES(title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * title: {text(2147483647)}
     * @param title The value of title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_GreaterEqual(String title) {
        regTitle(CK_GE, fRES(title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * title: {text(2147483647)}
     * @param title The value of title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_LessEqual(String title) {
        regTitle(CK_LE, fRES(title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * title: {text(2147483647)}
     * @param titleList The collection of title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_InScope(Collection<String> titleList) {
        doSetTitle_InScope(titleList);
    }

    protected void doSetTitle_InScope(Collection<String> titleList) {
        regINS(CK_INS, cTL(titleList), xgetCValueTitle(), "title");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * title: {text(2147483647)}
     * @param titleList The collection of title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_NotInScope(Collection<String> titleList) {
        doSetTitle_NotInScope(titleList);
    }

    protected void doSetTitle_NotInScope(Collection<String> titleList) {
        regINS(CK_NINS, cTL(titleList), xgetCValueTitle(), "title");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * title: {text(2147483647)} <br>
     * <pre>e.g. setTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param title The value of title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTitle_LikeSearch(String title, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTitle_LikeSearch(title, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * title: {text(2147483647)} <br>
     * <pre>e.g. setTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param title The value of title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTitle_LikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(title), xgetCValueTitle(), "title", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * title: {text(2147483647)}
     * @param title The value of title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTitle_NotLikeSearch(String title, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTitle_NotLikeSearch(title, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * title: {text(2147483647)}
     * @param title The value of title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTitle_NotLikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(title), xgetCValueTitle(), "title", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * title: {text(2147483647)}
     */
    public void setTitle_IsNull() { regTitle(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * title: {text(2147483647)}
     */
    public void setTitle_IsNullOrEmpty() { regTitle(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * title: {text(2147483647)}
     */
    public void setTitle_IsNotNull() { regTitle(CK_ISNN, DOBJ); }

    protected void regTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTitle(), "title"); }
    protected abstract ConditionValue xgetCValueTitle();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * is_checked: {bool(1)}
     * @param isChecked The value of isChecked as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIsChecked_Equal(Boolean isChecked) {
        regIsChecked(CK_EQ, isChecked);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * is_checked: {bool(1)}
     */
    public void setIsChecked_IsNull() { regIsChecked(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * is_checked: {bool(1)}
     */
    public void setIsChecked_IsNotNull() { regIsChecked(CK_ISNN, DOBJ); }

    protected void regIsChecked(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIsChecked(), "is_checked"); }
    protected abstract ConditionValue xgetCValueIsChecked();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * is_root: {bool(1)}
     * @param isRoot The value of isRoot as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIsRoot_Equal(Boolean isRoot) {
        regIsRoot(CK_EQ, isRoot);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * is_root: {bool(1)}
     */
    public void setIsRoot_IsNull() { regIsRoot(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * is_root: {bool(1)}
     */
    public void setIsRoot_IsNotNull() { regIsRoot(CK_ISNN, DOBJ); }

    protected void regIsRoot(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIsRoot(), "is_root"); }
    protected abstract ConditionValue xgetCValueIsRoot();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {date(13)}
     * @param createDate The value of createDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreateDate_Equal(java.time.LocalDate createDate) {
        regCreateDate(CK_EQ,  createDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {date(13)}
     * @param createDate The value of createDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreateDate_GreaterThan(java.time.LocalDate createDate) {
        regCreateDate(CK_GT,  createDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {date(13)}
     * @param createDate The value of createDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreateDate_LessThan(java.time.LocalDate createDate) {
        regCreateDate(CK_LT,  createDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {date(13)}
     * @param createDate The value of createDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreateDate_GreaterEqual(java.time.LocalDate createDate) {
        regCreateDate(CK_GE,  createDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {date(13)}
     * @param createDate The value of createDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreateDate_LessEqual(java.time.LocalDate createDate) {
        regCreateDate(CK_LE, createDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {date(13)}
     * <pre>e.g. setCreateDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCreateDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCreateDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * create_date: {date(13)}
     * <pre>e.g. setCreateDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setCreateDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "create_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCreateDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * create_date: {date(13)}
     */
    public void setCreateDate_IsNull() { regCreateDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * create_date: {date(13)}
     */
    public void setCreateDate_IsNotNull() { regCreateDate(CK_ISNN, DOBJ); }

    protected void regCreateDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreateDate(), "create_date"); }
    protected abstract ConditionValue xgetCValueCreateDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {date(13)}
     * @param updateDate The value of updateDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_Equal(java.time.LocalDate updateDate) {
        regUpdateDate(CK_EQ,  updateDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {date(13)}
     * @param updateDate The value of updateDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_GreaterThan(java.time.LocalDate updateDate) {
        regUpdateDate(CK_GT,  updateDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {date(13)}
     * @param updateDate The value of updateDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_LessThan(java.time.LocalDate updateDate) {
        regUpdateDate(CK_LT,  updateDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {date(13)}
     * @param updateDate The value of updateDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_GreaterEqual(java.time.LocalDate updateDate) {
        regUpdateDate(CK_GE,  updateDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {date(13)}
     * @param updateDate The value of updateDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_LessEqual(java.time.LocalDate updateDate) {
        regUpdateDate(CK_LE, updateDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {date(13)}
     * <pre>e.g. setUpdateDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_date: {date(13)}
     * <pre>e.g. setUpdateDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "update_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * update_date: {date(13)}
     */
    public void setUpdateDate_IsNull() { regUpdateDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * update_date: {date(13)}
     */
    public void setUpdateDate_IsNotNull() { regUpdateDate(CK_ISNN, DOBJ); }

    protected void regUpdateDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDate(), "update_date"); }
    protected abstract ConditionValue xgetCValueUpdateDate();

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
    public HpSLCFunction<MstElementCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MstElementCB.class);
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
    public HpSLCFunction<MstElementCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MstElementCB.class);
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
    public HpSLCFunction<MstElementCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MstElementCB.class);
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
    public HpSLCFunction<MstElementCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MstElementCB.class);
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
    public HpSLCFunction<MstElementCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MstElementCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MstElementCB&gt;() {
     *     public void query(MstElementCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MstElementCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MstElementCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MstElementCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MstElementCQ sq);

    protected MstElementCB xcreateScalarConditionCB() {
        MstElementCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MstElementCB xcreateScalarConditionPartitionByCB() {
        MstElementCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MstElementCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MstElementCB cb = new MstElementCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MstElementCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MstElementCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MstElementCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MstElementCB cb = new MstElementCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MstElementCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MstElementCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MstElementCB cb = new MstElementCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MstElementCQ sq);

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
    protected MstElementCB newMyCB() {
        return new MstElementCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MstElementCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
