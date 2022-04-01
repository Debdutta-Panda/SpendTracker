package com.debduttapanda.spendtracker.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.debduttapanda.spendtracker.data.SpendsTrackerDataSource

@Suppress("UNCHECKED_CAST")
class ViewModelFactory(
    private val dataSource: SpendsTrackerDataSource
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SpendViewModel(dataSource) as T
    }
}