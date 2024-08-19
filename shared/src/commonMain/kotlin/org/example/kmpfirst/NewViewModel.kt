package org.example.kmpfirst

import com.rickclephas.kmp.observableviewmodel.MutableStateFlow
import com.rickclephas.kmp.observableviewmodel.ViewModel

class NewViewModel: ViewModel() {
    var state = MutableStateFlow(viewModelScope, listOf(1,2,3))
}