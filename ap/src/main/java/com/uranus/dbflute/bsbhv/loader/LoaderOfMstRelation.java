package com.uranus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.uranus.dbflute.exbhv.*;
import com.uranus.dbflute.exentity.*;

/**
 * The referrer loader of mst_relation as TABLE. <br>
 * <pre>
 * [primary key]
 *     parent_id, child_id
 *
 * [column]
 *     parent_id, child_id
 *
 * [sequence]
 *     
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
public class LoaderOfMstRelation {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MstRelation> _selectedList;
    protected BehaviorSelector _selector;
    protected MstRelationBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMstRelation ready(List<MstRelation> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MstRelationBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MstRelationBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MstRelation> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
