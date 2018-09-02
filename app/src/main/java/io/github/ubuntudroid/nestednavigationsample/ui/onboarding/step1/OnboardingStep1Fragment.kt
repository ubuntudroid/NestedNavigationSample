package io.github.ubuntudroid.nestednavigationsample.ui.onboarding.step1

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import io.github.ubuntudroid.nestednavigationsample.databinding.OnboardingStep1FragmentBinding

class OnboardingStep1Fragment : Fragment() {

    private lateinit var viewModel: OnboardingStep1ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(OnboardingStep1ViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = OnboardingStep1FragmentBinding.inflate(inflater, container, false).apply {
        viewModel = this@OnboardingStep1Fragment.viewModel
    }.root
}
