package com.example.codingclub

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.example.codingclub.databinding.CustomTimeDialogBinding

class CustomTimeDialog(context : Context) : Dialog(context) {

    private lateinit var binding: CustomTimeDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 만들어놓은 dialog_profile.xml 뷰를 띄운다.
        binding = CustomTimeDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() = with(binding) {
        // 뒤로가기 버튼, 빈 화면 터치를 통해 dialog가 사라지지 않도록
        setCancelable(false)
        // OK Button 클릭에 대한 Callback 처리
        checkButton.setOnClickListener {
            dismiss()
        }
    }
}