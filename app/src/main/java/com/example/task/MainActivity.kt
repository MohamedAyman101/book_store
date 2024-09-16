package com.example.task

import android.icu.text.CaseMap.Title
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.task.ui.theme.TaskTheme
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : ComponentActivity() {
    private lateinit var booksRecyclerView: RecyclerView
    private lateinit var booksArrayList: ArrayList<itemsClass>
    private lateinit var drawerLayout: DrawerLayout

  //  private  var notfication : MenuItem = findViewById(R.id.notify)
//    lateinit var ImageId : Array<Int>
//    lateinit var title: Array<String>
//    lateinit var descrption : Array<String>
//    lateinit var rating : Array<Int>

   // var toolbar: Toolbar = findViewById(R.id.toolBar)
    val Tag : String ="Test"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   //     notfication.setOnClickListener{
          //  Toast.makeText(this,"Notfication Clicked",Toast.LENGTH_LONG).show()
       // }
        val books : List<itemsClass> = mutableListOf(
            itemsClass(R.drawable.angels,"Angels and demons","by Dan Drown",4.0),
            itemsClass(R.drawable.nostra,"Terra Nostra","by Carlos fenten",3.5),
            itemsClass(R.drawable.blood,"Blood Line","by James Rolne",4.2),
            itemsClass(R.drawable.sword,"The Sword Thief","by Peter Lerangis",4.8),
            itemsClass( R.drawable.humming,"The hummingbird's Daughter","by Luis Alberto",3.8),
            itemsClass( R.drawable.spirits,"The House of the Spirits","by Isabel Allende",3.0),
            itemsClass(R.drawable.solitude,"One Hundred Years of Solitude","by Gabrel Garcia",4.5)
        )
//        var toolbar: Toolbar = findViewById(R.id.toolBar)
            var toolbar : Toolbar = findViewById(R.id.toolBar)
            var navigationDrawer : NavigationView = findViewById(R.id.nav_view)
        //toolbar.inflateMenu(R.menu.mini_menu)
        toolbar.setOnMenuItemClickListener {
           when(it.itemId)
            {
                R.id.notify-> {
                    Toast.makeText(this, "Notfication Clicked", Toast.LENGTH_LONG).show()
                    true
                }

                else -> {false}
            }
        }
        navigationDrawer.setNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.search-> {
                    Toast.makeText(this, "search Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.setting-> {
                    Toast.makeText(this, "setting Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.profile-> {
                    Toast.makeText(this, "profile Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.review-> {
                    Toast.makeText(this, "reivew Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.favoraite-> {
                    Toast.makeText(this, "favorite Clicked", Toast.LENGTH_LONG).show()
                    true
                }


                else -> {false}
            }
        }

         drawerLayout = findViewById(R.id.drawer)

        toolbar.setNavigationOnClickListener {
            drawerLayout.open()
        }

//

        booksRecyclerView = findViewById(R.id.reyclerView)
        booksRecyclerView.layoutManager = LinearLayoutManager(this)
        booksRecyclerView.setHasFixedSize(true)
    //    booksArrayList = arrayListOf<itemsClass>()
//        getUserData()
        booksRecyclerView.adapter= adapterClass(books)

    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.mini_menu, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.notify -> {
//                Toast.makeText(this, "Notification Clicked", Toast.LENGTH_LONG).show()
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
//    private fun getUserData() {
//        for(i in ImageId.indices)
//        {
//            val items = itemsClass(ImageId[i],title[i],descrption[i])
//            booksArrayList.add(items)
//        }
//    }


}





