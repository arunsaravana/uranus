package com.uranus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.uranus.dbflute.exbhv.*;
import com.uranus.dbflute.exentity.*;

/**
 * The referrer loader of mst_element as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMstElement {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MstElement> _selectedList;
    protected BehaviorSelector _selector;
    protected MstElementBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMstElement ready(List<MstElement> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MstElementBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MstElementBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MstElement> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
