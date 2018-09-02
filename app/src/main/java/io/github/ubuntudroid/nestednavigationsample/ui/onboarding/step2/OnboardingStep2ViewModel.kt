package io.github.ubuntudroid.nestednavigationsample.ui.onboarding.step2

import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel

class OnboardingStep2ViewModel : ViewModel() {

    fun onFinishOnboardingClick(v: View) {
        /*
        TODO how to navigate to the game fragment from here? It isn't in v's navigation controller obviously.
        Best would be to somehow be able to define a parent navigation controller / nav graph which is searched
        if a destination isn't found in our own nav graph and which is also taken into account when performing
        up/back handling.
        */
        Toast.makeText(v.context, "TODO: Navigate to game fragment", Toast.LENGTH_SHORT).show()
    }
}
