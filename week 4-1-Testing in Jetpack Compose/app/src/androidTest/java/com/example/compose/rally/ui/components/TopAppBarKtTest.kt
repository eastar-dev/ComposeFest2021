package com.example.compose.rally.ui.components

import androidx.compose.material.Text
import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import com.example.compose.rally.RallyScreen
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class TopAppBarKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun rallyTopAppBar() {
    }

    @Test
    fun myTest() {
        composeTestRule.setContent {
            Text("You can set any Compose content!")
        }
    }

    @Test
    fun rallyTopAppBarTest() {
        val allScreens = RallyScreen.values().toList()
        composeTestRule.setContent {
            RallyTopAppBar(
                allScreens = allScreens,
                onTabSelected = { },
                currentScreen = RallyScreen.Accounts
            )
        }

        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Accounts.name)
            .assertIsSelected()

//        Thread.sleep(5000)
    }
}