package com.avp.test.JitPackPublish

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.avp.test.lib.githubpackages.R
import kotlinx.android.synthetic.main.jit_pack_fragment.view.*


class FragmentFromLibrary : Fragment() {

    companion object {
        fun newInstance() = FragmentFromLibrary()
    }

    private lateinit var rootView: View

    private lateinit var viewModel: ViewModelFromLibrary

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProviders.of(this).get(ViewModelFromLibrary::class.java)

        rootView = inflater.inflate(R.layout.jit_pack_fragment, container, false)
        rootView.hmm_text.text = viewModel.data
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }

}
