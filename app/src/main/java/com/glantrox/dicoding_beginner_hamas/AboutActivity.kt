package com.glantrox.dicoding_beginner_hamas

import android.annotation.SuppressLint
import android.os.Bundle
import android.telephony.PhoneNumberUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class AboutActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // IDs
        val btnBack = findViewById<ImageView>(R.id.btn_back)
        val textName = findViewById<TextView>(R.id.text_name)
        val textUserName = findViewById<TextView>(R.id.text_username)
        val textEmail = findViewById<TextView>(R.id.text_email)
        val textPhone = findViewById<TextView>(R.id.text_phone)
        val textAbout = findViewById<TextView>(R.id.text_aboutme)

        // Back Button
        btnBack.setOnClickListener {
            finish()
        }

        // Strings
        val name: String = "Hamas Azizan"
        val userName: String = "hamasified"
        val email: String = "hamasazeezan@gmail.com"
        val phoneNumber: String = "895630354422"
        val aboutMe: String = "I am a Junior Software Developer with a strong passion for creating mobile apps and websites. My true sense of belonging comes from working as a Front-End Developer within a collaborative team. I thoroughly enjoy utilizing various development technologies, such as Flutter for mobile development and Laravel for website development. Currently, I am actively learning Jetpack Compose for Android development. With one year of coding experience under my belt, I am eager to expand my knowledge and learn Swift. Recently, I completed a four-month internship at Telkom IoT."

        val pn = PhoneNumberUtils.formatNumber(phoneNumber)

        textName.text = name
        textUserName.text = "@$userName"
        textEmail.text = email
        textPhone.text = pn
        textAbout.text = aboutMe
    }
}