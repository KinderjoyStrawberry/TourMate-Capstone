package com.myapp.tourmate.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.myapp.tourmate.databinding.FragmentHomeBinding
import com.myapp.tourmate.viewmodels.HomeViewModel
import com.myapp.tourmate.viewmodels.SettingViewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
//        val textView: TextView = binding.textNotifications
//        notificationsViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        binding.sectionItemPopuler.setOnClickListener { detailItemPopuler() }
        binding.sectionItemAllPlace.setOnClickListener { detailItemAllPlace() }
        return root
    }

    private fun detailItemAllPlace() {
        Intent(activity, DetailPlaceActivity::class.java).also {
            it.putExtra(DetailPlaceActivity.EXTRA_DESTINAME_PLACE, "Pantai AllPlace")
            it.putExtra(DetailPlaceActivity.EXTRA_DESC_PLACE, "Testing lorem ipsum dolores")
            it.putExtra(DetailPlaceActivity.EXTRA_IMG_PLACE, "https://images.unsplash.com/photo-1562428258-806dca6784bf?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1233&q=80")
            startActivity(it)
        }
    }

    private fun detailItemPopuler() {
        Intent(activity, DetailPlaceActivity::class.java).also {
            it.putExtra(DetailPlaceActivity.EXTRA_DESTINAME_PLACE, "Pantai Populer")
            it.putExtra(DetailPlaceActivity.EXTRA_DESC_PLACE, "Testing lorem ipsum dolores")
            it.putExtra(DetailPlaceActivity.EXTRA_IMG_PLACE, "https://images.unsplash.com/photo-1515404929826-76fff9fef6fe?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80")
            startActivity(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}