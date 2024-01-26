package com.github.thailandandroiddeveloper.common.ui.screen.qualify1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
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
                title = {},
                navigationIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_qualify_1_menu),
                        contentDescription = null,
                    )
                },
                actions = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_qualify_1_profile),
                        contentDescription = null
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                ),
            )
        },
        containerColor = Color.White,
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(horizontal = 16.dp)
            ) {
                MainContent(
                    modifier = Modifier.fillMaxSize()
                )
                ThumbButtons(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter)
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
            .padding(top = 16.dp, bottom = 72.dp)
            .clip(shape = RoundedCornerShape(16.dp))
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_qualify_1_profile),
            contentDescription = null,
            modifier = Modifier.matchParentSize()
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
            .background(color = MaterialTheme.colorScheme.primary),
    ) {
        Text(
            text = "John Doe",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier.padding(top = 20.dp, start = 20.dp)
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 8.dp, start = 20.dp)
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
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier.padding(top = 8.dp, start = 20.dp, end = 19.dp, bottom = 40.dp)
        )
    }
}

@Composable
fun ThumbButtons(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.padding(bottom = 48.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier,
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.errorContainer,
                contentColor = MaterialTheme.colorScheme.onErrorContainer
            ),
            shape = RoundedCornerShape(100.dp),
            contentPadding = PaddingValues(vertical = 12.dp, horizontal = 48.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_qualify_1_thumb_down),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier,
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer
            ),
            shape = RoundedCornerShape(100.dp),
            contentPadding = PaddingValues(vertical = 12.dp, horizontal = 48.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_qualify_1_thumb_up),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
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