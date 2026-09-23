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
    // Сюда вставь Project URL из Supabase → Project Settings → API
    const val SB_URL = "https://ТВОЙ-ПРОЕКТ.supabase.co"

    // Сюда вставь anon public ключ (длинная строка eyJ...)
    const val SB_KEY = "ТВОЙ-ANON-КЛЮЧ"
}