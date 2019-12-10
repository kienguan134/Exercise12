package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonCalculate).setOnClickListener{
                calculateLoan()
                calculateInterest()
                calculateMonthlyRepayment()
        }
    }



    private fun calculateLoan() {

        var car : Int = editTextCarPrice.text.toString().toInt()
        var dpayment : Int = editTextDownPayment.text.toString().toInt()
        var loan : Int = car - dpayment
        textViewLoan.setText(loan.toString())

    }

    private fun calculateInterest(){
        var car : Int = editTextCarPrice.text.toString().toInt()
        var dpayment : Int = editTextDownPayment.text.toString().toInt()
        var loan : Int = car - dpayment
        var rate : Double = editTextInterestRate.text.toString().toDouble()
        var period : Int = editTextLoanPeriod.text.toString().toInt()
        var interest : Double = loan * rate * period
        textViewInterest.setText(interest.toString())


    }

    private fun calculateMonthlyRepayment(){
        var car : Int = editTextCarPrice.text.toString().toInt()
        var dpayment : Int = editTextDownPayment.text.toString().toInt()
        var loan : Int = car - dpayment
        var rate : Double = editTextInterestRate.text.toString().toDouble()
        var period : Int = editTextLoanPeriod.text.toString().toInt()
        var interest : Double = loan * rate * period
        var monthly : Double = (loan + interest) / period / 12

        textViewMonthlyRepayment.setText(monthly.toString())
    }
}
