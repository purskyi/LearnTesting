package com.example.learntesting

import android.app.Application
import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before

import org.junit.Test

class ResourseComparerTest{
    private lateinit var resourseComparer: ResourseComparer

    @Before
    fun setup()
    {
        resourseComparer = ResourseComparer()
    }

    @After
    fun teardown()
    {

    }

    @Test
    fun stringResourceSameAsGivenString_returnTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result  = resourseComparer.isEqual(context, R.string.app_name, "LearnTesting")
        assertThat(result).isTrue()
    }
    @Test
    fun stringResourceSameAsGivenString_returnFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result  = resourseComparer.isEqual(context, R.string.app_name, "something FALSE")
        assertThat(result).isFalse()
    }
}