package com.sjzl.wzgl.web.screens.ckd;

import com.haulmont.cuba.gui.screen.*;
import com.sjzl.wzgl.entity.CKD;

@UiController("wzgl_CKD.browse")
@UiDescriptor("ckd-browse.xml")
@LookupComponent("cKDsTable")
@LoadDataBeforeShow
public class CKDBrowse extends StandardLookup<CKD> {
}