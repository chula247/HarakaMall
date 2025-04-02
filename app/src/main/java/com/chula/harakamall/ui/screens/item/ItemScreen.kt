package com.chula.harakamall.ui.screens.item

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chula.harakamall.ui.theme.neworange
import com.chula.harakamall.ui.theme.newwhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(){
    Column (modifier = Modifier.fillMaxSize()
    ){

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                navigationIconContentColor = newwhite,
                containerColor = neworange,
                titleContentColor = newwhite,
                actionIconContentColor = newwhite

            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                }

            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "shoppingCart")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notifications")
                }

            }

        )

        //End





    }


}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen()
}