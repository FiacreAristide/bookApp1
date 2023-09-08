package com.example.cardviewinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cardviewinrecyclerview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity()
{ private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bookID = intent.getIntExtra(BOOK_ID_EXTRA, -1)
        val book = bookFromID(bookID)
        if(book != null)
        {
            binding.cover.setImageResource(book.cover)
            binding.hTitle.text = book.title
            binding.hdescription.text = book.description
            binding.hAuthor.text = book.author
        }
    }

    private fun bookFromID(bookID: Int): Book?
    {
        for(book in bookList)
        {
            if(book.id == bookID)
                return book
        }
        return null
    }
}