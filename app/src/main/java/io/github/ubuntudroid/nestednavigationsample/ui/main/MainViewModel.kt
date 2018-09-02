package io.github.ubuntudroid.nestednavigationsample.ui.main

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import io.github.ubuntudroid.nestednavigationsample.R

class MainViewModel : ViewModel() {

    fun onOnboardingClick(v: View) {
        v.findNavController().navigate(R.id.action_mainFragment_to_onboardingFragment)
    }
}
