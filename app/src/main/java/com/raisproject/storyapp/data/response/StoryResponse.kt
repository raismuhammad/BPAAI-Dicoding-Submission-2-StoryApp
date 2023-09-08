package com.raisproject.storyapp.data.response

import com.google.gson.annotations.SerializedName

data class StoryResponse(

    @field:SerializedName("error")
    val error: Boolean? = null,

    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("listStory")
    val listStory: List<ListStoryItem> = emptyList(),
)
