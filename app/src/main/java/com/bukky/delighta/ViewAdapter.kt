package com.bukky.delighta

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bukky.delighta.databinding.ActivityContactsBinding

class ViewAdapter: RecyclerView.Adapter<ViewAdapter.ContactViewHolder>(){
    private val contacts = mutableListOf<ContactsData>()

    inner class ContactViewHolder(private val binding : ActivityContactsBinding): RecyclerView.ViewHolder(binding.root){
        fun bindContactData(contactList:ContactsData){
            binding.nameTv.text = contactList.name
            binding.numberTv.text = contactList.number
        }
    }
    fun setupContacts(activity_contacts: List<ContactsData>){
        this.contacts.addAll(activity_contacts)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        return ContactViewHolder(
            ActivityContactsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bindContactData(contact)

    }

    override fun getItemCount(): Int {
        return contacts.size

    }

}