/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */

package com.example.peoplecounter.presentation

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.peoplecounter.R

class MainActivity : ComponentActivity() {
    var people = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val app: ConstraintLayout  = findViewById(R.id.screen)
        val counterDisplay: TextView = findViewById(R.id.textView)

        app.setOnClickListener{
            people += 1
            counterDisplay.setText(people.toString())
        }

        app.setOnLongClickListener {
            people = 0
            counterDisplay.setText(people.toString())
            return@setOnLongClickListener true

        }
    }
}
