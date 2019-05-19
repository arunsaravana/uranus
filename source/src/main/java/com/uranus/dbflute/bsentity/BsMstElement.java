package com.uranus.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.uranus.dbflute.allcommon.DBMetaInstanceHandler;
import com.uranus.dbflute.exentity.*;

/**
 * The entity of mst_element as TABLE. <br>
 * <pre>
 * [primary-key]
 *     id
 *
 * [column]
 *     id, type, title, is_checked, is_root, create_date, update_date
 *
 * [sequence]
 *     mst_element_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * Integer type = entity.getType();
 * String title = entity.getTitle();
 * Boolean isChecked = entity.getIsChecked();
 * Boolean isRoot = entity.getIsRoot();
 * java.time.LocalDate createDate = entity.getCreateDate();
 * java.time.LocalDate updateDate = entity.getUpdateDate();
 * entity.setId(id);
 * entity.setType(type);
 * entity.setTitle(title);
 * entity.setIsChecked(isChecked);
 * entity.setIsRoot(isRoot);
 * entity.setCreateDate(createDate);
 * entity.setUpdateDate(updateDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMstElement extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, ID, NotNull, serial(10)} */
    protected Integer _id;

    /** type: {int4(10)} */
    protected Integer _type;

    /** title: {text(2147483647)} */
    protected String _title;

    /** is_checked: {bool(1)} */
    protected Boolean _isChecked;

    /** is_root: {bool(1)} */
    protected Boolean _isRoot;

    /** create_date: {date(13)} */
    protected java.time.LocalDate _createDate;

    /** update_date: {date(13)} */
    protected java.time.LocalDate _updateDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "mst_element";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMstElement) {
            BsMstElement other = (BsMstElement)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_type));
        sb.append(dm).append(xfND(_title));
        sb.append(dm).append(xfND(_isChecked));
        sb.append(dm).append(xfND(_isRoot));
        sb.append(dm).append(xfND(_createDate));
        sb.append(dm).append(xfND(_updateDate));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public MstElement clone() {
        return (MstElement)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] id: {PK, ID, NotNull, serial(10)} <br>
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Integer id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] type: {int4(10)} <br>
     * @return The value of the column 'type'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getType() {
        checkSpecifiedProperty("type");
        return _type;
    }

    /**
     * [set] type: {int4(10)} <br>
     * @param type The value of the column 'type'. (NullAllowed: null update allowed for no constraint)
     */
    public void setType(Integer type) {
        registerModifiedProperty("type");
        _type = type;
    }

    /**
     * [get] title: {text(2147483647)} <br>
     * @return The value of the column 'title'. (NullAllowed even if selected: for no constraint)
     */
    public String getTitle() {
        checkSpecifiedProperty("title");
        return _title;
    }

    /**
     * [set] title: {text(2147483647)} <br>
     * @param title The value of the column 'title'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTitle(String title) {
        registerModifiedProperty("title");
        _title = title;
    }

    /**
     * [get] is_checked: {bool(1)} <br>
     * @return The value of the column 'is_checked'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getIsChecked() {
        checkSpecifiedProperty("isChecked");
        return _isChecked;
    }

    /**
     * [set] is_checked: {bool(1)} <br>
     * @param isChecked The value of the column 'is_checked'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIsChecked(Boolean isChecked) {
        registerModifiedProperty("isChecked");
        _isChecked = isChecked;
    }

    /**
     * [get] is_root: {bool(1)} <br>
     * @return The value of the column 'is_root'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getIsRoot() {
        checkSpecifiedProperty("isRoot");
        return _isRoot;
    }

    /**
     * [set] is_root: {bool(1)} <br>
     * @param isRoot The value of the column 'is_root'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIsRoot(Boolean isRoot) {
        registerModifiedProperty("isRoot");
        _isRoot = isRoot;
    }

    /**
     * [get] create_date: {date(13)} <br>
     * @return The value of the column 'create_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getCreateDate() {
        checkSpecifiedProperty("createDate");
        return _createDate;
    }

    /**
     * [set] create_date: {date(13)} <br>
     * @param createDate The value of the column 'create_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateDate(java.time.LocalDate createDate) {
        registerModifiedProperty("createDate");
        _createDate = createDate;
    }

    /**
     * [get] update_date: {date(13)} <br>
     * @return The value of the column 'update_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getUpdateDate() {
        checkSpecifiedProperty("updateDate");
        return _updateDate;
    }

    /**
     * [set] update_date: {date(13)} <br>
     * @param updateDate The value of the column 'update_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDate(java.time.LocalDate updateDate) {
        registerModifiedProperty("updateDate");
        _updateDate = updateDate;
    }
}
