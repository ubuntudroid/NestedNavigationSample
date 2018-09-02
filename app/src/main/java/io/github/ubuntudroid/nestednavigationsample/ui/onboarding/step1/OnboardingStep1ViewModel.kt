package io.github.ubuntudroid.nestednavigationsample.ui.onboarding.step1

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import io.github.ubuntudroid.nestednavigationsample.R

class OnboardingStep1ViewModel : ViewModel() {

    fun onStep2Click(v: View) {
        v.findNavController().navigate(R.id.onboardingStep2Fragment)
    }
}
