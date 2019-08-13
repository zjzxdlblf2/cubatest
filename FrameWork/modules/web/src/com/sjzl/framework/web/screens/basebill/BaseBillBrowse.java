package com.sjzl.framework.web.screens.basebill;

import com.haulmont.cuba.gui.screen.*;
import com.sjzl.framework.entity.BaseBill;

@UiController("framework_BaseBill.browse")
@UiDescriptor("base-bill-browse.xml")
@LookupComponent("baseBillsTable")
@LoadDataBeforeShow
public class BaseBillBrowse extends StandardLookup<BaseBill> {
}