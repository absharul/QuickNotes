package com.github.android.lvrn.lvrnproject.view.adapter.datapostset;

import com.github.valhallalabs.laverna.persistent.entity.base.ProfileDependedEntity;

import java.util.List;

/**
 * @author Vadim Boitsov <vadimboitsov1@gmail.com>
 */

public interface DataPostSetAdapter<T1 extends ProfileDependedEntity> {

    void setData(List<T1> data);

}
