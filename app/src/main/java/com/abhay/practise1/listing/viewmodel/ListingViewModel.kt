package com.abhay.practise1.listing.viewmodel

import androidx.lifecycle.ViewModel
import com.abhay.practise1.listing.DataModel

class ListingViewModel:ViewModel() {
    var dataList: Array<DataModel> = Array(40) { i -> DataModel("data no: $i") }


}