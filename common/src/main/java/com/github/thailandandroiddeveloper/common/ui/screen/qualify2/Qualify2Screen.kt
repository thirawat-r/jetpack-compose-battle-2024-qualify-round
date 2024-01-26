package com.github.thailandandroiddeveloper.common.ui.screen.qualify2

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun Qualify2Screen() {

    val pagerState = rememberPagerState(pageCount = {
        5
    })

    Scaffold(
        topBar = {
            TopAppBar(
                title = { /*TODO*/ },
                actions = {
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(
                            text = "Skip",
                            style = MaterialTheme.typography.labelLarge,
                            color = MaterialTheme.colorScheme.primary,
                        )
                    }
                }
            )

        },
        bottomBar = {
            BottomBar()
        },
        content = { paddingValues ->
            MainContent(
                modifier = Modifier.padding(paddingValues),
                pagerState = pagerState
            )
        }
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainContent(
    modifier: Modifier = Modifier,
    pagerState: PagerState
) {
    Column(
        modifier = modifier
            .padding(horizontal = 32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Lorem ipsum dolor sit amet",
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.onSurface,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec egestas dictum lacinia. Integer arcu neque, porttitor ac metus quis, iaculis molestie magna. Vivamus molestie justo sed nulla lacinia, quis fringilla lorem imperdiet. Proin in quam vel odio iaculis fringilla",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(32.dp))
        Image(
            painter = painterResource(id = R.drawable.img_qualify_2_onboard),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(32.dp))
        PagerIndicator(pagerState = pagerState)
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PagerIndicator(
    modifier: Modifier = Modifier,
    pagerState: PagerState
) {
    Row(
        modifier = modifier
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(pagerState.pageCount) { iteration ->
            val color =
                if (iteration == 3) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.primaryContainer
            val width = if (iteration == 3) 32.dp else 16.dp
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(color)
                    .size(height = 16.dp, width = width)
            )
        }
    }
}

@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .background(MaterialTheme.colorScheme.primaryContainer)
            .padding(vertical = 31.dp, horizontal = 80.dp)
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Next",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onPrimary,
            )
        }
    }
}

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify2ScreenPreview() = AppTheme {
    Qualify2Screen()
}
// endregion