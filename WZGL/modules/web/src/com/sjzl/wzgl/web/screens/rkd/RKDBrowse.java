package com.sjzl.wzgl.web.screens.rkd;

import com.haulmont.cuba.gui.screen.*;
import com.sjzl.wzgl.entity.RKD;

@UiController("wzgl_RKD.browse")
@UiDescriptor("rkd-browse.xml")
@LookupComponent("rKDsTable")
@LoadDataBeforeShow
public class RKDBrowse extends StandardLookup<RKD> {
}