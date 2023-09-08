package com.example.cardviewinrecyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.cardviewinrecyclerview.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: BookClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindBook(book: Book)
    {
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.hTitle.text = book.title
        cardCellBinding.hAuthor.text = book.author

        cardCellBinding.mcard.setOnClickListener{
            clickListener.onClick(book)
        }
    }
}