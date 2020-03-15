package br.com.meuchurrasco.calculator.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.fragment.app.Fragment
import br.com.ecglobal.alldience.common.navProvider
import br.com.meuchurrasco.R

class SplashFragment : Fragment(R.layout.splash_fragment) {

    private val navController by navProvider()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler().postDelayed({
            navController.navigate(SplashFragmentDirections.actionGoToFilter())
        }, 3000)

    }

}
