package com.myapp.tourmate.ui

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.myapp.tourmate.databinding.FragmentSettingBinding
import com.myapp.tourmate.viewmodels.SettingPreferences
import com.myapp.tourmate.viewmodels.SettingViewModel
import com.myapp.tourmate.viewmodels.SettingViewModelFactory

class SettingFragment : Fragment() {

    private var _binding: FragmentSettingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
//        val notificationsViewModel =
//            ViewModelProvider(this).get(SettingViewModel::class.java)

        _binding = FragmentSettingBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textNotifications
//        notificationsViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        binding.btThemeSetting.setOnClickListener { btChangeTheme() }
        binding.btThemeSetting.setOnClickListener { btChangeLanguage() }
        return root
    }

    private fun btChangeTheme() {
        Intent(activity, ThemeSettingActivity::class.java).also {
            startActivity(it)
        }
    }

    private fun btChangeLanguage() {
        Intent(activity, ThemeSettingActivity::class.java).also {
            startActivity(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}