package br.com.meuchurrasco.calculator

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import br.com.ecglobal.alldience.common.navProvider
import br.com.meuchurrasco.R

import kotlinx.android.synthetic.main.calculator_acivity.*

class CalculatorAcivity : AppCompatActivity() {
    private val navController by navProvider(R.id.calculator)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_acivity)
    }

    override fun onSupportNavigateUp() = navController.navigateUp()

    override fun onBackPressed() {
        when (navController.currentDestination?.id) {
            R.id.calculator_splash -> finish()
            else -> onSupportNavigateUp()
        }
    }
}// R.id.calculator_filter,