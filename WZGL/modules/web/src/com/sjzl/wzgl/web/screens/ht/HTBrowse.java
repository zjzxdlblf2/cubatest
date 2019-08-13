package com.sjzl.wzgl.web.screens.ht;

import com.haulmont.cuba.gui.screen.*;
import com.sjzl.wzgl.entity.HT;

@UiController("wzgl_HT.browse")
@UiDescriptor("ht-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class HTBrowse extends MasterDetailScreen<HT> {
}