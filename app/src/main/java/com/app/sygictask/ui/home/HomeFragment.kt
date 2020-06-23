package com.app.sygictask.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.app.sygictask.R
import com.app.sygictask.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : Fragment() {

    private val homeViewModel by viewModel<HomeViewModel>()

    private val args: HomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dataBinding: FragmentHomeBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        dataBinding.viewmodel = homeViewModel

        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        Pixel.load(args.url, image)

//        homeViewModel.imageLiveData.observe(viewLifecycleOwner, Observer {
//            if(it == null) {
//                val builder = AlertDialog.Builder(this.context)
//                builder.setPositiveButton(android.R.string.ok, null)
//                builder.setTitle(this.resources.getString(R.string.connection_problem))
//                builder.setMessage(this.resources.getString(R.string.connection_problem))
//                builder.create().show()
//            }
//            else {
//                image.setImageBitmap(it)
//            }
//        })

        homeViewModel.loadImage(image, args.homeArguments.url)
//        homeViewModel.imageUrl = args.homeArguments.url
        homeViewModel.name = args.homeArguments.text
    }


}