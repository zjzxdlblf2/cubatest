package com.sjzl.framework.web.screens.basebill;

import com.haulmont.cuba.gui.screen.*;
import com.sjzl.framework.entity.BaseBill;

@UiController("framework_BaseBill.edit")
@UiDescriptor("base-bill-edit.xml")
@EditedEntityContainer("baseBillDc")
@LoadDataBeforeShow
public class BaseBillEdit extends StandardEditor<BaseBill> {
}