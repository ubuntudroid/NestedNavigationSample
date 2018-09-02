package io.github.ubuntudroid.nestednavigationsample.ui.onboarding.step2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import io.github.ubuntudroid.nestednavigationsample.databinding.OnboardingStep2FragmentBinding

class OnboardingStep2Fragment : Fragment() {

    private lateinit var viewModel: OnboardingStep2ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(OnboardingStep2ViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = OnboardingStep2FragmentBinding.inflate(inflater, container, false).apply {
        viewModel = this@OnboardingStep2Fragment.viewModel
    }.root
}
