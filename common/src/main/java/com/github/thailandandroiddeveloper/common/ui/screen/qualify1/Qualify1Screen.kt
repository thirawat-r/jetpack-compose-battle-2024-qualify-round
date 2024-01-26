package com.github.thailandandroiddeveloper.common.ui.screen.qualify1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Qualify1Screen() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {},
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_qualify_1_menu),
                            contentDescription = null
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_qualify_1_profile),
                            contentDescription = null
                        )
                    }
                }
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .padding(paddingValues)
                    .padding(horizontal = 16.dp)
            ) {
                MainContent()
                ThumbButtons(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 48.dp)
                )
            }
        }
    )
}

@Composable
fun MainContent(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 16.dp, bottom = 72.dp)
            .clip(shape = RoundedCornerShape(16.dp))
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_qualify_1_profile),
            contentDescription = null,
        )
        Description(
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}

@Composable
fun Description(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .alpha(0.75F)
            .background(color = MaterialTheme.colorScheme.primary)
            .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 40.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            text = "John Doe",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.onPrimary
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_qualify_1_gender_male),
                contentDescription = null
            )
            Text(
                text = "Male",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onPrimary,
            )
        }
        Text(
            text = "Lorem ipsum dolor sit amet, cd nulla lacinia, quis fringilla lorem imperdiet. Proin in quam vel odio iaculis fringilla.",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onPrimary
        )
    }
}

@Composable
fun ThumbButtons(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .clip(RoundedCornerShape(100.dp))
                .background(MaterialTheme.colorScheme.errorContainer)
                .size(width = 120.dp, height = 48.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_qualify_1_thumb_down),
                contentDescription = null
            )
        }
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(width = 120.dp, height = 48.dp)
                .clip(RoundedCornerShape(100.dp))
                .background(MaterialTheme.colorScheme.primaryContainer)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_qualify_1_thumb_up),
                contentDescription = null
            )
        }
    }
}

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify1ScreenPreview() = AppTheme {
    Qualify1Screen()
}
// endregion