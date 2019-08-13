package com.sjzl.wzgl.web.screens.rkd;

import com.haulmont.cuba.gui.screen.*;
import com.sjzl.wzgl.entity.RKD;

@UiController("wzgl_RKD.edit")
@UiDescriptor("rkd-edit.xml")
@EditedEntityContainer("rKDDc")
@LoadDataBeforeShow
public class RKDEdit extends StandardEditor<RKD> {
}