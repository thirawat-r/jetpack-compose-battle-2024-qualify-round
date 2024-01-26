package com.github.thailandandroiddeveloper.common.ui.screen.qualify3

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Qualify3Screen() {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.size(48.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_qualify_3_back),
                            contentDescription = null
                        )
                    }
                },
                title = {
                    Text(
                        text = "John Doe",
                        style = MaterialTheme.typography.titleLarge,
                    )
                },
                actions = {
                    ActionButtons()
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                ),
            )
        },
        containerColor = Color.White,
        content = { paddingValues ->
            MainContent(
                modifier = Modifier
                    .padding(paddingValues)
            )
        }
    )
}

@Composable
fun ActionButtons() {
    IconButton(
        onClick = { /*TODO*/ },
        modifier = Modifier.size(48.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_qualify_3_copy),
            contentDescription = null,
        )
    }
    IconButton(
        onClick = { /*TODO*/ },
        modifier = Modifier.size(48.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_qualify_3_calendar),
            contentDescription = null
        )
    }
    IconButton(
        onClick = { /*TODO*/ },
        modifier = Modifier.size(48.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_qualify_3_menu),
            contentDescription = null
        )
    }
}

@Composable
fun MainContent(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        PhotoList()
        TagList()
        MessageList()
    }
}

@Composable
fun PhotoList() {

    val photoList = remember {
        listOf(
            R.drawable.img_qualify_3_photo_1,
            R.drawable.img_qualify_3_photo_2,
            R.drawable.img_qualify_3_photo_3,
        )
    }

    LazyRow(
        modifier = Modifier.padding(top = 16.dp),
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        itemsIndexed(photoList) { index, item ->
            val colorBorder =
                if (index == 0) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.primaryContainer

            Image(
                painter = painterResource(id = item),
                contentDescription = null,
                modifier = Modifier
                    .size(width = 160.dp, height = 320.dp)
                    .border(
                        BorderStroke(width = 2.dp, color = colorBorder),
                        RoundedCornerShape(16.dp)
                    )
                    .clip(RoundedCornerShape(16.dp))
            )
        }
    }
}

@Composable
fun TagList(
    modifier: Modifier = Modifier
) {

    val tagList = remember {
        listOf(
            "Tag 1",
            "Tag 2",
            "Tag 3",
            "Tag 4",
        )
    }

    LazyRow(
        modifier = modifier.padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        itemsIndexed(tagList) { index, item ->
            val chipColor =
                if (index == 0) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.outline
            AssistChip(
                onClick = { /*TODO*/ },
                label = {
                    Text(
                        text = item,
                        style = MaterialTheme.typography.labelLarge,
                    )
                },
                colors = AssistChipDefaults.assistChipColors(
                    labelColor = chipColor,
                ),
                border = AssistChipDefaults.assistChipBorder(
                    borderColor = chipColor
                ),
                modifier = Modifier
                    .width(68.dp)
                    .height(32.dp),
            )
        }
    }
}

@Composable
fun MessageList(
    modifier: Modifier = Modifier
) {

    val messageList = remember {
        listOf(
            "Duis dignissim pulvinar lectus imperdiet tempus. Curabitur fringilla commodo consectetur. Sed congue blandit nibh.",
            "Morbi sed sagittis justo, at pulvinar ipsum. Praesent massa metus, interdum at suscipit a, interdum vel orci. Pellentesque in sapien. Integer faucibus mauris ac luctus aliquam accumsan.",
            "Duis dignissim pulvinar lectus imperdiet tempus. Curabitur fringilla commodo.",
            "Ut hendrerit neque nec accumsan hendrerit. Fusce lobortis rhoncus erat, a blandit nibh molestie vel. Cras commodo ligula ex, vitae venenatis lacus facilisis eget."
        )
    }

    LazyColumn(
        modifier = modifier
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(messageList) { item ->
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface,
                ),
                border = BorderStroke(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.surfaceVariant
                ),
                shape = RoundedCornerShape(16.dp),
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_qualify_3_sender),
                        contentDescription = null,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(48.dp)
                    )
                    Column {
                        Text(
                            text = "Lorem Ipsum",
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier.height(24.dp)
                        )
                        Text(
                            text = item,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.height(40.dp)
                        )
                    }
                }
            }
        }
    }
}

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify3ScreenPreview() = AppTheme {
    Qualify3Screen()
}
// endregion