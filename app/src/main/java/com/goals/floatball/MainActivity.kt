package com.goals.floatball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.goals.floatball.floatbutton.BaseFloatDailog
import com.goals.floatball.floatbutton.FloatWindow
import com.goals.floatball.floatbutton.UiUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFloatButton()
    }

    var dialog: FloatWindow? = null
    private fun initFloatButton() {
        //var mask : SpeedDialOverlayLayout = mask
        var defaultY = UiUtils.getScreenHeight(this) / 2
        dialog = FloatWindow(this, BaseFloatDailog.RIGHT, defaultY, object :
            FloatWindow.IOnItemClicked {
            override fun onBackItemClick() {
                Toast.makeText(this@MainActivity, "onBackItemClick", Toast.LENGTH_SHORT).show()
                //dialog!!.openOrCloseMenu()
            }

            override fun onCloseItemClick() {
                Toast.makeText(this@MainActivity, "onCloseItemClick", Toast.LENGTH_SHORT).show()
                //mask.hide()
                dialog!!.dismiss()
            }

            override fun onClose() {
                //mask.hide()
                Toast.makeText(this@MainActivity, "onClose", Toast.LENGTH_SHORT).show()
            }

            override fun onExpand() {
                //mask.show()
                Toast.makeText(this@MainActivity, "onExpand", Toast.LENGTH_SHORT).show()
            }
        })
        //mask.setOnClickListener { dialog!!.openOrCloseMenu() }
        dialog!!.show("你想做甚")

    }
}