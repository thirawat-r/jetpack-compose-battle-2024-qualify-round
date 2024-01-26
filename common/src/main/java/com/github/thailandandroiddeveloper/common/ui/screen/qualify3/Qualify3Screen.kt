package com.github.thailandandroiddeveloper.common.ui.screen.qualify3

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
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
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                ),
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
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

                }
            )
        },
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
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_qualify_3_copy),
            contentDescription = null
        )
    }
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_qualify_3_calendar),
            contentDescription = null
        )
    }
    IconButton(onClick = { /*TODO*/ }) {
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
    LazyRow(
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.padding(top = 16.dp)
    ) {
        items(photoList) { photoData ->
            Card(
                modifier = Modifier.size(width = 160.dp, height = 320.dp),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(width = 2.dp, color = MaterialTheme.colorScheme.primary)
            ) {
                Image(
                    painter = painterResource(id = photoData.imageRes),
                    contentDescription = null,
                    modifier = Modifier.size(width = 160.dp, height = 320.dp)
                )
            }
        }
    }
}

@Composable
fun TagList(
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier.padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        itemsIndexed(tagList) { index: Int, item: TagData ->
            val color =
                if (index == 0) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.outline

            OutlinedButton(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),
                border = BorderStroke(width = 1.dp, color = color),
                shape = RoundedCornerShape(8.dp),
                contentPadding = PaddingValues(vertical = 6.dp, horizontal = 16.dp),
                modifier = Modifier.size(width = 68.dp, height = 32.dp)
            ) {
                Text(
                    text = item.name,
                    style = MaterialTheme.typography.labelLarge,
                    color = color,
                )
            }
        }
    }
}

@Composable
fun MessageList(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(messageList) { messageData ->
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface,
                ),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.surfaceVariant
                ),
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    Image(
                        painter = painterResource(id = messageData.senderProfileImageRes),
                        contentDescription = null,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(48.dp)
                    )
                    Column {
                        Text(
                            text = messageData.senderName,
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = messageData.message,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
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