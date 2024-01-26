package com.github.thailandandroiddeveloper.common.ui.screen.qualify3

import com.github.thailandandroiddeveloper.common.R

data class PhotoData(
    var imageRes: Int
)

data class TagData(
    var name: String
)

data class MessageData(
    var senderProfileImageRes: Int,
    var senderName: String,
    val message: String
)

val photoList = listOf(
    PhotoData(
        imageRes = R.drawable.img_qualify_3_photo_1
    ),
    PhotoData(
        imageRes = R.drawable.img_qualify_3_photo_2
    ),
    PhotoData(
        imageRes = R.drawable.img_qualify_3_photo_3
    ),
)

val tagList = listOf(
    TagData(
        name = "Tag 1"
    ),
    TagData(
        name = "Tag 2"
    ),
    TagData(
        name = "Tag 3"
    ),
    TagData(
        name = "Tag 4"
    ),
)

val messageList = listOf(
    MessageData(
        senderProfileImageRes = R.drawable.img_qualify_3_sender,
        senderName = "Lorem Ipsum",
        message = "Duis dignissim pulvinar lectus imperdiet tempus. Curabitur fringilla commodo consectetur. Sed congue blandit nibh."
    ),
    MessageData(
        senderProfileImageRes = R.drawable.img_qualify_3_sender,
        senderName = "Lorem Ipsum",
        message = "Morbi sed sagittis justo, at pulvinar ipsum. Praesent massa metus, interdum at suscipit a, interdum vel orci. Pellentesque in sapien. Integer faucibus mauris ac luctus aliquam accumsan."
    ),
    MessageData(
        senderProfileImageRes = R.drawable.img_qualify_3_sender,
        senderName = "Lorem Ipsum",
        message = "Duis dignissim pulvinar lectus imperdiet tempus. Curabitur fringilla commodo."
    ),
    MessageData(
        senderProfileImageRes = R.drawable.img_qualify_3_sender,
        senderName = "Lorem Ipsum",
        message = "Ut hendrerit neque nec accumsan hendrerit. Fusce lobortis rhoncus erat, a blandit nibh molestie vel. Cras commodo ligula ex, vitae venenatis lacus facilisis eget."
    )
)