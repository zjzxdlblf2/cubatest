package com.sjzl.wzgl.web.screens.ckd;

import com.haulmont.cuba.gui.screen.*;
import com.sjzl.framework.entity.BaseBill;
import com.sjzl.framework.web.screens.basebill.BaseBillEdit;
//import com.sjzl.wzgl.entity.CKD;

@UiController("wzgl_CKD.edit")
@UiDescriptor("ckd-edit.xml")
@EditedEntityContainer("cKDDc")
@LoadDataBeforeShow
public class CKDEdit extends BaseBillEdit {

}