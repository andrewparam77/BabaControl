package com.example.babacontrol

import android.content.Context

object Prefs {
    private const val NAME = "baba"
    private fun sp(c: Context) = c.getSharedPreferences(NAME, Context.MODE_PRIVATE)

    fun getMode(c: Context): String? = sp(c).getString("mode", null)
    fun setMode(c: Context, m: String?) {
        sp(c).edit().apply {
            if (m == null) remove("mode") else putString("mode", m)
        }.apply()
    }

    fun getRoom(c: Context): String = sp(c).getString("room", "") ?: ""
    fun setRoom(c: Context, r: String) {
        sp(c).edit().putString("room", r.trim()).apply()
    }

    // === SUPABASE ===
const val SB_URL = "https://jqohgyoixmthfvufoyrk.supabase.co"
const val SB_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Impxb2hneW9peG10aGZ2dWZveXJrIiwicm9sZSI6ImFub24iLCJpYXQiOjE3OTAxNjMwNjAsImV4cCI6MjEwNTczOTA2MH0.h5eJWQNJYKJ1UaxryXx21Nt_4f26DKDAGvI8i-QqX9o"
}
