package com.example.pertemuan5

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.pertemuan5.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel:ViewModel() {
    var namaUsr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var alamatUsr : String by mutableStateOf("")
        private set
    var jenisKL : String by mutableStateOf("")
        private set
    var emailUsr : String by mutableStateOf("")
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun readData(nm:String,tlp:String,alt:String, jk:String, email:String){
        namaUsr=nm;
        noTlp=tlp;
        alamatUsr=alt;
        jenisKL=jk;
        emailUsr=email;
    }
    fun setJenisK(pilihJK:String){
        _uiState.update {currentState -> currentState.copy(sex = pilihJK)}

    }

    fun setStatus(pilihST:String){
        _uiState.update {currentState -> currentState.copy(stat =  pilihST)}
    }

    fun insertData(textNama: String,alt:String, textTlp: String, sex: String, textem:String) {
        TODO("Not yet implemented")
    }
}