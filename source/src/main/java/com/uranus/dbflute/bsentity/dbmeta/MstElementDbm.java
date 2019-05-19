package com.uranus.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.uranus.dbflute.allcommon.*;
import com.uranus.dbflute.exentity.*;

/**
 * The DB meta of mst_element. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MstElementDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MstElementDbm _instance = new MstElementDbm();
    private MstElementDbm() {}
    public static MstElementDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((MstElement)et).getId(), (et, vl) -> ((MstElement)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((MstElement)et).getType(), (et, vl) -> ((MstElement)et).setType(cti(vl)), "type");
        setupEpg(_epgMap, et -> ((MstElement)et).getTitle(), (et, vl) -> ((MstElement)et).setTitle((String)vl), "title");
        setupEpg(_epgMap, et -> ((MstElement)et).getIsChecked(), (et, vl) -> ((MstElement)et).setIsChecked((Boolean)vl), "isChecked");
        setupEpg(_epgMap, et -> ((MstElement)et).getIsRoot(), (et, vl) -> ((MstElement)et).setIsRoot((Boolean)vl), "isRoot");
        setupEpg(_epgMap, et -> ((MstElement)et).getCreateDate(), (et, vl) -> ((MstElement)et).setCreateDate(ctld(vl)), "createDate");
        setupEpg(_epgMap, et -> ((MstElement)et).getUpdateDate(), (et, vl) -> ((MstElement)et).setUpdateDate(ctld(vl)), "updateDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "mst_element";
    protected final String _tableDispName = "mst_element";
    protected final String _tablePropertyName = "mstElement";
    protected final TableSqlName _tableSqlName = new TableSqlName("mst_element", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, true, true, "serial", 10, 0, null, "nextval('mst_element_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnType = cci("type", "type", null, null, Integer.class, "type", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTitle = cci("title", "title", null, null, String.class, "title", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIsChecked = cci("is_checked", "is_checked", null, null, Boolean.class, "isChecked", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIsRoot = cci("is_root", "is_root", null, null, Boolean.class, "isRoot", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateDate = cci("create_date", "create_date", null, null, java.time.LocalDate.class, "createDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDate = cci("update_date", "update_date", null, null, java.time.LocalDate.class, "updateDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);

    /**
     * id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * type: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnType() { return _columnType; }
    /**
     * title: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTitle() { return _columnTitle; }
    /**
     * is_checked: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsChecked() { return _columnIsChecked; }
    /**
     * is_root: {bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsRoot() { return _columnIsRoot; }
    /**
     * create_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateDate() { return _columnCreateDate; }
    /**
     * update_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDate() { return _columnUpdateDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnType());
        ls.add(columnTitle());
        ls.add(columnIsChecked());
        ls.add(columnIsRoot());
        ls.add(columnCreateDate());
        ls.add(columnUpdateDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "mst_element_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.uranus.dbflute.exentity.MstElement"; }
    public String getConditionBeanTypeName() { return "com.uranus.dbflute.cbean.MstElementCB"; }
    public String getBehaviorTypeName() { return "com.uranus.dbflute.exbhv.MstElementBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MstElement> getEntityType() { return MstElement.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MstElement newEntity() { return new MstElement(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MstElement)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MstElement)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
