package com.github.thailandandroiddeveloper.common.ui.screen.qualify2

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Qualify2Screen() {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { /*TODO*/ },
                actions = {
                    TextButton(
                        onClick = { /*TODO*/ },
                    ) {
                        Text(
                            text = "Skip",
                            style = MaterialTheme.typography.labelLarge,
                            color = MaterialTheme.colorScheme.primary,
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                ),
            )
        },
        bottomBar = {
            BottomBar()
        },
        containerColor = Color.White,
        content = { paddingValues ->
            MainContent(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize(),
            )
        }
    )
}

@Composable
fun MainContent(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Lorem ipsum dolor sit amet",
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.onSurface,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing\nelit. Donec egestas dictum lacinia. Integer arcu\nneque, porttitor ac metus quis, iaculis molestie\nmagna. Vivamus molestie justo sed nulla lacinia,\nquis fringilla lorem imperdiet. Proin in quam vel odio\niaculis fringilla",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(36.dp))
        Image(
            painter = painterResource(id = R.drawable.img_qualify_2_onboard),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(446.dp),
        )
        Spacer(modifier = Modifier.height(34.dp))
        PagerIndicator()
    }
}

@Composable
fun PagerIndicator(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(5) { iteration ->
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
            .height(102.dp)
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 80.dp)
                .align(Alignment.Center),
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